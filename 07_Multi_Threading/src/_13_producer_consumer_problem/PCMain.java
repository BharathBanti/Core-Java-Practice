package _13_producer_consumer_problem;

public class PCMain {
    public static void main(String[] args){
        Queue queue = new Queue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.setName("PRODUCER");
        consumer.setName("CONSUMER");

        producer.start();
        consumer.start();
    }
}
