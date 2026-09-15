package _10_synchronized_block;

public class MainSync {
    public static void main(String[] args){
        ExecutingLines e = new ExecutingLines();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);
        Thread t3 = new Thread(e);

        t1.setName("ONE");
        t2.setName("TWO");
        t3.setName("THREE");

        t1.start();
        t2.start();
        t3.start();
    }
}
