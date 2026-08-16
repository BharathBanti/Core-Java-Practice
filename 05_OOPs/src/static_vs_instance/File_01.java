package static_vs_instance;

public class File_01 {
    static int a;

    static{
        a = 34;
        System.out.println("This is from the main static block");
    }

    static void greet(){
        System.out.println("Hello, this is greet static method");
    }

    public static void main(String[] args){
        System.out.println("hello world");
        File_01.greet();
    }

    // WHILE LOADING THE MAIN CLASS INTO THE MEMORY FOR THE FIRST TIME
    // Step-1: JVM looks for the static variables
    // Step-2: JVM looks for the static block
    // Step-3: JVM looks for the static method (main method only for first time)

    // WHILE LOADING THE CLASS INTO MEMORY OTHER THAN MAIN METHOD
    // Step-1: JVM looks for the static variables
    // Step-2: JVM looks for the static block
    // JVM will not look for the static methods from the second time and beyond

}
