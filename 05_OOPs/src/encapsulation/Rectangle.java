package encapsulation;

public class Rectangle {
    // private members
    private int length;
    private int width;

    // constructor
    Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    // setters
    private void setLength(int length) {
        if(length < 0){
            System.out.println("length must be positive");
            return;
        }
        this.length = length;
    }

    void setWidth(int width){
        if(width < 0){
            System.out.println("width must be positive");
            return;
        }
        this.width = width;
    }

    // getters
    int getLength(){
        return length;
    }

    int getWidth(){
        return width;
    }

    // area()
    public int rectangleArea(){
        return length * width;
    }
}
