package org.oop.polymorphism;

public class Parent {

    // Method Overloading (Compile-time Polymorphism)
    public void functionA() {
        System.out.println("Parent: functionA executed.");
    }

    // Overloaded method same name, different parameter
    public void functionA(int x) {
        System.out.println("Parent: functionA with int " + x + " executed.");
    }

}
