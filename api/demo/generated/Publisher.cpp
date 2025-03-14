#include "Publisher.h"

/**
 * @brief Initialize a publisher instance.
 * @param name: Publisher ID.
 */
Publisher::Publisher(const std::string& name) : m_id_pub_broker("127.0.0.1", 7171), m_core_publisher(name, m_id_pub_broker, m_io_context), m_work_guard(boost::asio::make_work_guard(m_io_context))
{
    startIoContext();
}

/**
 * @brief Destructor that ensures proper shutdown of the publisher and its I/O thread.
 */
Publisher::~Publisher()
{
    stopIoContext();
    if (m_io_thread.joinable())
    {
        m_io_thread.join();
    }
}

/**
 * @brief Publish a message to the PubBroker.
 * @param topic: Topic ID of the published measure.
 * @param timestamp: Timestamp of the measure.
 * @param value: Value of the measure.
 */
void Publisher::publish(const std::string& topic, long long timestamp, double value)
{
    if (m_stopped.load())
    {
        return;
    }
    // All calls to publish() are safe to make from any thread
    // The actual write is posted to the I/O thread
    boost::asio::post(m_io_context, [this, topic, timestamp, value]()
    {
        m_core_publisher.publish(topic, timestamp, value);
    });
}

/**
 * @brief Start the I/O context in a separate thread to handle asynchronous operations.
 */
void Publisher::startIoContext()
{
    m_io_thread = std::thread([this](){ m_io_context.run(); });
}

/**
 * @brief Stop the I/O context, terminating asynchronous operations safely.
 */
void Publisher::stopIoContext()
{
    if (!m_stopped.exchange(true))
    {
        m_work_guard.reset();
        m_io_context.stop();
    }
}
