package inheritance.method_overriding.example;

public class FighterPlane extends Plane {
    // inherited methods are takeOff() and land()

    // overridden method
    void fly(){
        System.out.println("FighterPlane is flying at great heights");
    }

    // specialized method
    void carryWeapons(){
        System.out.println("FighterPlane is carrying weapons");
    }
}
