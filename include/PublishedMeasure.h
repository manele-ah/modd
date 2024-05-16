#ifndef DRONEPROTOCOL_PUBLISHEDMEASURE_H
#define DRONEPROTOCOL_PUBLISHEDMEASURE_H

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

class PublishedMeasure : public Payload
{
private:
    std::string m_code;
    std::vector<Measure> m_measures;

public:
    explicit PublishedMeasure(const std::string& code = {}, unsigned long long timestamp = 0, double value = 0.0);

    PublishedMeasure(const std::string& code, const std::vector<Measure>& measures);

    std::unique_ptr<Payload> clone() const override;

    std::string getCode() const;

    unsigned long long getTimestamp() const;

    double getValue() const;

    std::vector<Measure> getMeasures() const;

    std::string print() const override;

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<PublishedMeasure>();
        ar & boost::serialization::base_object<Payload>(*this);
        ar & m_code & m_measures;
    }
};

#endif
