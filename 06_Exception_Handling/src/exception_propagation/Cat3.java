package exception_propagation;

public class Cat3 {
    void cat3fun(){
        System.out.println("Cat3 Started");
        Cat2 cat2 = new Cat2();
        cat2.cat2fun();
        System.out.println("Cat3 Ended");
    }
}
