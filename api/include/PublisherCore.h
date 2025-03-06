#ifndef MODD_PUBLISHERCORE_H
#define MODD_PUBLISHERCORE_H

#pragma once

#include <string>
#include <boost/log/trivial.hpp>
#include "TcpClient.h"

/**
 * @class PublisherCore
 * @brief Class that defines the core logic of a publisher.
 */
class PublisherCore : public TcpClient
{
public:
    /**
     * @brief Initialize a publisher instance.
     * @param id: Publisher ID.
     * @param broker_id: PubBroker TCP/IP ID.
     * @param io_context: Reference to Boost I/O context.
     */
    PublisherCore(const std::string& id, TcpIpId& broker_id, boost::asio::io_context& io_context);

    /**
     * @brief Publish a message to the PubBroker.
     * @param code: Topic ID of the published measure.
     * @param timestamp: Timestamp of the measure.
     * @param value: Value of the measure.
     */
    void publish(const std::string& code, unsigned long long timestamp, double value);
};

#endif
