import java.util.ArrayList;
import java.util.List;

public class _03_Methods {

    public static void main(String[] args){
        /* =================================================== */
        /* =============== ARRAYLIST METHODS ================= */
        /* =================================================== */

        ArrayList<Integer> nums = new ArrayList<>(List.of(23, 45, 66, 89));
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(4, 5, 6, 7));

        System.out.println(nums);

        // 1. ADDING ELEMENTS
        // add(value);
//        nums.add(99);

        // add(index, value)
        nums.add(0, 100);
//        System.out.println(nums);

        // addAll(collection)
        nums.addAll(nums2);
//        System.out.println(nums);

        // addAll(index, collection);
        nums.addAll(1, nums2);
//        System.out.println(nums);

        // 2. REMOVING ELEMENTS
        // remove(index)
        nums.remove(0); // int argument -> index
        System.out.println(nums);

        // remove(object)
        nums.remove(Integer.valueOf(66)); // Object argument -> value/element
        System.out.println(nums);

        // removeAll(collection)
        nums.removeAll(nums2); // removes all duplicates
//        nums.retainAll(nums2); // removes all other than duplicates
        System.out.println(nums);

        // clear() -> clears all elements
//        nums.clear();
//        System.out.println(nums);

        // 3. UPDATING ELEMENTS
        // set(index, value);
        nums.set(0, 77);
        System.out.println(nums);

        // 4. SEARCHING ELEMENTS
        // indexOf(value);
        System.out.println(nums.indexOf(77));

        // lastIndexOf(value);
        nums.add(77);
        System.out.println(nums);
        System.out.println(nums.lastIndexOf(77));

        // contains(value);
        System.out.println(nums.contains(89));

        // containsAll(collection);
        System.out.println(nums.containsAll(List.of(77, 45)));

        // 5. SIZE & EMPTY CHECKS
        // size();
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

        // 6. OTHER METHODS
        // sort(null);
        nums.sort(null);
        System.out.println(nums);

        // trimToSize();
        nums.trimToSize();

        // clone();
        ArrayList<Integer> nums3 = (ArrayList<Integer>) nums.clone();
        System.out.println(nums3);

        // subList(startIndex, endIndex);
        System.out.println(nums.subList(1, 3));

        /*
        Given ArrayList<Integer> nums = new ArrayList<>(List.of(10, 20, 30, 40));,
        write code to remove the value 30 (not the index) from this list. Be
        careful of the trap mentioned above.
         */
        ArrayList<Integer> numss = new ArrayList<>(List.of(10, 20, 30, 40));
        System.out.println(numss);
        numss.remove(Integer.valueOf(30));
        System.out.println(numss);
    }

}
