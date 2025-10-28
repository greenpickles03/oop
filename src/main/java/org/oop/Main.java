package org.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}