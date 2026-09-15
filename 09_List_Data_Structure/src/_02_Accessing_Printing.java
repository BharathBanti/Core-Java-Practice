import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _02_Accessing_Printing {
    public static void main(String[] args){
        /* =================================================== */
        /* ============= ACCESSING AND PRINTING ============== */
        /* =================================================== */

        ArrayList<String> names = new ArrayList<>(List.of("Banti", "Siva", "Raju"));
        ArrayList<Integer> nums = new ArrayList<>(List.of(23, 45, 65));

        // 1. Using index - arraylist.get(index);
        System.out.println(names.get(2));
        System.out.println(names.get(0));

        // 2. Using TRADITIONAL for loop
        for(int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        // 3. Using ENHANCED for loop
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Using Iterator - can move only forward direction
        Iterator cursor = names.iterator();
        while(cursor.hasNext()){
            System.out.print(cursor.next() + " ");
        }
        System.out.println();

        // 5. Using ListIterator
        ListIterator pen = names.listIterator();
        // 5.1 moving forward
        while(pen.hasNext()){
            System.out.print(pen.next() + " ");
        }
        System.out.println();

        // 5.2 moving backward
        while(pen.hasPrevious()){
            System.out.print(pen.previous() + " ");
        }
        System.out.println();

        // 6. Printing all list
        System.out.println(names);

        /*
        Given ArrayList<Integer> marks = new ArrayList<>(List.of(90, 85, 76, 92));
        write code to print each mark using a traditional for loop, and separately
        using the enhanced for-each loop.
         */

        ArrayList<Integer> marks = new ArrayList<>(List.of(90, 85, 76, 92));
        for(int i = 0; i < marks.size(); i++){
            System.out.print(marks.get(i) + " ");
        }
        System.out.println();
        for(int mark : marks){
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
