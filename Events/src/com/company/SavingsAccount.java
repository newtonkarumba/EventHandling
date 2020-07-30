package com.company;

import jdk.dynalink.NamedOperation;

public class SavingsAccount extends BankAccount {
    double balance;

    public SavingsAccount(double balance) {
        this.balance =super.balance;
    }
    public SavingsAccount(String name, String accountNumber, Double balance){
        this.name=super.getName();
        this.accountNumber=super.getAccountNumber();
        this.balance=super.balance;
    }

    @Override
    public void CalculateInterest()  {

      double amount;
      this.balance=(0.5*balance)+balance;
        System.out.println("calculated Interest and Updated balance");

    }

    public  void withdraw(double amount) throws InsufficientBalanceException{
        if (this.balance<2500)
            throw new InsufficientBalanceException();
        super.withdraw(balance);

    }
}
