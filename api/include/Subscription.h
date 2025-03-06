#ifndef MODD_SUBSCRIPTION_H
#define MODD_SUBSCRIPTION_H

#pragma once

#include <string>
#include <ostream>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"
#include "AggregationType.h"

/**
 * @class Subscription
 * @brief Class that defines a subscription request sent by subscribers to the SubBroker.
 */
class Subscription : public Payload
{
private:
    /** Subscriber ID. */
    std::string m_id;
    /** Delivery interval in milliseconds. */
    unsigned long long m_interval;
    /** Aggregation type requested by the subscriber. */
    AggregationType m_aggregation;
    /** Topic of interest for the subscriber. */
    std::string m_code;

public:
    /**
     * @brief Initialize a subscription request.
     * @param id: ID of the subscriber requesting the subscription.
     * @param interval: Delivery interval in milliseconds.
     * @param aggregation: Aggregation type requested by the subscriber.
     * @param code: Topic of interest for the subscriber.
     */
    explicit Subscription(const std::string& id = {}, unsigned long long interval = 0, AggregationType aggregation = AggregationType::NONE, const std::string& code = {});

    /**
     * @brief Create a deep copy of a Subscription instance.
     * @return Pointer to the newly cloned object.
     */
    std::unique_ptr<Payload> clone() const override;

    /**
     * @brief Retrieve the ID of the subscriber requesting the subscription.
     * @return Subscriber ID.
     */
    std::string getId() const;

    /**
     * @brief Retrieve the delivery interval.
     * @return Delivery interval between two consecutive updates.
     */
    unsigned long long getInterval() const;

    /**
     * @brief Retrieve the aggregation type of the subscription.
     * @return Aggregation type of the received data.
     */
    AggregationType getAggregation() const;

    /**
     * @brief Retrieve the topic ID related to the subscription.
     * @return Topic of the received data.
     */
    std::string getCode() const;

    /**
     * @brief Return a string representation of the subscription request.
     * @return String that represents the subscription request.
     */
    std::string print() const override;

    /**
     * Grant access to Boost serialization for private members of the Subscription class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize the subscription request.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned long long)
    {
        archive.template register_type<Subscription>();
        archive & boost::serialization::base_object<Payload>(*this);
        archive & m_id & m_interval & m_aggregation & m_code;
    }
};

#endif
