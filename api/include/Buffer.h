#ifndef MODD_BUFFER_H
#define MODD_BUFFER_H

#pragma once

#include <optional>
#include <utility>

/**
 * @class Buffer
 * @brief Class that defines a buffer to store a collection of elements.
 * @tparam T: Type of elements stored in the buffer.
 */
template<typename T>
class Buffer
{
protected:
    /** Buffer size. */
    unsigned int m_size;
    /** Flag to determine whether the buffer should write its content to a file. */
    bool m_write_in_file;
    /** Path to the file where the buffer content may be written, if enabled. */
    std::string m_file_path;

public:
    /**
     * @brief Initialize a buffer.
     * @param size: Buffer size.
     * @param write_in_file: Flag to enable or disable file writing.
     * @param file_path: Optional path to the file for writing buffer content. Defaults to empty string.
     */
    Buffer(unsigned int size, bool write_in_file, const std::string& file_path = {});

    /**
     * @brief Virtual destructor of a buffer.
     */
    virtual ~Buffer() = default;
};

/**
 * @brief Initialize a buffer.
 * @param size: Buffer size.
 * @param write_in_file: Flag to enable or disable file writing.
 * @param file_path: Optional path to the file for writing buffer content. Defaults to empty string.
 */
template<typename T>
Buffer<T>::Buffer(unsigned int size, bool write_in_file, const std::string& file_path): m_size(size), m_write_in_file(write_in_file), m_file_path(file_path)
{

}

#endif
