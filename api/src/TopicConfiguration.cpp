#include "TopicConfiguration.h"

/**
 * @brief Default constructor that initializes an empty topic configuration.
 */
TopicConfiguration::TopicConfiguration()
{

}

/**
 * @brief Initialize a topic configuration.
 * @param topics: List of topic IDs.
 * @param sizes: Sizes of the buffers associated with each topic.
 */
TopicConfiguration::TopicConfiguration(const std::vector<std::string>& topics, const std::vector<unsigned int>& sizes)
{
    if (topics.size() == sizes.size())
    {
        m_topics = topics;
        m_sizes = sizes;
    }
}

/**
 * @brief Create a deep copy of a TopicConfiguration instance.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> TopicConfiguration::clone() const
{
    return std::make_unique<TopicConfiguration>(m_topics, m_sizes);
}

/**
 * @brief Retrieve the IDs of the topics.
 * @return List of topic IDs.
 */
std::vector<std::string> TopicConfiguration::getTopics() const
{
    return m_topics;
}

/**
 * @brief Retrieve the list of sizes corresponding to each topic.
 * @return Sizes of the buffers associated with each topic.
 */
std::vector<unsigned int> TopicConfiguration::getSizes() const
{
    return m_sizes;
}

/**
 * @brief Return a string representation of the topic configuration.
 * @return String that represents the topic configuration.
 */
std::string TopicConfiguration::print() const
{
    std::string output;

    for (size_t j = 0; j < m_topics.size(); j++)
    {
        output += "(" + m_topics[j] + ", " + std::to_string(m_sizes[j]) + ")";
        if (j != m_topics.size() - 1)
        {
            output += ", ";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(TopicConfiguration)
