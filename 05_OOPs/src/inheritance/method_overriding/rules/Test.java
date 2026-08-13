package inheritance.method_overriding.rules;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Vehicle v = new Car();
        v.service(); // correctly overridden
        v.inspect(); // this is a static method, so it is from return type class i.e., Vehicle
        v.registration(); // this is a final method, it can't be overridden. So, it is from Vehicle
        v.className(); // correctly overridden
    }
}
