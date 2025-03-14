#include <thread>
#include <csignal>
#include <fstream>
#include <filesystem>
#include <boost/asio.hpp>
#include <boost/log/core.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/expressions.hpp>
#include "Util.h"
#include "PubBroker.h"

class MainPubBroker
{
private:
    boost::asio::io_context m_io_context;
    boost::asio::signal_set m_signals;

public:
    MainPubBroker() : m_io_context(), m_signals(m_io_context, SIGINT)
    {
        m_signals.async_wait([this](boost::system::error_code, int)
                             {
                                 m_io_context.stop();
                                 BOOST_LOG_TRIVIAL(info) << "[Main PubBroker] Interrupt signal received. Stopping PubBroker";
                             });
    }

    void run()
    {
        std::filesystem::path executable_path = std::filesystem::current_path();
        std::filesystem::path configuration_path = "conf/pub_broker.properties";
        std::filesystem::path full_path = executable_path / configuration_path;
        std::unordered_map<std::string, std::string> config = parsePropertiesFile(full_path.string());
        TcpIpId id_pub_broker = extractIpAndPort(config["BROKER_ENDPOINT"]);
        TcpIpId id_sub_broker = extractIpAndPort(config["PROXY_ENDPOINT"]);

        PubBroker pub_broker(id_pub_broker, id_sub_broker, config["LOG_PATH"], m_io_context);

        std::thread io_thread([this]() { m_io_context.run(); });

        if (io_thread.joinable())
            io_thread.join();
    }
};

int main()
{
    // Set logging severity level
    boost::log::core::get()->set_filter(boost::log::trivial::severity >= boost::log::trivial::info);

    MainPubBroker application;
    application.run();

    return 0;
}
