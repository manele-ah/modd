#include "TcpClient.h"

/**
 * Initialize a TCP client.
 * @param id: Client ID.
 * @param server_id: Server TCP/IP ID.
 * @param io_context: Reference to Boost I/O context.
 */
TcpClient::TcpClient(const std::string& id, TcpIpId& server_id, boost::asio::io_context& io_context) : m_id(id), m_server_id(server_id), m_number_retry(0), m_io_context(io_context), m_connection(new TcpHelper(m_io_context))
{

}

/**
 * Virtual destructor that disconnects a client.
 */
TcpClient::~TcpClient()
{
    disconnect();
}

/**
 * Initiate a connection to the server.
 */
void TcpClient::connect()
{
    boost::asio::ip::tcp::endpoint endpoint(boost::asio::ip::address::from_string(m_server_id.getIp()), (boost::asio::ip::port_type) m_server_id.getPort());
    boost::asio::ip::tcp::socket& socket = m_connection->getSocket();
    socket.async_connect(endpoint, boost::bind(&TcpClient::handleConnect, this, boost::asio::placeholders::error));
}

/**
 * Read the received message.
 */
void TcpClient::read()
{
    m_connection->read(m_message_received, boost::bind(&TcpClient::handleRead, this, boost::asio::placeholders::error));
}

/**
 * Write a message.
 * @param message: Message to be sent to the server.
 */
void TcpClient::write(const Message& message)
{
    m_connection->write(message, boost::bind(&TcpClient::handleWrite, this, boost::asio::placeholders::error));
}

/**
 * Close TCP socket.
 */
void TcpClient::disconnect()
{
    m_io_context.post([this] { handleDisconnect(); });
}

/**
 * Handle the completion of an asynchronous connect request.
 * @param error: Error information passed by Boost.
 */
void TcpClient::handleConnect(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(info) << "[TCP Client] Connection handler successful";
        // m_connection->readAll(m_message_received, boost::bind(&TcpClient::handleRead, this, boost::asio::placeholders::error));
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[TCP Client] Connection handler failed (" << error.to_string() << ")";
        if (m_number_retry < MAX_NUMBER_RETRY)
        {
            BOOST_LOG_TRIVIAL(info) << "[TCP Client] Retry connection";

            boost::asio::steady_timer timer(m_io_context);
            timer.expires_after(std::chrono::seconds(WAIT_TIME));
            timer.wait();
            connect();
            m_number_retry += 1;
        }
    }
}

/**
 * Handle the completion of an asynchronous read request.
 * @param error: Error information passed by Boost.
 */
void TcpClient::handleRead(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Client] Read handler successful";
        m_connection->read(m_message_received, boost::bind(&TcpClient::handleRead, this, boost::asio::placeholders::error));
        BOOST_LOG_TRIVIAL(info) << "[TCP Client] Message received (" << m_message_received << ")";
    }
    else
        BOOST_LOG_TRIVIAL(error) << "[TCP Client] Read handler failed";

}

/**
 * Handle the completion of an asynchronous write request.
 * @param error: Error information passed by Boost.
 */
void TcpClient::handleWrite(const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Client] Write handler successful";
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[TCP Client] Write handler failed";
    }
}

/**
 * Handle a disconnect operation.
 */
void TcpClient::handleDisconnect()
{
    m_connection->getSocket().shutdown(boost::asio::ip::tcp::socket::shutdown_both);
    m_connection->getSocket().close();
}
