#ifndef ROSMODDADAPTER_HELPER_H
#define ROSMODDADAPTER_HELPER_H

#include <string>
#include <iomanip>
#include "Util.h"
#include "AggregationType.h"

struct SubscriberConfig
{
    std::string name;
    std::string topic;
    double period;
    AggregationType aggregation_type;
};

std::string generateRosTopicName(const std::string& base_topic, double period, AggregationType aggregation);

std::vector<SubscriberConfig> parseSubscriberConfig(const std::string& file_path);

#endif
