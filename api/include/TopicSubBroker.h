#ifndef MODD_TOPICPROXY_H
#define MODD_TOPICPROXY_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "Topic.h"
#include "SimpleBuffer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class Topic;

class SubBroker;

/**
 * @class TopicSubBroker
 * @brief Class that handles messages and subscriptions for a specific topic at the SubBroker level.
 */
class TopicSubBroker : public Topic
{
private:
    /** Set of active subscribers associated with the topic. */
    std::set<p_tcp_session> m_subscribers;
    /** IDs of the subscribers. */
    std::vector<std::string> m_identities;
    /** List of subscription intervals for each subscriber. */
    std::vector<unsigned long long> m_intervals;
    /** List of aggregation types specified by each subscriber. */
    std::vector<AggregationType> m_aggregations;
    /** Buffer for storing messages associated to a specific topic. */
    SimpleBuffer<Message> m_buffer;
    /** Counter for the number of active subscribers. */
    unsigned int m_subscribers_counter;

public:
    /**
     * @brief Initialize a topic handler.
     * @param code: Topic ID.
     * @param size: Size of the double buffer associated with the topic.
     * @param logs_path: Path for logging measures related to the topic.
     */
    TopicSubBroker(const std::string& code, unsigned int size, const std::string& logs_path);

    /**
     * @brief Subscribe a new subscriber to the topic.
     * @param id: Subscriber ID.
     * @param interval: Delivery interval.
     * @param aggregation: Aggregation type requested.
     * @param subscriber: Shared pointer to the TCP session representing the subscriber.
     */
    void subscribe(const std::string& id, unsigned long long interval, const AggregationType& aggregation, p_tcp_session subscriber);

    /**
     * @brief Send aggregated data to the specified subscriber.
     * @param id: Subscriber ID.
     * @param ip_endpoint: IP address endpoint of the subscriber.
     * @param measures: List of aggregated measures to be sent to the subscriber.
     */
    void sendToSubscriber(const std::string& id, const std::string& ip_endpoint, const std::vector<Measure>& measures);
};

typedef boost::shared_ptr<TopicSubBroker> p_topic_sub_broker;

#endif
