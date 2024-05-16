#ifndef DRONEPROTOCOL_TOPICCONFIGURATION_H
#define DRONEPROTOCOL_TOPICCONFIGURATION_H

#pragma once

#include <string>
#include <vector>
#include <ostream>
#include <boost/serialization/access.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/base_object.hpp>
#include "Payload.h"

class TopicConfiguration : public Payload
{
private:
    std::vector<std::string> m_topics;
    std::vector<int> m_sizes;

public:
    TopicConfiguration();

    TopicConfiguration(const std::vector<std::string>& topics, const std::vector<int>& sizes);

    std::unique_ptr<Payload> clone() const override;

    /**
     * Getter method for topics.
     * @return List of topics.
     */
    std::vector<std::string> getTopics() const;

    /**
     * Getter method for sizes for each topic.
     * @return List of sizes.
     */
    std::vector<int> getSizes() const;

    std::string print() const override;

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<TopicConfiguration>();
        ar & boost::serialization::base_object<Payload>(*this);
        ar & m_topics & m_sizes;
    }
};

#endif
