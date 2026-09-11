package exception_propagation;

import java.util.Scanner;

public class Cat1 {
    void cat1fun(){
        System.out.println("Cat1 Started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int a = scanner.nextInt();
        System.out.println("Enter the denominator:");
        int b = scanner.nextInt();
        int result = a/b;
        System.out.println("Result: " + result);
        System.out.println("Cat1 Ended");
    }
}
