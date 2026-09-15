package _13_producer_consumer_problem;

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
