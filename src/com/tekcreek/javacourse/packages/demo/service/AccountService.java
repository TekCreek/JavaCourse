package com.tekcreek.javacourse.packages.demo.service;

public class AccountService {
     private AccountInternalService internalService = new AccountInternalService();

     public void openAccount() {
        System.out.println("opening an account - " + internalService.generateAccountID());
    }
}
