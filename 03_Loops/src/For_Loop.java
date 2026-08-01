public class For_Loop {
    public static void main(String[] args){
        // 1. Print all Armstrong numbers between 1 and 1000 (e.g., 153 = 1³+5³+3³).
//        for(int i = 1; i <= 2000; i++){
//            if(isArmstrong(i)){
//                System.out.println(i);
//            }
//        }

        // 2. Print the first N Fibonacci numbers using a for loop (no recursion).
//        int n = 30;
//        int a = 0, b = 1;
//        for(int i = 1; i <= n; i++){
//            System.out.println(a);
//            int temp = a + b;
//            a = b;
//            b = temp;
//        }

        // 3. Check if a number is prime, then extend it to print all primes between 1 and 100.
//        int m = 100;
//        for(int i = 1; i <= 100; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }

        // 4. Reverse the digits of a number and check if it's a palindrome (e.g., 121, 12321).
        int p = 787;
        System.out.println(isPalindrome(p));

        // 5. Use a labeled for loop with nested loops to break out of both loops when a specific condition is met (e.g., find the first pair (i,j) whose product exceeds 50).
//        outerLoop:
//        for(int i = 1; i <= 10; i++){
//            innerLoop:
//            for(int j = 1; j <= 10; j++){
//                if(i*j > 10){
//                    break outerLoop;
//                }
//                else System.out.println(i*j);
//            }
//        }
    }

    // armstrong number
    public static boolean isArmstrong(int num){
        int original = num;
        int temp = num;

        int sum = 0;
        int digits = 0;

        while(temp > 0){
            digits++;
            temp /= 10;
        }
//        while(num > 0){
//            int digit = num % 10;
//            sum += Math.powExact(digit, digits);
//            num /= 10;
//        }

        for( ; num > 0; num /= 10){
            int digit = num % 10;
            sum += Math.powExact(digit, digits);
        }
        return original == sum;
    }

    // isPrime
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i * i <= num; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }

    // isPalindrome
    public static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;
//        while(temp > 0){
//            rev = (rev * 10) + temp % 10;
//            temp /= 10;
//        }
        for( ; temp > 0; temp /= 10){
            rev = (rev * 10) + temp % 10;
        }
        return rev == num;
    }
}
