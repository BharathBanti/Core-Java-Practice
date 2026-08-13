package inheritance.method_overriding.example;

public class CargoPlane extends Plane {
    // inherited methods are takeOff() and land()

    // overridden method
    void fly(){
        System.out.println("CargoPlane is flying at low heights");
    }

    // specialized method
    void carryCargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
}
