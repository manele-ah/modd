#ifndef ROSMODDADAPTER_SUBBROKERADAPTER_H
#define ROSMODDADAPTER_SUBBROKERADAPTER_H

#include <thread>
#include <filesystem>
#include <boost/asio.hpp>
#include "rclcpp/rclcpp.hpp"
#include "TcpIpId.h"
#include "SubBroker.h"
#include "Subscription.h"
#include "SubscriberCore.h"
#include "AggregationType.h"
#include "PublishedMeasure.h"
#include "Helper.h"
#include "Constants.h"
#include "interfaces/msg/measure.hpp"

class SubBrokerAdapter : public rclcpp::Node
{
private:
    /** PubBroker IP address. */
    std::string m_pub_broker_ip;
    /** SubBroker IP address. */
    std::string m_sub_broker_ip;
    /** PubBroker port number. */
    unsigned int m_pub_broker_port;
    /** SubBroker port number. */
    unsigned int m_sub_broker_port;
    /** SubBroker logs directory. */
    std::string m_logs_path;
    /** Topics configuration path. */
    std::string m_topics_path;
    /** Subscribers configuration path. */
    std::string m_subscribers_path;
    /** Reference to the I/O context for operations on the SubBroker. */
    boost::asio::io_context m_io_context;
    /** Thread dedicated to the SubBroker. */
    std::thread m_sub_broker_thread;
    /** Reference to the I/O context for operations on subscribers. */
    boost::asio::io_context m_subscriber_io_context;
    /** Thread dedicated to subscribers. */
    std::thread m_subscriber_thread;
    /** Shared pointer to a SubBroker instance. */
    std::shared_ptr<SubBroker> m_sub_broker;
    /** Subscriber clients. */
    std::vector<std::shared_ptr<SubscriberCore>> m_subscriber_cores;
    /** List of active publishers (topic, publisher). */
    std::unordered_map<std::string, rclcpp::Publisher<interfaces::msg::Measure>::SharedPtr> m_ros_publishers;

public:
    SubBrokerAdapter();

    void onDataReceivedCallback(const std::string& subscriber_name, unsigned long long timestamp, double value, const std::string& ros_topic_name);

    ~SubBrokerAdapter();
};

#endif
