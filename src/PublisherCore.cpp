#include "PublisherCore.h"

PublisherCore::PublisherCore(const std::string& id, TcpIpId& broker_id, boost::asio::io_context& io_context) : TcpClient(id, broker_id, io_context)
{
    TcpClient::connect();
}

void PublisherCore::publish(const std::string& code, unsigned long long timestamp, double value)
{
    BOOST_LOG_TRIVIAL(debug) << "[Publisher] Publish measure";
    Message message(MessageType::PUBLISH_BROKER, std::make_unique<PublishedMeasure>(code, timestamp, value));
    BOOST_LOG_TRIVIAL(debug) << "[Publisher] Size: " << sizeof(message);
    TcpClient::write(message);
}

