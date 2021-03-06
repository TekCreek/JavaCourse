package com.tekcreek.javacourse.nestedclasses;

/**
 * Local classes
 *  - Classes which are local to be block.
 *  - They can only access to the final and effectively final variables.
 * Anonymous classes
 *  - A class instantaneously created with out any name.
 */

public class NestedClassesEx4 {
    static void test() {
        String name = "sagar";

        class Local {
          public void sayHello() {
              System.out.println("Hello !!" + name);
          }
        }

        Local obj = new Local();
        obj.sayHello();
    }
    public static void main(String[] args) {
        test();
    }
}
