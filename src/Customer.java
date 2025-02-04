public class Customer {
    private double funds;
    private Bike currentBike;

    public Customer(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    public void setCurrentBike(Bike currentBike) {
        this.currentBike = currentBike;
    }
}
