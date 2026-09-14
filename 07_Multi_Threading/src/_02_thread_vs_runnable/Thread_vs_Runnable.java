package _02_thread_vs_runnable;

public class Thread_vs_Runnable {
    public static void main(String[] args){

        Addition addition = new Addition();
        PrintCharacters printCharacters = new PrintCharacters();
        PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(addition);
        Thread t2 = new Thread(printCharacters);
        Thread t3 = new Thread(printNumbers);

        t1.start();
        t2.start();
        t3.start();
    }
}
