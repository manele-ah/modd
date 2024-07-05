#include "../include/Broker.h"

Broker::Broker(TcpIpId& id, TcpIpId& proxy_id, const std::string& logs_path, boost::asio::io_context& io_context) : PeerTcpServer(id, proxy_id, false, io_context), m_logs_path(logs_path), m_timer(io_context), m_current_slot(0)
{

}

void Broker::decode(const Message& message, p_tcp_session session)
{
    PeerTcpServer::decode(message, session);

    switch (message.getMessageType())
    {
        case MessageType::PUBLISH_BROKER:
        {
            PublishedMeasure measure = dynamic_cast<const PublishedMeasure&>(*message.getPayload()[0]);
            BOOST_LOG_TRIVIAL(debug) << "[Broker] Publish to topic: " << measure.getCode();
            publish(measure.getCode(), message);
            break;
        }
        case MessageType::PEER_SERVER_PING:
        {
            sendToPeer(message);
            break;
        }
        case MessageType::SEND_TOPICS_BROKER:
        {
            TopicConfiguration configurations = dynamic_cast<const TopicConfiguration&>(*message.getPayload()[0]);
            BOOST_LOG_TRIVIAL(debug) << "[Broker] Received topics: " << configurations;
            std::vector<std::string> topics = configurations.getTopics();
            std::vector<int> sizes = configurations.getSizes();
            for (int i = 0; i < topics.size(); i++)
            {
                Broker::addTopic(topics[i], sizes[i]);
            }
            break;
        }
        case MessageType::SEND_SCHEDULE_BROKER:
        {
            Schedule message_schedule = dynamic_cast<const Schedule&>(*message.getPayload()[0]);
            BOOST_LOG_TRIVIAL(debug) << "[Broker] Received schedule: " << message_schedule;
            m_schedule = message_schedule.getSchedule();
            m_timer.expires_after(std::chrono::milliseconds(1));
            m_timer.async_wait(boost::bind(&Broker::processSchedule, this));
        }
        case MessageType::NO_TYPE:
        {
            BOOST_LOG_TRIVIAL(debug) << "[Broker] No type";
            break;
        }
        default:
        {
            break;
        }
    }
}

/**
 * Add a topic to the list of managed topics
 * @param topic: The name of the topic
 * @param size: The size of the buffer associated with the topic
 */
void Broker::addTopic(const std::string& topic, int size)
{
    if (std::find(m_topics.begin(), m_topics.end(), topic) == m_topics.end())
    {
        m_topics.push_back(topic);
        m_topic_handlers.push_back(boost::make_shared<TopicBroker>(topic, size, m_logs_path));
    }
}

void Broker::publish(const std::string& topic, const Message& message)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        m_topic_handlers[element_iterator - m_topics.begin()]->write(message);
    }
}

void Broker::processSchedule()
{
    const std::vector<std::pair<std::string, std::string>>& scheduled_topics = m_schedule[m_current_slot];
    BOOST_LOG_TRIVIAL(debug) << "[Broker] Slot: " << m_current_slot;

    if (!scheduled_topics.empty())
    {
        std::vector<Message> scheduled_messages;
        std::vector<std::unique_ptr<Payload>> scheduled_payloads;
        std::string previous_topic;
        AggregationType previous_aggregation = AggregationType::DEFAULT;
        AggregationType current_aggregation;
        bool same_topic = true, same_aggregation = true, first_iteration = true;

        for (const std::pair<std::string, std::string>& pair : scheduled_topics)
        {
            current_aggregation = stringToAggregation(pair.second).value_or(AggregationType::DEFAULT);
            if (first_iteration)
            {
                previous_topic = pair.first;
                previous_aggregation = current_aggregation;
                first_iteration = false;
            }
            else
            {
                if (pair.first != previous_topic)
                {
                    same_topic = false;
                }
                if (current_aggregation != previous_aggregation)
                {
                    same_aggregation = false;
                }
            }

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
                BOOST_LOG_TRIVIAL(debug) << "[Broker] Send single message to Proxy: " << scheduled_messages[0];
                BOOST_LOG_TRIVIAL(debug) << "[Broker] Size: " << sizeof(scheduled_messages[0]);
                BOOST_LOG_TRIVIAL(info) << "[Broker] Send single";
                sendToPeer(scheduled_messages[0]);
            }
            else
            {
                Message combined_message;
                combined_message.setMessageId(m_current_slot);

                if (same_topic && same_aggregation)
                {
                    DeliveredMeasure first_payload = dynamic_cast<const DeliveredMeasure&>(*scheduled_messages[0].getPayload()[0]);
                    DeliveredMeasure combined_payload(first_payload.getCode(), first_payload.getMeasures());
                    combined_message.setMessageType(MessageType::SEND_PROXY_BATCH_SAME);
                    combined_message.setPayload(std::make_unique<DeliveredMeasure>(combined_payload));
                }
                else
                {
                    combined_message.setMessageType(MessageType::SEND_PROXY_BATCH_DIFFERENT);
                    combined_message.setPayload(std::move(scheduled_payloads));
                }

                BOOST_LOG_TRIVIAL(debug) << "[Broker] Send combined message to Proxy: " << combined_message;
                BOOST_LOG_TRIVIAL(info) << "[Broker] Send combined";
                sendToPeer(combined_message);
            }
        }
    }

    int next_action_slot = m_current_slot + 1;
    // Cycle through schedule and search for non-empty slot
    while (next_action_slot != m_current_slot)
    {
        if (!m_schedule[next_action_slot].empty())
        {
            break;
        }
        next_action_slot = (next_action_slot + 1) % m_schedule.size();
    }

    // Compute next delay
    auto delay = (next_action_slot - m_current_slot + m_schedule.size()) % m_schedule.size();
    if (delay == 0)
    {
        delay = m_schedule.size();
    }
    m_current_slot = next_action_slot;
    m_timer.expires_after(std::chrono::milliseconds(delay));
    m_timer.async_wait(boost::bind(&Broker::processSchedule, this));
}