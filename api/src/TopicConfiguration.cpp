#include "../include/TopicConfiguration.h"

TopicConfiguration::TopicConfiguration()
{

}

TopicConfiguration::TopicConfiguration(const std::vector<std::string>& topics, const std::vector<int>& sizes)
{
    if (topics.size() == sizes.size())
    {
        m_topics = topics;
        m_sizes = sizes;
    }
}

std::unique_ptr<Payload> TopicConfiguration::clone() const
{
    return std::make_unique<TopicConfiguration>(m_topics, m_sizes);
}

/**
 * Getter method for topics.
 * @return List of topics.
 */
std::vector<std::string> TopicConfiguration::getTopics() const
{
    return m_topics;
}

/**
 * Getter method for sizes for each topic.
 * @return List of sizes.
 */
std::vector<int> TopicConfiguration::getSizes() const
{
    return m_sizes;
}

std::string TopicConfiguration::print() const
{
    std::string output;

    for (int j = 0; j < m_topics.size(); j++)
    {
        output += "(" + m_topics[j] + "," + std::to_string(m_sizes[j]) + ")";
        if (j != m_topics.size() - 1)
        {
            output += ",";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(TopicConfiguration)
