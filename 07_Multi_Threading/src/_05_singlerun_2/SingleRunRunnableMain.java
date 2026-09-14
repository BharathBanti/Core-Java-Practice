package _05_singlerun_2;

// implementing single run using thread classes which IMPLEMENTS thread class
public class SingleRunRunnableMain {
    public static void main(String[] args){

        SingleRunByRunnable sr = new SingleRunByRunnable();

        Thread thread1 = new Thread(sr);
        Thread thread2 = new Thread(sr);
        Thread thread3 = new Thread(sr);

        thread1.setName("ADD");
        thread2.setName("CHAR");
        thread3.setName("NUM");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
