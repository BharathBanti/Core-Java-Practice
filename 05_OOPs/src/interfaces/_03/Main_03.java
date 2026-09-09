package interfaces._03;

/*
A class can both extend another class as well as implement
an interface. However, order should be extend first and
implemented later.
 */
public class Main_03 extends NormalClass implements Egg{
    @Override
    public void broken(){
        System.out.println("The Egg is BROKEN");
    }

    @Override
    public void onPan(){
        System.out.println("The Egg is ON THE PAN");
    }
}
