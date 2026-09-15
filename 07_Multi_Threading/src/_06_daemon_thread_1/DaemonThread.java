package _06_daemon_thread_1;

public class DaemonThread implements Runnable{
    @Override
    public void run(){
        for( ; ; ){
            System.out.println("Daemon thread is running..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("hello");
    }
}
