package _13_producer_consumer_problem;

public class Queue {
    int data;
    boolean is_data_present = false;

    synchronized void store(int data){
        try{
            if(!is_data_present){
                this.data = data;
                System.out.println(Thread.currentThread().getName() +
                        " produced " + this.data);
                is_data_present = true;
                notify();
            }
            else {
                wait();
            }
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized void retrieve(){
        try{
            if(is_data_present){
                System.out.println(Thread.currentThread().getName() +
                        " consumed " + this.data);
                is_data_present = false;
                notify();
                Thread.sleep(1000);
            }
            else{
                wait();
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
