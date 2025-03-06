#ifndef MODD_TCPHELPER_H
#define MODD_TCPHELPER_H

#pragma once

#include <vector>
#include <iostream>
#include <boost/asio.hpp>
#include <boost/bind/bind.hpp>
#include <boost/log/trivial.hpp>
#include <boost/tuple/tuple.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/archive/text_oarchive.hpp>
#include <boost/archive/text_iarchive.hpp>
#include <boost/serialization/utility.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/array.hpp>

class SharedConstantBuffer
{
private:
    boost::shared_ptr<std::vector<char>> m_data;
    boost::asio::const_buffer m_buffer;

public:
    explicit SharedConstantBuffer(const std::string& data) : m_data(new std::vector<char>(data.begin(), data.end())), m_buffer(boost::asio::buffer(*m_data))
    {

    }

    const boost::asio::const_buffer *begin() const
    {
        return &m_buffer;
    }

    const boost::asio::const_buffer *end() const
    {
        return &m_buffer + 1;
    }

    typedef boost::asio::const_buffer value_type;

    typedef const boost::asio::const_buffer* const_iterator;
};

/**
 * Header length constant in TCP messages.
 */
constexpr int HEADER_LENGTH = 8;

/**
 * @class TcpHelper
 * @brief Helper class that facilitates TCP communications by handling serialization and networking tasks.
 */
class TcpHelper
{
private:
    /** Socket for TCP connection. */
    boost::asio::ip::tcp::socket m_socket;
    /** Outgoing message header. */
    std::string m_out_header;
    /** Outgoing message data. */
    std::string m_out_data;
    /** Buffer for incoming message header. */
    char m_in_header[HEADER_LENGTH];
    /** Buffer for incoming message data. */
    std::vector<char> m_in_data;

public:
    /**
     * @brief Initialize a TCP socket.
     * @param io_context: Reference to Boost I/O context.
     */
    explicit TcpHelper(boost::asio::io_context& io_context) : m_socket(io_context), m_in_header{}
    {

    }

    /**
     * @brief Retrieve the TCP socket.
     * @return A reference to the TCP socket.
     */
    boost::asio::ip::tcp::socket& getSocket()
    {
        return m_socket;
    }

