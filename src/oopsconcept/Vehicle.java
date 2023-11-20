package oopsconcept;

public class Vehicle {

    //state
        String brandName;
        String modelName;
        String color;
        boolean isElectric;
        boolean isHybrid;
        int modelYear;


    //behavior
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }

    public void isElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    public void isHybrid(boolean isHybrid){
        this.isHybrid = isHybrid;
    }
}
