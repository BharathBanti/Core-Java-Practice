package association.example_02;

public class Bike {
    private String company;
    private int mileage;

    Bike(String company, int mileage){
        this.company = company;
        this.mileage = mileage;
    }

    String getCompany(){
        return company;
    }

    int getMileage(){
        return mileage;
    }
}
