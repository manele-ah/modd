#include "Util.h"

std::atomic<unsigned long> global_id(0);

/**
 * @brief Generate an ID by incrementing a global variable.
 * @return Generated ID.
 */
unsigned long generateId()
{
    return ++global_id;
}

/**
 * @brief Compute least common multiple from a list of integers.
 * @param numbers: List of integers.
 * @return Computed LCM.
 */
unsigned long long computeLeastCommonMultiple(const std::vector<unsigned long long>& numbers)
{
    unsigned long long lcm_value = 0;

    if (!numbers.empty())
    {
        lcm_value = numbers[0];
        for (unsigned long long number : numbers)
        {
            lcm_value = std::lcm(lcm_value, number);
        }
    }

    return lcm_value;
}

/**
 * @brief Convert a string to an enumeration of type AggregationType.
 * @param aggregation_string: String to be converted.
 * @return Corresponding AggregationType if it is valid.
 */
std::optional<AggregationType> stringToAggregation(const std::string& aggregation_string)
{
    static const std::unordered_map<std::string, AggregationType> map =
    {
        {"NONE", AggregationType::NONE},
        {"MIN", AggregationType::MIN},
        {"MAX", AggregationType::MAX},
        {"FIRST", AggregationType::FIRST},
        {"LAST", AggregationType::LAST},
        {"AVERAGE", AggregationType::AVERAGE},
    };

    auto iterator = map.find(aggregation_string);
    if (iterator != map.end())
    {
        return iterator->second;
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Invalid AggregationType: " << aggregation_string;
        return std::nullopt;
    }
}

/**
 * @brief Convert an enumeration of type AggregationType to a string.
 * @param aggregation_type: Aggregation type to be converted.
 * @return Corresponding string.
 */
std::string aggregationToString(AggregationType aggregation_type)
{
    static const std::unordered_map<AggregationType, std::string> map =
    {
        {AggregationType::NONE, "NONE"},
        {AggregationType::MIN, "MIN"},
        {AggregationType::MAX, "MAX"},
        {AggregationType::FIRST, "FIRST"},
        {AggregationType::LAST, "LAST"},
        {AggregationType::AVERAGE, "AVERAGE"},
    };

    auto iterator = map.find(aggregation_type);
    if (iterator != map.end())
    {
        return iterator->second;
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Invalid AggregationType";
        return "";
    }
}

/**
 * @brief Parse topics file.
 * @param file_path: Path of the given file.
 * @return Retrieved list of topics.
 */
std::vector<std::pair<std::string, double>> parseTopicFile(const std::string& file_path)
{
    std::vector<std::pair<std::string, double>> result;
    std::ifstream file_stream(file_path);

    if (!file_stream)
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Failed to open file " << file_path;
    }
    else
    {
        std::string line;
        while (std::getline(file_stream, line))
        {
            std::istringstream line_stream(line);
            std::string topic, string_size;

            if (std::getline(line_stream, topic, ',') && std::getline(line_stream, string_size, ','))
            {
                double interval = std::stod(string_size);
                result.emplace_back(topic, interval);
            }
            else
            {
                BOOST_LOG_TRIVIAL(error) << "[Util] Failed to parse line " << line;
            }
        }

        file_stream.close();
    }

    return result;
}

/**
 * @brief Parse subscribers file.
 * @param file_path: Path of the given file.
 * @return List of configurations for each subscriber.
 */
std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> parseSubscriberFile(const std::string& file_path)
{
    std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> result;
    std::ifstream file_stream(file_path);

    if (!file_stream)
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Failed to open file " << file_path;
    }
    else
    {
        std::string line;
        while (std::getline(file_stream, line))
        {
            std::istringstream line_stream(line);
            std::string id, topic, string_interval, string_aggregation, ip_address_port;

            if (std::getline(line_stream, id, ',') &&
                std::getline(line_stream, topic, ',') &&
                std::getline(line_stream, string_interval, ',') &&
                std::getline(line_stream, string_aggregation, ',') &&
                std::getline(line_stream, ip_address_port, ','))
            {
                double interval = std::stod(string_interval);
                std::optional<AggregationType> aggregation = stringToAggregation(string_aggregation);
                if (aggregation.has_value())
                {
                    result.emplace_back(id, topic, interval, *aggregation, ip_address_port);
                }
            }
            else
            {
                BOOST_LOG_TRIVIAL(error) << "[Util] Failed to parse line " << line;
            }
        }

        file_stream.close();
    }

    return result;
}

