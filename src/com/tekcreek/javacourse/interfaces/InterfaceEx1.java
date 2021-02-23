package com.tekcreek.javacourse.interfaces;

/**
 * Interface -
 *    - 100% abstract as per old Java versions
 *    - Java recent editions supports adding default and static methods
 *    - All methods are public abstract by default.
 *    - All fields are public static and final by default.
 *    - Used for
 *       - Separating interface from implementation
 *       - As a specification for required methods
 *       - For constants.
 *       - As marker interfaces.
 *    - Any class that implements an interface must override all the abstract
 *      methods of the interface otherwise it becomes abstract.
 */

interface Calculator {
    double PI = 3.14159; // public static final

    int add(int a, int b); // public abstract
    int sub(int a, int b);
    double sin(double deg);
}

class BasicCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin(deg * PI / 180);
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        Calculator calc; // ref variable
        calc = new BasicCalculator();
        System.out.println( calc.add(10, 20));
        System.out.println( calc.sub(10, 20));
        System.out.println( calc.sin(90));
    }
}
