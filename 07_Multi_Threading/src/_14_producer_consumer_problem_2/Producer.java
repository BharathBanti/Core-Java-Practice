package _14_producer_consumer_problem_2;

public class Producer extends Thread{
    Queue queue;

    public Producer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        int i = 1;
        for( ; ; ){
            queue.store(i++);
        }
    }

}
