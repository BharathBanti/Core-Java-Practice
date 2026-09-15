package _14_producer_consumer_problem_2;

public class Consumer extends Thread{
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        for( ; ; ){
            queue.retrieve();
        }
    }
}
