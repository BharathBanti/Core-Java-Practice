package polymorphism;

public class FighterPlane extends Plane{
    @Override
    void fly(){
        System.out.println("FighterPlane is flying at great height");
    }

    void carryWeapons(){
        System.out.println("FighterPlane is carrying weapons");
    }
}
