package Complete_OOPS_Example;

import java.util.Scanner;

public class Circle extends Shape {
    private float radius;

    @Override
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        radius = scanner.nextFloat();
    }

    @Override
    public void calculateArea(){
        area = (float) (Math.PI * Math.pow(radius, 2));
    }
}
