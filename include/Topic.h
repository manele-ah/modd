#ifndef DRONEPROTOCOL_TOPIC_H
#define DRONEPROTOCOL_TOPIC_H

#pragma once

#include <set>
#include <boost/shared_ptr.hpp>
#include "TcpHelper.h"
#include "TcpSession.h"
#include "AggregationType.h"

class TcpSession;

typedef boost::shared_ptr<TcpSession> p_tcp_session;

class Topic
{
protected:
    int m_size;
    bool m_is_buffer_empty;
    std::string m_code;
    std::string m_logs_path;

public:
    explicit Topic(const std::string& code, int size, const std::string& logs_path);
};

#endif
