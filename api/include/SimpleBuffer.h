#ifndef MODD_SIMPLEBUFFER_H
#define MODD_SIMPLEBUFFER_H

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
    std::vector<T> m_buffer;
    unsigned int m_write_index;
    bool m_is_full;
    std::ofstream m_file_stream;

public:
    SimpleBuffer(unsigned int size, bool write_in_file, const std::string& file_path);

    ~SimpleBuffer();
};

template<typename T>
SimpleBuffer<T>::SimpleBuffer(unsigned int size, bool write_in_file, const std::string& file_path) : Buffer<T>(size, write_in_file, file_path), m_buffer(size), m_write_index(0), m_is_full(false)
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

#endif
