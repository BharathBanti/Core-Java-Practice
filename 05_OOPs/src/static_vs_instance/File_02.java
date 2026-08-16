package static_vs_instance;

public class File_02 {
    int a, b; // compound declaration

    {
        System.out.println("From the instance block");
        a = 4598;
        b = 9845;
        System.out.println("Initialized instance variables");
        System.out.println(a + " " + b);
    }

    File_02(){
        System.out.println("This is from constructor");
    }

    public void hello(){
        System.out.println("From the instance method");
    }

    static int x, y;

    static {
        System.out.println("From the static block");
        x = 34;
        y = 99;
        System.out.println("Initialized instance variables");
        System.out.println(x + " " + y);
    }

    public static void good(){
        System.out.println("From the static block");
    }

    public static void main(String[] args){
        File_02.good();

        File_02 f2 = new File_02();
    }
}
