#ifndef MODD_CUSTOMTICKER_H
#define MODD_CUSTOMTICKER_H

#pragma once

#include "../lib/qCustomPlot/qcustomplot.h"

/**
 * @class CustomTicker
 * @brief Class that defines a custom axis ticker.
 */
class CustomTicker : public QCPAxisTickerText
{
public:
    /**
     * @brief Add a custom tick mark to the axis.
     * @param position: Position on the axis where the tick should be placed.
     * @param label: Text label associated with the tick mark.
     */
    void addTick(double position, const QString& label);
};

#endif
