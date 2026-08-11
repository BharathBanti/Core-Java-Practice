package encapsulation;

public class BankAccount {
    // private members
    String name;
    private double balance;

    // constructor
    BankAccount(String name){
        this.name = name;
    }

    // setter and getter for balance
    void setBalance(double balance){
        if(balance < 0){
            System.out.println("Balance shouldn't be negative");
            return;
        }
        this.balance = balance;
        System.out.println("Balance has been set successfully");
    }

    double getBalance(){
        return balance;
    }

    void deposit(int amount){
        if(amount < 0){
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposit successfull");
    }

    void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
            return;
        }
        else if(amount < 0){
            System.out.println("Withdraw amount should be positive");
            return;
        }
        else{
            balance -= amount;
            System.out.println("Withdraw successfull");
        }
    }
}
