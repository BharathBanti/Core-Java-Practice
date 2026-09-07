package inheritance.constructor_chaining.example_05;

public class ChildAlpha extends ParentAlpha{

    ChildAlpha(String parentName, int parentAge, String parentPlace) {
        super("Siva", 48, "Kurlpalli");
        /*
        if we didn't call super() with 3 parameters,
        automatically inserts super() with 0 parameters, but ParentAlpha doesn't have
        0-parameterized constructor, so it throws error
        */
        System.out.println("This is from Child Alpha class constructor");
    }
}
