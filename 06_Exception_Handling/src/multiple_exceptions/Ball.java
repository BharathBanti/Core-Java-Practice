package multiple_exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ball {
    public static void main(String[] args){
        System.out.println("Program Started...");

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the numerator:");
            int a = scanner.nextInt();
            System.out.println("Enter the denominator:");
            int b = scanner.nextInt();
            int result = a/b;
            System.out.println("Result: " + result);

            System.out.println("Enter the array size: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the index to store result:");
            int index = scanner.nextInt();
            arr[index] = result;
            System.out.println(arr[index] + " Stored successfully in array");
            System.out.println(Arrays.toString(arr));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Arrays shouldn't be negative");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index of array");
        }
        catch(Exception e){
            System.out.println("Something went wrong..!");
        }
        System.out.println("Program Terminated..!");
    }
}
