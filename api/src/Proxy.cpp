#include "../include/Proxy.h"

Proxy::Proxy(TcpIpId& id, TcpIpId& broker_id, const std::string& topics_path, const std::string& subscribers_path, const std::string& logs_path, boost::asio::io_context& io_context) : PeerTcpServer(id, broker_id, true, io_context, std::bind(&Proxy::initializeCommunication, this)), m_topics_path(topics_path), m_subscribers_path(subscribers_path), m_logs_path(logs_path), m_last_ping_timestamp(0)
{

}

/**
 * Configure proxy with list of topics and subscribers.
 */
std::vector<std::pair<std::string, int>> Proxy::initializeConfiguration()
{
    // Retrieve list of topics and their corresponding double buffer size
    std::vector<std::pair<std::string, int>> measured_variables = parseTopicFile(m_topics_path);
    for (const auto& measured_variable: measured_variables)
    {
        Proxy::addTopic(measured_variable.first, measured_variable.second);
    }

    // Retrieve configuration for each subscriber
    std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> subscribers = parseSubscriberFile(m_subscribers_path);
    for (const auto& subscriber : subscribers)
    {
        m_subscribers_identities.push_back(std::get<0>(subscriber));
        m_subscribers_topics.push_back(std::get<1>(subscriber));
        m_subscribers_intervals.push_back(static_cast<int>(std::get<2>(subscriber) * 1000));
        m_subscribers_aggregations.push_back(std::get<3>(subscriber));
        m_subscribers_ip_endpoints.push_back(std::get<4>(subscriber));
    }

    return measured_variables;
}

/**
 * Initialize communication with broker.
 */
void Proxy::initializeCommunication()
{
    sendInitialMessageToPeer();
    sendPingToBroker();
    // TODO: Integrate ILP to compute sizes of double buffers
    std::vector<std::pair<std::string, int>> topics_info = initializeConfiguration();
    std::vector<std::pair<std::string, std::string>> subscribers_topics_aggregations;
    for (size_t i = 0; i < m_subscribers_topics.size(); i++)
    {
        subscribers_topics_aggregations.emplace_back(m_subscribers_topics[i], aggregationToString(m_subscribers_aggregations[i]));
    }
    m_schedule_topics = generateSchedule<std::pair<std::string, std::string>>(m_subscribers_intervals, subscribers_topics_aggregations);
    m_schedule_subscribers = generateSchedule<std::string>(m_subscribers_intervals, m_subscribers_identities);
    sendTopicsToBroker(topics_info);
    sendScheduleToBroker();
}

void Proxy::decode(const Message& message, p_tcp_session session)
{
    switch (message.getMessageType())
    {
        case MessageType::SUBSCRIBE_PROXY:
        {
            Subscription subscription = dynamic_cast<const Subscription&>(*message.getPayload()[0]);
            BOOST_LOG_TRIVIAL(debug) << "[Proxy] Subscribe to topic: " << subscription.getCode();
            subscribe(subscription.getId(), subscription.getInterval(), subscription.getAggregation(), subscription.getCode(), session);
            break;
        }
        case MessageType::SEND_PROXY_SINGLE_AGGREGATION:
        {
            DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*message.getPayload()[0]);
            deliverSingle(m_schedule_subscribers[message.getMessageId()][0], measure.getCode(), {{measure.getTimestamp(), measure.getValue()}});
            break;
        }
        case MessageType::SEND_PROXY_SINGLE_NO_AGGREGATION:
        {
            DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*message.getPayload()[0]);
            deliverSingle(m_schedule_subscribers[message.getMessageId()][0], measure.getCode(), measure.getMeasures());
            break;
        }
        case MessageType::SEND_PROXY_BATCH_SAME:
        {
            std::vector<std::string> identities;
            std::vector<std::string> codes;
            std::vector<std::vector<Measure>> measures;
            const std::vector<std::unique_ptr<Payload>>& payloads = message.getPayload();

            if (payloads[0])
            {
                DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*payloads[0]);
                identities = m_schedule_subscribers[message.getMessageId()];
                for (std::string id : identities)
                {
                    codes.push_back(measure.getCode());
                    measures.push_back(measure.getMeasures());
                    BOOST_LOG_TRIVIAL(debug) << "[Proxy] Deliver to subscriber (" << id << ")";
                }
            }

            deliverBatch(identities, codes, measures);
            break;
        }
        case MessageType::SEND_PROXY_BATCH_DIFFERENT:
        {
            std::vector<std::string> identities;
            std::vector<std::string> codes;
            std::vector<std::vector<Measure>> measures;
            const auto& payloads = message.getPayload();
            int index = 0;

            for (const auto& payload_pointer : payloads)
            {
                if (payload_pointer)
                {
                    DeliveredMeasure measure = dynamic_cast<const DeliveredMeasure&>(*payload_pointer);
                    identities.push_back(m_schedule_subscribers[message.getMessageId()][index]);
                    codes.push_back(measure.getCode());
                    measures.push_back(measure.getMeasures());
                    BOOST_LOG_TRIVIAL(debug) << "[Proxy] Deliver to subscriber (" << m_schedule_subscribers[message.getMessageId()][index] << ")";
                }

                index += 1;
            }
            deliverBatch(identities, codes, measures);
            break;
        }
        case MessageType::PEER_SERVER_PING:
        {
            auto now = std::chrono::system_clock::now();
            auto current_timestamp = std::chrono::duration_cast<std::chrono::milliseconds>(now.time_since_epoch()).count();
            auto round_trip_time = current_timestamp - m_last_ping_timestamp;
            BOOST_LOG_TRIVIAL(info) << "[Proxy] Ping: " << round_trip_time << " milliseconds";
            break;
        }
        case MessageType::NO_TYPE:
        {
            BOOST_LOG_TRIVIAL(debug) << "[Proxy] No type";
            break;
        }
        default:
        {
            break;
        }
    }
}

