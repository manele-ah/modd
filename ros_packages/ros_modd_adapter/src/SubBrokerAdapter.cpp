#include "SubBrokerAdapter.h"

SubBrokerAdapter::SubBrokerAdapter() : Node(Constants::SUB_BROKER_NODE_NAME), m_io_context(), m_sub_broker_thread(), m_subscriber_io_context(), m_subscriber_thread()
{
    this->declare_parameter(Constants::PUB_BROKER_IP_ARGUMENT_NAME, Constants::PUB_BROKER_IP_ARGUMENT_DEFAULT);
    this->declare_parameter(Constants::SUB_BROKER_IP_ARGUMENT_NAME, Constants::SUB_BROKER_IP_ARGUMENT_DEFAULT);
    // ROS 2 doesn't handle unsigned integers...
    this->declare_parameter(Constants::PUB_BROKER_PORT_ARGUMENT_NAME, static_cast<int>(Constants::PUB_BROKER_PORT_ARGUMENT_DEFAULT));
    this->declare_parameter(Constants::SUB_BROKER_PORT_ARGUMENT_NAME, static_cast<int>(Constants::SUB_BROKER_PORT_ARGUMENT_DEFAULT));
    this->declare_parameter(Constants::SUB_BROKER_LOGS_PATH_ARGUMENT_NAME, Constants::SUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT);
    this->declare_parameter(Constants::SUB_BROKER_TOPICS_PATH_ARGUMENT_NAME, Constants::SUB_BROKER_TOPICS_PATH_ARGUMENT_DEFAULT);
    this->declare_parameter(Constants::SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_NAME, Constants::SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_DEFAULT);

    this->get_parameter(Constants::PUB_BROKER_IP_ARGUMENT_NAME, m_pub_broker_ip);
    this->get_parameter(Constants::SUB_BROKER_IP_ARGUMENT_NAME, m_sub_broker_ip);
    this->get_parameter(Constants::PUB_BROKER_PORT_ARGUMENT_NAME, m_pub_broker_port);
    this->get_parameter(Constants::SUB_BROKER_PORT_ARGUMENT_NAME, m_sub_broker_port);
    this->get_parameter(Constants::SUB_BROKER_LOGS_PATH_ARGUMENT_NAME, m_logs_path);
    this->get_parameter(Constants::SUB_BROKER_TOPICS_PATH_ARGUMENT_NAME, m_topics_path);
    this->get_parameter(Constants::SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_NAME, m_subscribers_path);

    TcpIpId sub_broker_id(m_sub_broker_ip, m_sub_broker_port);
    TcpIpId pub_broker_id(m_pub_broker_ip, m_pub_broker_port);

    m_sub_broker = std::make_shared<SubBroker>(sub_broker_id, pub_broker_id, m_topics_path, m_subscribers_path, m_logs_path, m_io_context);

    m_sub_broker_thread = std::thread([this]() { m_io_context.run(); });

    RCLCPP_INFO(this->get_logger(), "[SubBroker Node] Node started at %s:%d", m_sub_broker_ip.c_str(), m_sub_broker_port);

    auto subscriber_configs = parseSubscriberConfig(m_subscribers_path);
    
    for (auto& config : subscriber_configs)
    {
        std::string ros_topic = generateRosTopicName(config.topic, config.period, config.aggregation_type);

        if (m_ros_publishers.find(ros_topic) == m_ros_publishers.end())
        {
            auto pub = this->create_publisher<interfaces::msg::Measure>(ros_topic, Constants::SUB_BROKER_ROS_QUEUE_SIZE);
            m_ros_publishers[ros_topic] = pub;

            RCLCPP_DEBUG(this->get_logger(), "[SubBroker Node] Send '%s' to subscriber '%s'", ros_topic.c_str(), config.name.c_str());
        }

        auto subscriber_core = std::make_shared<SubscriberCore>(config.name, sub_broker_id, config.topic, config.period, config.aggregation_type, m_subscriber_io_context);

        subscriber_core->subscribe();
        subscriber_core->read();

        subscriber_core->onDataReceived.connect(boost::bind(&SubBrokerAdapter::onDataReceivedCallback, this, boost::placeholders::_1, boost::placeholders::_2, boost::placeholders::_3, ros_topic));
        /*
        subscriber_core->onDataReceived.connect([this, ros_topic](const std::string& subscriber_name, unsigned long long timestamp, double value)
        {
            onDataReceivedCallback(subscriber_name, timestamp, value, ros_topic);
        }
        );
        */

        m_subscriber_cores.push_back(subscriber_core);
    }

    m_subscriber_thread = std::thread([this]() { m_subscriber_io_context.run(); });    
}

void SubBrokerAdapter::onDataReceivedCallback([[maybe_unused]] const std::string& subscriber_name, unsigned long long timestamp, double value, const std::string& ros_topic)
{
    auto iterator = m_ros_publishers.find(ros_topic);
    if (iterator == m_ros_publishers.end())
    {
        RCLCPP_WARN(this->get_logger(), "[SubBroker Node] No ROS publisher found for topic: %s", ros_topic.c_str());
        return;
    }

    interfaces::msg::Measure message;
    message.timestamp = timestamp;
    message.value = value;

    iterator->second->publish(message);

    RCLCPP_DEBUG(this->get_logger(), "Publish measure to '%s': (%llu,%f)", ros_topic.c_str(), timestamp, value);
}

SubBrokerAdapter::~SubBrokerAdapter()
{
    RCLCPP_INFO(this->get_logger(), "[SubBroker Node] Shutting down...");

    m_io_context.stop();
    if (m_sub_broker_thread.joinable())
    {
        m_sub_broker_thread.join();
    }

    m_subscriber_io_context.stop();
    if (m_subscriber_thread.joinable())
    {
        m_subscriber_thread.join();
    }
}