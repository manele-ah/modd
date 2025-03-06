#include "Id.h"

/**
 * @brief Overload the output stream operator for printing ID details.
 * @param out: Output stream to write to.
 * @param id: Reference to an ID.
 * @return Reference to the modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Id& id)
{
    id.print(out);
    return out;
}