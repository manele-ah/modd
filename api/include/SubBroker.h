#ifndef MODD_PROXY_H
#define MODD_PROXY_H

#pragma once

#include <chrono>
#include <ranges>
#include <memory>
#include <utility>
#include <boost/asio.hpp>
#include <boost/log/trivial.hpp>
#include <boost/enable_shared_from_this.hpp>
#include "PeerTcpServer.h"
#include "BufferOptimizer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class TcpSession;

class TopicSubBroker;

typedef boost::shared_ptr<TcpSession> p_tcp_session;
typedef boost::shared_ptr<TopicSubBroker> p_topic_sub_broker;
typedef boost::weak_ptr<TopicSubBroker> p_weak_topic_sub_broker;

/**
 * @class SubBroker
 * @brief Class that defines the SubBroker.
 * It manages subscriptions and acts as an intermediary between the PubBroker and the subscribers.
 */
class SubBroker : public PeerTcpServer
{
private:
    /** Path where definitions of topics are stored. */
    std::string m_topics_path;
    /** Path where definitions of subscribers are stored. */
    std::string m_subscribers_path;
    /** Path for storing logged measures. */
    std::string m_logs_path;
    /** List of managed topics. */
    std::vector<std::string> m_topics;
    /** List of topic handlers. */
    std::vector<p_topic_sub_broker> m_topics_handlers;
    /** List of identifiers for each subscriber. */
    std::vector<std::string> m_subscribers_identities;
    /** List of topics each subscriber is interested in. */
    std::vector<std::string> m_subscribers_topics;
    /** Delivery intervals for each subscriber, expressed in milliseconds. */
    std::vector<unsigned long long> m_subscribers_intervals;
    /** Types of data aggregation requested by subscribers. */
    std::vector<AggregationType> m_subscribers_aggregations;
    /** List of endpoints for each subscriber. */
    std::vector<std::string> m_subscribers_ip_endpoints;
    /** Delivery schedule mapping time slots to topics. */
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule_topics;
    /** Delivery schedule mapping time slots to subscribers. */
    std::vector<std::vector<std::string>> m_schedule_subscribers;
    /** Last saved timestamp when sending a ping to the PubBroker, expressed in milliseconds. */
    long long m_last_ping_timestamp;

public:
    /**
     * @brief Initialize the SubBroker and start listening for incoming connections.
     * @param id: SubBroker TCP/IP ID.
     * @param pub_broker_id: PubBroker TCP/IP ID.
     * @param topics_path: Path to topics definitions.
     * @param subscribers_path: Path to subscribers definitions.
     * @param logs_path: File path for logging measures.
     * @param io_context: Reference to Boost I/O context.
     */
    SubBroker(TcpIpId& id, TcpIpId& pub_broker_id, const std::string& topics_path, const std::string& subscribers_path, const std::string& logs_path, boost::asio::io_context& io_context);

    /**
     * @brief Configure topics and subscribers handled by the SubBroker.
     * @return List of topics and their corresponding periods.
     */
    std::vector<std::pair<std::string, double>> initializeConfiguration();

    /**
     * @brief Initialize communication with the PubBroker.
     */
    void initializeCommunication();

    /**
     * @brief Decode and process incoming messages.
     * @param message: Received message to process.
     * @param session: Pointer to the active session over which the message is received.
     */
    void decode(const Message& message, p_tcp_session session) override;

    /**
     * @brief Add a topic to the list of managed topics.
     * @param topic: Name of the topic.
     * @param size: Buffer size to allocate for the topic's data handling.
     */
    void addTopic(const std::string& topic, unsigned int size);

    /**
     * @brief Subscribe a client to receive updates for a specific topic.
     * @param id: ID of the subscriber.
     * @param interval: Delivery interval in milliseconds.
     * @param aggregation: Aggregation type requested by the subscriber.
     * @param topic: Topic of interest for the subscriber.
     * @param session: TCP session associated with the subscriber.
     */
    void subscribe(const std::string& id, unsigned long long interval, const AggregationType& aggregation, const std::string& topic, p_tcp_session session);

    /**
     * @brief Send a ping message to the PubBroker.
     */
    void sendPingToPubBroker();

    /**
     * @brief Send topics configuration to the PubBroker.
     * @param topics: List of topic names.
     * @param sizes: List of buffer sizes for each topic.
     */
    void sendTopicsToPubBroker(const std::vector<std::string>& topics, const std::vector<unsigned int>& sizes);

    /**
     * @brief Send message emission schedule to the PubBroker.
     */
    void sendScheduleToPubBroker();

    /**
     * @brief Deliver a message to a single subscriber.
     * @param id: ID of the subscriber.
     * @param topic: Topic corresponding to the measures being delivered.
     * @param measures: Measures to deliver.
     */
    void deliverSingle(const std::string& id, const std::string& topic, const std::vector<Measure>& measures);

    /**
     * @brief Deliver messages to multiple subscribers.
     * @param identities: IDs of the subscribers.
     * @param topics: Topics corresponding to the measures being delivered.
     * @param measures: Measures to deliver.
     */
    void deliverBatch(std::vector<std::string> identities, std::vector<std::string> topics, const std::vector<std::vector<Measure>>& measures);

    /**
     * @brief Retrieve managed topics.
     * @return List of managed topics.
     */
    std::vector<std::string> getTopics();
};

#endif
