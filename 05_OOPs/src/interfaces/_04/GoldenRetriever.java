package interfaces._04;

public interface GoldenRetriever {
    void walk();

    // DEFAULT method
    default void bark(){
        System.out.println("Golden Retriever: Bow Bow..!");
    }

    // STATIC method
    public static void name(){
        System.out.println("I'm Golden Retriever");
    }
}
