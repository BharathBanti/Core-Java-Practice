package _07_daemon_thread_2;

public class Inhaling extends Thread{
    @Override
    public void run(){
        for( ; ; ){
            System.out.println("Inhaling..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
