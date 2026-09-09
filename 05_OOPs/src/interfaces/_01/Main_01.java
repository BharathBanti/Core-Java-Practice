package interfaces._01;

public class Main_01 implements Apple {

    // achieved standardization by implementing the methods present in the interface
    public void greet(String name){
        System.out.println("Good morning, " + name);
    }

    public void sayBye(String name){
        System.out.println("Bye bye, " + name);
    }

    public static void main(String[] args){
        new Main_01().greet("Banti");
        new Main_01().sayBye("Banti");
    }
}
