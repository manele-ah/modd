#include "MessageType.h"

/**
 * Overload the "<<" operator for a message type.
 * @param out: Reference to the output stream where the message type will be added.
 * @param type: Reference to a message type.
 * @return The modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const MessageType& type)
{
    return out << asInteger(type);
}