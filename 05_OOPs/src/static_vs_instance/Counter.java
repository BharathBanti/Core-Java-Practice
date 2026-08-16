package static_vs_instance;

/*
Create the Counter example (auto-incrementing id using a static counter)
 */

public class Counter {
    static int count;
    int objectCount;

    Counter(){
        count++;
        objectCount = count;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c1.objectCount);
        System.out.println(c2.objectCount);
        System.out.println(c3.objectCount);
        System.out.println(Counter.count);

        Counter.count = 10;
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter c6 = new Counter();

        System.out.println(c4.objectCount);
        System.out.println(c5.objectCount);
        System.out.println(c6.objectCount);
        System.out.println(Counter.count);
    }
}
