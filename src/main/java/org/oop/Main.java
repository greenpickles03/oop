package org.oop;


import org.oop.encapsulation.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setUsername("johndoe");
        employee.setPassword("password123");

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Username: " + employee.getUsername());
        // Note: In a real application, avoid printing passwords
    }
}