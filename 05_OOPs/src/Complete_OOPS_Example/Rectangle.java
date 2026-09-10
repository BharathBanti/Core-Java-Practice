package Complete_OOPS_Example;

import java.util.Scanner;

public class Rectangle extends Shape {
    private float length;
    private float breadth;

    @Override
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        length = scanner.nextFloat();
        System.out.println("Enter the side of Rectangle: ");
        breadth = scanner.nextFloat();
    }

    @Override
    public void calculateArea(){
        area = length * breadth;
    }
}
