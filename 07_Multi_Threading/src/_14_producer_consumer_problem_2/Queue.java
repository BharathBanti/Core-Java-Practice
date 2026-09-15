package _14_producer_consumer_problem_2;

public class Queue {
    int data;
    boolean is_data_present = false;

    synchronized void store(int data){
        try{
            while(is_data_present){
                wait();
            }
            this.data = data;
            System.out.println(Thread.currentThread().getName() +
                    " produced " + this.data);
            is_data_present = true;
            notify();
//            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized void retrieve(){
        try{
            while(!is_data_present){
                wait();
            }
            System.out.println(Thread.currentThread().getName() +
                    " consumed " + this.data);
            is_data_present = false;
            notify();
//            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
