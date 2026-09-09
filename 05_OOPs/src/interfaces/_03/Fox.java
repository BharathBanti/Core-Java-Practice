package interfaces._03;

// An interface can't implements another interface
/*
Because if any class implementing an interface, then
that class should implement the body for the umimplemented
methods in that interface due to contract(standardization)
*/

//public interface Fox implements Egg{
//} // throws error

// But an interface can extend more than one interface
public interface Fox extends Egg{
    void jump();
    void sit();
}