/**
 * @brief Parse properties file.
 * @param file_path: Path of the given file.
 * @return List of pairs (key, value).
 */
std::unordered_map<std::string, std::string> parsePropertiesFile(const std::string& file_path)
{
    std::unordered_map<std::string, std::string> result;
    std::ifstream file_stream(file_path);

    if (!file_stream)
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Failed to open file " << file_path;
    }
    else
    {
        std::string line;
        while (std::getline(file_stream, line))
        {
            std::istringstream line_stream(line);
            std::string key;

            if (std::getline(line_stream, key, '='))
            {
                std::string value;
                if (std::getline(line_stream, value))
                {
                    value.erase(remove(value.begin(), value.end(), '\"'), value.end());
                    result[key] = value;
                }
            }
            else
            {
                BOOST_LOG_TRIVIAL(error) << "[Util] Failed to parse line " << line;
            }
        }
    }

    return result;
}

/**
 * @brief Extract IP address and port number from a string.
 * @param ip_port_string: String containing IP address and port number.
 * @return Structure containing IP address and port number.
 */
TcpIpId extractIpAndPort(const std::string& ip_port_string)
{
    TcpIpId result;
    size_t colon_position = ip_port_string.find(':');
    if (colon_position != std::string::npos)
    {
        result.setIp(ip_port_string.substr(0, colon_position));
        result.setPort(std::stoul(ip_port_string.substr(colon_position + 1)));
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[Util] Invalid IP:port format";
    }

    return result;
}

/**
 * @brief Convert a duration expressed in milliseconds to its equivalent in seconds.
 * @param millisecond_value: Duration expressed in milliseconds.
 * @return Duration expressed in seconds.
 */
double millisecondToSecond(unsigned long long millisecond_value)
{
    return std::chrono::duration<double, std::ratio<1, 1>>(std::chrono::milliseconds(millisecond_value)).count();
}

/**
 * @brief Convert a duration expressed in seconds to its equivalent in milliseconds.
 * @param second_value: Duration expressed in seconds.
 * @return Duration expressed in milliseconds.
 */
unsigned long long secondToMillisecond(double second_value)
{
    std::chrono::duration<double> second_duration(second_value);
    return std::chrono::duration_cast<std::chrono::milliseconds>(second_duration).count();
}


/**
 * @brief Create suitable structures for the buffer optimization problem and map subscribers to topics.
 * @param subscribers_topics: List of topics each subscriber is interested in.
 * @param subscribers_intervals: Delivery intervals for each subscriber, expressed in milliseconds.
 * @param topics: List of topics.
 * @param topics_info: List of pairs associating topics with their periods, expressed in seconds.
 * @return A tuple containing:
 *      - Delivery intervals for each subscriber, expressed in seconds.
 *      - List of periods for each topic.
 *      - 2D vector associating topics with their subscribers' indices.
 */
std::tuple<std::vector<double>, std::vector<double>, std::vector<std::vector<int>>> mapSubscriberTopicData(const std::vector<std::string>& subscribers_topics, const std::vector<unsigned long long>& subscribers_intervals, const std::vector<std::string>& topics, const std::vector<std::pair<std::string, double>>& topics_info)
{
    std::vector<double> topics_periods(topics.size(), 0.0);

    for (size_t i = 0; i < topics.size(); i++)
    {
        std::string key = topics[i];
        auto iterator = std::find_if(topics_info.begin(), topics_info.end(), [&key](const std::pair<std::string, double>& info)
        {
            return info.first == key;
        });
        if (iterator != topics_info.end())
        {
            topics_periods[i] = iterator->second;
        }
    }

    std::vector<double> subscribers_periods(subscribers_intervals.size());
    for (size_t i = 0; i < subscribers_intervals.size(); i++)
    {
        subscribers_periods[i] = millisecondToSecond(subscribers_intervals[i]);
    }

    std::vector<std::vector<int>> associations(topics.size());
    for (size_t i = 0; i < topics.size(); i++)
    {
        auto iterator = subscribers_topics.begin();
        while ((iterator = std::find(iterator, subscribers_topics.end(), topics[i])) != subscribers_topics.end())
        {
            int index = static_cast<int>(std::distance(subscribers_topics.begin(), iterator));
            associations[i].push_back(index);
            iterator += 1;
        }
    }

    return {subscribers_periods, topics_periods, associations};
}