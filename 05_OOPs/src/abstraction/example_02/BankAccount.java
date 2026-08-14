package abstraction.example_02;

/*
Abstract class BankAccount
Variables: accountNumber, balance
Constructor to initialize values
Abstract method withdraw(double amount)
Concrete method deposit(double amount)
Subclasses:
SavingsAccount
CurrentAccount
 */

import inheritance.rules.Bank;

public abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void deposit(double amount){
        if(amount > 0) System.out.println("Amount deposited successfully");
        else System.out.println("Invalid amount");
    }
}
