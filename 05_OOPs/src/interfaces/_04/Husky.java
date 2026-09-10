package interfaces._04;

public interface Husky {
    void run();

    // DEFAULT method
    default void bark(){
        System.out.println("Husky: Bow Bow..!");
    }

    // STATIC method
    public static void name(){
        System.out.println("I'm Husky");
//        double weight = getWeight(); // static methods can't access instance methods
        int age = getAge();
        System.out.println("I'm " + age + " years old");
    }

    // PRIVATE INSTANCE method
    private double getWeight(){
        return 6.59;
    }

    // PRIVATE STATIC method
    private static int getAge(){
        return 2;
    }
}
