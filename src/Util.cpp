#include "Util.h"

std::atomic<int> global_id(0);

/**
 * Generate an ID by incrementing a global variable.
 * @return Generated ID.
 */
unsigned long generateId()
{
    return (unsigned long) ++global_id;
}

/**
 * Compute least common multiple from a list of integers.
 * @param numbers: List of integers.
 * @return Computed LCM.
 */
int computeLeastCommonMultiple(const std::vector<int>& numbers)
{
    int lcm_value = numbers[0];

    for (int number : numbers)
    {
        lcm_value = std::lcm(lcm_value, number);
    }

    return lcm_value;
}

/**
 * Convert a string to an enumeration of type AggregationType.
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
 * Convert an enumeration of type AggregationType to a string.
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
 * Parse topics file.
 * @param file_path: Path of the given file.
 * @return Retrieved list of topics.
 */
std::vector<std::pair<std::string, int>> parseTopicFile(const std::string& file_path)
{
    std::vector<std::pair<std::string, int>> result;
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
                int size = std::stoi(string_size);
                result.emplace_back(topic, size);
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
 * Parse subscribers file.
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
 * Parse properties file.
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
 * Extract IP address and port number from a string.
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
        BOOST_LOG_TRIVIAL(error) << "[Util] Invalid IP:port format.";
    }

    return result;
}