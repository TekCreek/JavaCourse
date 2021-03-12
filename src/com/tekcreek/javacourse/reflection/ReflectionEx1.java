package com.tekcreek.javacourse.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection -
 * Used by programs which tend to examine or modify the runtime behaviour of the
 * applications running in Java virtual machines.
 * Note - Use with caution.
 */

public class ReflectionEx1 {
    public static void main(String[] args) throws Exception {

        Class clazz = Sample.class;

        // Class clazz = Class.forName("com.tekcreek.javacourse.reflection.Sample");
        // Class clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Fields are - ");
        for (Field f : fields) {
            System.out.println( f );
        }

        System.out.println("Constructors are - ");
        for (Constructor c : constructors) {
            System.out.println( c );
        }

        System.out.println("Methods are - ");
        for (Method m : methods) {
            System.out.println( m );
        }
    }
}

class Sample {
    // fields
    int a;

    // constructors
    Sample() {}
    Sample(int a) {
        this.a = a;
    }

    // methods
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}


