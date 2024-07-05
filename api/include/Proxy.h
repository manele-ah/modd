#ifndef DRONEPROTOCOL_PROXY_H
#define DRONEPROTOCOL_PROXY_H

#pragma once

#include <ranges>
#include <memory>
#include <utility>
#include <boost/asio.hpp>
#include <boost/log/trivial.hpp>
#include <boost/enable_shared_from_this.hpp>
#include "TcpSession.h"
#include "TopicProxy.h"
#include "PeerTcpServer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class TcpSession;

class TopicProxy;

typedef boost::shared_ptr<TcpSession> p_tcp_session;
typedef boost::shared_ptr<TopicProxy> p_topic_proxy;
typedef boost::weak_ptr<TopicProxy> p_weak_topic_proxy;

/** Class that defines a proxy. */
class Proxy : public PeerTcpServer
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
    std::vector<p_topic_proxy> m_topic_handlers;
    /** List of identifiers for each subscriber. */
    std::vector<std::string> m_subscribers_identities;
    /** List of topics each subscriber is interested in. */
    std::vector<std::string> m_subscribers_topics;
    /** Delivery intervals for each subscriber, expressed in milliseconds. */
    std::vector<int> m_subscribers_intervals;
    /** Types of data aggregation requested by subscribers. */
    std::vector<AggregationType> m_subscribers_aggregations;
    /** List of endpoints for each subscriber. */
    std::vector<std::string> m_subscribers_ip_endpoints;
    /** Delivery schedule mapping time slots to topics. */
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule_topics;
    /** Delivery schedule mapping time slots to subscribers. */
    std::vector<std::vector<std::string>> m_schedule_subscribers;
    /** Last saved timestamp when sending a ping to the broker. */
    long long m_last_ping_timestamp;

public:
    Proxy(TcpIpId& id, TcpIpId& broker_id, const std::string& topics_path, const std::string& subscribers_path, const std::string& logs_path, boost::asio::io_context& io_context);

    /**
     * Configure proxy with list of topics and subscribers.
     */
    std::vector<std::pair<std::string, int>> initializeConfiguration();

    /**
     * Initialize communication with broker.
     */
    void initializeCommunication();

    void addTopic(const std::string& topic, int size);

    void decode(const Message& message, p_tcp_session session) override;

    void subscribe(const std::string& id, int interval, const AggregationType& aggregation, const std::string& topic, p_tcp_session session);

    void sendPingToBroker();

    void sendTopicsToBroker(std::vector<std::pair<std::string, int>> measured_variables);

    void sendScheduleToBroker();

    void deliverSingle(const std::string& id, const std::string& topic, const std::vector<Measure>& measures);

    void deliverBatch(std::vector<std::string> identities, std::vector<std::string> topics, const std::vector<std::vector<Measure>>& measures);

};

#endif
