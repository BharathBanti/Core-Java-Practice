package interfaces._02;

public class Main_02 {
    public static void main(String[] args){
        // Promoting POLYMORPHISM using interface type reference
        MyCalculator mc1 = new MyCalculator();
        MyCalculator mc2 = new MyCalculator();

        Calculator1 c1 = new MyCalculator();
        c1.add(3, 5);
        c1.sub(5, 2);

        Calculator1 c;
        c = mc1;
        c.add(2, 3);
        c.sub(5, 2);
//        c.mul(3, 3); // can't access the specialized methods of implementing class using interface type reference

        c = mc2;
        c.add(5, 3);
        c.sub(8, 2);
//        c.mul(2, 2);

    }
}
