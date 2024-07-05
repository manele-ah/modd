#include "../include/PublishedMeasure.h"

PublishedMeasure::PublishedMeasure(const std::string& code, unsigned long long timestamp, double value) : m_code(code)
{
    m_measures.push_back({timestamp, value});
}

PublishedMeasure::PublishedMeasure(const std::string& code, const std::vector<Measure>& measures) : m_code(code), m_measures(measures)
{

}

std::unique_ptr<Payload> PublishedMeasure::clone() const
{
    return std::make_unique<PublishedMeasure>(m_code, m_measures);
}

std::string PublishedMeasure::getCode() const
{
    return m_code;
}

unsigned long long PublishedMeasure::getTimestamp() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_timestamp;
    }
    return 0;
}

double PublishedMeasure::getValue() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_value;
    }
    return 0.0;
}

std::vector<Measure> PublishedMeasure::getMeasures() const
{
    return m_measures;
}

std::string PublishedMeasure::print() const
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

BOOST_CLASS_EXPORT(PublishedMeasure)
