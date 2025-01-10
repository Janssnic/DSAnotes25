public class Main {

    public static void main(String[] args) {
        Car[] car = {
                new Car("Polo", "VW", 2016),
                new Car("535xd", "BMW", 2011),
                new Car("Corola", "Toyota", 2009)

        };
        Bike bike = new Bike("mountain bike", "kilimanjaro");

        System.out.println(bike.getMake() + " " + bike.getModel() + " is " + bike.getType());
        System.out.println(bike.soundWarning());
        Shirt[] tshirt = {
                new Shirt("Everlast", "Blue", 49.99f),
                new Shirt("Gucci", "Yellow", 4999.99f),
                new Shirt("Supreme", "Olive", 149.99f)
        };
        Hoodie huppare = new Hoodie("Off white", "White", 1299.99f);

        //System.out.println(huppare.getBrand() + " " + huppare.getColor() + " " + huppare.getPrice() + " " + huppare.getType());

        for(int i = 0; i<=2; i++){
            System.out.println(car[i].getMake() + " " + car[i].getModel()+ " " + car[i].getYear() + " is " + car[i].getType());
            System.out.printf("%s kostar %.2f\n", car[i].getModel(), car[i].getPrice());
            //System.out.println(tshirt[i].getBrand() + " " + tshirt[i].getColor() + " " + tshirt[i].getPrice() + " " + tshirt[i].getType());
            System.out.println(car[i].soundWarning());
        }




    }

}
