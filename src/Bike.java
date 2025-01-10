public class Bike extends Vehicle{
    public Bike(String model, String make) {
        super(model, make, 2025, "pedaled");
    }
    @Override
    public String soundWarning() {
        return "pling-pling";
    }

}
