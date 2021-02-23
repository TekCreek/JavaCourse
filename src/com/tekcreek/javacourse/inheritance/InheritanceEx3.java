package com.tekcreek.javacourse.inheritance;

/**
 * - Overriding and method invocation
 * - Dynamic binding -
 *      binding/linking to the corresponding method definition based on object.
 */

class Base {
    void f() {
        System.out.println("f() in Base");
    }
    void g() {
        System.out.println("g() in Base");
    }
}

class Derived extends Base {
    void f() {
        System.out.println("f() in Derived");
    }
    void h() {
        System.out.println("h() in Derived");
    }
}


public class InheritanceEx3 {
    public static void main(String[] args) {
//        Base b1 = new Base();
//        b1.f(); // f() in Base
//        b1.g(); // g() in Base
//
//        System.out.println();
//
//        Base b2 = new Derived();
//        b2.f(); // f() in Derived
//        b2.g(); // g() in Base
//        // b2.h();

        test(new Base());
    }

    static void test(Base b) {
        b.f();
        b.g();
        if (b instanceof Derived) {
            ((Derived) b).h();
        }
    }
}
