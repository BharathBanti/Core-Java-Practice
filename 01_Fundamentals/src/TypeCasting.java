public class TypeCasting {
    public static void main(String[] args) {
        // widening
        // byte -> short -> int -> long -> float -> double

        // 1. int -> double
        int a = 3445;
        double b = a;
        System.out.println(b);

        // 2. char -> int
        char c = 'g';
        int d = c;
        System.out.println(d);

        // 3. int -> long
        int e = 9843;
        long f = e;
        System.out.println(f);

        // 4. float -> double
        float g = 98754.3984f;
        double h = g;
        System.out.println(h);

        // 5. byte -> int
        byte i = 45;
        int j = i;
        System.out.println(i);

        // narrowing
        // double -> float -> long -> int -> short -> byte

        // 1. double -> int
        double k = 4538.323;
        int l = (int) k;
        System.out.println(l);

        // 2. float -> int
        float m = 498.49843f;
        int n =  (int) m;
        System.out.println(n);

        // 3. long -> int
        long o = 9843L;
        int p = (int) o;
        System.out.println(p);

        // 4. int -> byte
        int q = 132;
        byte r =  (byte) q;
        System.out.println(r);

        // 5. double -> byte
        double s = 349.984;
        byte t = (byte) s;
        System.out.println(t);

        // Overflow
        // int -> byte (overflow)
        int u = 134;
        byte v = (byte) u;
        System.out.println(v);
    }
}
