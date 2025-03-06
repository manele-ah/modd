#ifndef MODD_ID_H
#define MODD_ID_H

#pragma once

#include <ostream>

/**
 * @class Id
 * @brief Abstract class of an ID.
 */
class Id
{
public:
    /** @brief Virtual destructor of an ID. */
    virtual ~Id() = default;

    /**
     * @brief Pure virtual print method.
     * @param out: Reference to the output stream where the ID will be printed.
     */
    virtual void print(std::ostream& out) const = 0;
};


/**
 * @brief Overload the output stream operator for printing ID details.
 * @param out: Output stream to write to.
 * @param id: Reference to an ID.
 * @return Reference to the modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Id& id);

#endif
