#include <chrono>
#include <memory>
#include <string>
#include "rclcpp/rclcpp.hpp"
#include "interfaces/msg/measure.hpp"

namespace
{
    constexpr char NODE_NAME[] = "demo_subscriber";
    constexpr char TOPICS_ARGUMENT_NAME[] = "topics";
    const std::vector<std::string> DEFAULT_TOPICS = {"accel_x/MIN/p1_00", "accel_y/AVERAGE/p2_00"};
    constexpr unsigned int QUEUE_SIZE = 10;
}

class SimpleSubscriber : public rclcpp::Node
{
private:
    /** ROS subscribers instances. */
    std::vector<rclcpp::Subscription<interfaces::msg::Measure>::SharedPtr> m_subscribers;
    /** Subscription topics. */
    std::vector<std::string> m_topics;

public:
    SimpleSubscriber(): Node(NODE_NAME)
    {
        this->declare_parameter(TOPICS_ARGUMENT_NAME, DEFAULT_TOPICS);
        this->get_parameter(TOPICS_ARGUMENT_NAME, m_topics);

        for (const std::string& topic : m_topics)
        {
            auto sub = this->create_subscription<interfaces::msg::Measure>(topic, QUEUE_SIZE, std::bind(&SimpleSubscriber::onDataReceivedCallback, this, std::placeholders::_1));

            m_subscribers.push_back(sub);
        }
    }

    void onDataReceivedCallback(const interfaces::msg::Measure::SharedPtr message)
    {
        RCLCPP_INFO(this->get_logger(), "Received measure: (%llu, %.2f)", static_cast<long long unsigned>(message->timestamp), message->value);
    }
};

int main(int argc, char* argv[])
{
    rclcpp::init(argc, argv);
    rclcpp::spin(std::make_shared<SimpleSubscriber>());
    rclcpp::shutdown();
    return 0;
}
