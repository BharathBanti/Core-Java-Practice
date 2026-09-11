package _3ways_of_handling;

import java.util.Scanner;

class Demo{
    void demofun() throws Exception{
        System.out.println("Demo started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int a = scanner.nextInt();
        System.out.println("Enter the denominator:");
        int b = scanner.nextInt();
        int result = a/b;
        System.out.println("Result: " + result);
        System.out.println("Demo ended");
    }
}

public class _03_Ducking {
    public static void main(String[] args){
        System.out.println("Program started..");
        try {
            Demo demo = new Demo();
            demo.demofun();
        } catch (Exception e) {
            System.out.println("Exception received in main");
        }
        System.out.println("Program ended!");
    }
}

