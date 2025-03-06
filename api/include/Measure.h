#ifndef MODD_MEASURE_H
#define MODD_MEASURE_H

#pragma once

#include <boost/serialization/serialization.hpp>

/**
 * @struct Measure
 * @brief Structure that defines a measure.
 */
struct Measure
{
    /** Timestamp of the measure. */
    unsigned long long m_timestamp;
    /** Value of the measure. */
    double m_value;

    /**
     * Grant access to Boost serialization for private members of the Measure class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize a measure.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive>
    void serialize(Archive& archive, const unsigned int)
    {
        archive & m_timestamp;
        archive & m_value;
    }
};

#endif
