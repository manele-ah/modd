#ifndef DRONEPROTOCOL_BUFFER_H
#define DRONEPROTOCOL_BUFFER_H

#pragma once

#include <optional>

template<typename T>
class Buffer
{
protected:
    int m_size;
    bool m_write_in_file;
    std::string m_file_path;

public:
    Buffer(int size, bool write_in_file, const std::string& file_path = {});

    virtual ~Buffer() = default;
};

template<typename T>
Buffer<T>::Buffer(int size, bool write_in_file, const std::string& file_path): m_size(size), m_write_in_file(write_in_file), m_file_path(file_path)
{

}

#endif
