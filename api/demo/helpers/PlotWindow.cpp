#include <iostream>
#include "PlotWindow.h"

/**
 * Initialize a plot window.
 * @param window_title: Title of the window.
 * @param x_axis_label: X-axis label.
 * @param y_axis_label: Y-axis label.
 * @param parent: Pointer to the parent QWidget.
 */
PlotWindow::PlotWindow(const QString& window_title, const QString& x_axis_label, const QString& y_axis_label, QWidget *parent) : QMainWindow(parent), m_window_title(window_title), m_x_axis_label(x_axis_label), m_y_axis_label(y_axis_label), m_min_max_mode(false)
{
    setWindowTitle(m_window_title);
    m_custom_plot = new QCustomPlot(this);
    setCentralWidget(m_custom_plot);

    m_custom_plot->addGraph();
    m_custom_plot->addGraph();

    m_custom_plot->xAxis->setLabel(m_x_axis_label);
    m_custom_plot->yAxis->setLabel(m_y_axis_label);

    m_custom_ticker = QSharedPointer<CustomTicker>::create();
    m_custom_plot->xAxis->setTicker(m_custom_ticker);
}

/**
 * @brief Update x-axis label.
 * @param label New label for the x-axis.
 */
void PlotWindow::setXAxisLabel(const QString& label)
{
    m_x_axis_label = label;
    m_custom_plot->xAxis->setLabel(m_x_axis_label);
}

/**
 * @brief Update y-axis label.
 * @param label New label for the y-axis.
 */
void PlotWindow::setYAxisLabel(const QString& label)
{
    m_y_axis_label = label;
    m_custom_plot->yAxis->setLabel(m_y_axis_label);
}

/**
 * Plot incoming data.
 * @param x: Timestamp of the measure.
 * @param y_1: Primary value of the measure.
 * @param y_2: Optional secondary value (valid if m_min_max_mode is true).
 */
void PlotWindow::plotData(unsigned long long x, double y_1, double y_2)
{
    if (m_min_max_mode && !isnan(y_2))
    {
        m_custom_plot->graph(1)->addData((double) x, y_1);
        m_custom_plot->graph(1)->addData((double) x, y_2);
    }
    else
    {
        m_custom_plot->graph(0)->addData((double) x, y_1);
    }

    QCPRange x_range = m_custom_plot->xAxis->range();
    QCPRange y_range = m_custom_plot->yAxis->range();
    double x_margin = x_range.size() * 0.05;
    double y_margin = y_range.size() * 0.05;

    m_custom_plot->xAxis->setRange(x_range.lower - x_margin, x_range.upper + x_margin);
    m_custom_plot->yAxis->setRange(y_range.lower - y_margin, y_range.upper + y_margin);

    m_custom_plot->rescaleAxes();
    m_custom_plot->replot();
}