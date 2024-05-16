#ifndef DRONEPROTOCOL_UTIL_H
#define DRONEPROTOCOL_UTIL_H

#pragma once

#include <atomic>
#include <vector>
#include <string>
#include <numeric>
#include <fstream>
#include <sstream>
#include <iostream>
#include <optional>
#include <unordered_map>
#include <boost/log/trivial.hpp>
#include "TcpIpId.h"
#include "AggregationType.h"

/** Global ID used for messages. */
extern std::atomic<int> global_id;

/**
 * Generate an ID by incrementing a global variable.
 * @return Generated ID.
 */
unsigned long generateId();

/**
 * Compute least common multiple from a list of integers.
 * @param numbers: List of integers.
 * @return Computed LCM.
 */
int computeLeastCommonMultiple(const std::vector<int>& numbers);

/**
 * Convert a string to an enumeration of type AggregationType.
 * @param aggregation_string: String to be converted.
 * @return Corresponding AggregationType if it is valid.
 */
std::optional<AggregationType> stringToAggregation(const std::string& aggregation_string);

/**
 * Convert an enumeration of type AggregationType to a string.
 * @param aggregation_type: Aggregation type to be converted.
 * @return Corresponding string.
 */
std::string aggregationToString(AggregationType aggregation_type);

/**
 * Parse topics file.
 * @param file_path: Path of the given file.
 * @return Retrieved list of topics.
 */
std::vector<std::pair<std::string, int>> parseTopicFile(const std::string& file_path);

/**
 * Parse subscribers file.
 * @param file_path: Path of the given file.
 * @return List of configurations for each subscriber.
 */
std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> parseSubscriberFile(const std::string& file_path);

/**
 * Parse properties file.
 * @param file_path: Path of the given file.
 * @return List of pairs (key, value).
 */
std::unordered_map<std::string, std::string> parsePropertiesFile(const std::string& file_path);

/**
 * Extract IP address and port number from a string.
 * @param ip_port_string: String containing IP address and port number.
 * @return Structure containing IP address and port number.
 */
TcpIpId extractIpAndPort(const std::string& ip_port_string);

/**
 * Generate a schedule from the given subscribers information.
 * @tparam T Type of information for each subscriber. It can be an ID or a pair of (topic, aggregation).
 * @param subscribers_periods: List of periods expressed in milliseconds.
 * @param subscribers_information: Information for each subscriber.
 * @return Generated schedule.
 */
template<typename T>
std::vector<std::vector<T>> generateSchedule(const std::vector<int>& subscribers_periods, const std::vector<T>& subscribers_information)
{
    int hyper_period = computeLeastCommonMultiple(subscribers_periods);
    std::vector<std::vector<T>> generated_schedule(hyper_period);

    for (size_t iterator = 0; iterator < subscribers_periods.size(); ++iterator)
    {
        auto insertIfNotPresent = [&](size_t time_index, const T& info)
        {
            auto& slot = generated_schedule[time_index];
            if (std::find(slot.begin(), slot.end(), info) == slot.end())
            {
                slot.push_back(info);
            }
        };

        insertIfNotPresent(0, subscribers_information[iterator]);
        size_t time = subscribers_periods[iterator];
        while (time < hyper_period)
        {
            insertIfNotPresent(time, subscribers_information[iterator]);
            time += subscribers_periods[iterator];
        }
    }

    return generated_schedule;
}

/**
 * Convert an enumerated type value to an integer.
 * @tparam T: Enumerated type to be converted.
 * @param value: Enumeration value to be converted.
 * @return Integer representation of the enumeration value.
 */
template<typename T>
auto asInteger(T const value) -> typename std::underlying_type<T>::type
{
    return static_cast<typename std::underlying_type<T>::type>(value);
}

#endif
