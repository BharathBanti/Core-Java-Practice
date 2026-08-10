public class VarArgs {

    // 1. Achieving method overloading by 'n' no.of arguments
    public static int sum(int... numbers){
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        return total;
    }

    // 2. One fixed argument and 'n' no.of arguments
    public static void counter(String itemCategory, String... itemNames){
        System.out.println(itemCategory);
        int i = 1;
        for(String item : itemNames){
            System.out.println(i++ + " - " + item);
        }
    }

    // 3. Overloading between fixed arguments and 'n' no.of arguments
    public static int findMax(int a, int b){
        System.out.println("From fixed args");
        return Math.max(a, b);
    }

    public static int findMax(int... numbers){
        System.out.println("From var args");
        int max = Integer.MIN_VALUE;
        for(int num : numbers){
            max = Math.max(num, max);
        }
        return max;
    }

    public static void main(String[] args){
//        System.out.println(sum());
//        System.out.println(sum(34,9834,545,764,435,8));
//        System.out.println(sum(34, 6));

//        counter("Fruits", "Apple", "Banana", "Grapes", "StrawBerry");
//        counter("Animals", "Tiger", "Lion", "Elephant");
//        counter("Pets", "Cat", "Dog");

        System.out.println(findMax(3, 5));
        System.out.println(findMax(43, 54, 34, 8));
        System.out.println(findMax(234));
    }
}
