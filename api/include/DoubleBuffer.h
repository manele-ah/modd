#ifndef MODD_DOUBLEBUFFER_H
#define MODD_DOUBLEBUFFER_H

#pragma once

#include <mutex>
#include <vector>
#include <fstream>
#include <iostream>
#include <iterator>
#include <algorithm>
#include <condition_variable>
#include "Buffer.h"

/**
 * @class DoubleBuffer
 * @brief Class that defines a thread-safe double buffering mechanism to handle concurrent reads and writes.
 * Two internal buffers are used, with one writer and multiple readers.
 * @tparam T: Type of elements stored in the double buffer.
 */
template<typename T>
class DoubleBuffer : public Buffer<T>
{
private:
    /** First buffer. */
    std::vector<T> m_buffer_1;
    /** Second buffer. */
    std::vector<T> m_buffer_2;
    /** Pointer to the current read (front) buffer. */
    std::vector<T> *p_front_buffer;
    /** Pointer to the current write (back) buffer. */
    std::vector<T> *p_back_buffer;
    /** Current index in the back buffer for writing. */
    unsigned int m_write_index;
    /** Flag indicating if the buffers are ready to be swapped. */
    bool m_is_full;
    /** File stream for writing buffer data to a file. */
    std::ofstream m_file_stream;
    /** Mutex for synchronizing write operations. */
    std::mutex m_write_mutex;
    /** Mutex for managing the full condition of the buffer. */
    std::mutex m_full_mutex;
    /** Condition variable to signal when the buffer is full. */
    std::condition_variable m_full_condition;

public:
    /**
     * @brief Initialize a double buffer.
     * @param size: Size of each internal buffer.
     * @param write_in_file: Flag to enable or disable file writing.
     * @param file_path: Path to the file for writing buffer content.
     */
    DoubleBuffer(unsigned int size, bool write_in_file, const std::string& file_path);

    /**
     * @brief Virtual destructor of a double buffer.
     */
    ~DoubleBuffer();

    /**
     * @brief Reads the current front buffer into the provided vector.
     * @param buffer: Vector to store the copied buffer contents.
     */
    void readBuffer(std::vector<T>& buffer);

    /**
     * @brief Writes an element to the current back buffer at the current write index.
     * @param value: The value to write into the buffer.
     */
    void writeElement(T value);

    /**
     * @brief Swaps the front and back buffers.
     */
    void swap();
};

/**
 * @brief Initialize a double buffer.
 * @param size: Size of each internal buffer.
 * @param write_in_file: Flag to enable or disable file writing.
 * @param file_path: Path to the file for writing buffer content.
 */
template<typename T>
DoubleBuffer<T>::DoubleBuffer(unsigned int size, bool write_in_file, const std::string& file_path) : Buffer<T>(size, write_in_file, file_path), m_buffer_1(size), m_buffer_2(size), p_front_buffer(&m_buffer_1), p_back_buffer(&m_buffer_2), m_write_index(0), m_is_full(false)
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.open(file_path, std::ios_base::app);
    }
}

/**
 * @brief Virtual destructor of a double buffer.
 */
template<typename T>
DoubleBuffer<T>::~DoubleBuffer()
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.close();
    }
}

/**
 * @brief Reads the current front buffer into the provided vector.
 * @param buffer: Vector to store the copied buffer contents.
 */
template<typename T>
void DoubleBuffer<T>::readBuffer(std::vector<T> &buffer)
{
    /*
    std::unique_lock<std::mutex> full_lock(m_full_mutex);
    m_full_condition.wait(full_lock, [this]() { return m_is_full; });
    full_lock.unlock();
    buffer = *p_front_buffer;
    */
    buffer = *p_front_buffer;
    // copy((*p_front_buffer).begin(), (*p_front_buffer).end(), back_inserter(buffer));
    // m_is_full = false;
}

/**
 * @brief Writes an element to the current back buffer at the current write index.
 * @param value: The value to write into the buffer.
 */
template<typename T>
void DoubleBuffer<T>::writeElement(T value)
{
    std::unique_lock<std::mutex> write_lock(m_write_mutex);
    (*p_back_buffer)[m_write_index] = value;
    m_write_index += 1;
    write_lock.unlock();
    if (m_write_index == Buffer<T>::m_size)
        swap();
}

/**
 * @brief Swaps the front and back buffers.
 */
template<typename T>
void DoubleBuffer<T>::swap()
{
    std::lock(m_full_mutex, m_write_mutex);
    std::lock_guard<std::mutex> write_lock(m_write_mutex, std::adopt_lock);
    std::lock_guard<std::mutex> full_lock(m_full_mutex, std::adopt_lock);

    {
        std::swap(p_front_buffer, p_back_buffer);
        if (Buffer<T>::m_write_in_file)
        {
            for (unsigned int index = 0; index < Buffer<T>::m_size; index++)
            {
                m_file_stream << (*p_front_buffer)[index] << "\n";
            }
            m_file_stream.flush();
        }
        m_write_index = 0;
        // std::unique_lock<std::mutex> full_lock(m_full_mutex);
        m_is_full = true;
        m_full_condition.notify_all();
        // full_lock.unlock();

    }
}

#endif