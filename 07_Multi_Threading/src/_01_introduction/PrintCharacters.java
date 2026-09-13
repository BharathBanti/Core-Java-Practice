package _01_introduction;

public class PrintCharacters extends Thread{
    @Override
    public void run(){
        System.out.println("Character printing task started..!");
        for(int i = 65; i <= 75; i++){
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Character printing task completed..!");
    }
}
