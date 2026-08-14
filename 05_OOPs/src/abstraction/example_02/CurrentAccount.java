package abstraction.example_02;

public class CurrentAccount extends BankAccount{
    CurrentAccount(){
        super(9843, 50984);
    }

    @Override
    void withdraw(double amount){
        if(amount > balance) System.out.println("Insufficient balance");
        else if(amount <= 0) System.out.println("Invalid amount");
    }
}