void Proxy::addTopic(const std::string& topic, int size)
{
    if (std::find(m_topics.begin(), m_topics.end(), topic) == m_topics.end())
    {
        m_topics.push_back(topic);
        m_topic_handlers.push_back(boost::make_shared<TopicProxy>(topic, size, m_logs_path));
    }
}

void Proxy::subscribe(const std::string& id, int interval, const AggregationType& aggregation, const std::string& topic, p_tcp_session session)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        BOOST_LOG_TRIVIAL(debug) << "[Proxy] Subscribe to topic";
        m_topic_handlers[element_iterator - m_topics.begin()]->subscribe(id, interval, aggregation, session);
    }
}

void Proxy::sendPingToBroker()
{
    BOOST_LOG_TRIVIAL(debug) << "[Proxy] Send ping to broker";
    Message ping(MessageType::PEER_SERVER_PING);

    auto now = std::chrono::system_clock::now();
    auto timestamp = std::chrono::duration_cast<std::chrono::milliseconds>(now.time_since_epoch()).count();

    sendToPeer(ping);
    m_last_ping_timestamp = timestamp;
}

void Proxy::sendTopicsToBroker(std::vector<std::pair<std::string, int>> measured_variables)
{
    std::vector<std::string> topics;
    std::vector<int> sizes;

    for (const auto& measured_variable: measured_variables)
    {
        topics.push_back(measured_variable.first);
        sizes.push_back(measured_variable.second);
    }

    Message message(MessageType::SEND_TOPICS_BROKER, std::make_unique<TopicConfiguration>(topics, sizes));
    sendToPeer(message);
}

void Proxy::sendScheduleToBroker()
{
    Message message(MessageType::SEND_SCHEDULE_BROKER, std::make_unique<Schedule>(m_schedule_topics));
    sendToPeer(message);
}

void Proxy::deliverSingle(const std::string& id, const std::string& topic, const std::vector<Measure>& measures)
{
    auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topic);
    if (element_iterator != m_topics.end())
    {
        BOOST_LOG_TRIVIAL(debug) << "[Proxy] Deliver to subscriber (" << id << ")";
        auto id_iterator = std::find(m_subscribers_identities.begin(), m_subscribers_identities.end(), id);
        auto index = id_iterator - m_subscribers_identities.begin();
        m_topic_handlers[element_iterator - m_topics.begin()]->sendToSubscriber(id, m_subscribers_ip_endpoints[index], measures);
    }
}

void Proxy::deliverBatch(std::vector<std::string> identities, std::vector<std::string> topics, const std::vector<std::vector<Measure>>& measures)
{
    if ((topics.size() == identities.size()) && (topics.size() == measures.size()))
    {
        for (size_t j = 0; j < topics.size(); j++)
        {
            auto element_iterator = std::find(m_topics.begin(), m_topics.end(), topics[j]);
            if (element_iterator != m_topics.end())
            {
                BOOST_LOG_TRIVIAL(debug) << "[Proxy] Deliver to subscriber (" << identities[j] << ")";
                auto id_iterator = std::find(m_subscribers_identities.begin(), m_subscribers_identities.end(), identities[j]);
                auto index = id_iterator - m_subscribers_identities.begin();
                m_topic_handlers[element_iterator - m_topics.begin()]->sendToSubscriber(identities[j], m_subscribers_ip_endpoints[index], measures[j]);
            }
        }
    }
}
