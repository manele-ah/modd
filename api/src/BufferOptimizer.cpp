#include "BufferOptimizer.h"

/**
 * @brief Initialize the optimizer with all necessary inputs.
 * @param subscribers_periods: Delivery intervals for each subscriber, expressed in seconds.
 * @param topics_periods: Period of each topic, expressed in seconds.
 * @param associations: Mapping of topics to subscribers' indices.
 * @param time_out: Time out for delays.
 */
BufferOptimizer::BufferOptimizer(const std::vector<double>& subscribers_periods, const std::vector<double>& topics_periods, const std::vector<std::vector<int>>& associations, double time_out) : m_subscribers_periods(subscribers_periods), m_topics_periods(topics_periods), m_associations(associations), m_time_out(time_out), m_solver(PROBLEM_LITERAL, operations_research::MPSolver::CBC_MIXED_INTEGER_PROGRAMMING), m_buffer_sizes(topics_periods.size()), m_delays(subscribers_periods.size())
{
    m_max_delay = m_solver.MakeNumVar(0, operations_research::MPSolver::infinity(), W_LITERAL);

    setProblem();
}

/**
 * @brief Build the linear optimization problem constraints and objective.
 */
void BufferOptimizer::setProblem()
{
    for (int i = 0; i < m_topics_periods.size(); ++i)
    {
        m_buffer_sizes[i] = m_solver.MakeIntVar(MIN_BUFFER, MAX_BUFFER, N_LITERAL + "_" + std::to_string(i));

        for (int j : m_associations[i])
        {
            m_delays[j].push_back(m_solver.MakeNumVar(0, FACTOR * m_time_out, Z_LITERAL + "_" + std::to_string(j) + "_" + std::to_string(i)));

            operations_research::MPConstraint* constraint_1 = m_solver.MakeRowConstraint(- operations_research::MPSolver::infinity(), - m_subscribers_periods[j]);
            constraint_1->SetCoefficient(m_delays[j].front(), - 1);
            constraint_1->SetCoefficient(m_buffer_sizes[i], - m_topics_periods[i]);

            operations_research::MPConstraint* constraint_2 = m_solver.MakeRowConstraint(- operations_research::MPSolver::infinity(), m_subscribers_periods[j]);
            constraint_2->SetCoefficient(m_delays[j].back(), - 1);
            constraint_2->SetCoefficient(m_buffer_sizes[i], m_topics_periods[i]);

            operations_research::MPConstraint* constraint_3 = m_solver.MakeRowConstraint(- operations_research::MPSolver::infinity(), 0);
            constraint_3->SetCoefficient(m_delays[j].back(), 1);
            constraint_3->SetCoefficient(m_max_delay, -1);
        }
    }

    m_objective = m_solver.MutableObjective();
    for (const auto& z_j: m_delays)
    {
        for (const auto& z_j_i: z_j)
        {
            m_objective->SetCoefficient(z_j_i, ALPHA);
        }
    }

    m_objective->SetCoefficient(m_max_delay, BETA);
    m_objective->SetMinimization();
}

/**
 * @brief Check if the solver found an optimal or feasible solution.
 * @return True if a feasible solution was found, false otherwise.
 */
bool BufferOptimizer::isSolved()
{
    return m_solver.Solve() == operations_research::MPSolver::OPTIMAL || operations_research::MPSolver::FEASIBLE;
}

/**
 * @brief Retrieve the computed buffer sizes after solving the optimization problem.
 * @return List of buffer sizes (given in the same order as topics).
 */
std::vector<unsigned int> BufferOptimizer::getBufferSizes()
{
    std::vector<unsigned int> buffer_sizes;

    if (isSolved())
    {
        for (auto& buffer_size: m_buffer_sizes)
        {
            if (buffer_size != nullptr)
            {
                buffer_sizes.emplace_back(static_cast<unsigned int>(buffer_size->solution_value()));
            }
            else
            {
                buffer_sizes.emplace_back(1);
            }
        }
    }
    else
    {
        buffer_sizes.resize(m_buffer_sizes.size(), 1);
    }

    return buffer_sizes;
}
