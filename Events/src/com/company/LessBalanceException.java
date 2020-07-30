package com.company;

public class LessBalanceException extends Exception {
    public LessBalanceException() {
        super("Balance cannot be less than 0");
    }
}
