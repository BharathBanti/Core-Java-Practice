package association.example_01;

public class Main {
    public static void main(String[] args){
        Mobile mobile = new Mobile();

        System.out.println(mobile.os.getName());
        System.out.println(mobile.os.getSize());

        Charger charger = new Charger("Realme", 4.5f);
        mobile.hasACharger(charger);

        mobile = null;
//        System.out.println(mobile.os.getSize()); // Null Pointer Exception
        System.out.println(charger.getBrand());
    }
}
