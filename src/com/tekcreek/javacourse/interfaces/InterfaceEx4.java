package com.tekcreek.javacourse.interfaces;

/**
 * Default and static methods in interfaces.
 */

interface ITest {
    void f();

    default void g() {
        System.out.println("g() in ITest");
    }

    static void h() {
        System.out.println("h() in ITest");
    }
}

class Demo1 implements ITest {
    @Override
    public void f() {
        System.out.println("f() in Demo1");
    }
}

class Demo2 implements ITest {
    @Override
    public void f() {
        System.out.println("f() in Demo2");
    }
}



public class InterfaceEx4 {
    static void test(ITest i) {
        i.f();
        i.g();
        ITest.h();
    }
    public static void main(String[] args) {
        test(new Demo1());
        System.out.println();
        test(new Demo2());
    }
}
