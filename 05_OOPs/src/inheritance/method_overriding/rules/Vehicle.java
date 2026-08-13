package inheritance.method_overriding.rules;

import java.io.IOException;

public class Vehicle {
    protected Vehicle service() throws IOException {
        System.out.println("Servicing vehicle");
        return new Vehicle();
    }

    void className(){
        System.out.println("Vehicle class");
    }

    static void inspect(){
        System.out.println("Vehicle inspection");
    }

    final void registration(){
        System.out.println("Vehicle registered");
    }
}
