package polymorphism;

public class CargoPlane extends Plane{
    @Override
    void fly(){
        System.out.println("CargoPlane is flying at lower height");
    }

    void carryCargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
}
