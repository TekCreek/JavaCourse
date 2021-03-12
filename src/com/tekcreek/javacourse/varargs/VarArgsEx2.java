package com.tekcreek.javacourse.varargs;


/**
 * Variable arguments -
 */
public class VarArgsEx2 {

    static <T extends Number> double sum(T ... a) {
        double s = 0;
        for (T value : a) {
            s += value.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println( sum(10, 20 ) );
        System.out.println( sum(10, 20, 30) );
        System.out.println( sum(10.2, 20.2, 30.3, 40.4) );
    }
}

