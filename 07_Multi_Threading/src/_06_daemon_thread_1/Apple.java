package _06_daemon_thread_1;

public class Apple implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Apple is running.. " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
