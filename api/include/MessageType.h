#ifndef DRONEPROTOCOL_MESSAGETYPE_H
#define DRONEPROTOCOL_MESSAGETYPE_H

#pragma once

#include <iostream>
#include "Util.h"

/**
 * Types of supported messages.
 */
enum class MessageType
{
    NO_TYPE, PEER_SERVER_HANDSHAKE, PEER_SERVER_PING, SEND_TOPICS_BROKER, SEND_SCHEDULE_BROKER, PUBLISH_BROKER,
    SUBSCRIBE_PROXY, SEND_PROXY_SINGLE_AGGREGATION, SEND_PROXY_SINGLE_NO_AGGREGATION, SEND_PROXY_BATCH_SAME,
    SEND_PROXY_BATCH_DIFFERENT, SEND_SUBSCRIBER
};

/**
 * Overload the "<<" operator for a message type.
 * @param out: Reference to the output stream where the message type will be added.
 * @param type: Reference to a message type.
 * @return The modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const MessageType& type);

#endif

