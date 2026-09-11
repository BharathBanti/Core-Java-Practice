package exception_propagation;

public class MainCat {
    public static void main(String[] args){
        System.out.println("Program Started..!");
        try{
            Cat3 cat3 = new Cat3();
            cat3.cat3fun();
        }
        catch(Exception e){
            System.out.println("Exception handled in MainCat class method");
        }
        System.out.println("Program Ended..!");
    }
}
