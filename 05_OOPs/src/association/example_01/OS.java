package association.example_01;

public class OS {
    private String name;
    private int size;

    OS(String name, int size){
        this.name = name;
        this.size = size;
    }

    String getName(){
        return name;
    }

    int getSize(){
        return size;
    }
}
