package com.tekcreek.javacourse.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Invoking method through reflection.
 */
public class ReflectionEx2 {
    public static void main(String[] args) throws Exception {
//        Demo d1 = new Demo();
//        d1.sayHello("sagar");

        Class<Demo> clazz = Demo.class;
        Constructor<Demo> constructor = clazz.getDeclaredConstructor();
        Demo d1 = constructor.newInstance();
        Method m1 = clazz.getDeclaredMethod("sayHello", String.class);
        m1.invoke(d1, "sagar");
    }
}


class Demo {
    public void sayHello(String name) {
        System.out.println("Hello !! " + name);
    }
}
