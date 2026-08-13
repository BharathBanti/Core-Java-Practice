package inheritance.method_overriding.example;

public class PassengerPlane extends Plane {
    // inherited methods are takeOff() and land()

    // overridden method
    void fly(){
        System.out.println("PassengerPlane is flying at medium heights");
    }

    // specialized method
    void carryPassenger(){
        System.out.println("PassengerPlane is carrying passengers");
    }
}
