#ifndef MODD_BUFFEROPTIMIZER_H
#define MODD_BUFFEROPTIMIZER_H

#include <vector>
#include "ortools/linear_solver/linear_solver.h"
#include "ortools/linear_solver/linear_solver.pb.h"

#pragma once

/** Minimum buffer size. */
constexpr double MIN_BUFFER = 1;
/** Maximum buffer size. */
constexpr double MAX_BUFFER = 1000;
/** Weight factor for the objective function. */
constexpr double ALPHA = 1;
/** Weight factor for the objective function. */
constexpr double BETA = 1;
/** Time out factor. */
constexpr unsigned int FACTOR = 3;
/** Literal for problem description. */
const std::string PROBLEM_LITERAL = "Buffer Size Optimization";
/** Literal for buffer size decision variable. */
const std::string N_LITERAL = "n";
/** Literal for delay decision variable. */
const std::string Z_LITERAL = "z";
/** Literal for max delay decision variable. */
const std::string W_LITERAL = "w";

/**
 * @class BufferOptimizer
 * @brief Class that defines the double buffer size of each topic in the PubBroker.
 * This is formulated as a MILP (Mixed-Integer Linear Program).
 */
class BufferOptimizer
{
private:
    /** Delivery intervals for each subscriber, expressed in seconds. */
    std::vector<double> m_subscribers_periods;
    /** Period of each topic, expressed in seconds. */
    std::vector<double> m_topics_periods;
    /** Mapping of topics to subscribers' indices. */
    std::vector<std::vector<int>> m_associations;
    /** Time out for delays. */
    double m_time_out;
    /** Solver instance. */
    operations_research::MPSolver m_solver;
    /** Decision variables for buffer sizes. */
    std::vector<operations_research::MPVariable*> m_buffer_sizes;
    /** Decision variables for delays experienced by subscribers. */
    std::vector<std::vector<operations_research::MPVariable*>> m_delays;
    /** Decision variable for the max delay any subscriber might encounter. */
    operations_research::MPVariable* m_max_delay;
    /** Objective function to minimize. */
    operations_research::MPObjective* m_objective;

    /**
     * @brief Build the linear optimization problem constraints and objective.
     */
    void setProblem();

    /**
     * @brief Check if the solver found an optimal or feasible solution.
     * @return True if a feasible solution was found, false otherwise.
     */
    bool isSolved();

public:
    /**
     * @brief Initialize the optimizer with all necessary inputs.
     * @param subscribers_periods: Delivery intervals for each subscriber, expressed in seconds.
     * @param topics_periods: Period of each topic, expressed in seconds.
     * @param associations: Mapping of topics to subscribers' indices.
     * @param time_out: Time out for delays.
     */
    BufferOptimizer(const std::vector<double>& subscribers_periods, const std::vector<double>& topics_periods, const std::vector<std::vector<int>>& associations, double time_out);

    /**
     * @brief Retrieve the computed buffer sizes after solving the optimization problem.
     * @return List of buffer sizes (given in the same order as topics).
     */
    std::vector<unsigned int> getBufferSizes();
};

#endif
