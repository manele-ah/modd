#include "../include/Schedule.h"

Schedule::Schedule()
{

}

Schedule::Schedule(const std::vector<std::vector<std::pair<std::string, std::string>>>& schedule): m_schedule(schedule)
{

}

std::unique_ptr<Payload> Schedule::clone() const
{
    return std::make_unique<Schedule>(m_schedule);
}

/**
 * Getter method for schedule.
 * @return Delivery schedule.
 */
std::vector<std::vector<std::pair<std::string, std::string>>> Schedule::getSchedule() const
{
    return m_schedule;
}


std::string Schedule::print() const
{
    std::string output;

    for (int j = 0; j < m_schedule.size(); j++)
    {
        output += std::to_string(j) + " ==> {";
        if (m_schedule[j].empty())
        {
            output += "}";
        }
        else
        {
            for (int k = 0; k < m_schedule[j].size(); k++)
            {
                output += "(" + m_schedule[j][k].first + "," + m_schedule[j][k].second + ")";

                if (k != m_schedule[j].size() - 1)
                {
                    output += ",";
                }
                else
                {
                    output += "}";
                }
            }
        }

        if (j != m_schedule.size() - 1)
        {
            output += ",";
        }
    }

    return output;
}

BOOST_CLASS_EXPORT(Schedule)

