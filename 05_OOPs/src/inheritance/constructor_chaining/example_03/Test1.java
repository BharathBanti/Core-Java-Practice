package inheritance.constructor_chaining.example_03;

public class Test1 {
    int x,y;

    Test1(){
        super();
        x = 100;
        y = 200;
    }

    Test1(int x, int y){
        this.x = x;
        this.y = y;
    }
}
