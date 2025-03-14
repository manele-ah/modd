cmake_minimum_required(VERSION 3.24)
project(MoDD)

#----------------------------------------------------------------------
# Global settings
#----------------------------------------------------------------------
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_VERBOSE_MAKEFILE ON)
set(CMAKE_EXPORT_COMPILE_COMMANDS ON)

#----------------------------------------------------------------------
# Platform and compiler options
#----------------------------------------------------------------------
if(CMAKE_CXX_COMPILER_ID STREQUAL "MSVC")
    add_definitions(-DWIN32_LEAN_AND_MEAN -D_WIN32_WINNT=0x0601)
    add_compile_options(/W4)
elseif(CMAKE_CXX_COMPILER_ID STREQUAL "Clang")
    add_compile_options(-Wall -Wno-unused)
endif()

#----------------------------------------------------------------------
# Third-party library paths needed for the PubBroker and SubBroker
#----------------------------------------------------------------------
# Set settings
set(BOOST_ENABLE_CMAKE ON)
set(Boost_USE_STATIC_LIBS ON)

# Find and configure packages
find_package(Boost 1.80.0 REQUIRED COMPONENTS thread serialization filesystem system program_options log log_setup)
find_package(ortools CONFIG REQUIRED)

# Include and link directories
include_directories(${Boost_INCLUDE_DIRS} "include/" "demo/generated/" "demo/helpers/")
link_directories(${Boost_LIBRARY_DIRS})

# Windows networking libraries, needed for Boost
if(WIN32)
    link_libraries(ws2_32 wsock32)
endif()

#----------------------------------------------------------------------
# Static library for common sources and headers
#----------------------------------------------------------------------
set(COMMON_SOURCES src/Message.cpp src/MessageType.cpp src/Payload.cpp src/PublishedMeasure.cpp src/DeliveredMeasure.cpp src/Subscription.cpp src/TopicConfiguration.cpp src/Schedule.cpp src/Util.cpp src/Id.cpp src/TcpIpId.cpp src/TcpSession.cpp src/TcpClient.cpp src/TcpServer.cpp src/PeerTcpServer.cpp)
set(COMMON_HEADERS include/Message.h include/MessageType.h include/Payload.h include/Measure.h include/PublishedMeasure.h include/DeliveredMeasure.h include/Subscription.h include/TopicConfiguration.h include/Schedule.h include/Util.h include/Id.h include/TcpIpId.h include/TcpHelper.h include/TcpSession.h include/SessionType.h include/TcpClient.h include/TcpServer.h include/PeerTcpServer.h)
add_library(CoreUtilities STATIC ${COMMON_HEADERS} ${COMMON_SOURCES})
target_link_libraries(CoreUtilities PUBLIC ${Boost_LIBRARIES})

#----------------------------------------------------------------------
# PubBroker and SubBroker static libraries
#----------------------------------------------------------------------
add_library(PubBroker STATIC include/PubBroker.h src/PubBroker.cpp include/Topic.h src/Topic.cpp include/TopicPubBroker.h src/TopicPubBroker.cpp include/Buffer.h include/DoubleBuffer.h)
target_link_libraries(PubBroker PUBLIC CoreUtilities ${Boost_LIBRARIES})
add_library(SubBroker STATIC include/SubBroker.h src/SubBroker.cpp include/Topic.h src/Topic.cpp include/TopicSubBroker.h src/TopicSubBroker.cpp include/Buffer.h include/SimpleBuffer.h include/BufferOptimizer.h src/BufferOptimizer.cpp)
target_link_libraries(SubBroker PUBLIC CoreUtilities ${Boost_LIBRARIES} ortools::ortools)

#----------------------------------------------------------------------
# Third-party library paths needed for publishers and subscribers
#----------------------------------------------------------------------
# To do : You need to configure path for Qt 6 and QCustomPlot library (https://www.qcustomplot.com/)
# Set directories
set(QT_CUSTOM_PLOT_DIRS $ENV{QT_CUSTOM_PLOT_DIRS})

# Find and configure packages
find_package(Qt6 REQUIRED COMPONENTS Core Widgets PrintSupport)

#----------------------------------------------------------------------
# Publisher static library
#----------------------------------------------------------------------
add_library(Publisher STATIC include/PublisherCore.h src/PublisherCore.cpp)
target_link_libraries(Publisher PUBLIC CoreUtilities)

#----------------------------------------------------------------------
# Subscriber static library
#----------------------------------------------------------------------
add_library(Subscriber STATIC include/SubscriberCore.h src/SubscriberCore.cpp)
target_link_libraries(Subscriber PUBLIC CoreUtilities)

#----------------------------------------------------------------------
# PubBroker and SubBroker executables
#----------------------------------------------------------------------
add_executable(PubBrokerServer demo/main/main_pub_broker.cpp)
target_link_libraries(PubBrokerServer PubBroker)
add_executable(SubBrokerServer demo/main/main_sub_broker.cpp)
target_link_libraries(SubBrokerServer SubBroker)

#----------------------------------------------------------------------
# Publisher executable
#----------------------------------------------------------------------
add_executable(PublisherComputer demo/main/main_publisher_computer.cpp demo/generated/Publisher.h demo/generated/Publisher.cpp)
target_link_libraries(PublisherComputer CoreUtilities Publisher)

#----------------------------------------------------------------------
# Subscriber executable
#----------------------------------------------------------------------
add_library(QCustomPlot ${QT_CUSTOM_PLOT_DIRS}/qcustomplot.h ${QT_CUSTOM_PLOT_DIRS}/qcustomplot.cpp)
set_target_properties(QCustomPlot PROPERTIES AUTOMOC ON AUTORCC ON AUTOUIC ON)
target_link_libraries(QCustomPlot Qt6::Core Qt6::Widgets Qt6::PrintSupport)
add_executable(ClientAdvanced demo/main/main_client_advanced.cpp demo/generated/Subscriber.h demo/generated/Subscriber.cpp demo/helpers/QSubscriberDataHandler.h demo/helpers/QSubscriberDataHandler.cpp demo/helpers/PlotWindow.h demo/helpers/PlotWindow.cpp demo/helpers/CustomTicker.h demo/helpers/CustomTicker.cpp)
set_target_properties(ClientAdvanced PROPERTIES AUTOMOC ON AUTORCC ON AUTOUIC ON)
target_link_libraries(ClientAdvanced CoreUtilities Subscriber Qt6::Core Qt6::Widgets Qt6::PrintSupport QCustomPlot)