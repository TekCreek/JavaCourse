package com.tekcreek.javacourse.packages.demo.service;

import java.util.UUID;

// Visibility only with in the package
class AccountInternalService {
    public String generateAccountID() {
        return UUID.randomUUID().toString();
    }
}
