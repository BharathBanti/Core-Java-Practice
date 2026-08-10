public class MethodOverloading {

    // 1.
    public static void add(int a, int b){
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void add(double a, double b){
        System.out.println(a + b);
    }

    public static void add(String a, String b){
        System.out.println(a + b);
    }

    // 2.
    public static void area(float r){
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }

    public static void area(int l, int b){
        long area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void area(double base, double height){
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    // 3.
    public static void sample(long a){
        System.out.println("From Sample 1");
    }

    public static void sample(int a){
        System.out.println("From Sample 2");
    }

    public static void sample(short a){
        System.out.println("From Sample 3");
    }

    public static void sample(char a){
        System.out.println("From Sample 4");
    }

    // 4. Return type of a method doesn't participate in Method Overloading
//    public static int addition(int a, int b){
//        return a + b;
//    }
//
//    public static double addition(int a, int b){
//        return a + b;
//    }

    // 5. Order of the arguments do matters in method overloading
    public static void example(int a, char b){
        System.out.println("Int and Char");
    }

    public static void example(char c, int d){
        System.out.println("Char and Int");
    }

    public static void main(String[] args){

//        add(23, 43);
//        add(25,8945, 84);
//        add(34D, 84D);
//        add("hello, ", "Banti");

//        area(3.5f);
//        area(54, 8);
//        area(3.5, 8.5);

//        sample(48L);
//        sample(9845);
//        sample('a');

        example('a', 4);
        example(3, 'b');

//        example('a', 'b'); // Ambiguity in methods - because both example methods can allow these arguments
    }
}
