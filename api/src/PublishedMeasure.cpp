#include <utility>

#include "PublishedMeasure.h"

/**
 * @brief Initialize a measure with a topic ID and a single (timestamp, value) tuple.
 * @param code: Topic ID of the measure.
 * @param timestamp: Timestamp of the measure.
 * @param value: Value of the measure.
 */
PublishedMeasure::PublishedMeasure(const std::string& code, unsigned long long timestamp, double value) : m_code(code)
{
    m_measures.push_back({timestamp, value});
}

/**
 * @brief Initialize a measure with a topic ID and a list of (timestamp, value) tuples.
 * @param code: Topic ID of the measure.
 * @param measures: List of (timestamp, value) tuples.
 */
PublishedMeasure::PublishedMeasure(const std::string& code, const std::vector<Measure>& measures) : m_code(code), m_measures(measures)
{

}

/**
 * @brief Create a deep copy of a PublishedMeasure instance.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> PublishedMeasure::clone() const
{
    return std::make_unique<PublishedMeasure>(m_code, m_measures);
}

/**
 * @brief Retrieve the topic ID of the published measure.
 * @return Topic ID of the measure.
 */
std::string PublishedMeasure::getCode() const
{
    return m_code;
}

/**
 * @brief Retrieve the timestamp of the published measure.
 * @return Timestamp of the measure.
 */
unsigned long long PublishedMeasure::getTimestamp() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_timestamp;
    }
    return 0;
}

/**
 * @brief Retrieve the value of the published measure.
 * @return Value of the measure.
 */
double PublishedMeasure::getValue() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_value;
    }
    return 0.0;
}

/**
 * @brief Retrieve the list of (timestamp, value) tuples contained within the published measures.
 * @return (timestamp, value) tuples.
 */
std::vector<Measure> PublishedMeasure::getMeasures() const
{
    return m_measures;
}

/**
 * @brief Return a string representation of the published measures.
 * @return String that represents the published measures content.
 */
std::string PublishedMeasure::print() const
{
    std::string output = m_code + ", ";

    for (size_t j = 0; j < m_measures.size(); j++)
    {
        output += std::to_string(m_measures[j].m_timestamp) + ", " + std::to_string(m_measures[j].m_value);
        if (j != m_measures.size() - 1)
        {
            output += ", ";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(PublishedMeasure)
