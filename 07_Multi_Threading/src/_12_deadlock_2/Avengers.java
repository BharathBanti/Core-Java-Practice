package _12_deadlock_2;

public class Avengers implements Runnable{
    String res1 = "Gauntlet";
    String res2 = "Infinity Stones";

    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("IRONMAN")){
            ironman();
        }
        else{
            thanos();
        }
    }

    void ironman(){
        try{
            Thread.sleep(3000);
            synchronized (res1){
                System.out.println("Ironman acquired the Gaunlet");
                Thread.sleep(3000);
                synchronized (res2){
                    System.out.println("Ironman acquired Infinity Stones");
                    Thread.sleep(3000);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println("Ironman failed..!");
            e.printStackTrace();
        }
    }

    void thanos(){
        try{
            Thread.sleep(3000);
            synchronized (res2){
                System.out.println("Thanos acquired Infinity Stones");
                Thread.sleep(3000);
                synchronized (res1){
                    System.out.println("Thanos acquired the Gaunlet");
                    Thread.sleep(3000);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println("Thanos failed..!");
            e.printStackTrace();
        }
    }
}
