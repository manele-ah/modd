#ifndef DRONEPROTOCOL_SIMPLEBUFFER_H
#define DRONEPROTOCOL_SIMPLEBUFFER_H

#pragma once

#include <mutex>
#include <vector>
#include <fstream>
#include <iostream>
#include <iterator>
#include <algorithm>
#include <condition_variable>
#include "Buffer.h"

template<typename T>
class SimpleBuffer : public Buffer<T>
{
private:
    int m_size;
    bool m_write_in_file;
    std::string m_file_path;
    std::vector<T> m_buffer;
    int m_write_index;
    bool m_is_full;
    std::ofstream m_file_stream;
    std::mutex m_write_mutex;
    std::mutex m_clear_mutex;

public:
    SimpleBuffer(int size, bool write_in_file, const std::string& file_path);

    ~SimpleBuffer();

    std::optional<T> readElement(int index);

    void writeElement(T value);

    void clear();
};

template<typename T>
SimpleBuffer<T>::SimpleBuffer(int size, bool write_in_file, const std::string& file_path) : Buffer<T>(size, write_in_file, file_path), m_buffer(size), m_write_index(0), m_is_full(false)
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.open(file_path, std::ios_base::app);
    }
}

template<typename T>
SimpleBuffer<T>::~SimpleBuffer()
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.close();
    }
}

template<typename T>
std::optional<T> SimpleBuffer<T>::readElement(int index)
{
    std::unique_lock<std::mutex> clear_lock(m_clear_mutex);
    if (index < m_write_index)
    {
        return m_buffer[index];
    }
    clear_lock.unlock();

    return {};
}

template<typename T>
void SimpleBuffer<T>::writeElement(T value)
{
    std::unique_lock<std::mutex> write_lock(m_write_mutex);
    m_buffer[m_write_index] = value;
    m_write_index += 1;
    write_lock.unlock();

    if (m_write_index == Buffer<T>::m_size)
        clear();
}

template<typename T>
void SimpleBuffer<T>::clear()
{
    std::lock(m_clear_mutex, m_write_mutex);
    std::lock_guard<std::mutex> write_lock(m_write_mutex, std::adopt_lock);
    std::lock_guard<std::mutex> clear_lock(m_clear_mutex, std::adopt_lock);

    {
        if (Buffer<T>::m_write_in_file)
        {
            for (int index = 0; index < Buffer<T>::m_size; index++)
            {
                m_file_stream << m_buffer[index] << "\n";
            }
            m_file_stream.flush();
        }
        m_write_index = 0;
    }
}

#endif
