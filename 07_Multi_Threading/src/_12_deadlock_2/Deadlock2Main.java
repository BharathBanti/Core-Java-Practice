package _12_deadlock_2;

public class Deadlock2Main {
    public static void main(String[] args){
        Avengers avengers = new Avengers();

        Thread thread1 = new Thread(avengers);
        Thread thread2 = new Thread(avengers);

        thread1.setName("IRONMAN");
        thread2.setName("THANOS");

        thread1.start();
        thread2.start();
    }
}
