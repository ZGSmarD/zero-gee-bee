# ZGSMartD

# Challenge:
Zero Gee Bee - Your Friendly Neighborhood Drone.

# Objective:
Design and simulate a drone (e.g. quad-copter) to be used anywhere, to assist with moving items (5 lb / ~2kg) around. Weightlessness and zero g will be a major design change (or benefit) compared to terrestrial applications.

# Problem description:
Frequently, on repair task the astronauts deal with difficult situations, because the mobility, is difficult to carry different tools and parts at the same time, or unexpected problems during the reparation and have to ask for a replacement part, but can’t leave the damage zone; ZGSmartD have enough sources to serve as an assistant for supporting space engineers on their labors, either repair, carry or move tools/parts for example. The problem is the waste of time of the astronaut and the equipment on the spacecraft, aim that fulfil  ZG SmartD.

# Solution:
ZG SmartD is present as an acronym of <<Zero Gravity Smart Drone>> a drone that is able to work on microgravity conditions, with the required features to help a space engineer on their task.
The control of the ZG SmartD is carried out with an App that is situated on a weareable (SmartPhone), where the interface is access by functionalities menu of the device, it responds to engineer’s instructions and execute the order.

ZG SmartD manage his actual position by a positioning control called LPS (Local Positioning System) on the triangulation of Wi-Fi signals implemented on the platform Waspmote V1.1 de DIgi     XBee.

# User app interface:
Stocktaking access (List): By the interface the astronaut can choose from a list of tools and parts, the one that need for his job. when is accomplished the selection the drone takes the object that the astronaut have ask for by RFID technology, and redirects the user position. 
The drone also have the option to come back and return the part or tools that is carrying to their spot.

# Mapping: 
By the app the astronaut can see the ZGSmartD location and also the other astronauts inside the spacecraft.

# Datasheet access: 
Other interesting functions that are able to the wearable user is to access a database with different technical information about mechanical or electronic components, information about the parts that are available at the spacecraft and reading of electric diagrams of many different systems.

# ZG SmartD structure:
parts that assembled it:
Mechanic gyroscope
Gas tank (CO2)
Propellers
Attachment sleeve
Electrovalves
Linear movement servo
Ultrasonic sensor
Lidar sensor
Battery
DC Motors
Raspberry
Arduino
LCD Touch
Xbee
Expansion ports
Electronics

# User considerations:
Produce a drone design based on existing concepts that would be suitable for use onboard a human-inhabited spacecraft.

Consider the implications for autonomous navigation within a human-inhabited station.

Modify existing drone simulator software and applications to create a ZERO GEE Bee simulator to allow a user to fly a drone in a spacecraft environment (zero gravity). The drone shall be able to carry a 5lb/~2kg payload for a suitable length of distance (representative of human-inhabited stations and future large spacecraft.)

Look at the SPHERES project for inspiration, and investigate and research potential additional autonomous implementations that could be ported to the spacecraft environment.
