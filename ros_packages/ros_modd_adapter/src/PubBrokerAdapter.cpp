#include "PubBrokerAdapter.h"

PubBrokerAdapter::PubBrokerAdapter() : Node(Constants::PUB_BROKER_NODE_NAME), m_io_context(), m_pub_broker_thread()
{
    this->declare_parameter(Constants::PUB_BROKER_IP_ARGUMENT_NAME, Constants::PUB_BROKER_IP_ARGUMENT_DEFAULT);
    this->declare_parameter(Constants::SUB_BROKER_IP_ARGUMENT_NAME, Constants::SUB_BROKER_IP_ARGUMENT_DEFAULT);
    // ROS 2 doesn't handle unsigned integers...
    this->declare_parameter(Constants::PUB_BROKER_PORT_ARGUMENT_NAME, static_cast<int>(Constants::PUB_BROKER_PORT_ARGUMENT_DEFAULT));
    this->declare_parameter(Constants::SUB_BROKER_PORT_ARGUMENT_NAME, static_cast<int>(Constants::SUB_BROKER_PORT_ARGUMENT_DEFAULT));
    this->declare_parameter(Constants::PUB_BROKER_LOGS_PATH_ARGUMENT_NAME, Constants::PUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT);

    this->get_parameter(Constants::PUB_BROKER_IP_ARGUMENT_NAME, m_pub_broker_ip);
    this->get_parameter(Constants::SUB_BROKER_IP_ARGUMENT_NAME, m_sub_broker_ip);
    this->get_parameter(Constants::PUB_BROKER_PORT_ARGUMENT_NAME, m_pub_broker_port);
    this->get_parameter(Constants::SUB_BROKER_PORT_ARGUMENT_NAME, m_sub_broker_port);
    this->get_parameter(Constants::PUB_BROKER_LOGS_PATH_ARGUMENT_NAME, m_logs_path);

    TcpIpId pub_broker_id(m_pub_broker_ip, m_pub_broker_port);
    TcpIpId sub_broker_id(m_sub_broker_ip, m_sub_broker_port);

    m_pub_broker = std::make_shared<PubBroker>(pub_broker_id, sub_broker_id, m_logs_path, m_io_context);

    m_pub_broker_thread = std::thread([this]() { m_io_context.run(); });

    RCLCPP_INFO(this->get_logger(), "[PubBroker Node] Node started at %s:%d", m_pub_broker_ip.c_str(), m_pub_broker_port);

    m_poll_timer = this->create_wall_timer(std::chrono::milliseconds(Constants::PUB_BROKER_TIMER_PERIOD), std::bind(&PubBrokerAdapter::pollPubBrokerTopics, this));
}

void PubBrokerAdapter::pollPubBrokerTopics()
{
    std::vector<std::string> topics = m_pub_broker->getTopics();

    if (topics.empty())
    {
        RCLCPP_DEBUG(this->get_logger(), "[PubBroker Node] No topics yet from SubBroker...");
        return; 
    }

    for (const std::string& topic : topics)
    {
        if (m_known_topics.find(topic) == m_known_topics.end())
        {
            subscribeToTopic(topic);
            m_known_topics.insert(topic);
        }
    }

    if (!topics.empty())
    {
        RCLCPP_DEBUG(this->get_logger(), "[PubBroker Node] Retrieved %zu topics", topics.size());
        m_poll_timer->cancel();
    }

}

void PubBrokerAdapter::subscribeToTopic(const std::string& topic)
{
    auto callback = [this, topic](const interfaces::msg::Measure::SharedPtr message)
    {
        this->forwardToPubBroker(topic, message);
    };

    auto subscription = this->create_subscription<interfaces::msg::Measure>(topic, Constants::PUB_BROKER_ROS_QUEUE_SIZE, callback);
    m_subscriptions[topic] = subscription;
    RCLCPP_INFO(this->get_logger(), "[PubBroker Node] Subscribe to topic: %s", topic.c_str());
}

void PubBrokerAdapter::forwardToPubBroker(const std::string& topic, const interfaces::msg::Measure::SharedPtr message)
{
    Message modd_message(MessageType::PUBLISH_PUB_BROKER, std::make_unique<PublishedMeasure>(topic, message->timestamp, message->value));

    m_pub_broker->publish(topic, modd_message);

    RCLCPP_DEBUG(this->get_logger(), "[PubBroker Node] Publish measure to '%s': (%" PRIu64 ",%f)", topic.c_str(), message->timestamp, message->value);
}

PubBrokerAdapter::~PubBrokerAdapter()
{
    RCLCPP_INFO(this->get_logger(), "[PubBroker Node] Shutting down...");

    m_io_context.stop();
    if (m_pub_broker_thread.joinable())
    {
        m_pub_broker_thread.join();
    }
}