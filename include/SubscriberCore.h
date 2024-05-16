#ifndef DRONEPROTOCOL_SUBSCRIBERCORE_H
#define DRONEPROTOCOL_SUBSCRIBERCORE_H

#pragma once

#include <string>
#include <boost/signals2.hpp>
#include <boost/log/trivial.hpp>
#include "TcpClient.h"
#include "MessageType.h"
#include "Subscription.h"
#include "AggregationType.h"

class SubscriberCore : public TcpClient
{
    typedef boost::signals2::signal<void(const std::string&, unsigned long long, double)> DataReceived;

private:
    /**
     * Subscription topic
     */
    std::string m_topic;
    /**
     * Message update frequency
     */
    double m_interval;
    /**
     * Specified data aggregation
     */
    AggregationType m_aggregation;

public:
    SubscriberCore(const std::string& id, TcpIpId& proxy_id, const std::string& topic, double interval, AggregationType aggregation, boost::asio::io_context& io_context);

    void subscribe();

    void read() override;

    void onMessageReceived(const boost::system::error_code& error);

    DataReceived onDataReceived;
};

#endif
