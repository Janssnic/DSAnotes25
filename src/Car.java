public class Car {
    private String model, make;
    private int year;

    public Car(String model,String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }

    private String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(int year){
        this.year = year;
    }
    public void carInfo(){
        System.out.println(make + " " + model + " " + year);
    }


}
