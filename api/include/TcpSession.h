#ifndef DRONEPROTOCOL_TCPSESSION_H
#define DRONEPROTOCOL_TCPSESSION_H

#pragma once

#include <iostream>
#include <boost/smart_ptr.hpp>
#include <boost/log/trivial.hpp>
#include <boost/system/error_code.hpp>
#include "Message.h"
#include "TcpHelper.h"
#include "TcpServer.h"
#include "SessionType.h"

class TcpServer;

/** Class that defines a TCP session. */
class TcpSession : public boost::enable_shared_from_this<TcpSession>
{
private:
    /** Pointer to the TCP connection. */
    p_tcp_connection m_tcp_connection;
    /** Associated TCP server that manages this session. */
    TcpServer& m_server;
    /** Session type. */
    SessionType m_type;
    /** Last received message. */
    Message m_message;
    // boost::asio::strand<boost::asio::any_io_executor> m_strand;

    /**
     * Initialize a TCP session.
     * @param tcp_connection: Pointer to the TCP connection.
     * @param server: Reference to the associated TCP server.
     * @param type: Session type.
     */
    TcpSession(p_tcp_connection tcp_connection, TcpServer& server, SessionType type);

    /**
     * Wait for data to be received on the TCP connection.
     */
    void waitForData();

    /**
     * Read and decode received message.
     * @param error: Error information passed by Boost.
     */
    void handleRead(const boost::system::error_code& error);

    /**
     * Handle the completion of a write operation.
     * @param error: Error information passed by Boost.
     */
    void handleWrite(const boost::system::error_code& error);

public:
    /**
     * Factory method to create a new TCP session and initiate data reception.
     * @param tcp_connection: Pointer to the TCP connection.
     * @param server: Reference to the associated TCP server.
     * @param type: Session type.
     * @return Shared pointer to the newly created session.
     */
    static boost::shared_ptr<TcpSession> create(p_tcp_connection tcp_connection, TcpServer& server, SessionType type = SessionType::SERVER_TO_CLIENT)
    {
        BOOST_LOG_TRIVIAL(debug) << "TCP Session : Create new session";
        boost::shared_ptr<TcpSession> session(new TcpSession(tcp_connection, server, type));
        BOOST_LOG_TRIVIAL(debug) << "TCP Session : Wait for data";
        session->waitForData();
        return session;
    }

    /**
     * Deliver a message to the client connected in this TCP session.
     * @param message: Message to be sent.
     */
    void deliver(const Message& message);
};

typedef boost::shared_ptr<TcpSession> p_tcp_session;

#endif
