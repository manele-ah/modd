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
include_directories(${Boost_INCLUDE_DIRS} "include/")
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
# Publisher static library
#----------------------------------------------------------------------
add_library(Publisher STATIC include/PublisherCore.h src/PublisherCore.cpp)
target_link_libraries(Publisher PUBLIC CoreUtilities)

#----------------------------------------------------------------------
# Subscriber static library
#----------------------------------------------------------------------
add_library(Subscriber STATIC include/SubscriberCore.h src/SubscriberCore.cpp)
target_link_libraries(Subscriber PUBLIC CoreUtilities)