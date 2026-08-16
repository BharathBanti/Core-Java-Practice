package object_class_methods;

public class Main_01 {
    public static void main(String[] args){
        Student s1 = new Student("Banti", 23);
        Student s2 = new Student("Banti", 23);

        // 1. == compares the address of the objects, but not the values or data inside the objects
        boolean result = s1 == s2; // 2 different objects in heap
        System.out.println(result); // false

        Student s3 = s1;
        result = s3 == s1; // 2 different Student type references points to same Student object
        System.out.println(result); // true

        // 2. toString() method - returns the hashcode in hexadecimal of the object
        System.out.println(s1.toString());
//        System.out.println(s1); // both s1.toString and s1 returns same output
        System.out.println(s2.toString());
        System.out.println(s3.toString()); // reason for: s1 == s3 -> true

        // 3. hashcode() method - returns the hascode
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // 4. .equals() method also works same as == operator, but .equals() method can be overridden
        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals(s3)); // false
        System.out.println(s1.equals(s3)); // true
    }
}
