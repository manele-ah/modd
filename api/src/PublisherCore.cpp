#include "PublisherCore.h"

/**
 * @brief Initialize a publisher instance.
 * @param id: Publisher ID.
 * @param broker_id: PubBroker TCP/IP ID.
 * @param io_context: Reference to Boost I/O context.
 */
PublisherCore::PublisherCore(const std::string& id, TcpIpId& broker_id, boost::asio::io_context& io_context) : TcpClient(id, broker_id, io_context)
{
    TcpClient::connect();
}

/**
 * @brief Publish a message to the PubBroker.
 * @param code: Topic ID of the published measure.
 * @param timestamp: Timestamp of the measure.
 * @param value: Value of the measure.
 */
void PublisherCore::publish(const std::string& code, unsigned long long timestamp, double value)
{
    BOOST_LOG_TRIVIAL(debug) << "[Publisher] Publish measure";
    Message message(MessageType::PUBLISH_PUB_BROKER, std::make_unique<PublishedMeasure>(code, timestamp, value));
    BOOST_LOG_TRIVIAL(debug) << "[Publisher] Size: " << sizeof(message);
    TcpClient::write(message);
}

