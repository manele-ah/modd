#ifndef MODD_SCHEDULE_H
#define MODD_SCHEDULE_H

#include <string>
#include <vector>
#include <ostream>
#include <boost/serialization/access.hpp>
#include <boost/serialization/vector.hpp>
#include <boost/serialization/utility.hpp>
#include <boost/serialization/unique_ptr.hpp>
#include <boost/serialization/base_object.hpp>
#include "Util.h"
#include "Payload.h"

/**
 * @class Schedule
 * @brief Class that defines the schedule for delivering messages from the PubBroker to the SubBroker.
 */
class Schedule : public Payload
{
private:
    /** Schedule data structure, where each slot contains pairs of (topic, aggregation) configurations. */
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule;

public:
    /**
     * @brief Default constructor that initializes an empty schedule.
     */
    Schedule();

    /**
     * @brief Initialize a schedule instance with a pre-defined schedule.
     * @param schedule: Schedule data.
     */
    Schedule(const std::vector<std::vector<std::pair<std::string, std::string>>>& schedule);

    /**
     * @brief Create a deep copy of a Schedule instance.
     * @return Pointer to the newly cloned object.
     */
    std::unique_ptr<Payload> clone() const override;

    /**
     * @brief Retrieve the schedule.
     * @return Schedule data.
     */
    std::vector<std::vector<std::pair<std::string, std::string>>> getSchedule() const;

    /**
     * @brief Return a string representation of the schedule.
     * @return String that represents the schedule content.
     */
    std::string print() const override;

    /**
     * Grant access to Boost serialization for private members of the Schedule class.
     */
    friend class boost::serialization::access;

    /**
     * @brief Serialize the schedule.
     * @param archive: Archive used for serialization.
     * @param version: Version number of the serialization protocol.
     */
    template<class Archive> void serialize(Archive& archive, const unsigned int)
    {
        archive.template register_type<Schedule>();
        archive & boost::serialization::base_object<Payload>(*this);
        archive & m_schedule;
    }
};

#endif
