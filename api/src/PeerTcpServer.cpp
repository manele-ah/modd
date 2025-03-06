#include "PeerTcpServer.h"

/**
 * @brief Initialize a TCP server and start listening for incoming connections.
 * @param id: Server TCP/IP ID.
 * @param peer_id: Peer server TCP/IP ID.
 * @param io_context: Reference to Boost I/O context.
 */
PeerTcpServer::PeerTcpServer(TcpIpId& id, TcpIpId& peer_id, bool initiator, boost::asio::io_context& io_context, std::function<void()> established_connection_callback) : TcpServer(id, io_context), m_peer_id(peer_id), m_initiator(initiator), m_number_retry(0)
{
    if (m_initiator)
    {
        connectToPeer(established_connection_callback);
    }
}

/**
 * @brief Handle the completion of an asynchronous connect request.
 * @param error: Error information passed by Boost.
 */
void PeerTcpServer::handleConnect(p_tcp_connection connection, const std::function<void()>& established_connection_callback, const boost::system::error_code& error)
{
    if (!error)
    {
        BOOST_LOG_TRIVIAL(info) << "[Peer TCP Server] Connection handler successful";
        m_peer_session = TcpSession::create(connection, *this, SessionType::SERVER_TO_SERVER);
        if (established_connection_callback)
        {
            established_connection_callback();
        }
    }
    else
    {
        BOOST_LOG_TRIVIAL(error) << "[Peer TCP Server] Connection handler failed (" << error.to_string() << ")";
        if (m_number_retry < MAX_NUMBER_RETRY)
        {
            BOOST_LOG_TRIVIAL(info) << "[Peer TCP Server] Retry connection";

            boost::asio::steady_timer timer(m_io_context);
            timer.expires_after(std::chrono::seconds(WAIT_TIME));
            timer.wait();
            connectToPeer(established_connection_callback);
            m_number_retry += 1;
        }
    }
}

/**
 * @brief Establish connection with peer server.
 */
void PeerTcpServer::connectToPeer(const std::function<void()>& established_connection_callback)
{
    p_tcp_connection connection(new TcpHelper(m_io_context));
    boost::asio::ip::tcp::endpoint endpoint(boost::asio::ip::address::from_string(m_peer_id.getIp()), (boost::asio::ip::port_type) m_peer_id.getPort());
    boost::asio::ip::tcp::socket& socket = connection->getSocket();
    socket.async_connect(endpoint, [this, connection, established_connection_callback](const boost::system::error_code& error)
    {
        handleConnect(connection, established_connection_callback, error);
    });
}

/**
 * @brief Send message to peer server.
 * @param message : Message to be sent.
 */
void PeerTcpServer::sendToPeer(const Message& message)
{
    if (m_peer_session)
    {
        m_peer_session->deliver(message);
    }
    else
    {
        BOOST_LOG_TRIVIAL(warning) << "[Peer TCP Server] No peer session established";
    }
}

/**
 * @brief Send initial message to peer.
 */
void PeerTcpServer::sendInitialMessageToPeer()
{
    BOOST_LOG_TRIVIAL(info) << "[Peer TCP Server] Send ping to peer";
    Message handshake(MessageType::PEER_SERVER_HANDSHAKE);
    sendToPeer(handshake);
}

/**
 * @brief Decode the received message.
 * @param message: Received message.
 * @param session: Pointer to the session from which the message was received.
 */
void PeerTcpServer::decode(const Message& message, p_tcp_session session)
{
    switch (message.getMessageType())
    {
        case MessageType::PEER_SERVER_HANDSHAKE:
        {
            m_peer_session = session;
            break;
        }
        default:
        {
            break;
        }
    }
}