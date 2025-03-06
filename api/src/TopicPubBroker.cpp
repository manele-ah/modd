#include "PubBroker.h"
#include "TopicPubBroker.h"

/**
 * @brief Initialize a topic handler.
 * @param code: Topic ID.
 * @param size: Size of the double buffer associated with the topic.
 * @param logs_path: Path for logging measures related to the topic.
 */
TopicPubBroker::TopicPubBroker(const std::string& code, unsigned int size, const std::string& logs_path) : Topic(code, size, logs_path + code + ".csv"), m_buffer(m_size, true, m_logs_path)
{

}

/**
 * @brief Read messages from the topic's double buffer.
 * @param buffer: Buffer to store read messages.
 */
void TopicPubBroker::read(std::vector<Message>& buffer)
{
    m_buffer.readBuffer(buffer);
}

/**
 * @brief Write a message to the topic's double buffer.
 * @param message: Message to be written.
 */
void TopicPubBroker::write(const Message& message)
{
    m_buffer.writeElement(message);
    if (m_is_buffer_empty)
    {
        m_is_buffer_empty = false;
    }
}

/**
 * @brief Construct a message for delivery based on the specified aggregation type.
 * @param aggregation: Type of aggregation to apply on the data.
 * @param slot_id: Time slot ID.
 * @return Constructed message ready for delivery.
 */
Message TopicPubBroker::constructMessage(const AggregationType& aggregation, long long slot_id)
{
    Message constructed_message;
    constructed_message.setMessageId(slot_id);

    if (!m_is_buffer_empty)
    {
        BOOST_LOG_TRIVIAL(debug) << "[Topic PubBroker] Construct message";

        bool empty_message = false;
        std::vector<Message> buffer;
        buffer.reserve(m_size);
        read(buffer);

        auto buffer_iterator = buffer.begin();
        while (buffer_iterator != buffer.end() && !empty_message)
        {
            if (buffer_iterator->getMessageType() == MessageType::NO_TYPE || buffer_iterator->getPayload().empty())
            {
                empty_message = true;
            }
            buffer_iterator += 1;
        }

        if (!empty_message)
        {
            switch (aggregation)
            {
                case AggregationType::NONE:
                {
                    std::vector<Measure> measures;
                    std::string code;
                    for (auto iterator = buffer.begin(); iterator != buffer.end(); ++iterator)
                    {
                        const PublishedMeasure current_measure = dynamic_cast<const PublishedMeasure&>(*(iterator->getPayload()[0]));
                        if (iterator == buffer.begin())
                        {
                            code = current_measure.getCode();
                        }
                        measures.push_back({current_measure.getTimestamp(), current_measure.getValue()});
                    }
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_NO_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(code, measures));
                    break;
                }
                case AggregationType::MIN:
                {
                    const PublishedMeasure first_measure = dynamic_cast<const PublishedMeasure&>(*(buffer.begin()->getPayload().at(0)));
                    double min = first_measure.getValue();
                    std::string code = first_measure.getCode();
                    unsigned long long timestamp = first_measure.getTimestamp();
                    for (auto iterator = buffer.begin() + 1; iterator != buffer.end(); ++iterator)
                    {
                        const PublishedMeasure current_measure = dynamic_cast<const PublishedMeasure&>(*(iterator->getPayload()[0]));
                        if (current_measure.getValue() < min)
                        {
                            min = current_measure.getValue();
                            code = current_measure.getCode();
                            timestamp = current_measure.getTimestamp();
                        }
                    }
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(code, timestamp, min));
                    break;
                }
                case AggregationType::MAX:
                {
                    const PublishedMeasure first_measure = dynamic_cast<const PublishedMeasure&>(*(buffer.begin()->getPayload()[0]));
                    double max = first_measure.getValue();
                    std::string code = first_measure.getCode();
                    unsigned long long timestamp = first_measure.getTimestamp();
                    for (auto iterator = buffer.begin() + 1; iterator != buffer.end(); ++iterator)
                    {
                        const PublishedMeasure current_measure = dynamic_cast<const PublishedMeasure&>(*(iterator->getPayload()[0]));
                        if (current_measure.getValue() > max)
                        {
                            max = current_measure.getValue();
                            code = current_measure.getCode();
                            timestamp = current_measure.getTimestamp();
                        }
                    }
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(code, timestamp, max));
                    break;
                }
                case AggregationType::FIRST:
                {
                    const PublishedMeasure first_measure = dynamic_cast<const PublishedMeasure&>(*(buffer.begin()->getPayload()[0]));
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(first_measure.getCode(), first_measure.getTimestamp(), first_measure.getValue()));
                    break;
                }
                case AggregationType::LAST:
                {
                    const PublishedMeasure last_measure = dynamic_cast<const PublishedMeasure&>(*(buffer.rbegin()->getPayload()[0]));
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(last_measure.getCode(), last_measure.getTimestamp(), last_measure.getValue()));
                    break;
                }
                case AggregationType::AVERAGE:
                {
                    double sum_value = 0.0;
                    std::string code = {};
                    unsigned long long timestamp = 0;
                    for (auto iterator = buffer.begin(); iterator != buffer.end(); ++iterator)
                    {
                        const PublishedMeasure current_measure = dynamic_cast<const PublishedMeasure&>(*(iterator->getPayload()[0]));
                        sum_value += current_measure.getValue();
                        if (iterator == buffer.begin())
                        {
                            code = current_measure.getCode();
                            timestamp = current_measure.getTimestamp();
                        }
                    }
                    constructed_message.setMessageType(MessageType::SEND_SUB_BROKER_SINGLE_AGGREGATION);
                    constructed_message.setPayload(std::make_unique<DeliveredMeasure>(code, timestamp, sum_value / m_size));
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
    }

    BOOST_LOG_TRIVIAL(debug) << "[Topic PubBroker] Size: " << sizeof(constructed_message);

    return constructed_message;
}
