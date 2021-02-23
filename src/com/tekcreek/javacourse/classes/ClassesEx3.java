package com.tekcreek.javacourse.classes;
/**
 * Classes -
 *  class {  data + operations } + data hiding + encapsulation
 */

class Account {
    // data
    private double balance;

    // operation
    public void withdraw(double amount) {
        if((balance - amount ) > 0) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ClassesEx3 {
    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(1000);
        acc1.deposit(-9000);
        // acc1.balance = -999999; // error

        System.out.println( acc1.getBalance() );
    }
}
