#include "TcpSession.h"

/**
 * Initialize a TCP session.
 * @param tcp_connection: Pointer to the TCP connection.
 * @param server: Reference to the associated TCP server.
 * @param type: Session type.
 */
TcpSession::TcpSession(p_tcp_connection tcp_connection, TcpServer& server, SessionType type) : m_tcp_connection(tcp_connection), m_server(server), m_type(type)
{
    // m_strand(m_tcp_connection->getSocket().get_executor())
    BOOST_LOG_TRIVIAL(debug) << "[TCP Session] New session";
}

/**
 * Wait for data to be received on the TCP connection.
 */
void TcpSession::waitForData()
{
    // auto handler = boost::asio::bind_executor(m_strand, boost::bind(&TcpSession::handleRead, shared_from_this(), boost::asio::placeholders::error));
    // m_tcp_connection->read(m_message, handler);

    m_tcp_connection->read(m_message, boost::bind(&TcpSession::handleRead, shared_from_this(), boost::asio::placeholders::error));
    BOOST_LOG_TRIVIAL(debug) << "[TCP Session] Read incoming message (" << m_message << ")";
}

/**
 * Read and decode received message.
 * @param error: Error information passed by Boost.
 */
void TcpSession::handleRead(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Session] Read handler successful";
        m_server.decode(m_message, shared_from_this());
        waitForData();
    }
    else
        BOOST_LOG_TRIVIAL(error) << "[TCP Session] Read handler failed (" << error.message() << ")";

}

/**
 * Handle the completion of a write operation.
 * @param error: Error information passed by Boost.
 */
void TcpSession::handleWrite(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Session] Write handler successful";
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[TCP Session] Write handler failed (" << error.message() << ")";
    }
}

/**
 * Deliver a message to the client connected in this TCP session.
 * @param message: Message to be sent.
 */
void TcpSession::deliver(const Message& message)
{
    // auto handler = boost::asio::bind_executor(m_strand, boost::bind(&TcpSession::handleWrite, shared_from_this(), boost::asio::placeholders::error));
    // m_tcp_connection->write(message, handler);

    m_tcp_connection->write(message, boost::bind(&TcpSession::handleWrite, shared_from_this(), boost::asio::placeholders::error));
}

