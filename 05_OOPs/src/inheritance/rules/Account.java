package inheritance.rules;

// Rule - 01: Private variables do not participate in Inheritance
// Rule - 02: Multi-level inheritance is permitted in Java
// Rule - 03: Multiple inheritance is not allowed in Java
// Rule - 04: Cyclic inheritance is not allowed in Java
// Rule - 05: Constructors do not participate in Inheritance
public class Account {
    private int accNum = 2398;
    private int pin = 7892;

    String accHolderName;
    int age;

    Account(){
        accHolderName = "Bharath";
        age = 24;
    }
}
