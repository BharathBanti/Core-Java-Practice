package inheritance.method_overriding.rules;

public class Car extends Vehicle{
    @Override
    public Car service(){
        System.out.println("Servicing car");
        return new Car();
    }

    static void inspect(){
        System.out.println("Car inspection");
    }

    @Override
    public void className(){
        System.out.println("Car class");
    }

    // final methods or variables can't be overridden
//    @Override
//    public final void registration(){
//        System.out.println("Car registered");
//    }
}
