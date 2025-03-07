#ifndef ROSMODDADAPTER_CONSTANTS_H
#define ROSMODDADAPTER_CONSTANTS_H

#pragma once

#include <string>

namespace Constants
{
    /** 
     * PubBroker configuration parameters. 
     */

    /** Name of the ROS node wrapper of the PubBroker. */
    extern const std::string PUB_BROKER_NODE_NAME;
    /** Name of the ROS topic on which the PubBroker receives data. */
    extern const std::string PUB_BROKER_TOPIC_NAME;
    /** Argument name for IP address of the PubBroker. */
    extern const std::string PUB_BROKER_IP_ARGUMENT_NAME;
    /** Argument name for port number of the PubBroker. */
    extern const std::string PUB_BROKER_PORT_ARGUMENT_NAME;
    /** Argument name for log directory of the PubBroker. */
    extern const std::string PUB_BROKER_LOGS_PATH_ARGUMENT_NAME;
    /** Default IP address for the PubBroker if none is set externally. */
    extern const std::string PUB_BROKER_IP_ARGUMENT_DEFAULT;
    /** Default port number for the PubBroker if none is set externally. */
    extern const unsigned int PUB_BROKER_PORT_ARGUMENT_DEFAULT;
    /** Default log directory for the PubBroker if none is set externally. */
    extern const std::string PUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT;
    /** Size of the ROS queue used by the PubBroker. */
    extern const unsigned int PUB_BROKER_ROS_QUEUE_SIZE;
    /** Polling period for topics in milliseconds. */
    extern const unsigned int PUB_BROKER_TIMER_PERIOD;

    /** 
     * SubBroker configuration parameters. 
     */

    /** Name of the ROS node wrapper of the SubBroker. */
    extern const std::string SUB_BROKER_NODE_NAME;
    /** Argument name for IP address of the SubBroker. */
    extern const std::string SUB_BROKER_IP_ARGUMENT_NAME;
    /** Argument name for port number of the SubBroker. */
    extern const std::string SUB_BROKER_PORT_ARGUMENT_NAME;
    /** Argument name for log directory of the SubBroker. */
    extern const std::string SUB_BROKER_LOGS_PATH_ARGUMENT_NAME;
    /** Argument name for topics configuration path of the SubBroker. */
    extern const std::string SUB_BROKER_TOPICS_PATH_ARGUMENT_NAME;
    /** Argument name for subscribers configuration path of the SubBroker. */
    extern const std::string SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_NAME;
    /** Default IP address for the SubBroker if none is set externally. */
    extern const std::string SUB_BROKER_IP_ARGUMENT_DEFAULT;
    /** Default port number for the SubBroker if none is set externally. */
    extern const unsigned int SUB_BROKER_PORT_ARGUMENT_DEFAULT;
    /** Default log directory for the SubBroker if none is set externally. */
    extern const std::string SUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT;
    /** Default topics path for the SubBroker if none is set externally. */
    extern const std::string SUB_BROKER_TOPICS_PATH_ARGUMENT_DEFAULT;
    /** Default subscribers path for the SubBroker if none is set externally. */
    extern const std::string SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_DEFAULT;
    /** Size of the ROS queue used by the SubBroker. */
    extern const unsigned int SUB_BROKER_ROS_QUEUE_SIZE;
}

#endif
