public class Car extends Vehicle{


    public Car(String model,String make, int year){
        super.model = model;
        super.make = make;
        super.year = year;
        super.type = "motorized";
    }

    public void carInfo(){
        System.out.println(make + " " + model + " " + year);
    }


}
