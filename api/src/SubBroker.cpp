#include <utility>
#include "TcpSession.h"
#include "TopicSubBroker.h"
#include "SubBroker.h"

/**
 * @brief Initialize the SubBroker and start listening for incoming connections.
 * @param id: SubBroker TCP/IP ID.
 * @param pub_broker_id: PubBroker TCP/IP ID.
 * @param topics_path: Path to topics definitions.
 * @param subscribers_path: Path to subscribers definitions.
 * @param logs_path: File path for logging measures.
 * @param io_context: Reference to Boost I/O context.
 */
SubBroker::SubBroker(TcpIpId& id, TcpIpId& pub_broker_id, const std::string& topics_path, const std::string& subscribers_path, const std::string& logs_path, boost::asio::io_context& io_context) : PeerTcpServer(id, pub_broker_id, true, io_context, std::bind(&SubBroker::initializeCommunication, this)), m_topics_path(topics_path), m_subscribers_path(subscribers_path), m_logs_path(logs_path), m_last_ping_timestamp(0)
{

}

/**
 * @brief Configure topics and subscribers handled by the SubBroker.
 * @return List of topics and their corresponding periods.
 */
std::vector<std::pair<std::string, double>> SubBroker::initializeConfiguration()
{
    // Retrieve list of topics and their corresponding period
    std::vector<std::pair<std::string, double>> measured_variables = parseTopicFile(m_topics_path);

    // Retrieve configuration for each subscriber
    std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> subscribers = parseSubscriberFile(m_subscribers_path);
    for (const auto& subscriber : subscribers)
    {
        m_subscribers_identities.push_back(std::get<0>(subscriber));
        m_subscribers_topics.push_back(std::get<1>(subscriber));
        m_subscribers_intervals.push_back(secondToMillisecond(std::get<2>(subscriber)));
        m_subscribers_aggregations.push_back(std::get<3>(subscriber));
        m_subscribers_ip_endpoints.push_back(std::get<4>(subscriber));
    }

    return measured_variables;
}

/**
 * @brief Initialize communication with the PubBroker.
 */
void SubBroker::initializeCommunication()
{
    sendInitialMessageToPeer();

    sendPingToPubBroker();

    std::vector<std::pair<std::string, double>> topics_info = initializeConfiguration();

    std::vector<std::string> topics;
    for (const auto& topic : topics_info)
    {
        topics.emplace_back(topic.first);
    }

    auto data = mapSubscriberTopicData(m_subscribers_topics, m_subscribers_intervals, topics, topics_info);
    BufferOptimizer optimizer(std::get<0>(data), std::get<1>(data), std::get<2>(data), millisecondToSecond(m_last_ping_timestamp));
    std::vector<unsigned int> buffer_sizes = optimizer.getBufferSizes();
    for (int i = 0; i < topics.size(); i++)
    {
        SubBroker::addTopic(topics[i], buffer_sizes[i]);
    }

    std::vector<std::pair<std::string, std::string>> subscribers_topics_aggregations;
    for (size_t i = 0; i < m_subscribers_topics.size(); i++)
    {
        subscribers_topics_aggregations.emplace_back(m_subscribers_topics[i], aggregationToString(m_subscribers_aggregations[i]));
    }
    m_schedule_topics = generateSchedule<std::pair<std::string, std::string>>(m_subscribers_intervals, subscribers_topics_aggregations);
    m_schedule_subscribers = generateSchedule<std::string>(m_subscribers_intervals, m_subscribers_identities);

    sendTopicsToPubBroker(topics, buffer_sizes);
    sendScheduleToPubBroker();
}

/**
 * @brief Decode and process incoming messages.
 * @param message: Received message to process.
 * @param session: Pointer to the active session over which the message is received.
 */
