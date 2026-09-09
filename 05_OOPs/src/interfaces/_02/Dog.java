package interfaces._02;

/*
If a class partially implements interface, it must declare
itself as abstract
 */
public abstract class Dog implements Calculator1{

    // implementing only add() method
    @Override
    public void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    // not implementing the sub() method
    // - so, Calculator1 interface is not implemented completely
    // - so, we should declare this class as abstract
}
