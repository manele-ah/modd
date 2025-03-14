#include "QSubscriberDataHandler.h"

/**
 * @brief Initialize a subscriber data handler.
 * @param parent: Pointer to the parent QObject.
 */
QSubscriberDataHandler::QSubscriberDataHandler(QObject* parent) : QObject(parent)
{

}

/**
 * @brief Receive measures and trigger signals.
 * @param subscriber_name: Subscriber ID.
 * @param x: Timestamp of the measure.
 * @param y: Value of the measure.
 */
void QSubscriberDataHandler::receiveData(const std::string& subscriber_name, unsigned long long int x, double y)
{
    latest_data[subscriber_name] = {x, y};
    emit newDataReceived(subscriber_name, x, y);
}