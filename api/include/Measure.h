#ifndef DRONEPROTOCOL_MEASURE_H
#define DRONEPROTOCOL_MEASURE_H

#pragma once

#include <boost/serialization/serialization.hpp>

struct Measure
{
    unsigned long long m_timestamp;
    double m_value;

    friend class boost::serialization::access;

    template<class Archive>
    void serialize(Archive& ar, const unsigned int)
    {
        ar & m_timestamp;
        ar & m_value;
    }
};

#endif
