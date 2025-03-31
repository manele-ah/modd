# MoDD - A Model-Driven Framework For Data Collection In Drone-Based Systems

MoDD is a **model-driven framework** designed to simplify and optimize sensor data collection in drone-based systems. It relies on a customized **publish/subscribe architecture** that efficiently aggregates data while allowing subscribers to control their data ingestion frequency.
Leveraging Model-Driven Engineering (MDE), MoDD automates code generation, significantly reducing development effort.
Practical evaluations on an Unmanned Surface Vehicle (USV) showed a 79% reduction in **data throughput** (drone-to-base station link) compared to existing publish/subscribe systems.

## Citation

If you use MoDD in your research or projects, please cite:
> Manele Ait Habouche, Mickaël Kerboeuf, Goulven Guillou and Jean-Philippe Babau. MoDD: A Model-Driven Framework For Data Collection In Drone-Based Systems. 50th Euromicro Conference On Software Engineering And Advanced Applications (SEAA 2024). DOI: [10.1109/SEAA64295.2024.00013](https://ieeexplore.ieee.org/document/10803507/).

---

## Project structure

MoDD is organized into three main directories:
- **/api** - Provides the C++ core libraries that implement MoDD's custom publish/subscribe architecture and communication protocols.
- **/modeling** - Contains the Ecore metamodel, Domain-Specific Language (DSL) definitions, and Acceleo templates for generating configuration and deployment code.
- **/ros_packages** - Provides packages enabling integration of MoDD libraries with **ROS 2** publishers and subscribers.

---

## Building MoDD C++ libraries

### **Tested environment**
- Ubuntu 24.04
- Clang 15
- Boost 1.80.0
- Google OR-Tools 9.11

### **Dependencies**

**1. Install build tools**

Install the required tools to compile and build MoDD.
```sh
sudo apt install cmake ninja-build clang-15 bzip2
```

**2. Set Clang as the default compiler**

Ubuntu may use GCC by default. The commands below register Clang as the system’s default.
```sh
# Register clang-15 as the default clang
sudo update-alternatives --install /usr/bin/clang clang /usr/bin/clang-15 100
sudo update-alternatives --install /usr/bin/clang++ clang++ /usr/bin/clang++-15 100

# Select clang-15 and clang++-15
sudo update-alternatives --config clang
sudo update-alternatives --config clang++
```

**3. Install Boost**

Download and install Boost 1.80.0 from source. MoDD uses this library to handle networking tasks. 
```sh
# Download the Boost 1.80.0 archive
wget https://archives.boost.io/release/1.80.0/source/boost_1_80_0.tar.bz2

# Extract the archive
tar --bzip2 -xvf boost_*.tar.bz2
cd boost_*/

# Configure and install Boost with Clang
./bootstrap.sh --prefix=/usr/local --with-toolset=clang
sudo ./b2 -j$(nproc) toolset=clang variant=release link=static threading=multi install
```

**4. Install Google OR-Tools**

MoDD uses OR-Tools to define and solve the Mixed Integer Linear Programming (MILP) needed for optimizing buffer sizes.
```sh
# Download the OR-Tools 9.11 archive
wget https://github.com/google/or-tools/releases/download/v9.11/or-tools_amd64_ubuntu-24.04_cpp_v9.11.4210.tar.gz

# Extract the archive
tar -xvzf or-tools_*.tar.gz
```
If you install OR-Tools in a custom location, note that path for the build step below.

### **Installation**

Use CMake to compile MoDD libraries. Adjust paths as needed.
```sh
# Configure the project with CMake
# Specify OR-Tools directory if necessary
cmake -DCMAKE_PREFIX_PATH=/path/to/or-tools \
      -DCMAKE_BUILD_TYPE=Release \
      -DCMAKE_CXX_COMPILER=/usr/bin/clang++ \
      -DCMAKE_MAKE_PROGRAM=/usr/bin/ninja \
      -G Ninja -S /path/to/src -B /path/to/build

# Build MoDD libraries
cmake --build /path/to/build --target PubBroker -j $(nproc)
cmake --build /path/to/build --target SubBroker -j $(nproc)
cmake --build /path/to/build --target Publisher -j $(nproc)
cmake --build /path/to/build --target Subscriber -j $(nproc)
```

---

## Building ROS 2 packages for MoDD integration

### **Tested environment**
- Ubuntu 24.04
- ROS 2 Jazzy
- Boost 1.80.0
- Google OR-Tools 9.11

### **Dependencies**

**1. Install ROS 2**

Follow the official **ROS 2 Jazzy** [installation guide](https://docs.ros.org/en/jazzy/Installation/Ubuntu-Install-Debs.html).

**2. Create a workspace**

A workspace is a directory containing one or more ROS 2 packages. This is where you will build MoDD packages.
```sh
# Source ROS 2 environment so that ROS commands and paths are recognized
source /opt/ros/jazzy/setup.bash
# Create and enter your workspace
mkdir -p ~/modd_ws/src
cd  ~/modd_ws/src
```

For more details on creating workspaces, see [this tutorial](https://docs.ros.org/en/jazzy/Tutorials/Beginner-Client-Libraries/Creating-A-Workspace/Creating-A-Workspace.html).

### **Configuration**

**1. Import MoDD ROS 2 packages**

MoDD packages (`interfaces` and `ros_modd_adapter`) are located in the `/ros_packages` directory of the Git repository. 

Copy both of these repositories to `~/modd_ws/src`. Your workspace folder structure should look like this:
```sh
~/modd_ws/src
 ┣━ interfaces
 ┗━ ros_modd_adapter
```

**2. Deploy MoDD libraries**

To enable `ros_modd_adapter` to link against and use MoDD’s core functionality, run the following commands.
```sh
cp /path/to/modd/build/lib*.a ~/modd_ws/src/ros_modd_adapter/lib/modd/release/
cp /path/to/modd/include/* ~/modd_ws/src/ros_modd_adapter/lib/modd/include/
```

**3. Configure MoDD PubBroker and SubBroker**

Under `~/modd_ws/src/ros_modd_adapter/conf`, you will find two sample YAML files that define IP addresses, ports, and data paths for the PubBroker and SubBroker nodes:
- `pub_broker_node.yaml`
- `sub_broker_node.yaml` files. 

Update them with your own IPs, ports, and paths if needed.

Example of a `pub_broker_node.yaml` file:
```yaml
pub_broker_node:
  ros__parameters:
    pub_broker_ip: "127.0.0.1"
    sub_broker_ip: "127.0.0.1"
    pub_broker_port: 7171
    sub_broker_port: 7272
    logs_path: "~/modd_ws/src/ros_modd_adapter/data/"
```

Example of a `sub_broker_node.yaml` file:
```yaml
sub_broker_node:
  ros__parameters:
    pub_broker_ip: "127.0.0.1"
    sub_broker_ip: "127.0.0.1"
    pub_broker_port: 7171
    sub_broker_port: 7272
    logs_path: "~/modd_ws/src/ros_modd_adapter/data/"
    topics_path: "~/modd_ws/src/ros_modd_adapter/conf/topics.conf"
    subscribers_path: "~/modd_ws/src/ros_modd_adapter/conf/subscribers.conf"
```

### **Installation**

To build the packages, navigate back to the root of your workspace and use `colcon`.
```sh
cd ~/ros2_ws

# Build 'interfaces' package
colcon build --symlink-install --cmake-args -DCMAKE_VERBOSE_MAKEFILE=ON -DCMAKE_EXPORT_COMPILE_COMMANDS=ON --packages-select interfaces

# Build 'ros_modd_adapter' package
colcon build --symlink-install --cmake-args -DCMAKE_VERBOSE_MAKEFILE=ON -DCMAKE_EXPORT_COMPILE_COMMANDS=ON -DCMAKE_PREFIX_PATH=/path/to/or-tools --packages-select ros_modd_adapter
```

Once built, source the workspace to overlay these packages onto your ROS 2 environment.
```sh
source install/setup.bash
```

### **Usage**

**1. Configure MoDD topics and subscriptions requirements**

Topics (sensor data) and subscription requirements are defined respectively in `topics.conf` and `subscribers.conf`. The examples provided in `~/modd_ws/src/ros_packages/conf` are adjusted according to the publisher and subscriber demos in `~/modd_ws/src/ros_packages/demo`.

Example of a `topics.conf` file:
```sh
accel_x,0.2
accel_y,0.2
```
Each line describes a topic name and its publishing period in seconds.

Example of a `subscribers.conf` file:
```sh
cat sub_1,accel_x,1.0,MIN,127.0.0.1:5551
sub_2,accel_y,2.0,AVERAGE,127.0.0.1:5552
```
Each line describes a subscription that consists of an ID, a topic, a subscription period in seconds, an aggregation function (`MIN`, `MAX`, `AVERAGE`, `FIRST`, `LAST`, `NONE`), an IP address and a port number.

**2. Run PubBroker and SubBroker nodes**

Use `ros2 run` to start the PubBroker and SubBroker. The `--params-file` argument points to your YAML configurations.
```sh
# Launch PubBroker node
ros2 run ros_modd_adapter pub_broker --ros-args --params-file src/ros_modd_adapter/conf/pub_broker_node.yaml

# Launch SubBroker node
ros2 run ros_modd_adapter sub_broker --ros-args --params-file src/ros_modd_adapter/conf/sub_broker_node.yaml
```

**2. Run publisher and subscriber examples**

To illustrate the usage of MoDD with ROS 2 publishers and subscribers, sample publishers and subscribers are provided.  
```sh
# Start the publishers
ros2 run ros_modd_adapter publisher

# Start the subscribers
ros2 run ros_modd_adapter subscriber
```
