package classes_and_objects;

public class Student {
    // class members
    String name;
    int rollNumber;
    double marks;

    // constructor
    public Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // displayInfo method
    public void displayInfo(){
        System.out.println(rollNumber + " " + name + " " + marks);
    }
}
