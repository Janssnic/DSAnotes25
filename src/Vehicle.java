public class Vehicle {
    private String model, make;
    private int year;
    private String type;
    private double price = 0.0;
    private double discount = 0.90;

    public Vehicle(String model, String make, int year, String type) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.type = type;

    }

    public String soundWarning(){
        return "none";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price * discount;
    }

    public void setPrice(double price) {
        if(price < 0) throw new RuntimeException("bad price");
        this.price = price;
    }
}
