#ifndef MODD_MESSAGETYPE_H
#define MODD_MESSAGETYPE_H

#pragma once

#include <iostream>
#include "Util.h"

/**
 * @enum MessageType
 * @brief Types of supported messages.
 */
enum class MessageType
{
    NO_TYPE, PEER_SERVER_HANDSHAKE, PEER_SERVER_PING, SEND_TOPICS_PUB_BROKER, SEND_SCHEDULE_PUB_BROKER,
    PUBLISH_PUB_BROKER, SUBSCRIBE_SUB_BROKER, SEND_SUB_BROKER_SINGLE_AGGREGATION, SEND_SUB_BROKER_SINGLE_NO_AGGREGATION,
    SEND_SUB_BROKER_BATCH_DIFFERENT, SEND_SUBSCRIBER
};

/**
 * @brief Overload the output stream operator for printing message types.
 * @param out: Output stream to write to.
 * @param type: Reference to a message type.
 * @return Reference to the modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const MessageType& type);

#endif

