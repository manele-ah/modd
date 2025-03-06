#ifndef MODD_UTIL_H
#define MODD_UTIL_H

#pragma once

#include <ratio>
#include <chrono>
#include <atomic>
#include <vector>
#include <string>
#include <numeric>
#include <fstream>
#include <sstream>
#include <iostream>
#include <optional>
#include <algorithm>
#include <unordered_map>
#include <boost/log/trivial.hpp>
#include "TcpIpId.h"
#include "AggregationType.h"

/**
 * @file Util.h
 * @brief Various helper functions needed by MoDD.
 */

/** Global ID used for messages. */
extern std::atomic<unsigned long> global_id;

/**
 * @brief Generate an ID by incrementing a global variable.
 * @return Generated ID.
 */
unsigned long generateId();

/**
 * @brief Compute least common multiple from a list of integers.
 * @param numbers: List of integers.
 * @return Computed LCM.
 */
unsigned long long computeLeastCommonMultiple(const std::vector<unsigned long long>& numbers);

/**
 * @brief Convert a string to an enumeration of type AggregationType.
 * @param aggregation_string: String to be converted.
 * @return Corresponding AggregationType if it is valid.
 */
std::optional<AggregationType> stringToAggregation(const std::string& aggregation_string);

/**
 * @brief Convert an enumeration of type AggregationType to a string.
 * @param aggregation_type: Aggregation type to be converted.
 * @return Corresponding string.
 */
std::string aggregationToString(AggregationType aggregation_type);

/**
 * @brief Parse topics file.
 * @param file_path: Path of the given file.
 * @return Retrieved list of topics.
 */
std::vector<std::pair<std::string, double>> parseTopicFile(const std::string& file_path);

/**
 * @brief Parse subscribers file.
 * @param file_path: Path of the given file.
 * @return List of configurations for each subscriber.
 */
std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> parseSubscriberFile(const std::string& file_path);

/**
 * @brief Parse properties file.
 * @param file_path: Path of the given file.
 * @return List of pairs (key, value).
 */
std::unordered_map<std::string, std::string> parsePropertiesFile(const std::string& file_path);

/**
 * @brief Extract IP address and port number from a string.
 * @param ip_port_string: String containing IP address and port number.
 * @return Structure containing IP address and port number.
 */
TcpIpId extractIpAndPort(const std::string& ip_port_string);

/**
 * @brief Convert a duration expressed in milliseconds to its equivalent in seconds.
 * @param millisecond_value: Duration expressed in milliseconds.
 * @return Duration expressed in seconds.
 */
double millisecondToSecond(unsigned long long millisecond_value);

/**
 * @brief Convert a duration expressed in seconds to its equivalent in milliseconds.
 * @param second_value: Duration expressed in seconds.
 * @return Duration expressed in milliseconds.
 */
unsigned long long secondToMillisecond(double second_value);

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
std::tuple<std::vector<double>, std::vector<double>, std::vector<std::vector<int>>> mapSubscriberTopicData(const std::vector<std::string>& subscribers_topics, const std::vector<unsigned long long>& subscribers_intervals, const std::vector<std::string>& topics, const std::vector<std::pair<std::string, double>>& topics_info);

/**
 * @brief Generate a schedule from the given subscribers information.
 * @tparam T: Type of information for each subscriber. It can be an ID or a pair of (topic, aggregation).
 * @param subscribers_periods: List of periods expressed in milliseconds.
 * @param subscribers_information: Information for each subscriber.
 * @return Generated schedule.
 */
template<typename T>
std::vector<std::vector<T>> generateSchedule(const std::vector<unsigned long long>& subscribers_periods, const std::vector<T>& subscribers_information)
{
    unsigned long long hyper_period = computeLeastCommonMultiple(subscribers_periods);
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
        unsigned long long time = subscribers_periods[iterator];
        while (time < hyper_period)
        {
            insertIfNotPresent(time, subscribers_information[iterator]);
            time += subscribers_periods[iterator];
        }
    }

    return generated_schedule;
}

/**
 * @brief Convert an enumerated type value to an integer.
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
