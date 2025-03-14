#include <memory>
#include <random>
#include <csignal>
#include <boost/asio.hpp>
#include <boost/log/core.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/expressions.hpp>
#include "Publisher.h"

/** Global atomic to signal shutdown. */
std::atomic<bool> shutdown_requested{false};
/** Global publisher pointer. */
std::unique_ptr<Publisher> publisher;

/**
 * @brief Signal handler to catch Ctrl-C and initiate graceful shutdown.
 * @param signal: Caught signal.
 */
void handleSignal(int signal)
{
    if (signal == SIGINT)
    {
        if (!shutdown_requested.exchange(true))
        {
            if (publisher)
            {
                BOOST_LOG_TRIVIAL(info) << "[Main Publisher] Interrupt signal received. Stopping publisher";
                publisher->stopIoContext();
            }
        }
    }
}

void readData()
{
    int i = 0;
    long long timestamp = 3754540000;
    static std::default_random_engine engine(std::random_device{}());
    std::uniform_real_distribution<double> distribution(-10, 10);

    while (i < 1000 && !shutdown_requested.load())
    {
        BOOST_LOG_TRIVIAL(info) << "Reading data...";
        publisher->publish("accel_x", timestamp, distribution(engine));
        publisher->publish("accel_y", timestamp, distribution(engine));
        publisher->publish("accel_z", timestamp, distribution(engine));
        publisher->publish("mag_x", timestamp, distribution(engine));
        publisher->publish("mag_y", timestamp, distribution(engine));
        publisher->publish("mag_z", timestamp, distribution(engine));
        publisher->publish("gyro_x", timestamp, distribution(engine));
        publisher->publish("gyro_y", timestamp, distribution(engine));
        publisher->publish("gyro_z", timestamp, distribution(engine));
        publisher->publish("pitch", timestamp, distribution(engine));
        publisher->publish("roll", timestamp, distribution(engine));
        publisher->publish("yaw", timestamp, distribution(engine));
        publisher->publish("north_vel", timestamp, distribution(engine));
        publisher->publish("east_vel", timestamp, distribution(engine));
        publisher->publish("down_vel", timestamp, distribution(engine));
        publisher->publish("quat_x", timestamp, distribution(engine));
        publisher->publish("quat_y", timestamp, distribution(engine));
        publisher->publish("quat_z", timestamp, distribution(engine));
        publisher->publish("quat_w", timestamp, distribution(engine));
        i += 1;
        timestamp += 1;
        std::this_thread::sleep_for(std::chrono::milliseconds(40));
    }
}

int main()
{
    // Set logging severity level
    boost::log::core::get()->set_filter(boost::log::trivial::severity >= boost::log::trivial::info);
    std::signal(SIGINT, handleSignal);
    publisher = std::make_unique<Publisher>("pub_1");
    readData();
    return 0;
}
