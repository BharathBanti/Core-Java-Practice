package _01_introduction;

import java.util.Scanner;

public class Addition extends Thread{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run(){
        System.out.println("Addition task started..!");
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
        System.out.println("Addition task completed..!");
    }
}
