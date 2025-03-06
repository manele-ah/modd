#ifndef MODD_TOPICCONFIGURATION_H
#define MODD_TOPICCONFIGURATION_H

#pragma once

#include <string>
#include <vector>
#include <ostream>
#include <boost/serialization/access.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/base_object.hpp>
#include "Payload.h"

/**
 * @class TopicConfiguration
 * @brief Class that defines the configuration for topics.
 */
class TopicConfiguration : public Payload
{
private:
    /** List of topic IDs. */
    std::vector<std::string> m_topics;
    /** Sizes of the buffers associated with each topic. */
    std::vector<unsigned int> m_sizes;

public:
    /**
     * @brief Default constructor that initializes an empty topic configuration.
     */
    TopicConfiguration();

    /**
     * @brief Initialize a topic configuration.
     * @param topics: List of topic IDs.
     * @param sizes: Sizes of the buffers associated with each topic.
     */
    TopicConfiguration(const std::vector<std::string>& topics, const std::vector<unsigned int>& sizes);

    /**
     * @brief Create a deep copy of a TopicConfiguration instance.
     * @return Pointer to the newly cloned object.
     */
    std::unique_ptr<Payload> clone() const override;

    /**
     * @brief Retrieve the IDs of the topics.
     * @return List of topic IDs.
     */
    std::vector<std::string> getTopics() const;

    /**
     * @brief Retrieve the list of sizes corresponding to each topic.
     * @return Sizes of the buffers associated with each topic.
     */
    std::vector<unsigned int> getSizes() const;

    /**
     * @brief Return a string representation of the topic configuration.
     * @return String that represents the topic configuration.
     */
    std::string print() const override;

    /**
     * Grant access to Boost serialization for private members of the TopicConfiguration class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize the topic configuration.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned int)
    {
        archive.template register_type<TopicConfiguration>();
        archive & boost::serialization::base_object<Payload>(*this);
        archive & m_topics & m_sizes;
    }
};

#endif
