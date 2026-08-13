package polymorphism;

public class PassengerPlane extends Plane{
    @Override
    void fly(){
        System.out.println("PassengerPlane is flying at medium height");
    }

    void carryPassenger(){
        System.out.println("PassengerPlane is carrying passengers");
    }
}
