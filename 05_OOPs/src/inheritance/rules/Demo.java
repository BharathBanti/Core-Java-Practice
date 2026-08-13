package inheritance.rules;

public class Demo {
    public static void main(String[] args){
        Hacker hacker = new Hacker();
        // 1. Here, the Hacker() default construtor is called first
        // 2. Internally the Account() constructor is called by Hacker() constructor using super() defaultly
        hacker.display();
        hacker.changeData();
        hacker.display();
    }
}
