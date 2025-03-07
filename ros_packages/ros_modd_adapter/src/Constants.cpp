#include "Constants.h"

namespace Constants
{
    /** 
     * PubBroker configuration parameters. 
     */

    const std::string PUB_BROKER_NODE_NAME = "pub_broker_node";
    const std::string PUB_BROKER_TOPIC_NAME = "pub_broker_node";
    const std::string PUB_BROKER_IP_ARGUMENT_NAME = "pub_broker_ip";
    const std::string PUB_BROKER_PORT_ARGUMENT_NAME = "pub_broker_port";
    const std::string PUB_BROKER_LOGS_PATH_ARGUMENT_NAME = "logs_path";
    const std::string PUB_BROKER_IP_ARGUMENT_DEFAULT = "127.0.0.1";
    const unsigned int PUB_BROKER_PORT_ARGUMENT_DEFAULT = 7171;
    const std::string PUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT = "data/";
    const unsigned int PUB_BROKER_ROS_QUEUE_SIZE = 1000;
    const unsigned int PUB_BROKER_TIMER_PERIOD = 250;

    /** 
     * SubBroker configuration parameters. 
     */

    const std::string SUB_BROKER_NODE_NAME = "sub_broker_node";
    const std::string SUB_BROKER_IP_ARGUMENT_NAME = "sub_broker_ip";
    const std::string SUB_BROKER_PORT_ARGUMENT_NAME = "sub_broker_port";
    const std::string SUB_BROKER_LOGS_PATH_ARGUMENT_NAME = "logs_path";
    const std::string SUB_BROKER_TOPICS_PATH_ARGUMENT_NAME = "topics_path";
    const std::string SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_NAME = "subscribers_path";
    const std::string SUB_BROKER_IP_ARGUMENT_DEFAULT = "127.0.0.1";
    const unsigned int SUB_BROKER_PORT_ARGUMENT_DEFAULT = 7272;
    const std::string SUB_BROKER_LOGS_PATH_ARGUMENT_DEFAULT = "data/";
    const std::string SUB_BROKER_TOPICS_PATH_ARGUMENT_DEFAULT = "conf/topics.conf";
    const std::string SUB_BROKER_SUBSCRIBERS_PATH_ARGUMENT_DEFAULT = "conf/subscribers.conf";
    const unsigned int SUB_BROKER_ROS_QUEUE_SIZE = 1000;
}