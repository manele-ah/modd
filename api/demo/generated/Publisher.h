#ifndef MODD_PUBLISHER_H
#define MODD_PUBLISHER_H

#pragma once

#include <thread>
#include <vector>
#include <string>
#include <fstream>
#include <sstream>
#include <boost/asio.hpp>
#include "PublisherCore.h"

/**
 * @class Publisher
 * @brief Class that manages a publisher, acting as a high-level wrapper for PublisherCore.
 */
class Publisher
{
private:
    /** Reference to the I/O context for asynchronous operations. */
    boost::asio::io_context m_io_context;
    /** PubBroker TCP/IP ID. */
    TcpIpId m_id_pub_broker;
    /** Core publisher logic. */
    PublisherCore m_core_publisher;
    /** Dedicated thread for running the I/O context. */
    std::thread m_io_thread;
    /** To ensure that the I/O context remains active. */
    boost::asio::executor_work_guard<boost::asio::io_context::executor_type> m_work_guard;
    /** Flag to prevent repeated shutdown. */
    std::atomic<bool> m_stopped{false};

    /**
     * @brief Start the I/O context in a separate thread to handle asynchronous operations.
     */
    void startIoContext();

public:
    /**
     * @brief Initialize a publisher instance.
     * @param name: Publisher ID.
     */
    Publisher(const std::string& name);

    /**
     * @brief Destructor that ensures proper shutdown of the publisher and its I/O thread.
     */
    ~Publisher();

    /**
     * @brief Publish a message to the PubBroker.
     * @param topic: Topic ID of the published measure.
     * @param timestamp: Timestamp of the measure.
     * @param value: Value of the measure.
     */
    void publish(const std::string& topic, long long timestamp, double value);

    /**
     * @brief Stop the I/O context, terminating asynchronous operations safely.
     */
    void stopIoContext();
};

#endif
