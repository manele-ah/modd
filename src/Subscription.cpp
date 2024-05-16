#include "Subscription.h"

Subscription::Subscription(const std::string& id, int interval, AggregationType aggregation, const std::string& code) : m_id(id), m_interval(interval), m_aggregation(aggregation), m_code(code)
{

}

std::unique_ptr<Payload> Subscription::clone() const
{
    return std::make_unique<Subscription>(m_id, m_interval, m_aggregation, m_code);
}

std::string Subscription::getId() const
{
    return m_id;
}

int Subscription::getInterval() const
{
    return m_interval;
}

AggregationType Subscription::getAggregation() const
{
    return m_aggregation;
}

std::string Subscription::getCode() const
{
    return m_code;
}

std::string Subscription::print() const
{
    return m_id + ", " + std::to_string(m_interval) + ", " + std::to_string(asInteger(m_aggregation)) + ", " + m_code;
}

BOOST_CLASS_EXPORT(Subscription)
