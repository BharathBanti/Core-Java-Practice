package _3ways_of_handling;

import java.util.Scanner;

class Sample{
    void samplefun() throws Exception{
        System.out.println("Sample started");
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the numerator:");
            int a = scanner.nextInt();
            System.out.println("Enter the denominator:");
            int b = scanner.nextInt();
            int result = a/b;
            System.out.println("Result: " + result);
        }
        catch(Exception e){
            System.out.println("Re-throwing exception to main");
            throw e;
        }
        finally{
            System.out.println("Sample ended");
        }
    }
}

public class _02_ReThrowing {
    public static void main(String[] args){
        System.out.println("Program started..");
        try {
            Sample sample = new Sample();
            sample.samplefun();
        } catch (Exception e) {
            System.out.println("Exception received in main");
        }
        System.out.println("Program ended!");
    }
}
