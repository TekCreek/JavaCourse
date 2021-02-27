package com.tekcreek.javacourse.exceptions;

/**
 * Exceptions are special kind of errors or failure conditions in the code
 * which need to be caught and handled.
 */
public class ExceptionHandlingEx1 {

    static int div(int a, int b) {
        try { // block where exceptions might occur
            return a / b;
        } catch(ArithmeticException e) { // handle
            System.out.println("Caught ArithmeticException ");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println( div(10, 2));
        System.out.println( div(10, 0));
    }
}
