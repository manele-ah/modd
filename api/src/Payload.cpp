#include "Payload.h"

/**
 * @brief Create a deep copy to enable polymorphic cloning of payloads.
 * @return Pointer to the newly cloned object.
 */
std::unique_ptr<Payload> Payload::clone() const
{
    return std::make_unique<Payload>();
}

/**
 * @brief Return a string representation of a payload.
 * @return String that represents the payload content.
 */
std::string Payload::print() const
{
    return {};
}

/**
 * @brief Overload the output stream operator for printing payload details.
 * @param out: Output stream to write to.
 * @param payload: Reference to a payload.
 * @return Reference to the modified output stream.
 */
std::ostream& operator<<(std::ostream& out, const Payload& payload)
{
    return out << payload.print();
}

BOOST_SERIALIZATION_ASSUME_ABSTRACT(Payload)
