#include <utility>
#include "TcpSession.h"
#include "TopicPubBroker.h"
#include "PubBroker.h"

/**
 * @brief Initialize the PubBroker and start listening for incoming connections.
 * @param id: PubBroker TCP/IP ID.
 * @param sub_broker_id: SubBroker TCP/IP ID.
 * @param logs_path: File path for logging published measures.
 * @param io_context: Reference to Boost I/O context.
 */
PubBroker::PubBroker(TcpIpId& id, TcpIpId& sub_broker_id, const std::string& logs_path, boost::asio::io_context& io_context) : PeerTcpServer(id, sub_broker_id, false, io_context), m_logs_path(logs_path), m_timer(io_context), m_current_slot(0)
{

}

/**
 * @brief Decode and process incoming messages.
 * @param message: Received message to process.
 * @param session: Pointer to the active session over which the message is received.
 */
void PubBroker::decode(const Message& message, p_tcp_session session)
{
    PeerTcpServer::decode(message, session);

    switch (message.getMessageType())
    {
        case MessageType::PUBLISH_PUB_BROKER:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                PublishedMeasure measure = dynamic_cast<const PublishedMeasure&>(*payloads[0]);
                BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Publish to topic: " << measure.getCode();
                publish(measure.getCode(), message);
            }
            break;
        }
        case MessageType::PEER_SERVER_PING:
        {
            sendToPeer(message);
            break;
        }
        case MessageType::SEND_TOPICS_PUB_BROKER:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                TopicConfiguration configurations = dynamic_cast<const TopicConfiguration&>(*payloads[0]);
                BOOST_LOG_TRIVIAL(info) << "[PubBroker] Received topics: " << configurations;
                std::vector<std::string> topics = configurations.getTopics();
                std::vector<unsigned int> sizes = configurations.getSizes();
                for (size_t i = 0; i < topics.size(); i++)
                {
                    PubBroker::addTopic(topics[i], sizes[i]);
                }
            }
            break;
        }
        case MessageType::SEND_SCHEDULE_PUB_BROKER:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                Schedule message_schedule = dynamic_cast<const Schedule&>(*payloads[0]);
                BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Received schedule: " << message_schedule;
                m_schedule = message_schedule.getSchedule();
                m_timer.expires_after(std::chrono::milliseconds(1));
                m_timer.async_wait(boost::bind(&PubBroker::processSchedule, this));
            }
            break;
        }
        case MessageType::NO_TYPE:
        {
            BOOST_LOG_TRIVIAL(warning) << "[PubBroker] Message type not recognized!";
            break;
        }
        default:
        {
            break;
        }
    }
}

/**
 * @brief Add a topic to the list of managed topics.
 * @param topic: Name of the topic.
 * @param size: Buffer size to allocate for the topic's data handling.
 */
void PubBroker::addTopic(const std::string& topic, unsigned int size)
{
    if (std::find(m_topics.begin(), m_topics.end(), topic) == m_topics.end())
    {
        m_topics.push_back(topic);
        m_topic_handlers.push_back(boost::make_shared<TopicPubBroker>(topic, size, m_logs_path));
    }
}

/**
 * @brief Publish a message to the specified topic.
 * @param topic: Topic under which the message is published.
 * @param message: Message to publish.
 */
void PubBroker::publish(const std::string& topic, const Message& message)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        m_topic_handlers[element_iterator - m_topics.begin()]->write(message);
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[PubBroker] Topic " << topic << " not handled!";
    }
}

/**
 * @brief Manage message distribution based on the current schedule.
 */
void PubBroker::processSchedule()
{
    const std::vector<std::pair<std::string, std::string>>& scheduled_topics = m_schedule[m_current_slot];
    BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Slot: " << m_current_slot;

    if (!scheduled_topics.empty())
    {
        std::vector<Message> scheduled_messages;
        std::vector<std::unique_ptr<Payload>> scheduled_payloads;
        AggregationType current_aggregation;

        for (const std::pair<std::string, std::string>& pair : scheduled_topics)
        {
            current_aggregation = stringToAggregation(pair.second).value_or(AggregationType::DEFAULT);

            // Construct message for each topic
            auto topic_iterator = std::find(m_topics.begin(), m_topics.end(), pair.first);
            Message message = m_topic_handlers[topic_iterator - m_topics.begin()]->constructMessage(current_aggregation, m_current_slot);
            if (message.getMessageType() != MessageType::NO_TYPE)
            {
                scheduled_messages.push_back(message);
                scheduled_payloads.push_back(message.getPayload()[0]->clone());
            }
        }

        if (!scheduled_messages.empty())
        {
            if (scheduled_messages.size() == 1)
            {
                BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Send single message to SubBroker: " << scheduled_messages[0];
                BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Size: " << sizeof(scheduled_messages[0]);
                sendToPeer(scheduled_messages[0]);
            }
            else
            {
                Message combined_message;
                combined_message.setMessageId(m_current_slot);
                combined_message.setMessageType(MessageType::SEND_SUB_BROKER_BATCH_DIFFERENT);
                combined_message.setPayload(std::move(scheduled_payloads));

                BOOST_LOG_TRIVIAL(debug) << "[PubBroker] Send combined message to SubBroker: " << combined_message;
                sendToPeer(combined_message);
            }
        }
    }

    long long next_action_slot = m_current_slot + 1;
    // Cycle through schedule and search for non-empty slot
    while (next_action_slot != m_current_slot)
    {
        if (!m_schedule[next_action_slot].empty())
        {
            break;
        }
        next_action_slot = (long long) ((next_action_slot + 1) % m_schedule.size());
    }

    // Compute next delay
    auto delay = (next_action_slot - m_current_slot + m_schedule.size()) % m_schedule.size();
    if (delay == 0)
    {
        delay = m_schedule.size();
    }
    m_current_slot = next_action_slot;
    m_timer.expires_after(std::chrono::milliseconds(delay));
    m_timer.async_wait(boost::bind(&PubBroker::processSchedule, this));
}

/**
 * @brief Retrieve managed topics.
 * @return List of managed topics.
 */
std::vector<std::string> PubBroker::getTopics()
{
    return m_topics;
}