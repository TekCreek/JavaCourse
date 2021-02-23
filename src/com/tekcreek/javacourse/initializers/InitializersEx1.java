package com.tekcreek.javacourse.initializers;

/**
 * Initializers -
 *  static initializer - runs once per the class
 *  non-static initializer - runs once for each object.
 */

class Sample {

    static {
      System.out.println("static initializer");
    }


    {
        System.out.println("non - static initializer");
    }
}

public class InitializersEx1 {
    public static void main(String[] args) {
        Sample s1, s2, s3;
        s1 = new Sample();
        s2 = new Sample();
        s3 = new Sample();
    }
}
