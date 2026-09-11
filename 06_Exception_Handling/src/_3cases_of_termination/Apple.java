package _3cases_of_termination;

import java.util.Scanner;

public class Apple {

//    public static void main(String[] args){
//        System.out.println("Program Started");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the numerator: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter the denominator: ");
//        int b = scanner.nextInt();
//        int result = a/b;
//        // 1. Normal termination when input is correct
//        // 2. Abrupt termination when input is faulty ex: b = 0
//        System.out.println(result);
//
//        System.out.println("Program Terminated");
//    }

    public static void main(String[] args){
        System.out.println("Program Started");

        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int a = scanner.nextInt();
        System.out.println("Enter the denominator: ");
        int b = scanner.nextInt();
        int result = a/b;
        // 1. Normal termination when input is correct
        // 2. Abrupt termination when input is faulty ex: b = 0
        System.out.println(result);
        }
        // 3. Normal termination by handling the abrupt exception error
        //    by using the try-catch block
        catch(Exception e){
            System.out.println("Enter non-zero denominator");
        }

        System.out.println("Program Terminated");
    }
}
