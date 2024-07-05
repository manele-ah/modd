#ifndef DRONEPROTOCOL_BROKER_H
#define DRONEPROTOCOL_BROKER_H

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
#include "TcpSession.h"
#include "TopicBroker.h"
#include "PeerTcpServer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class TcpSession;

class TopicBroker;

typedef boost::shared_ptr<TcpSession> p_tcp_session;
typedef boost::shared_ptr<TopicBroker> p_topic_broker;

/** Class that defines a broker. */
class Broker : public PeerTcpServer
{
private:
    /** Path for storing logged measures. */
    std::string m_logs_path;
    /** List of managed topics. */
    std::vector<std::string> m_topics;
    /** List of topic handlers. */
    std::vector<p_topic_broker> m_topic_handlers;
    /** Delivery schedule mapping time slots to topics. */
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule;
    /** Timer for managing schedule. */
    boost::asio::high_resolution_timer m_timer;
    /** Current slot in schedule. */
    unsigned long long m_current_slot;

public:
    Broker(TcpIpId& id, TcpIpId& proxy_id, const std::string& logs_path, boost::asio::io_context& io_context);

    void decode(const Message& message, p_tcp_session session) override;

    void addTopic(const std::string& topic, int size);

    void publish(const std::string& topic, const Message& message);

    void processSchedule();
};

#endif
