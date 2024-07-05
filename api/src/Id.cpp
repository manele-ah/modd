#include "../include/Id.h"

/**
 * Overload the "<<" operator for an ID.
 * @param out: Reference to the output stream where the ID will be added.
 * @param id: Reference to an ID.
 * @return The modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Id& id)
{
    id.print(out);
    return out;
}