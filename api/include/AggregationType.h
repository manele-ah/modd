#ifndef DRONEPROTOCOL_AGGREGATIONTYPE_H
#define DRONEPROTOCOL_AGGREGATIONTYPE_H

#pragma once

/**
 * @enum AggregationType
 * @brief Types of data aggregations.
 */
enum class AggregationType
{
    DEFAULT, NONE, MIN, MAX, FIRST, LAST, AVERAGE
};

#endif
