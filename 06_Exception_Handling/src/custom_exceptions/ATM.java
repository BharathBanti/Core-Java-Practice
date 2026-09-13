package custom_exceptions;

import java.util.Scanner;

public class ATM {
    private int accountNum = 9843;
    private int pin = 2102;
    private int accNum;
    private int pn;

    public void acceptIntput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account number:");
        accNum = scanner.nextInt();
        System.out.println("Enter your pin:");
        pn = scanner.nextInt();
    }

    public void validate() throws InvalidPin{
        if(accNum == accountNum && pin == pn){
            System.out.println("Collect your money");
        }
        else {
            InvalidPin invalidPin = new InvalidPin();
            System.out.println(invalidPin.getMessage());
            throw invalidPin;
        }
    }
}
