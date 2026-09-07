package object_class_methods;

import java.util.Objects;

class Person {
    String name;
    int age;


    @Override
    public String toString(){
        return name + " - " + age;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
