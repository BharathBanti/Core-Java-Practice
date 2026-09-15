package _07_daemon_thread_2;

// 2nd way of using daemon threads
// 1. Identify primary threads
// 2. identify secondary threads(daemon threads)
// 3. create secondary threads in primary threads
// 4. setDaemon(true) to secondary threads in primary threads

public class ManLifeMain {
    public static void main(String[] args){
        ManLife manLife = new ManLife();
        manLife.start();
    }
}
