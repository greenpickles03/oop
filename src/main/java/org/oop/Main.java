package org.oop;


import org.oop.encapsulation.Employee;
import org.oop.inheritance.Dog;
import org.oop.polymorphism.Child;
import org.oop.polymorphism.Parent;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Abstraction Example
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
        // Encapsulation Example
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

        // Inheritance Example
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
        myDog.fetch();

        // Polymorphism Example
        Parent parent = new Parent();
        Child child = new Child();
        // Dynamic Polymorphism
        Parent polyChild = new Child(); // Upcasting
        // Method Overloading (compile-time polymorphism)
        parent.functionA();
        parent.functionA(42);

        // Method Overriding (runtime polymorphism)
        child.functionA(20);
        // Polymorphism in action
        polyChild.functionA(30);

        Immutable obj = new Immutable( "Immutable Object");
        System.out.println("Immutable Object ID: " + obj.getName());
    }
}