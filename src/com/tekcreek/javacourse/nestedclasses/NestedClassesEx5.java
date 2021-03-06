package com.tekcreek.javacourse.nestedclasses;

/**
 * Anonymous class
 */

interface Greet {
    void sayHello(String name);
}

class MyGreetImpl implements Greet {
    public void sayHello(String name) {
        System.out.println("Hello !!" + name);
    }
}

public class NestedClassesEx5 {
    public static void main(String[] args) {
        Greet obj = new MyGreetImpl();
        obj.sayHello("sagar");

//        Greet obj2 = new MyGreetImpl();
//        obj2.sayHello("sagar11");

        Greet obj1 = new Greet() {
            public void sayHello(String name) {
                System.out.println("Hello !! " + name +" from anonymous implementation");
            }
        };
        obj1.sayHello("a");
    }
}
