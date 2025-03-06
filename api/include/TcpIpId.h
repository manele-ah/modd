#ifndef MODD_TCPIPID_H
#define MODD_TCPIPID_H

#pragma once

#include <string>
#include "Id.h"

/**
 * @class TcpIpId
 * @brief Class to handle TCP/IP endpoints.
 */
class TcpIpId : public Id
{
private:
    /** IP address. */
    std::string m_ip_address;
    /** Port number. */
    unsigned int m_port;

public:
    /**
     * @brief Initialize a TCP/IP ID.
     * @param ip_address: IP address.
     * @param port: Port number.
     */
    explicit TcpIpId(const std::string& ip_address = {}, unsigned int port = 0);

    /**
     * @brief Retrieve the IP address.
     * @return IP address.
     */
    std::string getIp() const;

    /**
     * @brief Retrieve the port number.
     * @return Port number.
     */
    unsigned int getPort() const;

    /**
     * @brief Set the IP address with the given parameter.
     * @param ip_address: Given IP address.
     */
    void setIp(const std::string& ip_address);

    /**
     * @brief Set the port number with the given parameter.
     * @param port: Given port number.
     */
    void setPort(unsigned int port);

    /**
     * @brief Override the print method to print an IP address with its port number.
     * @param out: Reference to the output stream where the TCP/IP ID will be printed.
     */
    void print(std::ostream& out) const override;
};

#endif