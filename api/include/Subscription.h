#ifndef DRONEPROTOCOL_SUBSCRIPTION_H
#define DRONEPROTOCOL_SUBSCRIPTION_H

#pragma once

#include <string>
#include <ostream>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"
#include "AggregationType.h"

class Subscription : public Payload
{
private:
    std::string m_id;
    int m_interval;
    AggregationType m_aggregation;
    std::string m_code;

public:
    explicit Subscription(const std::string& id = {}, int interval = 0, AggregationType aggregation = AggregationType::NONE, const std::string& code = {});

    std::unique_ptr<Payload> clone() const override;

    std::string getId() const;

    int getInterval() const;

    AggregationType getAggregation() const;

    std::string getCode() const;

    std::string print() const override;

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<Subscription>();
        ar & boost::serialization::base_object<Payload>(*this);
        ar & m_id & m_interval & m_aggregation & m_code;
    }
};

#endif
