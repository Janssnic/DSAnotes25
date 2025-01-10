public class Car extends Vehicle{


    public Car(String model,String make, int year){
        super(model, make, year, "motorized");
        super.setPrice(12345.0);

    }

    @Override
    public String soundWarning() {
        return "tUUUUUUt-tUUUUUUt";
    }

}
