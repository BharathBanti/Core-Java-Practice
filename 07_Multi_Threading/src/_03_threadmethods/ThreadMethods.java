package _03_threadmethods;

public class ThreadMethods {
    public static  void main(String[] args){

        Thread thread = Thread.currentThread();

        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getId());

        thread.setName("Banti");
        thread.setPriority(1);
        System.out.println(thread);

        SampleThread sampleThread = new SampleThread();
        sampleThread.start();
    }
}

// Thread class methods
// 1. currentThread();
// 2. getId();
// 3. setName();
// 4. setPriority();
// 5. getName();
// 6. getPriority();
// 7. getThreadGroup();
// 8. join();
// 9. isAlive();
// 10. setDaemon();
// 11. start();
// 12. stop();
// 13. resume();
// 14. suspend();
// 15. isDaemon();
