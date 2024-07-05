#ifndef DRONEPROTOCOL_DELIVEREDMEASURE_H
#define DRONEPROTOCOL_DELIVEREDMEASURE_H

#pragma once

#include <ostream>
#include <string>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"
#include "Measure.h"

class DeliveredMeasure : public Payload
{
private:
    std::string m_code;
    std::vector<Measure> m_measures;

public:
    explicit DeliveredMeasure(const std::string& code = {}, unsigned long long timestamp = 0, double value = 0.0);

    DeliveredMeasure(const std::string& code, const std::vector<Measure>& measures);

    std::unique_ptr<Payload> clone() const override;

    std::string getCode() const;

    unsigned long long getTimestamp() const;

    double getValue() const;

    std::vector<Measure> getMeasures() const;

    std::string print() const override;

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<DeliveredMeasure>();
        ar & boost::serialization::base_object<Payload>(*this);
        ar & m_code & m_measures;
    }
};

#endif
