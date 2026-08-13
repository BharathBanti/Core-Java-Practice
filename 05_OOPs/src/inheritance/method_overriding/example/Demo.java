package inheritance.method_overriding.example;

public class Demo {
    public static void main(String[] args){
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryCargo();

        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryPassenger();

        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    }
}
