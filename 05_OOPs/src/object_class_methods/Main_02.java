package object_class_methods;

public class Main_02 {
    public static void main(String[] args){
        Person p1 = new Person("Bharath", 45);
        Person p2 = new Person("Bharath", 45);

        // toString() method is overridden in Person class
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // overridden .equals() method
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);

    }
}
