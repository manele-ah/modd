#ifndef DRONEPROTOCOL_MESSAGE_H
#define DRONEPROTOCOL_MESSAGE_H

#pragma once

#include <string>
#include <memory>
#include <vector>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/utility.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/split_member.hpp>
#include "Schedule.h"
#include "MessageType.h"
#include "Subscription.h"
#include "PublishedMeasure.h"
#include "DeliveredMeasure.h"
#include "TopicConfiguration.h"

/** Class that defines a message. */
class Message
{
private:
    /** Message ID. */
    int m_slot_id;
    /** Message type. */
    MessageType m_type;
    /** List of payloads. */
    std::vector<std::unique_ptr<Payload>> m_payloads;

public:
    /**
     * Initialize a message with a list of payloads.
     * @param type: Message type.
     * @param payloads: List of pointers for each payload.
     */
    explicit Message(const MessageType& type = MessageType::NO_TYPE, std::vector<std::unique_ptr<Payload>> payloads = {}, int slot_id = -1);

    /**
     * Initialize a message with one payload.
     * @param type: Message type.
     * @param payload: Payload pointer.
     */
    Message(const MessageType& type, std::unique_ptr<Payload> payload, int slot_id = -1);

    /**
     * Copy constructor of a message.
     * @param message: Message to copy.
     */
    Message(const Message& message);

    /**
     * Virtual destructor of a message.
     */
    virtual ~Message() = default;

    int getMessageId() const;

    MessageType getMessageType() const;

    std::vector<std::unique_ptr<Payload>> getPayload() const;

    void setMessageId(int slot_id);

    void setMessageType(MessageType type);

    void setPayload(std::vector<std::unique_ptr<Payload>> payload);

    void setPayload(std::unique_ptr<Payload> payload);

    Message& operator=(const Message& message);

    friend std::ostream& operator<<(std::ostream& out, const Message& message);

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<PublishedMeasure>();
        ar.template register_type<DeliveredMeasure>();
        ar.template register_type<Subscription>();
        ar.template register_type<TopicConfiguration>();
        ar.template register_type<Schedule>();

        ar & m_slot_id & m_type & m_payloads;
    }
};

#endif
