package interfaces._04;

public interface GoldenRetriever {
    void walk();

    default void bark(){
        System.out.println("Bow Bow..!");
    }
}
