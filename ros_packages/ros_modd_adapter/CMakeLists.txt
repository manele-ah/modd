#----------------------------------------------------------------------
# Global settings
#----------------------------------------------------------------------
cmake_minimum_required(VERSION 3.8)
project(ros_modd_adapter)

#----------------------------------------------------------------------
# Platform and compiler options
#----------------------------------------------------------------------
if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

#----------------------------------------------------------------------
# ROS required packages
#----------------------------------------------------------------------
# Find and configure packages
find_package(ament_cmake REQUIRED)
find_package(rclcpp REQUIRED)
find_package(std_msgs REQUIRED)
find_package(interfaces REQUIRED)

#----------------------------------------------------------------------
# Boost, OR-Tools and MoDD library paths
#----------------------------------------------------------------------
# Set settings
set(BOOST_ENABLE_CMAKE ON)
set(Boost_USE_STATIC_LIBS ON)

# Find and configure packages and libraries
find_package(Boost 1.80.0 REQUIRED COMPONENTS thread serialization filesystem system program_options log log_setup)
find_package(ortools CONFIG REQUIRED)
find_library(CORE_MODD_LIB NAMES CoreUtilities PATHS ${CMAKE_CURRENT_SOURCE_DIR}/lib/modd/release)
find_library(PUB_BROKER_LIB NAMES PubBroker PATHS ${CMAKE_CURRENT_SOURCE_DIR}/lib/modd/release)
find_library(SUB_BROKER_LIB NAMES SubBroker PATHS ${CMAKE_CURRENT_SOURCE_DIR}/lib/modd/release)
find_library(CLIENT_LIB NAMES Subscriber PATHS ${CMAKE_CURRENT_SOURCE_DIR}/lib/modd/release)

# Windows networking libraries, needed for Boost
if(WIN32)
  link_libraries(ws2_32 wsock32)
endif()

# Include and link directories
include_directories(${Boost_INCLUDE_DIRS})
link_directories(${Boost_LIBRARY_DIRS})
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/lib/modd/include "include/ros_modd_adapter")

#----------------------------------------------------------------------
# Testing configuration
#----------------------------------------------------------------------
if(BUILD_TESTING)
  find_package(ament_lint_auto REQUIRED)
  set(ament_cmake_copyright_FOUND TRUE)
  set(ament_cmake_cpplint_FOUND TRUE)
  ament_lint_auto_find_test_dependencies()
endif()

#----------------------------------------------------------------------
# Build targets
#----------------------------------------------------------------------
add_executable(pub_broker main/pub_broker_node.cpp include/ros_modd_adapter/PubBrokerAdapter.h src/PubBrokerAdapter.cpp include/ros_modd_adapter/Constants.h src/Constants.cpp)
target_link_libraries(pub_broker ${CORE_MODD_LIB} ${PUB_BROKER_LIB} ${Boost_LIBRARIES})
ament_target_dependencies(pub_broker rclcpp std_msgs interfaces)

add_executable(sub_broker main/sub_broker_node.cpp include/ros_modd_adapter/SubBrokerAdapter.h src/SubBrokerAdapter.cpp include/ros_modd_adapter/Helper.h src/Helper.cpp include/ros_modd_adapter/Constants.h src/Constants.cpp)
target_link_libraries(sub_broker ${SUB_BROKER_LIB} ${CLIENT_LIB} ${CORE_MODD_LIB} ${Boost_LIBRARIES} ortools::ortools)
ament_target_dependencies(sub_broker rclcpp std_msgs interfaces)

add_executable(publisher demo/demo_publisher.cpp)
ament_target_dependencies(publisher rclcpp std_msgs interfaces)

add_executable(subscriber demo/demo_subscriber.cpp)
ament_target_dependencies(subscriber rclcpp std_msgs interfaces)

install(TARGETS pub_broker DESTINATION lib/${PROJECT_NAME})
install(TARGETS sub_broker DESTINATION lib/${PROJECT_NAME})
install(TARGETS publisher DESTINATION lib/${PROJECT_NAME})
install(TARGETS subscriber DESTINATION lib/${PROJECT_NAME})

ament_package()
