#include "Helper.h"

std::string generateRosTopicName(const std::string& base_topic, double period, AggregationType aggregation)
{
    std::string aggregation_string = aggregationToString(aggregation);
    std::ostringstream string_stream;
    string_stream << base_topic << "/" << aggregation_string << "/p" << std::fixed << std::setprecision(2) << period ;

    std::string topic = string_stream.str();
    std::replace(topic.begin(), topic.end(), '.', '_');
    
    return topic;
}

std::vector<SubscriberConfig> parseSubscriberConfig(const std::string& file_path)
{
    std::vector<SubscriberConfig> configs;
    std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> parsed_subscribers = parseSubscriberFile(file_path);

    for (const auto& tuple : parsed_subscribers)
    {
        SubscriberConfig subscriber_config;
        subscriber_config.name = std::get<0>(tuple);
        subscriber_config.topic = std::get<1>(tuple);
        subscriber_config.period = std::get<2>(tuple);
        subscriber_config.aggregation_type = std::get<3>(tuple);
        configs.push_back(subscriber_config);
    }

    return configs;
}