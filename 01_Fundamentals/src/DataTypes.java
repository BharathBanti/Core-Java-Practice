class Sample{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
}

public class DataTypes {
    public static void main(String[] args){
        /* ----------Data Types---------- */

//        Local Variables - no default values assigned
        byte a = 23;
        short b = 252;
        int c = 6343;
        long d = 487872387L;
        float e = 9844.57444387f;
        double f = 9874389.874387387;
        char g = 'c';
        boolean h = true;

        System.out.println("Local Variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

//        Instance Variables - default values are assigned
//        System.out.println("Instance Variables");
//        Sample s = new Sample();
//        System.out.println(s.a); // 0
//        System.out.println(s.b); // 0
//        System.out.println(s.c); // 0
//        System.out.println(s.d); // 0
//        System.out.println(s.e); // 0.0
//        System.out.println(s.f); // 0.0
//        System.out.println(s.g); // '' empty character
//        System.out.println(s.h); // false

//        Printing the MIN and MAX values of byte, short, int and long
//        System.out.println("Ranges of byte, short, int and long");
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);

//        System.out.println("For Float and Double");
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.NaN);
//        System.out.println(Double.POSITIVE_INFINITY);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 2L);

        float deci = 9849539.1989498398f;
        double deci2 = 9849539.1989498398;
        System.out.println(deci);
        System.out.println(deci2);
    }
}
