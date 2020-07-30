package com.company;

public class Checking extends BankAccount{
    double balance= super.balance;


    public double getBalance2() throws InsufficientBalanceException   {

   return this.balance= super.getBalance2();

    }
    public Checking(String name,String accountNumber,Double balance){
        this.balance=super.getBalance();
        this.name=super.getName();
        this.accountNumber=super.getAccountNumber();
    }


    public void CalculateInterest(Double balance) {
        balance+=(0.5*balance);
        System.out.println("Added Interest and Updated Balance");
      //  super.CalculateInterest();
    }


    public void withdrawChecking(Double amount) throws InsufficientBalanceException {
        if (balance<500)
            throw new InsufficientBalanceException();
        System.out.println("Withdrawing...");
        super.withdraw(amount);
        
    }
}
