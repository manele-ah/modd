#ifndef MODD_PUBLISHEDMEASURE_H
#define MODD_PUBLISHEDMEASURE_H

#pragma once

#include <vector>
#include <ostream>
#include <boost/serialization/access.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"
#include "Measure.h"

/**
 * @class PublishedMeasure
 * @brief Class that defines the measures sent by the publishers to the PubBroker.
 */
class PublishedMeasure : public Payload
{
private:
    /** Topic ID of a measure. */
    std::string m_code;
    /** List of (timestamp, value) tuples. */
    std::vector<Measure> m_measures;

public:
    /**
     * @brief Initialize a measure with a topic ID and a single (timestamp, value) tuple.
     * @param code: Topic ID of the measure.
     * @param timestamp: Timestamp of the measure.
     * @param value: Value of the measure.
     */
    explicit PublishedMeasure(const std::string& code = {}, unsigned long long timestamp = 0, double value = 0.0);

    /**
     * @brief Initialize a measure with a topic ID and a list of (timestamp, value) tuples.
     * @param code: Topic ID of the measure.
     * @param measures: List of (timestamp, value) tuples.
     */
    PublishedMeasure(const std::string& code, const std::vector<Measure>& measures);

    /**
     * @brief Create a deep copy of a PublishedMeasure instance.
     * @return Pointer to the newly cloned object.
     */
    std::unique_ptr<Payload> clone() const override;

    /**
     * @brief Retrieve the topic ID of the published measure.
     * @return Topic ID of the measure.
     */
    std::string getCode() const;

    /**
     * @brief Retrieve the timestamp of the published measure.
     * @return Timestamp of the measure.
     */
    unsigned long long getTimestamp() const;

    /**
     * @brief Retrieve the value of the published measure.
     * @return Value of the measure.
     */
    double getValue() const;

    /**
     * @brief Retrieve the list of (timestamp, value) tuples contained within the published measures.
     * @return (timestamp, value) tuples.
     */
    std::vector<Measure> getMeasures() const;

    /**
     * @brief Return a string representation of the published measures.
     * @return String that represents the published measures content.
     */
    std::string print() const override;

    /**
     * Grant access to Boost serialization for private members of the PublishedMeasure class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize the published measures.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned int)
    {
        archive.template register_type<PublishedMeasure>();
        archive & boost::serialization::base_object<Payload>(*this);
        archive & m_code & m_measures;
    }
};

#endif