void SubBroker::decode(const Message& message, p_tcp_session session)
{
    switch (message.getMessageType())
    {
        case MessageType::SUBSCRIBE_SUB_BROKER:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                Subscription subscription = dynamic_cast<const Subscription&>(*payloads[0]);
                BOOST_LOG_TRIVIAL(debug) << "[SubBroker] Subscribe to topic: " << subscription.getCode();
                subscribe(subscription.getId(), subscription.getInterval(), subscription.getAggregation(), subscription.getCode(), session);
            }
            break;
        }
        case MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                // There may be multiple subscribers with the same period and interested in the same (topic, aggregation) pair
                std::vector<std::string> identities;
                std::vector<std::string> codes;
                std::vector<std::vector<Measure>> measures;
                DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*payloads[0]);
                identities = m_schedule_subscribers[message.getMessageId()];
                for (std::string id : identities)
                {
                    codes.push_back(measure.getCode());
                    measures.push_back({{measure.getTimestamp(), measure.getValue()}});
                }
                deliverBatch(identities, codes, measures);
            }
            break;
        }
        case MessageType::SEND_SUB_BROKER_SINGLE_NO_AGGREGATION:
        {
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();
            if (payloads[0])
            {
                // There may be multiple subscribers with the same period and interested in receiving raw data
                std::vector<std::string> identities;
                std::vector<std::string> codes;
                std::vector<std::vector<Measure>> measures;
                DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*payloads[0]);
                identities = m_schedule_subscribers[message.getMessageId()];
                for (std::string id : identities)
                {
                    codes.push_back(measure.getCode());
                    measures.push_back(measure.getMeasures());
                }
                deliverBatch(identities, codes, measures);
            }
            break;
        }
        case MessageType::SEND_SUB_BROKER_BATCH_DIFFERENT:
        {
            long long slot_id = message.getMessageId();
            const auto& payloads = message.getPayload();
            std::vector<std::pair<std::string, std::string>> slot_topics = m_schedule_topics[slot_id];
            std::map<std::pair<std::string, std::string>, DeliveredMeasure> topics_measures;
            // Order of payloads must be the same as the (topic, aggregation) pairs in the schedule sent to the PubBroker
            for (size_t i = 0; i < payloads.size(); i++)
            {
                if (payloads[i])
                {
                    DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*payloads[i]);
                    topics_measures.insert({slot_topics[i], measure});
                }
            }

            std::vector<std::string> slot_subscribers = m_schedule_subscribers[slot_id];
            std::vector<std::string> identities;
            std::vector<std::string> codes;
            std::vector<std::vector<Measure>> measures;
            for (const std::string& subscriber_id : slot_subscribers)
            {
                auto id_iterator = std::find(m_subscribers_identities.begin(), m_subscribers_identities.end(), subscriber_id);
                auto index = id_iterator - m_subscribers_identities.begin();
                std::string relevant_topic = m_subscribers_topics[index];
                std::string relevant_aggregation = aggregationToString(m_subscribers_aggregations[index]);
                auto measure_iterator = topics_measures.find({relevant_topic, relevant_aggregation});
                if (measure_iterator != topics_measures.end())
                {
                    const DeliveredMeasure& measure = measure_iterator->second;
                    identities.push_back(subscriber_id);
                    codes.push_back(measure.getCode());
                    measures.push_back(measure.getMeasures());
                }
            }

            deliverBatch(identities, codes, measures);
            break;
        }
        case MessageType::PEER_SERVER_PING:
        {
            auto now = std::chrono::system_clock::now();
            auto current_timestamp = std::chrono::duration_cast<std::chrono::milliseconds>(now.time_since_epoch()).count();
            auto round_trip_time = current_timestamp - m_last_ping_timestamp;
            BOOST_LOG_TRIVIAL(info) << "[SubBroker] Ping: " << round_trip_time << " milliseconds";
            break;
        }
        case MessageType::NO_TYPE:
        {
            BOOST_LOG_TRIVIAL(warning) << "[SubBroker] Message type not recognized!";
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
void SubBroker::addTopic(const std::string& topic, unsigned int size)
{
    if (std::find(m_topics.begin(), m_topics.end(), topic) == m_topics.end())
    {
        m_topics.push_back(topic);
        m_topics_handlers.push_back(boost::make_shared<TopicSubBroker>(topic, size, m_logs_path));
    }
}

/**
 * @brief Subscribe a client to receive updates for a specific topic.
 * @param id: ID of the subscriber.
 * @param interval: Delivery interval in milliseconds.
 * @param aggregation: Aggregation type requested by the subscriber.
 * @param topic: Topic of interest for the subscriber.
 * @param session: TCP session associated with the subscriber.
 */
void SubBroker::subscribe(const std::string& id, unsigned long long interval, const AggregationType& aggregation, const std::string& topic, p_tcp_session session)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        BOOST_LOG_TRIVIAL(debug) << "[SubBroker] Subscribe to topic: " << topic;
        m_topics_handlers[element_iterator - m_topics.begin()]->subscribe(id, interval, aggregation, session);
    }
}

