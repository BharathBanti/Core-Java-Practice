package Complete_OOPS_Example;

import java.util.Scanner;

public class Square extends Shape {
    private float side;

    @Override
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of Square: ");
        side = scanner.nextFloat();
    }

    @Override
    public void calculateArea(){
        area = side * side;
    }
}