    /**
     * @brief Asynchronously write serialized data to the TCP socket and handle completion with a user-defined handler.
     * @tparam T: Type of data to serialize.
     * @tparam Handler: Type of handler to manage completion of the write operation.
     * @param data_type: Reference to the data to serialize and send.
     * @param handler: Callback function to handle the completion of the write operation.
     */
    template<typename T, typename Handler>
    void write(const T& data_type, Handler handler)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Helper] Write operation";
        std::ostringstream archive_stream;
        {
            boost::archive::text_oarchive archive(archive_stream);
            archive << data_type;
        }
        m_out_data = std::move(archive_stream).str();

        std::ostringstream header_stream;
        header_stream << std::setw(HEADER_LENGTH) << std::hex << m_out_data.size();
        BOOST_LOG_TRIVIAL(debug) << "[TCP Helper] Write " << m_out_data.size() << " bytes";
        if (!header_stream || header_stream.str().size() != HEADER_LENGTH)
        {
            BOOST_LOG_TRIVIAL(error) << "[TCP Helper] Error in header size (Invalid argument)";
            boost::system::error_code error(boost::asio::error::invalid_argument);
            post(m_socket.get_executor(), boost::bind(handler, error));
            return;
        }
        m_out_header = std::move(header_stream).str();

        SharedConstantBuffer buffer(m_out_header + m_out_data);
        boost::asio::async_write(m_socket, buffer, handler);
    }

    /**
     * @brief Asynchronously read data from the TCP socket, deserialize it into a specified data type and handle completion with a user-defined handler.
     * @tparam T: Type of data to deserialize into.
     * @tparam Handler: Type of handler to manage completion of the read operation.
     * @param data_type: Reference to store the deserialized data.
     * @param handler: Callback function to handle the completion of the read operation.
     */
    template<typename T, typename Handler>
    void read(T& data_type, Handler handler)
    {
        BOOST_LOG_TRIVIAL(debug) << "[TCP Helper] Read operation";
        void (TcpHelper::*function)(const boost::system::error_code&, T&, boost::tuple<Handler>) = &TcpHelper::handleReadHeader<T, Handler>;
        boost::asio::async_read(m_socket, boost::asio::buffer(m_in_header), boost::bind(function, this, boost::asio::placeholders::error, boost::ref(data_type), boost::make_tuple(handler)));
    }

    /**
     * @brief Internal handler to manage reading headers during TCP communications.
     * @tparam T: Type of data expected to be received.
     * @tparam Handler: Type of handler to manage completion of the read operation.
     * @param error_code: Error information passed by Boost.
     * @param data_type:  Reference to store the deserialized data.
     * @param handler: Callback function to handle the completion of the read operation.
     */
    template<typename T, typename Handler>
    void handleReadHeader(const boost::system::error_code& error_code, T& data_type, boost::tuple<Handler> handler)
    {
        if (error_code)
        {
            BOOST_LOG_TRIVIAL(error) << "[TCP Helper] Error in incoming data length (" << m_in_header << " bytes)";
            boost::get<0>(handler)(error_code);
        }
        else
        {
            std::istringstream header_stream(std::string(m_in_header, HEADER_LENGTH));
            std::size_t m_inbound_data_size = 0;
            if (!(header_stream >> std::hex >> m_inbound_data_size))
            {
                BOOST_LOG_TRIVIAL(error) << "[TCP Helper] Could not retrieve data size (Invalid argument)";
                boost::system::error_code error(boost::asio::error::invalid_argument);
                boost::get<0>(handler)(error);
                return;
            }

            BOOST_LOG_TRIVIAL(debug) << "[TCP Helper] Size: " << m_inbound_data_size;
            m_in_data.resize(m_inbound_data_size);
            void (TcpHelper::*function)(const boost::system::error_code&, T&, boost::tuple<Handler>) = &TcpHelper::handleReadData<T, Handler>;

            boost::asio::async_read(m_socket, boost::asio::buffer(m_in_data), boost::bind(function, this, boost::asio::placeholders::error, boost::ref(data_type), handler));
        }
    }

    /**
     * @brief Internal handler to manage reading data during TCP communications.
     * @tparam T: Type of data expected to be received.
     * @tparam Handler: Type of handler to manage completion of the read operation.
     * @param error_code: Error information passed by Boost.
     * @param data_type:  Reference to store the deserialized data.
     * @param handler: Callback function to handle the completion of the read operation.
     */
    template<typename T, typename Handler>
    void handleReadData(const boost::system::error_code& error_code, T& data_type, boost::tuple<Handler> handler)
    {
        if (error_code)
        {
            boost::get<0>(handler)(error_code);
        }
        else
        {
            try
            {
                std::string archive_data(&m_in_data[0], m_in_data.size());
                std::istringstream archive_stream(archive_data);
                boost::archive::text_iarchive archive(archive_stream);
                archive >> data_type;
                BOOST_LOG_TRIVIAL(debug) << "[TCP Helper] Read " << m_in_data.size() << " bytes";
            }
            catch ([[maybe_unused]] std::exception& exception)
            {
                BOOST_LOG_TRIVIAL(error) << "[TCP Helper] Error in deserialization (Invalid argument)";
                boost::system::error_code error(boost::asio::error::invalid_argument);
                boost::get<0>(handler)(error);
                return;
            }

            boost::get<0>(handler)(error_code);
        }
    }
};

/** Type alias for a shared pointer to TcpHelper to simplify handling and memory management. */
typedef boost::shared_ptr<TcpHelper> p_tcp_connection;

#endif