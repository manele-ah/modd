#ifndef MODD_SUBSCRIBER_H
#define MODD_SUBSCRIBER_H

#pragma once

#include <thread>
#include <memory>
#include <boost/asio.hpp>
#include "SubscriberCore.h"

/**
 * @class Subscriber
 * @brief Class that manages a subscriber, acting as a high-level wrapper for SubscriberCore.
 */
class Subscriber
{
private:
    /** Reference to the I/O context for asynchronous operations. */
    boost::asio::io_context m_io_context;
    /** SubBroker TCP/IP ID. */
    TcpIpId m_id_sub_broker;
    /** Core subscriber logic. */
    SubscriberCore m_subscriber_core;
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
     * @brief Initialize a subscriber instance.
     * @param name: Subscriber ID.
     * @param topic: Topic of interest for the subscriber.
     * @param period: Delivery interval in seconds.
     * @param aggregation_type: Aggregation type requested by the subscriber.
     */
    Subscriber(const std::string& name, const std::string& topic, double period, AggregationType aggregation_type);

    /**
     * @brief Destructor that ensures proper shutdown of the subscriber and its I/O thread.
     */
    ~Subscriber();

    /**
     * @brief Start subscription and listen to incoming messages.
     */
    void start();

    /**
     * @brief Stop the I/O context, terminating asynchronous operations safely.
     */
    void stopIoContext();

    /**
     * @brief Register a callback to handle incoming messages.
     * @tparam T: Callable type matching the signature of the emitted signal in SubscriberCore.
     * @param callback: Function or lambda that should be invoked whenever data are received.
     */
    template <typename T>
    void setDataCallback(T&& callback)
    {
        m_subscriber_core.onDataReceived.connect(std::forward<T>(callback));
    }
};

#endif