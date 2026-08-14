package association.example_01;

public class Mobile {
    private String mobileName = "Realme";

    // Composition
    OS os = new OS("Android", 8);

    // Aggregation
    void hasACharger(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