/**
 * @brief Send a ping message to the PubBroker.
 */
void SubBroker::sendPingToPubBroker()
{
    BOOST_LOG_TRIVIAL(debug) << "[SubBroker] Send ping to PubBroker";
    Message ping(MessageType::PEER_SERVER_PING);

    auto now = std::chrono::system_clock::now();
    auto timestamp = std::chrono::duration_cast<std::chrono::milliseconds>(now.time_since_epoch()).count();

    sendToPeer(ping);
    m_last_ping_timestamp = timestamp;
}

/**
 * @brief Send topics configuration to the PubBroker.
 * @param topics: List of topic names.
 * @param sizes: List of buffer sizes for each topic.
 */
void SubBroker::sendTopicsToPubBroker(const std::vector<std::string>& topics, const std::vector<unsigned int>& sizes)
{
    Message message(MessageType::SEND_TOPICS_PUB_BROKER, std::make_unique<TopicConfiguration>(topics, sizes));
    sendToPeer(message);
}

/**
 * @brief Send message emission schedule to the PubBroker.
 */
void SubBroker::sendScheduleToPubBroker()
{
    Message message(MessageType::SEND_SCHEDULE_PUB_BROKER, std::make_unique<Schedule>(m_schedule_topics));
    sendToPeer(message);
}

/**
 * @brief Deliver a message to a single subscriber.
 * @param id: ID of the subscriber.
 * @param topic: Topic corresponding to the measures being delivered.
 * @param measures: Measures to deliver.
 */
void SubBroker::deliverSingle(const std::string& id, const std::string& topic, const std::vector<Measure>& measures)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        BOOST_LOG_TRIVIAL(debug) << "[SubBroker] Deliver to subscriber (" << id << ")";
        auto id_iterator = std::find(m_subscribers_identities.begin(), m_subscribers_identities.end(), id);
        auto index = id_iterator - m_subscribers_identities.begin();
        m_topics_handlers[element_iterator - m_topics.begin()]->sendToSubscriber(id, m_subscribers_ip_endpoints[index], measures);
    }
}

/**
 * @brief Deliver messages to multiple subscribers.
 * @param identities: IDs of the subscribers.
 * @param topics: Topics corresponding to the measures being delivered.
 * @param measures: Measures to deliver.
 */
void SubBroker::deliverBatch(std::vector<std::string> identities, std::vector<std::string> topics, const std::vector<std::vector<Measure>>& measures)
{
    if ((topics.size() == identities.size()) && (topics.size() == measures.size()))
    {
        for (size_t j = 0; j < topics.size(); j++)
        {
            auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topics[j]);
            if (element_iterator != m_topics.end())
            {
                BOOST_LOG_TRIVIAL(debug) << "[SubBroker] Deliver to subscriber (" << identities[j] << ")";
                auto id_iterator = std::find(m_subscribers_identities.begin(), m_subscribers_identities.end(), identities[j]);
                auto index = id_iterator - m_subscribers_identities.begin();
                m_topics_handlers[element_iterator - m_topics.begin()]->sendToSubscriber(identities[j], m_subscribers_ip_endpoints[index], measures[j]);
            }
        }
    }
}

/**
 * @brief Retrieve managed topics.
 * @return List of managed topics.
 */
std::vector<std::string> SubBroker::getTopics()
{
    return m_topics;
}