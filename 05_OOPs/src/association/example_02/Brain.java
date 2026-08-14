package association.example_02;

public class Brain {
    private double weight;
    private String colour;

    Brain(double weight, String colour){
        this.weight = weight;
        this.colour = colour;
    }

    double getWeight(){
        return weight;
    }

    String getColour(){
        return colour;
    }
}
