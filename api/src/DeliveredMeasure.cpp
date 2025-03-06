#include <utility>
#include "DeliveredMeasure.h"

/**
 * @brief Initialize a measure with a topic ID and a single (timestamp, value) tuple.
 * @param code: Topic ID of the measure.
 * @param timestamp: Timestamp of the measure.
 * @param value: Value of the measure.
 */
DeliveredMeasure::DeliveredMeasure(const std::string& code, unsigned long long timestamp, double value) : m_code(code)
{
    m_measures.push_back({timestamp, value});
}

/**
 * @brief Initialize a measure with a topic ID and a list of (timestamp, value) tuples.
 * @param code: Topic ID of the measure.
 * @param measures: List of (timestamp, value) tuples.
 */
DeliveredMeasure::DeliveredMeasure(const std::string& code, const std::vector<Measure>& measures) : m_code(code), m_measures(measures)
{

}

/**
 * @brief Create a deep copy of a DeliveredMeasure instance.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> DeliveredMeasure::clone() const
{
    return std::make_unique<DeliveredMeasure>(m_code, m_measures);
}

/**
 * @brief Retrieve the topic ID of the delivered measures.
 * @return Topic ID of the measures.
 */
std::string DeliveredMeasure::getCode() const
{
    return m_code;
}

/**
 * @brief Retrieve the timestamp of the delivered measure.
 * @return Timestamp of the measure.
 */
unsigned long long DeliveredMeasure::getTimestamp() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_timestamp;
    }
    return 0;
}

/**
 * @brief Retrieve the value of the delivered measure.
 * @return Value of the measure.
 */
double DeliveredMeasure::getValue() const
{
    if (!m_measures.empty())
    {
        return m_measures[0].m_value;
    }
    return 0.0;
}

/**
 * @brief Retrieve the list of (timestamp, value) tuples contained within the delivered measures.
 * @return (timestamp, value) tuples.
 */
std::vector<Measure> DeliveredMeasure::getMeasures() const
{
    return m_measures;
}

/**
 * @brief Return a string representation of the delivered measures.
 * @return String that represents the delivered measures content.
 */
std::string DeliveredMeasure::print() const
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

BOOST_CLASS_EXPORT(DeliveredMeasure)


