package com.tekcreek.javacourse.lambda;

/**
 * Lambda Expression -
 *  - Anonymous classes seems a bit excessive and cumbersome with only one method
 *    to implement.
 *  - Lambda expressions let you express that more compactly.
 */

interface MyMath {
    int add(int a, int b);
}

class MyMathImpl implements MyMath {
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyMath m1 = new MyMathImpl();
        System.out.println( m1.add(10, 20) );

        // Anonymous
        MyMath m2 = new MyMath() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println( m2.add(20, 30));

        // Lambda
        MyMath m3 = (a, b) -> a + b;
        System.out.println( m3.add(30, 40));
    }
}
