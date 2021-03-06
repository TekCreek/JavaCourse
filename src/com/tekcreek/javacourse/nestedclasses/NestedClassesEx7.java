package com.tekcreek.javacourse.nestedclasses;

class Base {
    public void f() {
        System.out.println("f() in Base");
    }

    public void g() {
        System.out.println("g() in Base");
    }
}

public class NestedClassesEx7 {
    public static void main(String[] args) {
        Base b1 = new Base();
        b1.f();
        b1.g();

        Base b2 = new Base() {
            @Override
            public void g() {
                System.out.println("g() in anonymous dervied");
            }
        };

        b2.f();
        b2.g();
    }
}
