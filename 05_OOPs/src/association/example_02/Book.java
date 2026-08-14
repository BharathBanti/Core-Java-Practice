package association.example_02;

public class Book {
    private String name;
    private String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    String getName(){
        return name;
    }

    String getAuthor(){
        return author;
    }
}
