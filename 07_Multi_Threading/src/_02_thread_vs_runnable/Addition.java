package _02_thread_vs_runnable;

import java.util.Scanner;

public class Addition implements Runnable{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run(){
        System.out.println("Addition task started..!");
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
//        int c = a/b; // if there is any exception in this thread then
//        this thread only will get abrupt termination
        int c = a + b;
        System.out.println(c);
        System.out.println("Addition task completed..!");
    }
}
