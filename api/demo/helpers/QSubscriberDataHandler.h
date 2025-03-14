#ifndef MODD_QSUBSCRIBERDATAHANDLER_H
#define MODD_QSUBSCRIBERDATAHANDLER_H

#pragma once

#include <QApplication>

/**
 * @class QSubscriberDataHandler
 * @brief Class that handles incoming subscriber data.
 */
class QSubscriberDataHandler : public QObject
{
    Q_OBJECT

private:
    /** Track last (timestamp, value) pair for each subscriber. */
    std::map<std::string, std::pair<unsigned long long, double>> latest_data;

public:
    /**
     * @brief Initialize a subscriber data handler.
     * @param parent: Pointer to the parent QObject.
     */
    explicit QSubscriberDataHandler(QObject* parent = nullptr);

    /**
     * @brief Receive measures and trigger signals.
     * @param subscriber_name: Subscriber ID.
     * @param x: Timestamp of the measure.
     * @param y: Value of the measure.
     */
    void receiveData(const std::string& subscriber_name, unsigned long long int x, double y);

signals:
    /**
     * @brief Emitted signal when new data are received.
     * @param subscriber_name: Subscriber ID.
     * @param x: Timestamp of the measure.
     * @param y: Value of the measure.
     */
    void newDataReceived(const std::string& subscriber_name, unsigned long long int x, double y);
};

#endif
