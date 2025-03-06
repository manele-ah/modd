#ifndef MODD_MESSAGE_H
#define MODD_MESSAGE_H

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

/** @class Message
 * @brief Class that defines a message.
 */
class Message
{
private:
    /** Message type. */
    MessageType m_type;
    /** List of payloads. */
    std::vector<std::unique_ptr<Payload>> m_payloads;
    /** Message ID. */
    long long m_slot_id;

public:
    /**
     * @brief Initialize a message with a list of payloads.
     * @param type: Message type.
     * @param payloads: List of pointers for each payload.
     * @param slot_id: Message ID.
     */
    explicit Message(const MessageType& type = MessageType::NO_TYPE, std::vector<std::unique_ptr<Payload>> payloads = {}, long long slot_id = -1);

    /**
     * @brief Initialize a message with a single payload.
     * @param type: Message type.
     * @param payload: Payload pointer.
     * @param slot_id: Message ID.
     */
    Message(const MessageType& type, std::unique_ptr<Payload> payload, long long slot_id = -1);

    /**
     * @brief Copy constructor of a message.
     * @param message: Message to copy from.
     */
    Message(const Message& message);

    /**
     * @brief Virtual destructor of a message.
     */
    virtual ~Message() = default;

    /**
     * @brief Retrieve the message ID.
     * @return ID of the message.
     */
    long long getMessageId() const;

    /**
     * @brief Retrieve the message type.
     * @return Type of the message.
     */
    MessageType getMessageType() const;

    /**
     * @brief Retrieve the list of payloads contained in the message.
     * @return Vector of pointers to payloads.
     */
    std::vector<std::unique_ptr<Payload>> getPayload() const;

    /**
     * @brief Set the message ID.
     * @param slot_id: ID to assign to the message.
     */
    void setMessageId(long long slot_id);

    /**
     * @brief Set the message type.
     * @param type: Type to assign to the message.
     */
    void setMessageType(MessageType type);

    /**
     * @brief Set the list of payloads for the message.
     * @param payload: Payloads to assign to the message.
     */
    void setPayload(std::vector<std::unique_ptr<Payload>> payload);

    /**
     * @brief Set a single payload for the message.
     * @param payload: Payload to assign to the message.
     */
    void setPayload(std::unique_ptr<Payload> payload);

    /**
     * @brief Overload the assignment operator for copying messages.
     * @param message: Message to copy from.
     * @return Reference to the updated message.
     */
    Message& operator=(const Message& message);

    /**
     * @brief Overload the output stream operator for printing message details.
     * @param out: Output stream to write to.
     * @param message: Reference to a message.
     * @return Reference to the modified output stream.
     */
    friend std::ostream& operator<<(std::ostream& out, const Message& message);

    /**
     * Grant access to Boost serialization for private members of the Message class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize a message.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned int)
    {
        archive.template register_type<PublishedMeasure>();
        archive.template register_type<DeliveredMeasure>();
        archive.template register_type<Subscription>();
        archive.template register_type<TopicConfiguration>();
        archive.template register_type<Schedule>();

        archive & m_slot_id & m_type & m_payloads;
    }
};

#endif
