public class VarArgs_02 {

    // Achieving method overloading using VarArgs
    // 1. print all numbers
    public static void printAllNumbers(int ...numbers){
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2. print all names
    public static void printAllNames(String ...names){
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();
    }

    // Invalid VarArgs method
    // the parameter which accepts multiple values must be at the end of the parameter list
//    public static void test(int ...nums, int number){
//        System.out.println(nums.length);
//    }

    // 1. predict the output
    public static void numbers(int ...nums){
        System.out.println(nums.length);
    }

    // 2. predict the output
    // the parameters int ...numbers and int[] arr are same, so method overloading is not achieved
//    public static void arrays(int ...numbers){
//        System.out.println("Accepts varargs");
//    }
//
//    public static void arrays(int[] arr){
//        System.out.println("Accepts an array");
//    }

    public static void main(String[] args){
        // 1. print all numbers
//        printAllNumbers(23);
//        printAllNumbers(9845, 843, 834, 895, 98, 23);
//        printAllNumbers(45, 43, 23, 4);

        // 2. print all names
//        printAllNames("Banti");
//        printAllNames("Siva", "Bharath", "Raju");
//        printAllNames("Malli", "Pavan");

        // Invalid varargs method

        // 1. predict the output
        numbers(2, 23, 4, 54); // 4
        numbers(5, 343, 23, 89, 98, 4, 34); // 7
        numbers(45); // 1

        // 2. predict the output
    }
}
