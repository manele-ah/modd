#include <thread>
#include <vector>
#include <QWidget>
#include <QLabel>
#include <QGridLayout>
#include <QApplication>
#include <boost/log/core.hpp>
#include <boost/bind/bind.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/expressions.hpp>
#include "TcpIpId.h"
#include "PlotWindow.h"
#include "Subscriber.h"
#include "QSubscriberDataHandler.h"

struct SubscriberConfig
{
    std::string name;
    double period = 0.0;
    AggregationType aggregation_type = AggregationType::DEFAULT;
    std::string topic;
};

int main(int argc, char *argv[])
{
    // Set logging severity level
    boost::log::core::get()->set_filter(boost::log::trivial::severity >= boost::log::trivial::info);

    QApplication application(argc, argv);
    QWidget main_window;
    auto* layout = new QGridLayout(&main_window);

    std::filesystem::path executable_path = std::filesystem::current_path();
    std::filesystem::path subscriptions_path = "conf/subscribers.conf";
    std::filesystem::path full_path_subscriptions_file = executable_path / subscriptions_path;
    std::vector<std::tuple<std::string, std::string, double, AggregationType, std::string>> parsed_configurations = parseSubscriberFile(full_path_subscriptions_file.string());

    // Parse subscribers information
    std::vector<SubscriberConfig> subscribers_configurations;
    for (const auto& tuple : parsed_configurations)
    {
        SubscriberConfig subscriber_configuration;
        subscriber_configuration.name = std::get<0>(tuple);
        subscriber_configuration.topic = std::get<1>(tuple);
        subscriber_configuration.period = std::get<2>(tuple);
        subscriber_configuration.aggregation_type = std::get<3>(tuple);
        subscribers_configurations.push_back(subscriber_configuration);
    }

    const size_t subscribers_number = subscribers_configurations.size();
    std::vector<std::unique_ptr<Subscriber>> subscribers;
    std::vector<std::unique_ptr<PlotWindow>> windows;
    std::vector<std::unique_ptr<QSubscriberDataHandler>> helpers;
    std::vector<std::unique_ptr<QLabel>> titles;

    // Create subscribers instances and set up callbacks
    for (size_t i = 0; i < subscribers_number; ++i)
    {
        helpers.emplace_back(std::make_unique<QSubscriberDataHandler>());
        windows.emplace_back(std::make_unique<PlotWindow>("Monitoring", "Timestamps", "Values"));
        titles.emplace_back(std::make_unique<QLabel>(QString::fromStdString(subscribers_configurations[i].topic)));
        subscribers.emplace_back(std::make_unique<Subscriber>(subscribers_configurations[i].name, subscribers_configurations[i].topic, subscribers_configurations[i].period, subscribers_configurations[i].aggregation_type));
        subscribers.back()->start();
        subscribers.back()->setDataCallback(boost::bind(&QSubscriberDataHandler::receiveData, helpers.back().get(), boost::placeholders::_1, boost::placeholders::_2, boost::placeholders::_3));
        QObject::connect(helpers.back().get(), &QSubscriberDataHandler::newDataReceived, windows.back().get(), [&, i](const std::string&, unsigned long long x, double y)
        {
            windows[i]->plotData(x, y);
        });

        int row = (int) i / 2;
        int col = (int) i % 2;

        layout->addWidget(titles.back().get(), row * 2, col);
        layout->addWidget(windows.back().get(), row * 2 + 1, col);
    }

    main_window.setLayout(layout);
    main_window.resize(1200, 600);
    main_window.show();
    int result = QApplication::exec();

    return result;
}