package association.example_01;

public class Charger {
    private String brand;
    private float voltage;

    Charger(String brand, float voltage){
        this.brand = brand;
        this.voltage = voltage;
    }

    String getBrand(){
        return brand;
    }

    float getVoltage(){
        return voltage;
    }
}
