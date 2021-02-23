package com.tekcreek.javacourse.constructor;

/**
 * Constructors - A function like block which takes the name of the class but
 * with no return type. Like functions constructors could be overloaded to give
 * multiple options to initialize the object.
 */

class Sample {

    // no argument constructor
    public Sample() {
        System.out.println("no arg constructor");
    }

    // argument constructor
    public Sample(int value) {
        System.out.println("arg constructor with value - " + value);
    }
}

public class ConstructorEx1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample(100);
    }
}
