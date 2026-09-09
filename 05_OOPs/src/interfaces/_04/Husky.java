package interfaces._04;

// DEFAULT methods - Java 8+ features
// RULES:
// 1. default methods must have a body
// 2. must use the 'default' keyword
// 3. can be overridden in implementing class if it need custom implementation
// 4. When we implement two interfaces, if both interfaces have same default methods
//    then ambiguity is re-introduced. So, the solution for this is to mention the interface
//    name before using the method.
//    Ex: Interface.super.method();

public interface Husky {
    void run();

    default void bark(){
        System.out.println("Bow Bow..!");
    }
}
