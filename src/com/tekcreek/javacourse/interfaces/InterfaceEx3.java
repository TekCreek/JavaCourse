package com.tekcreek.javacourse.interfaces;

/**
 * 1) An interface can extend multiple interfaces
 * 2) A class can implement multiple interfaces.
 *
 * Note - A Java class can not extend more than one class, but it can implement
 * multiple interfaces.
 */
interface A {
    void f();
}

interface B {
    void g();
}

interface C extends A, B {
    void h();
}

interface D {
    void i();
}

class SomeClass implements C,D {

    @Override
    public void f() {
        System.out.println("f() in SomeClass");
    }

    @Override
    public void g() {
        System.out.println("g() in SomeClass");
    }

    @Override
    public void h() {
        System.out.println("h() in SomeClass");
    }

    @Override
    public void i() {
        System.out.println("i() in SomeClass");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        A a = new SomeClass();
        a.f();

        B b = new SomeClass();
        b.g();

        C c = new SomeClass();
        c.f();
        c.g();
        c.h();

        D d = new SomeClass();
        d.i();

        SomeClass s = new SomeClass();
        s.f();
        s.g();
        s.h();
        s.i();
    }
}
