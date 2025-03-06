#ifndef MODD_TOPICBROKER_H
#define MODD_TOPICBROKER_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "Topic.h"
#include "DoubleBuffer.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"

class PubBroker;

/**
 * @class TopicPubBroker
 * @brief Class that handles messages for a specific topic at the PubBroker level.
 */
class TopicPubBroker : public Topic
{
private:
    /** Double buffer for storing messages associated to a specific topic. */
    DoubleBuffer<Message> m_buffer;

public:
    /**
     * @brief Initialize a topic handler.
     * @param code: Topic ID.
     * @param size: Size of the double buffer associated with the topic.
     * @param logs_path: Path for logging measures related to the topic.
     */
    TopicPubBroker(const std::string& code, unsigned int size, const std::string& logs_path);

    /**
     * @brief Read messages from the topic's double buffer.
     * @param buffer: Buffer to store read messages.
     */
    void read(std::vector<Message>& buffer);

    /**
     * @brief Write a message to the topic's double buffer.
     * @param message: Message to be written.
     */
    void write(const Message& message);

    /**
     * @brief Construct a message for delivery based on the specified aggregation type.
     * @param aggregation: Type of aggregation to apply on the data.
     * @param slot_id: Time slot ID.
     * @return Constructed message ready for delivery.
     */
    Message constructMessage(const AggregationType& aggregation, long long slot_id);
};

typedef boost::shared_ptr<TopicPubBroker> p_topic_pub_broker;

#endif
