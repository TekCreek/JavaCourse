package com.tekcreek.javacourse.abstractclasses;

/**
 * Abstract classes -
 *  - Can not be instantiated.
 *  - They are declared abstract and may or may not include abstract methods
 *  - They can be subclassed.
 *  - Abstract classes and abstract methods can not be final.
 * Concrete classes -
 *  - Classes which an be instantiated.
 */
abstract class Base {
    public void f() {
        System.out.println("f() in Base");
    }
    public abstract void g();
}

// concrete class
class Derived extends Base {

    @Override
    public void g() {
        System.out.println("g() in Derived");
    }
}

public class AbstractClassEx1 {
    public static void main(String[] args) {
        Base b; // reference variable
        b = new Derived(); // error
        b.f();
        b.g();

        System.out.println();

        Derived d = new Derived();
        d.f();
        d.g();
    }
}
