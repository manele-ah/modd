#include "TcpServer.h"

/**
 * Initialize a TCP server and start listening for incoming connections.
 * @param id: Server TCP/IP ID.
 * @param io_context: Reference to Boost I/O context.
 */
TcpServer::TcpServer(TcpIpId& id, boost::asio::io_context& io_context) : m_id(id), m_io_context(io_context), m_acceptor(io_context, boost::asio::ip::tcp::endpoint(boost::asio::ip::address::from_string(m_id.getIp()), (boost::asio::ip::port_type) m_id.getPort()))
{
    listen();
}

/**
 * Start listening for incoming connections.
 */
 void TcpServer::listen()
{
    BOOST_LOG_TRIVIAL(info) << "[TCP Server] Listen to new connections";
    p_tcp_connection connection(new TcpHelper(m_io_context));
    m_acceptor.async_accept(connection->getSocket(), boost::bind(&TcpServer::handleAccept, this, connection, boost::asio::placeholders::error));
}

/**
 * Handle the acceptance of a new connection by creating a new session.
 * @param connection: Newly accepted TCP connection.
 * @param error: Error information passed by Boost.
 */
void TcpServer::handleAccept(p_tcp_connection connection, const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Server] Accept handler successful";
        BOOST_LOG_TRIVIAL(info) << "[TCP Server] Create new session";
        p_tcp_session session = TcpSession::create(connection, *this);
        m_client_sessions.insert(session);
        listen();
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[TCP Server] Accept handler failed (" << error.message() << ")";
    }
}