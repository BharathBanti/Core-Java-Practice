package association.example_02;

public class Heart {
    private double weight;
    private int bpm;

    Heart(double weight, int bpm){
        this.weight = weight;
        this.bpm = bpm;
    }

    double getWeight(){
        return weight;
    }

    int getBpm(){
        return bpm;
    }
}
