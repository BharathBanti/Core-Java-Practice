public class Ternary_Statement {
    public static void main(String[] args){
        // 1. Find the largest of three numbers using nested ternary operators only.
        int a = -334, b = 35, c = 82;
        System.out.println((a > b && a > c) ? "a is largest" : (b > a && b > c) ? "b is largest" : "c is largest");

        // 2. Check if a number is even/odd, positive/negative/zero — combine both checks using nested ternaries in a single print statement.
        System.out.println(a == 0 ? "zero" :
                (a > 0 ? "a is positive" : "a is negative")
                        + " and " +
                        ((a % 2 == 0) ? "even" : "odd") + " number");

        // 3. Write a ternary chain to classify a character as vowel/consonant (handle both upper and lower case).
        char x = '$';
        System.out.println((x == 'a' || x == 'e' || x == 'i' || x == 'o'
            || x == 'u' || x == 'A' || x == 'E' || x == 'I'
            || x == 'O' || x == 'U') ? "Vowel" : (Character.isLetter(x) ? "Consonant" : "Not an alphabet"));

        // 4. Take a triangle's three sides and use ternary logic to check if a valid triangle can be formed (sum of two sides > third side).
        System.out.println((a + b > c && a + c > b && b + c > a) ? "valid triangle" : "invalid triangle");
    }
}
