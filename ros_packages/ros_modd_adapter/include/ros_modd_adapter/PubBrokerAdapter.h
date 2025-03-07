#ifndef ROSMODDADAPTER_PUBBROKERADAPTER_H
#define ROSMODDADAPTER_PUBBROKERADAPTER_H

#include <thread>
#include <memory>
#include <chrono>
#include <functional>
#include <inttypes.h>
#include <filesystem>
#include <boost/asio.hpp>
#include "rclcpp/rclcpp.hpp"
#include "TcpIpId.h"
#include "Message.h"
#include "PubBroker.h"
#include "PublishedMeasure.h"
#include "Constants.h"
#include "interfaces/msg/measure.hpp"

class PubBrokerAdapter : public rclcpp::Node
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
    /** PubBroker logs directory. */
    std::string m_logs_path;
    /** Reference to the I/O context for operations on the PubBroker. */
    boost::asio::io_context m_io_context;
    /** Thread dedicated to the PubBroker. */
    std::thread m_pub_broker_thread;
    /** Shared pointer to a PubBroker instance. */
    std::shared_ptr<PubBroker> m_pub_broker;
    /** Timer to periodically poll for topics received by the SubBroker. */
    rclcpp::TimerBase::SharedPtr m_poll_timer;
    /** Topics already subscribed to. */
    std::set<std::string> m_known_topics;
    /** List of active subscriptions (topic, subscription). */
    std::unordered_map<std::string, rclcpp::Subscription<interfaces::msg::Measure>::SharedPtr> m_subscriptions;

public:
    PubBrokerAdapter();

    void pollPubBrokerTopics();

    void subscribeToTopic(const std::string& topic);

    void forwardToPubBroker(const std::string& topic, const interfaces::msg::Measure::SharedPtr message);

    ~PubBrokerAdapter();
};

#endif
