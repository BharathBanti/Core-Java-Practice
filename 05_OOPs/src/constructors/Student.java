package constructors;

public class Student {
    String name;
    int id;
    String branch;

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
