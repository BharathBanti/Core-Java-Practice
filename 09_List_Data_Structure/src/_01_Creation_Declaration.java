import java.util.ArrayList;
import java.util.List;

public class _01_Creation_Declaration {
    public static void main(String[] args){
        System.out.println("Welcome to Collections Practice");

        /* =================================================== */
        /* ============ CREATION AND DECLARATION ============= */
        /* =================================================== */

        // 1. Basic creation
        ArrayList<String> names = new ArrayList<>();

        // 2. Initial capacity
        ArrayList<String> apples = new ArrayList<>(50);

        // 3. Using existing collection
        String[] bags = {"Bag1", "Bag2", "Bag3"};
        ArrayList<String> baags = new ArrayList<>(List.of(bags));
        ArrayList<String> baags2 = new ArrayList<>(names);

        // 4. Initial values
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 3, 4, 5));

        // 5. Without generics
        ArrayList nums = new ArrayList(); // by default: type = Object
        nums.add(234);
        nums.add("Banti");

        /*
        Create an ArrayList<Integer> called marks with an initial capacity of 20
        (don't add elements yet, just the declaration).
         */
        ArrayList<Integer> marks = new ArrayList<>(20);
    }
}
