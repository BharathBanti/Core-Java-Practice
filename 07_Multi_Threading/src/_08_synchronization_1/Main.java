package _08_synchronization_1;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer);
        Thread t3 = new Thread(printer);

        t1.setName("WOMEN");
        t2.setName("MEN");
        t3.setName("CHILD");

        // 1. using join() we can achieve synchronization
        // or locking thread until it's execution is completed
        // but we are deciding the order of thread rather thread shceduler deciding
//        try {
//            t1.start();
//            t1.join();
//            t2.start();
//            t2.join();
//            t3.start();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // 2. now thread scheduler will decide the order of threads
        t1.start();
        t2.start();
        t3.start();
    }
}
