public class Shirt extends Clothing implements IShoppable{

    double price;
    String brand;

    public Shirt(String brand, String color, double price){
        this.brand = brand;
        super.color = color;
        this.price = price;
        super.type = "shirt";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
}

