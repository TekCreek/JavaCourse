package com.tekcreek.javacourse.classes;
/**
 * Classes -
 *  class {  data + operations }
 */
class Sample {
    // data
    int x;
    // operations
    void set(int value) { x = value; }
    int get() { return x; }
}

public class ClassesEx1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        s1.set(100);
        System.out.println( s1.get() );
        s2.set(200);
        System.out.println( s2.get() );
    }
}
