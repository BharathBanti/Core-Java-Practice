public class Operators {
    public static void main(String[] args) {

        // Basic operators +, -, *, /, %
        int a = 12;
        int b = 7;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational operators >, <, >=, <=, !=, ==
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical operators &&, ||, !
        int age = 24;
        boolean married = false;
        System.out.println(age >= 18 && married);
        System.out.println(age >= 18 || married);
        System.out.println(!married);

        // Assignment operators +=, -=, *=, /=, %=
        int c = 45;
        c += 3;
        System.out.println(c);
        c -= 45;
        System.out.println(c);
        c *= 3;
        System.out.println(c);
        c /= 3;
        System.out.println(c);
        c %= 3;
        System.out.println(c);

        // Unary operators ++, --
        int d = 8;
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(d--);
        System.out.println(--d);

    }
}
