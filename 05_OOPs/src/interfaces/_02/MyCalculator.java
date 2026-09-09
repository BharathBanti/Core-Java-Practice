package interfaces._02;

public class MyCalculator implements Calculator1{
    @Override
    public void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void sub(int a, int b){
        int sub = a - b;
        System.out.println("Diff: " + sub);
    }

    public void mul(int a, int b){
        int product = a * b;
        System.out.println("Product: " + product);
    }
}
