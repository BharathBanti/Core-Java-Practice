package _01_introduction;

import java.util.Scanner;

public class Introduction_01 {
    Scanner scanner= new Scanner(System.in);

    public void add(){
        System.out.println("Addition task started..!");
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
        System.out.println("Addition task completed..!");
    }

    public void printCharacters() {
        System.out.println("Character printing task started..!");
        for(int i = 65; i <= 75; i++){
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Character printing task completed..!");
    }

    public void printNumbers() {
        System.out.println("Number printing task started..!");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed..!");
    }
}
