#ifndef MODD_TCPSERVER_H
#define MODD_TCPSERVER_H

#pragma once

#include <set>
#include <string>
#include <vector>
#include <iterator>
#include <algorithm>
#include <functional>
#include <boost/asio.hpp>
#include <boost/log/trivial.hpp>
#include <boost/enable_shared_from_this.hpp>
#include "TcpIpId.h"
#include "Message.h"
#include "TcpHelper.h"
#include "TcpSession.h"

class TcpSession;

typedef boost::shared_ptr<TcpSession> p_tcp_session;

/**
 * @class TcpServer
 * @brief Class that defines a TCP server.
 */
class TcpServer
{
protected:
    /** Server TCP/IP ID. */
    TcpIpId& m_id;
    /** Reference to the I/O context for asynchronous operations. */
    boost::asio::io_context& m_io_context;
    /** Acceptor object to accept incoming socket connections. */
    boost::asio::ip::tcp::acceptor m_acceptor;
    /** Set of active client sessions managed by the server. */
    std::set<p_tcp_session> m_client_sessions;

    /**
     * @brief Start listening for incoming connections.
     */
    void listen();

    /**
     * @brief Handle the acceptance of a new connection by creating a new session.
     * @param connection: Newly accepted TCP connection.
     * @param error: Error information passed by Boost.
     */
    virtual void handleAccept(p_tcp_connection connection, const boost::system::error_code& error);

public:
    /**
     * @brief Initialize a TCP server and start listening for incoming connections.
     * @param id: Server TCP/IP ID.
     * @param io_context: Reference to Boost I/O context.
     */
    TcpServer(TcpIpId& id, boost::asio::io_context& io_context);

    /**
     * @brief Pure virtual method to decode the received message.
     * @param message: Received message.
     * @param session: Pointer to the session from which the message was received.
     */
    virtual void decode(const Message& message, p_tcp_session session) = 0;
};

#endif
