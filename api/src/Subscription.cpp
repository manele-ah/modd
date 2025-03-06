#include "Subscription.h"

/**
 * @brief Initialize a subscription request.
 * @param id: ID of the subscriber requesting the subscription.
 * @param interval: Delivery interval in milliseconds.
 * @param aggregation: Aggregation type requested by the subscriber.
 * @param code: Topic of interest for the subscriber.
 */
Subscription::Subscription(const std::string& id, unsigned long long interval, AggregationType aggregation, const std::string& code) : m_id(id), m_interval(interval), m_aggregation(aggregation), m_code(code)
{

}

/**
 * @brief Create a deep copy of a Subscription instance.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> Subscription::clone() const
{
    return std::make_unique<Subscription>(m_id, m_interval, m_aggregation, m_code);
}

/**
 * @brief Retrieve the ID of the subscriber requesting the subscription.
 * @return Subscriber ID.
 */
std::string Subscription::getId() const
{
    return m_id;
}

/**
 * @brief Retrieve the delivery interval.
 * @return Delivery interval between two consecutive updates.
 */
unsigned long long Subscription::getInterval() const
{
    return m_interval;
}

/**
 * @brief Retrieve the aggregation type of the subscription.
 * @return Aggregation type of the received data.
 */
AggregationType Subscription::getAggregation() const
{
    return m_aggregation;
}

/**
 * @brief Retrieve the topic ID related to the subscription.
 * @return Topic of the received data.
 */
std::string Subscription::getCode() const
{
    return m_code;
}

/**
 * @brief Return a string representation of the subscription request.
 * @return String that represents the subscription request.
 */
std::string Subscription::print() const
{
    return m_id + ", " + std::to_string(m_interval) + ", " + std::to_string(asInteger(m_aggregation)) + ", " + m_code;
}

BOOST_CLASS_EXPORT(Subscription)
