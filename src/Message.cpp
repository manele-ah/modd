#include "Message.h"

Message::Message(const MessageType& type, std::vector<std::unique_ptr<Payload>> payloads, int slot_id) : m_type(type), m_payloads(std::move(payloads)), m_slot_id(slot_id)
{

}

Message::Message(const MessageType& type, std::unique_ptr<Payload> payload, int slot_id) : m_type(type), m_slot_id(slot_id)
{
    m_payloads.push_back(std::move(payload));
}

Message::Message(const Message& message) : m_slot_id(message.getMessageId()), m_type(message.m_type)
{
    m_payloads.clear();
    for (const auto& payload : message.m_payloads)
    {
        m_payloads.push_back(payload ? payload->clone() : std::make_unique<Payload>());
    }
}

int Message::getMessageId() const
{
    return m_slot_id;
}

MessageType Message::getMessageType() const
{
    return m_type;
}

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

void Message::setMessageId(int slot_id)
{
    m_slot_id = slot_id;
}

void Message::setMessageType(MessageType type)
{
    m_type = type;
}

void Message::setPayload(std::vector<std::unique_ptr<Payload>> payload)
{
    m_payloads = std::move(payload);
}

void Message::setPayload(std::unique_ptr<Payload> payload)
{
    m_payloads.push_back(std::move(payload));
}

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

std::ostream& operator<<(std::ostream& out, const Message& message)
{
    // return out << "ID = " << message.m_id << ", Type = " << message.m_type << ", Payload = " << *message.m_payload;
    out << "ID = " << message.m_slot_id << ", Type = " << message.m_type << ", Payloads = [";
    for (int j = 0; j < message.m_payloads.size(); ++j)
    {
        out << "(" << *message.m_payloads[j] << ")";
        if (j != message.m_payloads.size() - 1)
        {
            out << ",";
        }
    }
    return out << "]";
}