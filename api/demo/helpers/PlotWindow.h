#ifndef MODD_PLOTWINDOW_H
#define MODD_PLOTWINDOW_H

#pragma once

#include <QTimer>
#include <QMainWindow>
#include <QSharedPointer>
#include <boost/log/trivial.hpp>
#include "../lib/qCustomPlot/qcustomplot.h"
#include "CustomTicker.h"

/**
 * @class PlotWindow
 * @brief Class that defines a plot to display incoming data.
 */
class PlotWindow : public QMainWindow
{
Q_OBJECT

private:
    /** Plot instance for charting. */
    QCustomPlot* m_custom_plot;
    /** Custom ticker for the x-axis. */
    QSharedPointer<CustomTicker> m_custom_ticker;
    /** Window title. */
    QString m_window_title;
    /** X-axis label. */
    QString m_x_axis_label;
    /** Y-axis label. */
    QString m_y_axis_label;
    /** Boolean that indicates if the plot displays single values or Min-Max values (vertical lines). */
    bool m_min_max_mode;

public:
    /**
     * Initialize a plot window.
     * @param window_title: Title of the window.
     * @param x_axis_label: X-axis label.
     * @param y_axis_label: Y-axis label.
     * @param parent: Pointer to the parent QWidget.
     */
    PlotWindow(const QString& window_title, const QString& x_axis_label, const QString& y_axis_label, QWidget *parent = nullptr);

    /**
     * @brief Update x-axis label.
     * @param label New label for the x-axis.
     */
    void setXAxisLabel(const QString& label);

    /**
     * @brief Update y-axis label.
     * @param label New label for the y-axis.
     */
    void setYAxisLabel(const QString& label);

public slots:
    /**
     * Plot incoming data.
     * @param x: Timestamp of the measure.
     * @param y_1: Primary value of the measure.
     * @param y_2: Optional secondary value (valid if m_min_max_mode is true).
     */
    void plotData(unsigned long long x, double y_1, double y_2 = NAN);

};

#endif
