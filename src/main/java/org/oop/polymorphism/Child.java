package org.oop.polymorphism;

public class Child extends Parent {

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void functionA() {
        System.out.println("Child: Overridden functionA executed.");
    }

    // Overloaded method same name, different parameter
    public void functionA(String msg) {
        System.out.println("Child: functionA with String '" + msg + "' executed.");
    }
}
