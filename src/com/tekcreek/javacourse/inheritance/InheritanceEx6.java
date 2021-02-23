package com.tekcreek.javacourse.inheritance;

/**
 * final modifier -
 *      1) Used for creating constants
 *              final double PI = 3.1416
 *      2) If a method is final it can not overridden
 *      3) If a class is final it can not be extended.
 */

class Base1 {
    public void print() {
        System.out.println("print in Base");
    }
}

class Derived1 extends Base1 {
    public void print() {
        System.out.println("print in Derived1");
    }
}

public class InheritanceEx6 {
    public static void main(String[] args) {

    }
}
