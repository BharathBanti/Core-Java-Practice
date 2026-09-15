package _10_synchronized_block;

public class ExecutingLines implements Runnable{
    @Override
    public void run(){
        String name = Thread.currentThread().getName();

        try{
            System.out.println(name + " line 1");
            Thread.sleep(1000);
            System.out.println(name + " line 2");
            Thread.sleep(1000);
            System.out.println(name + " line 3");
            Thread.sleep(1000);
            synchronized (this){
                System.out.println(name + " line 4");
                Thread.sleep(1000);
                System.out.println(name + " line 5");
                Thread.sleep(1000);
                System.out.println(name + " line 6");
                Thread.sleep(1000);
            }
            System.out.println(name + " line 7");
            Thread.sleep(1000);
            System.out.println(name + " line 8");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
