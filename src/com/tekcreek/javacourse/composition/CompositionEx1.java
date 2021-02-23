package com.tekcreek.javacourse.composition;

/**
 * Composition -
 *   Models an has-a relationship between the objects or classes.
 */

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}

// ScientificCalculator has-a BasicCalculator

class ScientificCalculator  {
    private static final double PI = 3.1417;

    BasicCalculator bcalc = new BasicCalculator();

    public int add(int a, int b) {
        return bcalc.add(a, b);
    }

    public int sub(int a, int b) {
        return bcalc.sub(a, b);
    }

    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class CompositionEx1 {
    public static void main(String[] args) {
        BasicCalculator bcalc1 = new BasicCalculator();
        System.out.println("Testing basic calc");
        System.out.println(bcalc1.add(10, 20));
        System.out.println(bcalc1.sub(10, 20));

        ScientificCalculator scalc1 = new ScientificCalculator();
        System.out.println("Testing scientific calc");
        System.out.println(scalc1.add(10, 20));
        System.out.println(scalc1.sub(10, 20));
        System.out.println(scalc1.sin(90));

        BasicCalculator b1 = new BasicCalculator();
        System.out.println("Testing basic calc");
        System.out.println(b1.add(10, 20));
        System.out.println(b1.sub(10, 20));
    }
}
