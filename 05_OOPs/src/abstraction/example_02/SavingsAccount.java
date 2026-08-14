package abstraction.example_02;

public class SavingsAccount extends BankAccount{

    SavingsAccount(){
        super(9843443, 9843);
        System.out.println("Savings account constructor");
    }

    @Override
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else if(balance - amount <= 500) {
            System.out.println("500 balance should be remained");
        }
    }
}
