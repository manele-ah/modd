#ifndef MODD_TCPCLIENT_H
#define MODD_TCPCLIENT_H

#pragma once

#include <string>
#include <boost/log/trivial.hpp>
#include "TcpIpId.h"
#include "Message.h"
#include "TcpHelper.h"

/**
 * @class TcpClient
 * @brief Class that defines a TCP client.
 */
class TcpClient
{
protected:
    /** Client ID. */
    std::string m_id;
    /** Server TCP/IP ID. */
    TcpIpId& m_server_id;
    /** Retry attempts counter for connecting. */
    int m_number_retry;
    /** Last message received from the server. */
    Message m_message_received;
    /** Write mutex. */
    std::mutex m_write_mutex;
    /** Reference to the I/O context for asynchronous operations. */
    boost::asio::io_context& m_io_context;
    /** Pointer to the TCP socket. */
    p_tcp_connection m_connection;

    /**
     * @brief Handle the completion of an asynchronous connect request.
     * @param error: Error information passed by Boost.
     */
    void handleConnect(const boost::system::error_code& error);

    /**
     * @brief Handle the completion of an asynchronous read request.
     * @param error: Error information passed by Boost.
     */
    void handleRead(const boost::system::error_code& error);

    /**
     * @brief Handle the completion of an asynchronous write request.
     * @param error: Error information passed by Boost.
     */
    void handleWrite(const boost::system::error_code& error);

    /**
     * @brief Handle a disconnect operation.
     */
    void handleDisconnect();

public:
    /** Retry attempts constant for connecting. */
    static constexpr int MAX_NUMBER_RETRY = 5;
    /** Wait time before retry attempt in seconds. */
    static constexpr int WAIT_TIME = 5;

    /**
     * @brief Initialize a TCP client.
     * @param id: Client ID.
     * @param server_id: Server TCP/IP ID.
     * @param io_context: Reference to Boost I/O context.
     */
    TcpClient(std::string id, TcpIpId& server_id, boost::asio::io_context& io_context);

    /**
     * @brief Virtual destructor that disconnects a client.
     */
    virtual ~TcpClient();

    /**
     * @brief Initiate a connection to the server.
     */
    void connect();

    /**
     * @brief Read the received message.
     */
    virtual void read();

    /**
     * @brief Write a message.
     * @param message: Message to be sent to the server.
     */
    void write(const Message& message);

    /**
     * @brief Close TCP socket.
     */
    void disconnect();
};

#endif
