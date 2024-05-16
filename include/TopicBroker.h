#ifndef DRONEPROTOCOL_TOPICBROKER_H
#define DRONEPROTOCOL_TOPICBROKER_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "Topic.h"
#include "Broker.h"
#include "DoubleBuffer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class Topic;

class Broker;

class TopicBroker : public Topic
{
private:
    DoubleBuffer<Message> m_buffer;

public:
    TopicBroker(const std::string& code, int size, const std::string& logs_path);

    void read(std::vector<Message>& buffer);

    void write(const Message& message);

    Message constructMessage(const AggregationType& aggregation, int slot_id);
};

typedef boost::shared_ptr<TopicBroker> p_topic_broker;

#endif
