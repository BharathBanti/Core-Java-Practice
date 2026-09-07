package constructors.constructor_chaining;

public class PersonMain {
    public static void main(String[] args){
        Person person = new Person(34, 45.6);
        Person person1 = new Person();
        Person person2 = new Person("banti");
        Person person3 = new Person("banti", 23, 56.6);
        Person person4 = new Person("banti", 23, 56.6, false);
    }
}
