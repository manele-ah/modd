#ifndef DRONEPROTOCOL_PAYLOAD_H
#define DRONEPROTOCOL_PAYLOAD_H

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

class Payload
{
public:
    Payload() = default;

    virtual std::unique_ptr<Payload> clone() const;

    virtual ~Payload() = default;

    virtual std::string print() const;

    friend std::ostream& operator<<(std::ostream& out, const Payload& payload);

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive&, const unsigned int)
    {

    }
};

#endif
