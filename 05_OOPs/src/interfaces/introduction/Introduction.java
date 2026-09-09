package interfaces.introduction;

public interface Introduction {
    int a = 234;
    double b = 9843.93;
    // 1. Variables
    // => All variables in interface are public static final by default
    // => They are constant - can't be reassign
    // => They are static - variables belongs to interfaces, accessed via interface.variable
    // => variables should be assigned at declaration itself, because there is no constructor
    //    available in interface to assign them later

    public static final float PI = 3.14f;
//    private int x = 34; // throws compilation error
//    protected int y = 43; // throws compilation error
//    int l; // should initialize at declaration itself

    void run();
    void start();
    void stop();
    // 2. methods
    // => any method in interface without a body is public abstract by default
    public abstract int move();
//    private double jump(); // throws error
//    protected void jumps(); // throws error
}
