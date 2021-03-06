package com.tekcreek.javacourse.lambda;

// Functional interface

@FunctionalInterface
interface Greet {
    void sayHello(String name);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        // Anonymous
        Greet g1 = new Greet() {
          public void sayHello(String name) {
              System.out.println("Hello !! " + name);
          }
        };
        g1.sayHello("a");

       // Lambda
       Greet g2 = (name) -> System.out.println("Hello! " + name + " from lambda");
       g2.sayHello("a");

       // Lamdba - method references
       Greet g3 = System.out::println;
       g3.sayHello("abc");

    }
}
