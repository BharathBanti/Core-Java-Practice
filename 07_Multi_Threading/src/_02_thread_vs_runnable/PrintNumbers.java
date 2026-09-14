package _02_thread_vs_runnable;

public class PrintNumbers implements Runnable{
    @Override
    public void run(){
        System.out.println("Number printing task started..!");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed..!");
    }
}
