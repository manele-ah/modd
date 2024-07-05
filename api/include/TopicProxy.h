#ifndef DRONEPROTOCOL_TOPICPROXY_H
#define DRONEPROTOCOL_TOPICPROXY_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "Topic.h"
#include "Proxy.h"
#include "SimpleBuffer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class Topic;

class Proxy;

class TopicProxy : public Topic
{
private:
    int m_subscribers_counter;
    std::set<p_tcp_session> m_subscribers;
    std::vector<std::string> m_identities;
    std::vector<int> m_intervals;
    std::vector<AggregationType> m_aggregations;
    SimpleBuffer<Message> m_buffer;

public:
    TopicProxy(const std::string& code, int size, const std::string& logs_path);

    void subscribe(const std::string& id, int interval, const AggregationType& aggregation, p_tcp_session subscriber);

    void unsubscribe(p_tcp_session subscriber);

    void sendToSubscriber(const std::string& id, const std::string& ip_endpoint, const std::vector<Measure>& measures);
};

typedef boost::shared_ptr<TopicProxy> p_topic_proxy;

#endif
