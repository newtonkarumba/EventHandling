package com.company;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
    public String accountNumber;
    public String name;
    public Double balance;
    public Date today;

    public  BankAccount(){
       this.setToday(new Date());
    }

    public void displayAccount(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", today=" + today +
                '}';
    }

    public void withdraw(Double amount) throws InsufficientBalanceException{

        if (balance<amount)
           throw new InsufficientBalanceException();
        this.balance= balance-amount;
        this.displayBalance();

    }
    public void deposit(double amount) throws LessBalanceException {
        if (balance<amount)
            throw new LessBalanceException();
        this.setBalance(this.getBalance() + amount);
    }
public  void CalculateInterest(){
    System.out.println("This method will calculate Interest");
}
    private void displayBalance() {
        System.out.println("Balance is: "+ this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance2() throws InsufficientBalanceException{
        if (balance<500)
            throw new InsufficientBalanceException();
        return this.balance;

    }

    public Double getBalance()  {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}