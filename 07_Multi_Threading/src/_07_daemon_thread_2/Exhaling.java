package _07_daemon_thread_2;

public class Exhaling extends Thread{
    @Override
    public void run(){
        for( ; ; ){
            System.out.println("Exhaling..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
