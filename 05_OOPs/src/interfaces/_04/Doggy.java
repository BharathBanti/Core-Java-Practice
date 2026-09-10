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

// INTERFACE methods - Java 9+ features
// 1. static interface methods belong to the interface, called as InterfaceName.method()
// 2. NOT inherited by implementing classes, NOT accessible via object reference
// 3. NOT overridable, NO polymorphism, NO diamond conflicts
// 4. Common use: utility/factory methods without needing a separate helper class

// PRIVATE methods - Java 9+ features
// 1. Private methods (Java 9+) = internal helpers only, never inherited or exposed
// 2. Private instance methods → callable only from default methods
// 3. Private static methods → callable from static AND default methods
// 4. Solves code duplication across default/static methods within the same interface

public class Doggy implements Husky, GoldenRetriever{ //
    @Override
    public void run(){
        System.out.println("Doggy runs");
    }

    @Override
    public void walk(){
        System.out.println("Doggy walks");
    }

    @Override
    public void bark(){ // here we make this as 'public' even we said 'dafault' in interface
        GoldenRetriever.super.bark();
        Husky.super.bark();
        System.out.println("hello");
    }

    public static void main(String[] args){
        Doggy doggy = new Doggy();
        doggy.run();
        doggy.walk();
        doggy.bark();

        // accessing static methods of interface
//        doggy.name(); static methods can't be accessed by using implemented classes
        Husky.name();
        GoldenRetriever.name();
    }
}
