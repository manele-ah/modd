#include <boost/asio.hpp>
#include <boost/log/core.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/expressions.hpp>
#include "rclcpp/rclcpp.hpp"
#include "SubBrokerAdapter.h"

int main(int argc, char ** argv)
{
    boost::log::core::get()->set_filter(boost::log::trivial::severity >= boost::log::trivial::info);
    rclcpp::init(argc, argv);
    auto node = std::make_shared<SubBrokerAdapter>();
    rclcpp::executors::MultiThreadedExecutor executor;
    executor.add_node(node);
    executor.spin();
    rclcpp::shutdown();
    return 0;
}