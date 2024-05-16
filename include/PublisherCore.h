#ifndef DRONEPROTOCOL_PUBLISHERCORE_H
#define DRONEPROTOCOL_PUBLISHERCORE_H

#pragma once

#include <string>
#include <boost/log/trivial.hpp>
#include "TcpClient.h"

class PublisherCore : public TcpClient
{
public:
    PublisherCore(const std::string& id, TcpIpId& broker_id, boost::asio::io_context& io_context);

    void publish(const std::string& code, unsigned long long timestamp, double value);
};

#endif
