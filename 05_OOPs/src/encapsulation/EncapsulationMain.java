package encapsulation;

public class EncapsulationMain {
    public static void main(String[] args){

//        Rectangle rectangle = new Rectangle(3, 4);
//        System.out.println(rectangle.rectangleArea());
//
//        Rectangle rectangle1 = new Rectangle(-34, 4);
//        System.out.println(rectangle1.rectangleArea());

        BankAccount bankAccount = new BankAccount("Bharath");
        bankAccount.setBalance(3498);
        bankAccount.setBalance(-489);

        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(2);
        bankAccount.deposit(-48);

        bankAccount.withdraw(5000);
        bankAccount.withdraw(-84);
        bankAccount.withdraw(500);

        System.out.println(bankAccount.getBalance());
    }
}
