package final_keyword;

public class Main extends Final{

    // 1. We can extend the main directly, if there is no
    //    parameterized constructor in the parent class
    // But, if the parent class contains the parameterized constructor,
    //    then we should explicitly the call the parent constructor using
    //    super() in the Main class constructor
    public Main(){
        super(9843);
    }

    public static void main(String[] args){
        System.out.println("hello, from main class");
    }

//    @Override
//    public void greet(){ // final methods can't be overridden
//        System.out.println("Overridden greet() method");
//    }
}
