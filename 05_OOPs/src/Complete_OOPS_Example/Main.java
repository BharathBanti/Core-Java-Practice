package Complete_OOPS_Example;

public class Main {
    public static void main(String[] args){

        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        Geometry.maths(square);
        Geometry.maths(rectangle);
        Geometry.maths(circle);
    }
}
