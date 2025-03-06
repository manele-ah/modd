#ifndef MODD_TOPIC_H
#define MODD_TOPIC_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "TcpHelper.h"
#include "TcpSession.h"
#include "AggregationType.h"

class TcpSession;

typedef boost::shared_ptr<TcpSession> p_tcp_session;

/**
 * @class Topic
 * @brief Class that defines a topic.
 */
class Topic
{
protected:
    /** Topic ID. */
    std::string m_code;
    /** Size of the buffer associated with the topic. */
    unsigned int m_size;
    /** Flag indicating if the buffer associated with the topic is empty. */
    bool m_is_buffer_empty;
    /** Path for logging measures related to the topic. */
    std::string m_logs_path;

public:
    /**
     * @brief Initialize a topic instance.
     * @param code: Topic ID.
     * @param size: Size of the buffer associated with the topic.
     * @param logs_path: Path for logging measures related to the topic.
     */
    explicit Topic(const std::string& code, unsigned int size, const std::string& logs_path);
};

#endif
