package com.tekcreek.javacourse.inheritance;

/**
 *  - Generalizing code through Inheritance.
 *  - Object
 *      - The base class for all Java classes.
 *      - Common methods equals(), toString(), hashCode()...
 */
class Animal {}
class WildAnimal extends Animal {}
class DomesticAnimal extends Animal {}
class Lion extends WildAnimal {}
class Tiger extends WildAnimal {}
class Cow extends DomesticAnimal {}
class Dog extends DomesticAnimal {}

class Human {}

public class InheritanceEx2 {
    public static void main(String[] args) {
        feed(new Animal());
        feed(new WildAnimal());
        feed(new DomesticAnimal());
        feed(new Lion());
        feed(new Tiger());
        feed(new Cow());
        feed(new Dog());

        // feed(new Human());
    }

    static void feed(Animal a) {
        System.out.println("feeding an animal");
    }
}
