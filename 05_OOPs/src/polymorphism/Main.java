package polymorphism;

public class Main {
    public static void main(String[] args){
        // tight coupling
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        // without polymorphism
//        cp.fly();
//        pp.fly();
//        fp.fly();

        // Achieving polymorphism using loose coupling
        Plane p;
        p = cp;
        p.fly();
        // using parent reference type we can't directly access the specialized methods of a child class
        // down casting
        ((CargoPlane)p).carryCargo();

        p = pp;
        p.fly();
        ((PassengerPlane)p).carryPassenger();

        p = fp;
        p.fly();
        ((FighterPlane)p).carryWeapons();

        permit(cp);
        permit(pp);
        permit(fp);

    }

    public static void permit(Plane p){
        p.fly();
    }
}
