public class While_Loop {
    public static void main(String[] args){
        // 1. Find the GCD and LCM of two numbers using a while loop (Euclidean algorithm for GCD).
        int a = 36, b = 24;
        int x = a, y = b;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;

//        System.out.println("GCD: " + gcd);
//        System.out.println("LCM: " + lcm);

        // 2. Count the number of digits and sum of digits in a given number using while.
        int n = 985891;
        int sum = 0, digits = 0;
        while(n > 0){
            sum = sum + (n % 10);
            digits++;
            n /= 10;
        }
//        System.out.println("Sum :" + sum);
//        System.out.println("No.of digits: " + digits);

        // 3. Reverse a number using a while loop and check for palindrome (same as #4 but with while — compare which felt more natural).
        int num = 95359;
        int original = num;
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        System.out.println(rev == original);
    }
}
