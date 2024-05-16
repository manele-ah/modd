#include "TcpIpId.h"

/**
 * Initialize a TCP/IP ID.
 * @param ip_address: IP address.
 * @param port: Port number.
 */
TcpIpId::TcpIpId(const std::string& ip_address, unsigned int port) : m_ip_address(ip_address), m_port(port)
{

}

/**
 * Getter method for IP address.
 * @return IP address.
 */
std::string TcpIpId::getIp() const
{
    return m_ip_address;
}

/**
 * Getter method for port number.
 * @return Port number.
 */
unsigned int TcpIpId::getPort() const
{
    return m_port;
}

/**
 * Setter method for IP address.
 * @param ip_address: Given IP address.
 */
void TcpIpId::setIp(const std::string& ip_address)
{
    m_ip_address = ip_address;
}

/**
 * Setter method for port number.
 * @param port: Given port number.
 */
void TcpIpId::setPort(unsigned int port)
{
    m_port = port;
}

/**
 * Override the print method to print an IP address with its port number.
 * @param out: Reference to the output stream where the TCP/IP ID will be printed.
 */
void TcpIpId::print(std::ostream& out) const
{
    out << m_ip_address + ":" + std::to_string(m_port);
}
