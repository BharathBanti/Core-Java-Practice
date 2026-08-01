import java.util.Scanner;

public class DoWhile_Loop {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        // 1. Build a simple menu-driven program (calculator: add/sub/mul/div/exit) that keeps running until the user selects "exit" — this is the classic real-world use case for do-while since it must run at least once.
        int a = 43, b = 89;
        int choice;
//        do{
//            showmenu();
//            choice = scanner.nextInt();
//            switch (choice){
//                case 1 -> sum(a, b);
//                case 2 -> sub(a, b);
//                case 3 -> mul(a, b);
//                case 4 -> div(a, b);
//                case 5 -> System.out.println("Exiting...");
//                default -> System.out.println("Invalid choice");
//            }
//        }while(choice != 5);

        // 2. Take a number and check whether it's a "perfect number" (sum of divisors excluding itself equals the number, e.g., 6 = 1+2+3) using do-while.
        System.out.println(isPerfectNumber(25));

    }

    public static void showmenu(){
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Exit");
    }

    public static void sum(int a, int b){
        System.out.println(a + b);
    }
    public static void sub(int a, int b){
        System.out.println(a - b);
    }
    public static void mul(int a, int b){
        System.out.println(a * b);
    }
    public static void div(int a, int b){
        System.out.println(a / b);
    }

    public static boolean isPerfectNumber(int num){
        int div = 0;
        int i = 1, sum = 0;
        do{
            if(num % i == 0){
                sum += i;
                if(num/i != i){
                    sum += num/i;
                }
            }
            i++;
        }while(i * i <= num);
        sum -= num;
        return sum == num;
    }
}
