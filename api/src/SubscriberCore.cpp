#include "SubscriberCore.h"

/**
 * @brief Initialize a subscriber instance.
 * @param id: Subscriber ID.
 * @param sub_broker_id: SubBroker TCP/IP ID.
 * @param topic: Topic of interest for the subscriber.
 * @param interval: Delivery interval in seconds.
 * @param aggregation: Aggregation type requested by the subscriber.
 * @param io_context: Reference to Boost I/O context.
 */
SubscriberCore::SubscriberCore(const std::string& id, TcpIpId& sub_broker_id, const std::string& topic, double interval, AggregationType aggregation, boost::asio::io_context& io_context) : TcpClient(id, sub_broker_id, io_context), m_topic(topic), m_interval(interval), m_aggregation(aggregation)
{
    TcpClient::connect();
}

/**
 * @brief Send a subscription request to the SubBroker.
 */
void SubscriberCore::subscribe()
{
    BOOST_LOG_TRIVIAL(info) << "[Subscriber] Subscribe to topic: " << m_topic;
    unsigned long long interval_milliseconds = secondToMillisecond(m_interval);
    Message message(MessageType::SUBSCRIBE_SUB_BROKER, std::make_unique<Subscription>(m_id, interval_milliseconds, m_aggregation, m_topic));
    TcpClient::write(message);
}

/**
 * @brief Read messages sent by the SubBroker.
 */
void SubscriberCore::read()
{
    m_connection->read(m_message_received, boost::bind(&SubscriberCore::onMessageReceived, this, boost::asio::placeholders::error));
}

/**
 * @brief Handle the receipt of a message and emits a signal if the message contains valid data for the subscriber.
 * @param error: System-specific error code  indicating the success or failure of the operation.
 */
void SubscriberCore::onMessageReceived(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[Subscriber] Read handler successful";
        m_connection->read(m_message_received, boost::bind(&SubscriberCore::onMessageReceived, this, boost::asio::placeholders::error));
        switch (m_message_received.getMessageType())
        {
            case MessageType::SEND_SUBSCRIBER:
            {
                BOOST_LOG_TRIVIAL(info) << "[Subscriber] Message received (" << m_message_received << ")";
                PublishedMeasure measure = dynamic_cast<const PublishedMeasure&>(*m_message_received.getPayload()[0]);
                onDataReceived(m_id, measure.getTimestamp(), measure.getValue());
                break;
            }
            default:
            {
                break;
            }
        }

    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[Subscriber] Read handler failed";
    }
}

