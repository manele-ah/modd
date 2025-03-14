#include "Subscriber.h"

/**
 * @brief Initialize a subscriber instance.
 * @param name: Subscriber ID.
 * @param topic: Topic of interest for the subscriber.
 * @param period: Delivery interval in seconds.
 * @param aggregation_type: Aggregation type requested by the subscriber.
 */
Subscriber::Subscriber(const std::string& name, const std::string& topic, double period, AggregationType aggregation_type) : m_id_sub_broker("127.0.0.1", 7272), m_subscriber_core(name, m_id_sub_broker, topic, period, aggregation_type, m_io_context), m_work_guard(boost::asio::make_work_guard(m_io_context))
{

}

/**
 * @brief Destructor that ensures proper shutdown of the subscriber and its I/O thread.
 */
Subscriber::~Subscriber()
{
    stopIoContext();
    if (m_io_thread.joinable())
    {
        m_io_thread.join();
    }
}

/**
 * @brief Start subscription and listen to incoming messages.
 */
void Subscriber::start()
{
    m_subscriber_core.subscribe();
    m_subscriber_core.read();
    startIoContext();
}

/**
 * @brief Start the I/O context in a separate thread to handle asynchronous operations.
 */
void Subscriber::startIoContext()
{
    m_io_thread = std::thread([this](){ m_io_context.run(); });
}

/**
 * @brief Stop the I/O context, terminating asynchronous operations safely.
 */
void Subscriber::stopIoContext()
{
    if (!m_stopped.exchange(true))
    {
        m_work_guard.reset();
        m_io_context.stop();
    }
}