#include "Message.h"

/**
 * @brief Initialize a message with a list of payloads.
 * @param type: Message type.
 * @param payloads: List of pointers for each payload.
 * @param slot_id: Message ID.
 */
Message::Message(const MessageType& type, std::vector<std::unique_ptr<Payload>> payloads, long long slot_id) : m_type(type), m_payloads(std::move(payloads)), m_slot_id(slot_id)
{

}

/**
 * @brief Initialize a message with a single payload.
 * @param type: Message type.
 * @param payload: Payload pointer.
 * @param slot_id: Message ID.
 */
Message::Message(const MessageType& type, std::unique_ptr<Payload> payload, long long slot_id) : m_type(type), m_slot_id(slot_id)
{
    m_payloads.push_back(std::move(payload));
}

/**
 * @brief Copy constructor of a message.
 * @param message: Message to copy from.
 */
Message::Message(const Message& message) : m_type(message.m_type), m_slot_id(message.getMessageId())
{
    m_payloads.clear();
    for (const auto& payload : message.m_payloads)
    {
        m_payloads.push_back(payload ? payload->clone() : std::make_unique<Payload>());
    }
}

/**
 * @brief Retrieve the message ID.
 * @return ID of the message.
 */
long long Message::getMessageId() const
{
    return m_slot_id;
}

/**
 * @brief Retrieve the message type.
 * @return Type of the message.
 */
MessageType Message::getMessageType() const
{
    return m_type;
}

/**
 * @brief Retrieve the list of payloads contained in the message.
 * @return Vector of pointers to payloads.
 */
std::vector<std::unique_ptr<Payload>> Message::getPayload() const
{
    // return m_payload->clone();
    std::vector<std::unique_ptr<Payload>> cloned_payload;
    for (const auto& payload : m_payloads)
    {
        cloned_payload.push_back(payload->clone());
    }
    return cloned_payload;
}

/**
 * @brief Set the message ID.
 * @param slot_id: ID to assign to the message.
 */
void Message::setMessageId(long long slot_id)
{
    m_slot_id = slot_id;
}

/**
 * @brief Set the message type.
 * @param type: Type to assign to the message.
 */
void Message::setMessageType(MessageType type)
{
    m_type = type;
}

/**
 * @brief Set the list of payloads for the message.
 * @param payload: Payloads to assign to the message.
 */
void Message::setPayload(std::vector<std::unique_ptr<Payload>> payload)
{
    m_payloads = std::move(payload);
}

/**
 * @brief Set a single payload for the message.
 * @param payload: Payload to assign to the message.
 */
void Message::setPayload(std::unique_ptr<Payload> payload)
{
    m_payloads.push_back(std::move(payload));
}

/**
 * @brief Overload the assignment operator for copying messages.
 * @param message: Message to copy from.
 * @return Reference to the updated message.
 */
Message& Message::operator=(const Message& message)
{
    m_slot_id = message.m_slot_id;
    m_type = message.m_type;
    // m_payload = message.m_payload ? message.m_payload->clone() : std::make_unique<Payload>();
    m_payloads.clear();
    for (const auto& payload : message.m_payloads)
    {
        m_payloads.push_back(payload ? payload->clone() : std::make_unique<Payload>());
    }
    return *this;
}

/**
 * @brief Overload the output stream operator for printing message details.
 * @param out: Output stream to write to.
 * @param message: Reference to a message.
 * @return Reference to the modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Message& message)
{
    // return out << "ID = " << message.m_id << ", Type = " << message.m_type << ", Payload = " << *message.m_payload;
    out << "Type = " << message.m_type << ", Payloads = [";
    for (size_t j = 0; j < message.m_payloads.size(); ++j)
    {
        out << "(" << *message.m_payloads[j] << ")";
        if (j != message.m_payloads.size() - 1)
        {
            out << ", ";
        }
    }
    return out << "]";
}