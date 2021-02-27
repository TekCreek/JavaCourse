package com.tekcreek.javacourse.exceptions;

/**
 * Finally block - finally block is executed irrespective of exceptions.
 *
 * Generally used for releasing the resources such as closing a file, closing
 * a database connection etc.
 *
 * Example Usage -
 *     open file
 *     try {
 *         read/write
 *     } catch(IOException e) {
 *         handle IOException
 *     } finally {
 *         close file
 *     }
 *
 * try-with-resources is a simplified version of finally for AutoCloseable
 * resources.
 *
 * Example Usage -
 *      try(open file) {
 *          read/write
 *      } catch(IOException e) {
 *          handle IOException
 *      }
 */
class MyExp extends Exception {}

public class ExceptionHandlingEx5 {
    static void f(int a) {
        try {
            System.out.println("inside try");

            if (a == 1) return;

            if (a == 2) throw new MyExp();

            System.out.println("last statement of try");
        } catch(MyExp e) {
            System.out.println("MyExp handler");
        } finally {
            System.out.println("finally.....");
        }
        System.out.println("after try block");
    }
    public static void main(String[] args) {
        // f(1);
        // f(2);
        f(3);
    }
}
