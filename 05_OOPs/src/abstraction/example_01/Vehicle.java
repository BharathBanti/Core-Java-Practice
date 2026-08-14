package abstraction.example_01;

/*
Create an abstract class Vehicle.
Add:
instance variable brand
abstract method startEngine()
concrete method displayBrand()
Create subclasses Car and Bike and implement startEngine().
 */

abstract public class Vehicle {
    String brand = "TATA";

    abstract void startEngine();

    void displayBrand(){
        System.out.println(brand);
    }
}
