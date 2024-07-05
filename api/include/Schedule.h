#ifndef DRONEPROTOCOL_SCHEDULE_H
#define DRONEPROTOCOL_SCHEDULE_H

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

class Schedule : public Payload
{
private:
    std::vector<std::vector<std::pair<std::string, std::string>>> m_schedule;

public:
    Schedule();

    Schedule(const std::vector<std::vector<std::pair<std::string, std::string>>>& schedule);

    std::unique_ptr<Payload> clone() const override;

    std::vector<std::vector<std::pair<std::string, std::string>>> getSchedule() const;

    std::string print() const override;

    friend class boost::serialization::access;

    template<class Archive> void serialize(Archive& ar, const unsigned int)
    {
        ar.template register_type<Schedule>();
        ar & boost::serialization::base_object<Payload>(*this);
        ar & m_schedule;
    }
};

#endif
