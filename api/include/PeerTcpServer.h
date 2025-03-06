#ifndef MODD_PEERTCPSERVER_H
#define MODD_PEERTCPSERVER_H

#pragma once

#include "TcpServer.h"

/**
 * @class PeerTcpServer
 * @brief Class that defines a peer TCP server.
 */
class PeerTcpServer : public TcpServer
{
protected:
    /** Peer server ID. */
    TcpIpId m_peer_id;
    /** Peer session managed by the server. */
    p_tcp_session m_peer_session;
    /** Boolean to indicate if this server should initiate connection to its peer. */
    bool m_initiator;
    /** Retry attempts counter for connecting to peer. */
    int m_number_retry;

    /**
     * @brief Handle the completion of an asynchronous connect request.
     * @param connection: Newly connected TCP connection.
     * @param error: Error information passed by Boost.
     */
    void handleConnect(p_tcp_connection connection, const std::function<void()>& established_connection_callback, const boost::system::error_code& error);

public:
    /** Retry attempts constant for connecting to peer. */
    static constexpr int MAX_NUMBER_RETRY = 5;
    /** Wait time before retry attempt in seconds. */
    static constexpr int WAIT_TIME = 5;

    /**
     * @brief Initialize a TCP server and start listening for incoming connections.
     * @param id: Server TCP/IP ID.
     * @param peer_id: Peer server TCP/IP ID.
     * @param io_context: Reference to Boost I/O context.
     * @param established_connection_callback: Function called when the connection to peer server is established.
     */
    PeerTcpServer(TcpIpId& id, TcpIpId& peer_id, bool initiator, boost::asio::io_context& io_context, std::function<void()> established_connection_callback = nullptr);

    /**
     * @brief Establish connection with peer server.
     * @param established_connection_callback: Function called when the connection to peer server is established.
     */
    void connectToPeer(const std::function<void()>& established_connection_callback = nullptr);

    /**
     * @brief Send message to peer server.
     * @param message : Message to be sent.
     */
    void sendToPeer(const Message& message);

    /**
     * @brief Send initial message to peer.
     */
    void sendInitialMessageToPeer();

    /**
     * @brief Decode the received message.
     * @param message: Received message.
     * @param session: Pointer to the session from which the message was received.
     */
    void decode(const Message& message, p_tcp_session session) override;
};

#endif
