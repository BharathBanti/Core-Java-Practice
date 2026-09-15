import java.util.ArrayList;

public class Task_01 {
    public static void main(String[] args){
        /*
        Create an ArrayList<String> called students with initial capacity 5.
        Add these 4 names one by one: "Banti", "Nani", "Siva", "Priya".
        Insert "Kiran" at index 2 (shifting others).
        Print the full list using the direct println method (no loop).
        Remove "Nani" by value, not index.
        Check and print whether the list contains "Siva".
        Print the final size() of the list.
        Loop and print each name with its index using a traditional for loop.
         */

        ArrayList<String> students = new ArrayList<>(5);
        students.add("Banti");
        students.add("Nani");
        students.add("Siva");
        students.add("Priya");
        students.add(2, "Kiran");
        System.out.println(students);
        students.remove("Nani");
        System.out.println(students.contains("Siva"));
        System.out.println(students.size());
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
