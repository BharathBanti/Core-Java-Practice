package _03_threadmethods;

public class SampleThread extends Thread{
    @Override
    public void run(){
        Thread t = Thread.currentThread();
//        Thread t = currentThread(); // static methods are inherited in classes
//        but not in interfaces
        System.out.println(t);
        t.setName("Sample");
        t.setPriority(1);
        System.out.println(t);

        currentThread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getThreadGroup());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
//        t.stop();
        System.out.println("Hello");
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Hello");
    }
}
