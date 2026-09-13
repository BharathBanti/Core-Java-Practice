package _01_introduction;

public class PrintNumbers extends Thread{
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
