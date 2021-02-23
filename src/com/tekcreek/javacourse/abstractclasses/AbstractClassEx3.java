package com.tekcreek.javacourse.abstractclasses;

/**
 * A class may or may not have abstract method but can still be declared abstract
 * to avoid instantiation.
 */
abstract class Demo {
    public void f() { System.out.println("f() in Demo "); }
}

class Sample extends Demo {}

public class AbstractClassEx3 {
    public static void main(String[] args) {
        Demo d;
        // d = new Demo();
        d = new Sample();
        d.f();
    }
}
