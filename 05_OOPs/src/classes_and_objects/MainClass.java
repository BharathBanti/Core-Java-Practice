package classes_and_objects;

public class MainClass {
    public static void main(String[] args){

        // 1. Trace the Object creation at memery level and observe the objects count
//        Box b1 = new Box();
//        b1.width = 10;
//        Box b2 = b1;
//        b2.width = 20;
//        System.out.println(b1.width);

        // 2. mutating and reassigning
        Box myBox = new Box();
        myBox.width = 222;

        System.out.println(myBox.width);

        changeWidth(myBox);
        System.out.println(myBox.width);

        reassign(myBox);
        System.out.println(myBox.width);

        Student s1 = new Student("Bharath", 5, 946);
        Student s2 = new Student("Srinidhi", 321, 740);
        Student s3 = new Student("Akhila", 765, 644);

//        s1.displayInfo();
//        s2.displayInfo();
//        s3.displayInfo();
    }

    // Mutating the same object
    public static void changeWidth(Box b){
        b.width = 50;
    }

    // Re-assigning the object
    public static void reassign(Box b){
        b = new Box();
        b.width = 999;
    }

}
