#ifndef DRONEPROTOCOL_DOUBLEBUFFER_H
#define DRONEPROTOCOL_DOUBLEBUFFER_H

#pragma once

#include <mutex>
#include <vector>
#include <fstream>
#include <iostream>
#include <iterator>
#include <algorithm>
#include <condition_variable>
#include "Buffer.h"

// One writer and multiple readers
template<typename T>
class DoubleBuffer : public Buffer<T>
{
private:
    std::vector<T> m_buffer_1;
    std::vector<T> m_buffer_2;
    std::vector<T> *p_front_buffer;
    std::vector<T> *p_back_buffer;
    int m_write_index;
    bool m_is_full;
    std::ofstream m_file_stream;
    std::mutex m_write_mutex;
    std::mutex m_full_mutex;
    std::condition_variable m_full_condition;

public:
    DoubleBuffer(int size, bool write_in_file, const std::string& file_path);

    ~DoubleBuffer();

    void readBuffer(std::vector<T>& buffer);

    void writeElement(T value);

    void swap();
};

template<typename T>
DoubleBuffer<T>::DoubleBuffer(int size, bool write_in_file, const std::string& file_path) : Buffer<T>(size, write_in_file, file_path), m_buffer_1(size), m_buffer_2(size), p_front_buffer(&m_buffer_1), p_back_buffer(&m_buffer_2), m_write_index(0), m_is_full(false)
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.open(file_path, std::ios_base::app);
    }
}

template<typename T>
DoubleBuffer<T>::~DoubleBuffer()
{
    if (Buffer<T>::m_write_in_file)
    {
        m_file_stream.close();
    }
}

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
            for (int index = 0; index < Buffer<T>::m_size; index++)
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