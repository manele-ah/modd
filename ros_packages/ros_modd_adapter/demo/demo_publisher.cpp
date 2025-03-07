#include <chrono>
#include <memory>
#include <string>
#include <random>
#include <inttypes.h>
#include "rclcpp/rclcpp.hpp"
#include "interfaces/msg/measure.hpp"

namespace
{
    constexpr char NODE_NAME[] = "demo_publisher";
    constexpr char TOPICS_ARGUMENT_NAME[] = "topics";
    constexpr char PERIODS_ARGUMENT_NAME[] = "periods";
    const std::vector<std::string> DEFAULT_TOPICS = {"accel_x", "accel_y"};
    const std::vector<int64_t> DEFAULT_PERIODS = {500, 500};
    constexpr unsigned int QUEUE_SIZE = 10;
    constexpr double MIN_VALUE = -10.0;
    constexpr double MAX_VALUE = 10.0;
}

struct PublisherConfig
{
    /** Topic to publish to. */
    std::string topic_name;
    /** ROS publisher instance. */
    rclcpp::Publisher<interfaces::msg::Measure>::SharedPtr publisher;
    /** Timer for publishing measures. */
    rclcpp::TimerBase::SharedPtr timer;
    /** Publishing period. */
    int64_t period;
    /** Dummy timestamp. */
    uint64_t count;
    /** Random number generator. */
    std::mt19937 generator;
    /** Uniform distribution. */
    std::uniform_real_distribution<double> distribution;
};

class SimplePublisher : public rclcpp::Node
{
private:
    /** Topics to publish to. */
    std::vector<std::string> m_topics;
    /** Publishing periods. */
    std::vector<int64_t> m_periods;
    /** Publishers information. */
    std::vector<PublisherConfig> m_publishers;

public:
    SimplePublisher(): Node(NODE_NAME)
    {
        this->declare_parameter(TOPICS_ARGUMENT_NAME, DEFAULT_TOPICS);
        this->declare_parameter(PERIODS_ARGUMENT_NAME, DEFAULT_PERIODS);
        this->get_parameter(TOPICS_ARGUMENT_NAME, m_topics);
        this->get_parameter(PERIODS_ARGUMENT_NAME, m_periods);

        if (m_topics.size() != m_periods.size())
        {
            RCLCPP_ERROR(this->get_logger(), "Parameters '%s' and '%s' must have the same number of entries (got %zu and %zu)", TOPICS_ARGUMENT_NAME, PERIODS_ARGUMENT_NAME, m_topics.size(), m_periods.size());
            rclcpp::shutdown();
            return;
        }

        for (size_t i = 0; i < m_topics.size(); i++)
        {
            PublisherConfig configuration;
            configuration.topic_name = m_topics[i];
            configuration.period = m_periods[i];
            configuration.count = 0;
            configuration.generator = std::mt19937(std::random_device{}());
            configuration.distribution = std::uniform_real_distribution<double>(MIN_VALUE, MAX_VALUE);

            configuration.publisher = this->create_publisher<interfaces::msg::Measure>(configuration.topic_name, QUEUE_SIZE);

            auto timer_callback = [this, config = configuration]() mutable
            {
                interfaces::msg::Measure message;
                message.timestamp = config.count++;
                message.value = config.distribution(config.generator);

                config.publisher->publish(message);

                RCLCPP_INFO(this->get_logger(), "Publish measure to '%s': (%" PRIu64 ",%.2f)", config.topic_name.c_str(), message.timestamp, message.value);
            };
            std::function<void()> callback_function = timer_callback;

            configuration.timer = this->create_wall_timer(std::chrono::milliseconds(configuration.period), callback_function);
            m_publishers.push_back(std::move(configuration));
        }
    }

};

int main(int argc, char* argv[])
{
    rclcpp::init(argc, argv);
    rclcpp::spin(std::make_shared<SimplePublisher>());
    rclcpp::shutdown();
    return 0;
}
