#include "../include/SubscriberCore.h"

SubscriberCore::SubscriberCore(const std::string& id, TcpIpId& proxy_id, const std::string& topic, double interval, AggregationType aggregation, boost::asio::io_context& io_context) : TcpClient(id, proxy_id, io_context), m_topic(topic), m_interval(interval), m_aggregation(aggregation)
{
    TcpClient::connect();
}

/**
 * Subscribe to topic
 */
void SubscriberCore::subscribe()
{
    BOOST_LOG_TRIVIAL(info) << "[Subscriber] Subscribe to topic";
    Message message(MessageType::SUBSCRIBE_PROXY, std::make_unique<Subscription>(m_id, m_interval, m_aggregation, m_topic));
    TcpClient::write(message);
}

/**
 * Read the message sent by the proxy
 */
void SubscriberCore::read()
{
    m_connection->read(m_message_received, boost::bind(&SubscriberCore::onMessageReceived, this, boost::asio::placeholders::error));
}

/**
 * Called when a message is received
 * @param error: System-specific error code
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

