package association.example_02;

public class Student {
    // Composition
    Heart heart = new Heart(33.4, 65);
    Brain brain = new Brain(54.43, "Red");

    // Aggregation
    void hasABike(Bike bike){
        System.out.println(bike.getCompany());
        System.out.println(bike.getMileage());
    }
    void hasABook(Book book){
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
