#include "Topic.h"

/**
 * @brief Initialize a topic instance.
 * @param code: Topic ID.
 * @param size: Size of the buffer associated with the topic.
 * @param logs_path: Path for logging measures related to the topic.
 */
Topic::Topic(const std::string& code, unsigned int size, const std::string& logs_path): m_code(code), m_size(size), m_is_buffer_empty(true), m_logs_path(logs_path)
{

}