package _06_daemon_thread_1;

public class Alpha {
    public static void main(String[] args){
        Apple apple = new Apple();
        DaemonThread daemonThread = new DaemonThread();

        Thread t1 = new Thread(apple);
        Thread t2 = new Thread(daemonThread);

        t2.setDaemon(true);
        t1.start();
        t2.start();

        for(int i = 1; i <= 10; i++){
            System.out.println("Main is running.. " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
