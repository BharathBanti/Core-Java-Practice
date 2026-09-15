package _07_daemon_thread_2;

public class ManLife extends Thread{
    @Override
    public void run(){
        Inhaling inhaling = new Inhaling();
        Exhaling exhaling = new Exhaling();

        inhaling.setDaemon(true);
        exhaling.setDaemon(true);

        inhaling.start();
        exhaling.start();

        try {
            System.out.println("Man is born");
            Thread.sleep(4000);
            System.out.println("Man goes to school");
            Thread.sleep(4000);
            System.out.println("Man goes to college");
            Thread.sleep(4000);
            System.out.println("Man got job");
            Thread.sleep(4000);
            System.out.println("Man got married");
            Thread.sleep(4000);
            System.out.println("Man have children");
            Thread.sleep(4000);
            System.out.println("Man become old");
            Thread.sleep(4000);
            System.out.println("Man is dead");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
