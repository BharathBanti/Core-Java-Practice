public class IfElse_Statements {
    public static void main(String[] args) {

        // 1. Write a program to check if a number is positive, negative, or zero using if-else-if.

        int a = 34;
        if(a > 0) System.out.println("Positive");
        else if(a < 0) System.out.println("Negative");
        else System.out.println("Zero");

        // 2. Given a year, determine if it's a leap year (handle the century divisible-by-400 rule correctly).
        int year = 2012;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap year.");
        }
        else System.out.println("Not a leap year.");

        // 3. Given marks, assign a grade (A/B/C/D/F) using nested if-else, then rewrite the same logic using else-if ladder and compare readability.
        float marks = 5.34f;
        if(marks > 90 && marks <= 100){
            System.out.println("Grade A");
        }
        else if(marks > 80){
            System.out.println("Grade B");
        }
        else if(marks > 70){
            System.out.println("Grade C");
        }
        else if(marks > 50){
            System.out.println("Grade D");
        }
        else if(marks > 35){
            System.out.println("Grade E");
        }
        else System.out.println("Failed");

        //. 4. Take three numbers and find the largest without using any built-in Math.max() — only if-else
        int d = 84, b = 648, c = 4433;
        if(d > b && d > c){
            System.out.println(d + " is largest");
        }
        else if(b > d && b > c){
            System.out.println(b + " is largest");
        }
        else System.out.println(c + " is largest");
    }
}
