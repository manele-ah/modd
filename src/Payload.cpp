#include "Payload.h"

std::unique_ptr<Payload> Payload::clone() const
{
    return std::make_unique<Payload>();
}

std::string Payload::print() const
{
    return {};
}

std::ostream& operator<<(std::ostream& out, const Payload& payload)
{
    return out << payload.print();
}

BOOST_SERIALIZATION_ASSUME_ABSTRACT(Payload)
