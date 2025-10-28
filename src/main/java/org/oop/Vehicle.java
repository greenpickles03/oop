package org.oop;

abstract class Vehicle {

    // Abstract methods
    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Engine started.");
    }

}
