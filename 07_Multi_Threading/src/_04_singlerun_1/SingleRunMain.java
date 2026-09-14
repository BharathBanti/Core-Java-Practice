package _04_singlerun_1;

// implementing single run using thread classes which EXTENDS thread class
public class SingleRunMain {
    public static void main(String[] args){

        SingleRunThread thread1 = new SingleRunThread();
        SingleRunThread thread2 = new SingleRunThread();
        SingleRunThread thread3 = new SingleRunThread();

        thread1.setName("ADD");
        thread2.setName("CHAR");
        thread3.setName("NUM");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
