package _08_synchronization_1;

public class Printer implements Runnable{
    @Override
    synchronized public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " started printing");
        for(int i = 1; i <= 5; i++){
            System.out.println(name + " is printing... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " completed printing");
    }
}
