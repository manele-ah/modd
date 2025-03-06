#ifndef MODD_PAYLOAD_H
#define MODD_PAYLOAD_H

#pragma once

#include <vector>
#include <memory>
#include <iostream>
#include <boost/serialization/access.hpp>
#include <boost/serialization/export.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/utility.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/base_object.hpp>
#include <boost/serialization/assume_abstract.hpp>

/**
 * @class Payload
 * @brief Abstract class that defines different types of payloads in a message.
 */
class Payload
{
public:
    /** Default constructor. */
    Payload() = default;

    /**
     * @brief Create a deep copy to enable polymorphic cloning of payloads.
     * @return Pointer to the newly cloned object.
     */
    virtual std::unique_ptr<Payload> clone() const;

    /**
     * @brief Virtual destructor of a payload.
     */
    virtual ~Payload() = default;

    /**
     * @brief Return a string representation of a payload.
     * @return String that represents the payload content.
     */
    virtual std::string print() const;

    /**
     * @brief Overload the output stream operator for printing payload details.
     * @param out: Output stream to write to.
     * @param payload: Reference to a payload.
     * @return Reference to the modified output stream.
     */
    friend std::ostream& operator<<(std::ostream& out, const Payload& payload);

    /**
     * Grant access to Boost serialization for private members of the Payload class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize a payload.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive&, const unsigned int)
    {

    }
};

#endif
