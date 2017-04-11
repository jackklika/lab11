# Lab 11 -- Threads
This project is a simple lab to demonstrate knowledge of basic Java cocurrancy principles.

*In this assignment you will use threads to simulate the action of the sensors in our semester project. It also simulates the notion of concurrent execution, in that each thread represents a separate activity in the sensors. We will simulate the tripping of the sensors (eye, gate, and pad) by using a button (distinct from the one in the chronotimer panel). You will be using the run(), sleep(), join(), and interrupt() method in the Thread interface.*

##Objectives

- To be able to create a Runnable class with appropriate required methods
- To use the interrupt() capability of threads
- To simulate the action of one of the sensors signaling the Timing system.

## Description of Lab

In main program, create an array of 8 threads representing Sensors, each with a name "Sensor<n>" where<n> is the number of the sensor 0-7. Each sensor must have a method "run()" as its body in order to be started.

Start each thread, then wait in the main program for Sensor7 by performing a "join()" on that thread in the main program. Set each sensor to sleep for 5 seconds, in a loop, until it is interrupted, whereupon it will print out the current nanotime() and continue.

Create a SensorView that has a JButton with the label "Sensor<n>" where <n> is the sensor number, as above. When it is clicked, it will interrupt the corresponding sensor, which will in turn print out the details of the thread (see "asString()") and the nanotime. You may create a panel with 8 buttons on it.

When Sensor7 is clicked, the program terminates (by ending the thread and returning, thus joining the main).

#Deliverables

1. Documented code in .zip file
2. Sample of output from a run.

Submit your completed artifacts individually to D2L under Lab11 by April 17th.
