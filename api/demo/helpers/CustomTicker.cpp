#include "CustomTicker.h"

/**
 * @brief Add a custom tick mark to the axis.
 * @param position: Position on the axis where the tick should be placed.
 * @param label: Text label associated with the tick mark.
 */
void CustomTicker::addTick(double position, const QString& label)
{
    QCPAxisTickerText::addTick(position, label);
}
