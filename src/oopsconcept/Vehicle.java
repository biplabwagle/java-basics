package oopsconcept;

public class Vehicle {

    //state
        private String brandName;
        private String modelName;
        private  String color;
        private boolean isElectric;
        private boolean isHybrid;
        private int modelYear;


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

    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    public void setIsHybrid(boolean isHybrid){
        this.isHybrid = isHybrid;
    }

    public String getBrandName(){
        return this.brandName;
    }
    public String getModelName(){
        return this.modelName;
    }
    public String getColor(){
        return this.color;
    }

    public boolean getIsElectric(){
        return this.isElectric;
    }

    public boolean getIsHybrid(){
        return this.isHybrid;
    }

    public int getModelYear(){
        return this.modelYear;
    }

}
