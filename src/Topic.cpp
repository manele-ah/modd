#include "Topic.h"

Topic::Topic(const std::string& code, int size, const std::string& logs_path): m_code(code), m_size(size), m_is_buffer_empty(true), m_logs_path(logs_path)
{

}