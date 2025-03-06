#ifndef MODD_BROKER_H
#define MODD_BROKER_H

#pragma once

#include <set>
#include <vector>
#include <string>
#include <iterator>
#include <algorithm>
#include <functional>
#include <boost/asio.hpp>
#include <boost/log/trivial.hpp>
#include <boost/enable_shared_from_this.hpp>
#include "Util.h"
#include "PeerTcpServer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class TcpSession;

class TopicPubBroker;

typedef boost::shared_ptr<TcpSession> p_tcp_session;
typedef boost::shared_ptr<TopicPubBroker> p_topic_pub_broker;

/**
 * @class PubBroker
 * @brief Class that defines the PubBroker.
 * It manages the publication process and acts as an intermediary between the SubBroker and the publishers.
 */
class PubBroker : public PeerTcpServer
{
private:
    /** Path for storing logged measures. */
    std::string m_logs_path;
    /** List of managed topics. */
    std::vector<std::string> m_topics;
    /** List of topic handlers. */
    std::vector<p_topic_pub_broker> m_topic_handlers;
    /** Delivery schedule mapping time slots to topics. */
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule;
    /** Timer for managing schedule. */
    boost::asio::high_resolution_timer m_timer;
    /** Current active slot in schedule. */
    long long m_current_slot;

public:
    /**
     * @brief Initialize the PubBroker and start listening for incoming connections.
     * @param id: PubBroker TCP/IP ID.
     * @param sub_broker_id: SubBroker TCP/IP ID.
     * @param logs_path: File path for logging published measures.
     * @param io_context: Reference to Boost I/O context.
     */
    PubBroker(TcpIpId& id, TcpIpId& sub_broker_id, const std::string& logs_path, boost::asio::io_context& io_context);

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
     * @brief Publish a message to the specified topic.
     * @param topic: Topic under which the message is published.
     * @param message: Message to publish.
     */
    void publish(const std::string& topic, const Message& message);

    /**
     * @brief Manage message distribution based on the current schedule.
     */
    void processSchedule();

    /**
     * @brief Retrieve managed topics.
     * @return List of managed topics.
     */
    std::vector<std::string> getTopics();
};

#endif
