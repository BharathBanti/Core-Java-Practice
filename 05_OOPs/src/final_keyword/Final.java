package final_keyword;

public class Final /* extends Demo */ { // can't extends the final class
    final int a = 34;
    final int b; // must be initialized in the constructor once
    static final double PI = 3.14;

    Final(int b){
        this.b = b;
    }

    final void greet(){
//        a = 433984; // final variables can't be re-assigned
        System.out.println("hello, banti");
    }
}
