#include "DeliveredMeasure.h"

DeliveredMeasure::DeliveredMeasure(const std::string& code, unsigned long long timestamp, double value) : m_code(code)
{
    m_measures.push_back({timestamp, value});
}

DeliveredMeasure::DeliveredMeasure(const std::string& code, const std::vector<Measure>& measures) : m_code(code), m_measures(measures)
{

}


std::unique_ptr<Payload> DeliveredMeasure::clone() const
{
    return std::make_unique<DeliveredMeasure>(m_code, m_measures);
}

std::string DeliveredMeasure::getCode() const
{
    return m_code;
}

unsigned long long DeliveredMeasure::getTimestamp() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_timestamp;
    }
    return 0;
}

double DeliveredMeasure::getValue() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_value;
    }
    return 0.0;
}

std::vector<Measure> DeliveredMeasure::getMeasures() const
{
    return m_measures;
}

std::string DeliveredMeasure::print() const
{
    std::string output = m_code + ",";

    for (int j = 0; j < m_measures.size(); j++)
    {
        output += std::to_string(m_measures[j].m_timestamp) + "," + std::to_string(m_measures[j].m_value);
        if (j != m_measures.size() - 1)
        {
            output += ",";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(DeliveredMeasure)


