#ifndef MODD_DELIVEREDMEASURE_H
#define MODD_DELIVEREDMEASURE_H

#pragma once

#include <ostream>
#include <string>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"
#include "Measure.h"

/**
 * @class DeliveredMeasure
 * @brief Class that defines the measures sent by the PubBroker to the SubBroker.
 */
class DeliveredMeasure : public Payload
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
    explicit DeliveredMeasure(const std::string& code = {}, unsigned long long timestamp = 0, double value = 0.0);

    /**
     * @brief Initialize a measure with a topic ID and a list of (timestamp, value) tuples.
     * @param code: Topic ID of the measure.
     * @param measures: List of (timestamp, value) tuples.
     */
    DeliveredMeasure(const std::string& code, const std::vector<Measure>& measures);

    /**
     * @brief Create a deep copy of a DeliveredMeasure instance.
     * @return Pointer to the newly cloned object.
     */
    std::unique_ptr<Payload> clone() const override;

    /**
     * @brief Retrieve the topic ID of the delivered measures.
     * @return Topic ID of the measures.
     */
    std::string getCode() const;

    /**
     * @brief Retrieve the timestamp of the delivered measure.
     * @return Timestamp of the measure.
     */
    unsigned long long getTimestamp() const;

    /**
     * @brief Retrieve the value of the delivered measure.
     * @return Value of the measure.
     */
    double getValue() const;

    /**
     * @brief Retrieve the list of (timestamp, value) tuples contained within the delivered measures.
     * @return (timestamp, value) tuples.
     */
    std::vector<Measure> getMeasures() const;

    /**
     * @brief Return a string representation of the delivered measures.
     * @return String that represents the delivered measures content.
     */
    std::string print() const override;

    /**
     * Grant access to Boost serialization for private members of the DeliveredMeasure class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize the delivered measures.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned int)
    {
        archive.template register_type<DeliveredMeasure>();
        archive & boost::serialization::base_object<Payload>(*this);
        archive & m_code & m_measures;
    }
};

#endif
