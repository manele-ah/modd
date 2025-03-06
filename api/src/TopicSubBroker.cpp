#include "SubBroker.h"
#include "TopicSubBroker.h"

/**
 * @brief Initialize a topic handler.
 * @param code: Topic ID.
 * @param size: Size of the double buffer associated with the topic.
 * @param logs_path: Path for logging measures related to the topic.
 */
TopicSubBroker::TopicSubBroker(const std::string& code, unsigned int size, const std::string& logs_path) : Topic(code, size, logs_path + code + ".csv"), m_buffer(m_size, false, m_logs_path), m_subscribers_counter(0)
{

}

/**
 * @brief Subscribe a new subscriber to the topic.
 * @param id: Subscriber ID.
 * @param interval: Delivery interval.
 * @param aggregation: Aggregation type requested.
 * @param subscriber: Shared pointer to the TCP session representing the subscriber.
 */
void TopicSubBroker::subscribe(const std::string& id, unsigned long long interval, const AggregationType& aggregation, p_tcp_session subscriber)
{
    auto element_iterator = std::find(m_identities.begin(), m_identities.end(), id);
    if (element_iterator == m_identities.end())
    {
        m_subscribers.insert(subscriber);
        m_identities.push_back(id);
        m_intervals.push_back(interval);
        m_aggregations.push_back(aggregation);
        BOOST_LOG_TRIVIAL(debug) << "[Topic SubBroker] Size: " << m_subscribers.size();
        m_subscribers_counter += 1;
    }
}

/**
 * @brief Send aggregated data to the specified subscriber.
 * @param id: Subscriber ID.
 * @param ip_endpoint: IP address endpoint of the subscriber.
 * @param measures: List of aggregated measures to be sent to the subscriber.
 */
void TopicSubBroker::sendToSubscriber(const std::string& id, [[maybe_unused]] const std::string& ip_endpoint, const std::vector<Measure>& measures)
{
    auto element_iterator = std::find(m_identities.begin(), m_identities.end(), id);
    if (element_iterator != m_identities.end())
    {
        BOOST_LOG_TRIVIAL(debug) << "[Topic SubBroker] Deliver to subscriber: " << id;
        Message message(MessageType::SEND_SUBSCRIBER, std::make_unique<PublishedMeasure>(m_code, measures));
        auto subscriber_iterator = std::next(m_subscribers.begin(), element_iterator - m_identities.begin());
        (*subscriber_iterator)->deliver(message);
    }
}