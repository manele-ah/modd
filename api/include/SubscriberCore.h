#ifndef MODD_SUBSCRIBERCORE_H
#define MODD_SUBSCRIBERCORE_H

#pragma once

#include <string>
#include <boost/signals2.hpp>
#include <boost/log/trivial.hpp>
#include "TcpClient.h"
#include "MessageType.h"
#include "Subscription.h"
#include "AggregationType.h"

/**
 * @class SubscriberCore
 * @brief Class that defines the core logic of a subscriber.
 */
class SubscriberCore : public TcpClient
{
    /** Signal for notifying subscribers whenever new data are received. */
    typedef boost::signals2::signal<void(const std::string&, unsigned long long, double)> DataReceived;

private:
    /** Subscription topic. */
    std::string m_topic;
    /** Time period between consecutive updates, expressed in seconds. */
    double m_interval;
    /** Requested data aggregation. */
    AggregationType m_aggregation;

public:
    /**
     * @brief Initialize a subscriber instance.
     * @param id: Subscriber ID.
     * @param sub_broker_id: SubBroker TCP/IP ID.
     * @param topic: Topic of interest for the subscriber.
     * @param interval: Delivery interval in seconds.
     * @param aggregation: Aggregation type requested by the subscriber.
     * @param io_context: Reference to Boost I/O context.
     */
    SubscriberCore(const std::string& id, TcpIpId& sub_broker_id, const std::string& topic, double interval, AggregationType aggregation, boost::asio::io_context& io_context);

    /**
     * @brief Send a subscription request to the SubBroker.
     */
    void subscribe();

    /**
     * @brief Read messages sent by the SubBroker.
     */
    void read() override;

    /**
     * @brief Handle the receipt of a message and emits a signal if the message contains valid data for the subscriber.
     * @param error: System-specific error code  indicating the success or failure of the operation.
     */
    void onMessageReceived(const boost::system::error_code& error);

    /** Signal emitted when new data are received from the SubBroker. */
    DataReceived onDataReceived;
};

#endif
