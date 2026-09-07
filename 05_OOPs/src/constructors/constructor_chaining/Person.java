package constructors.constructor_chaining;

class Person {
    private String name;
    private int age;
    private double weight;
    private boolean married;

    // constructor 01
    Person(){
        this.name = "UNKNOWN";
        System.out.println("I'm zero parameterized constructor");
    }

    // constructor 02
    Person(String name){
        this.name = name;
        System.out.println("I'm the 2nd constructor");
    }

    // constructor 03
    Person(int age, double weight){
        this();
        System.out.println("I'm the 3rd constructor");
        this.age = age;
        this.weight = weight;
    }

    // constructor 04
    Person(String name, int age, double weight){
        this(name);
//        this(age, weight); // we can't use this() other
//        than in first line of the constructor
        this.age = age;
        this.weight = weight;
        System.out.println("I'm the 4th constructor");
    }

    // constructor 05
    Person(String name, int age, double weight, boolean married){
        this(name, age, weight);
        this.married = married;
        System.out.println("I'm the 5th constructor");
    }
}
