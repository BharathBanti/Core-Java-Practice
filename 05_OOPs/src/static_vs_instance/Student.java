package static_vs_instance;

/*
Build a Student class with an instance field rollNumber and a static field schoolName.
Add a static method changeSchool(String newName).
Create 3 student objects, print each one's schoolName, call changeSchool() once,
then print all three again — confirm all three reflect the change.
 */

public class Student {
    int rollNumber;
    static String schoolName;

    static{
        schoolName = "Jeevananda";
    }

    public static void changeSchool(String newName){
        schoolName = newName; // static doesn't have 'this'
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        Student.changeSchool("Govt");
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
    }
}
