package constructors;

public class Student {
    String name;
    int id;
    String branch;

    // why constructor doesn't have a return type?
    // 1. Consructor returns the object reference of the class, so it is unneccessary
    // 2. If we mention any return type to the constructor then it is treated as a normal method
    // 3. If we mention return type as the Class, then also it is treated as a normal method

    // 2.
//    void Student(){
//        System.out.println("I'm not a constructor, just a normal method of class");
//    }

    // 3.
    Student Student(){
        System.out.println("I'm not a constructor " +
                "even my return type same as class type");
        return null;
    }

    Student(){
        this.name = "Unknown";
        this.id = 0;
        this.branch = "Not assigned";
        System.out.println("From 0 parameterized constructor");
    }

    Student(String name, int id){
        this.name = name;
        this.id = id;
        this.branch = "Not assigned";
        System.out.println("From 2 parameter constructor");
    }

    Student(String name, int id, String branch){
        this(name, id);
        this.branch = branch;
        System.out.println("From 3 parameter constructor");
    }

    public void displayDetails(){
        System.out.println(id + " " + name + " " + branch);
    }
}
