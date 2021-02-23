package com.tekcreek.javacourse.classes;

/**
 * Classes -
 *  class {  data + operations } + data hiding + encapsulation
 */

class PositiveInteger {
    // data / state
    private int x;
    // operations / behaviour
    public void set(int value) {
        if (value >= 0)
            x = value;
    }
    public int get() {
        return x;
    }
}

public class ClassesEx2 {
    public static void main(String[] args) {
        // reference variable
        PositiveInteger n1;
        // RHS : creating object and assigned its reference to n1.
        n1 = new PositiveInteger();
        n1.set(10);
        System.out.println( n1.get() );
        n1.set(-10);
        // n1.x = -10; // error
        System.out.println( n1.get() );

        // reference variable
        PositiveInteger n2;
        // RHS : creating object and assigned its reference to n1.
        n2 = new PositiveInteger();

    }
}
