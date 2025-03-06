#include "Schedule.h"

/**
 * @brief Default constructor that initializes an empty schedule.
 */
Schedule::Schedule()
{

}

/**
 * @brief Initialize a schedule instance with a pre-defined schedule.
 * @param schedule: Schedule data.
 */
Schedule::Schedule(const std::vector<std::vector<std::pair<std::string, std::string>>>& schedule): m_schedule(schedule)
{

}

/**
 * @brief Create a deep copy of a Schedule instance.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> Schedule::clone() const
{
    return std::make_unique<Schedule>(m_schedule);
}

/**
 * @brief Retrieve the schedule.
 * @return Schedule data.
 */
std::vector<std::vector<std::pair<std::string, std::string>>> Schedule::getSchedule() const
{
    return m_schedule;
}

/**
 * @brief Return a string representation of the schedule.
 * @return String that represents the schedule content.
 */
std::string Schedule::print() const
{
    std::string output;

    for (size_t j = 0; j < m_schedule.size(); j++)
    {
        output += std::to_string(j) + " ==> {";
        if (m_schedule[j].empty())
        {
            output += "}";
        }
        else
        {
            for (size_t k = 0; k < m_schedule[j].size(); k++)
            {
                output += "(" + m_schedule[j][k].first + ", " + m_schedule[j][k].second + ")";

                if (k != m_schedule[j].size() - 1)
                {
                    output += ", ";
                }
                else
                {
                    output += "}";
                }
            }
        }

        if (j != m_schedule.size() - 1)
        {
            output += ", ";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(Schedule)

