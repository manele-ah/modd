#ifndef DRONEPROTOCOL_ID_H
#define DRONEPROTOCOL_ID_H

#pragma once

#include <ostream>

/** Abstract class of an ID. */
class Id
{
public:
    /** Virtual destructor. */
    virtual ~Id() = default;

    /**
     * Pure virtual print method.
     * @param out: Reference to the output stream where the ID will be printed.
     */
    virtual void print(std::ostream& out) const = 0;
};


/**
 * Overload the "<<" operator for an ID.
 * @param out: Reference to the output stream where the ID will be added.
 * @param id: Reference to an ID.
 * @return The modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Id& id);

#endif
