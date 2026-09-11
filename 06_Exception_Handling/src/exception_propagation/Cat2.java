package exception_propagation;

public class Cat2 {
    void cat2fun(){
        System.out.println("Cat2 Started");
        Cat1 cat1 = new Cat1();
        cat1.cat1fun();
        System.out.println("Cat2 Ended");
    }
}
