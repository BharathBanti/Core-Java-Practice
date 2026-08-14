package association.example_02;

public class Main {
    public static void main(String[] args){
        Student student = new Student();

        System.out.println(student.brain.getColour());
        System.out.println(student.brain.getWeight());
        System.out.println(student.heart.getBpm());
        System.out.println(student.heart.getWeight());

        Bike bike = new Bike("Royal Enfield", 40);
        Book book = new Book("Mahabharatham", "Sri Valmiki");
        student.hasABike(bike);
        student.hasABook(book);
    }
}
