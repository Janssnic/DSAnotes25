import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("mountain bike", "kilimanjaro"));
        shop.addBike(new Bike("BMX", "kilimanjaro"));
        shop.addBike(new Bike("race bike", "Insera"));

        shop.getBike(0).addFeatures("suspension", "hardtail");
        shop.getBike(0).addFeatures("wheel size", "29inch");
        ArrayList<Bike> bikes = shop.getBikes();
        for (int i = 0; i < shop.getBikeCount(); i++){
            System.out.println(shop.getBike(i).getMake() + " " + shop.getBike(i).getModel());
            //System.out.printf("%s %.2f € lagersaldo : %s", shop.getBike(i).getMake(), shop.getBike(i).getModel());
        }
        System.out.println(shop.getBike(0).getFeatures());

        Car[] car = {
                new Car("Polo", "VW", 2016),
                new Car("535xd", "BMW", 2011),
                new Car("Corola", "Toyota", 2009)

        };

        //System.out.println(bike.getMake() + " " + bike.getModel() + " is " + bike.getType());
        //System.out.println(bike.soundWarning());
        Shirt[] tshirt = {
                new Shirt("Everlast", "Blue", 49.99 * 2 / 3),
                new Shirt("Gucci", "Yellow", 4999.99),
                new Shirt("Supreme", "Olive", 149.99)
        };
        Hoodie huppare = new Hoodie("Off white", "White", 1299.99f);

        //System.out.println(huppare.getBrand() + " " + huppare.getColor() + " " + huppare.getPrice() + " " + huppare.getType());

        for (int i = 0; i <= 2; i++) {
            //System.out.println(car[i].getMake() + " " + car[i].getModel()+ " " + car[i].getYear() + " is " + car[i].getType());
            //System.out.printf("%s kostar %.2f\n", car[i].getModel(), car[i].getPrice());
            //System.out.println(tshirt[i].getBrand() + " " + tshirt[i].getColor() + " kostar: " + tshirt[i].getPrice() + " typ: " + tshirt[i].getType() + " lagersaldo: " + tshirt[i].getStock());
            //System.out.printf("%s kostar %.2f €, lagersaldo: %d\n", tshirt[i].getBrand(),tshirt[i].getPrice(), tshirt[i].getStock());
            //System.out.println(car[i].soundWarning());
            String shirtInfo = String.format("%s kostar %.2f €, lagersaldo: %d", tshirt[i].getBrand(), tshirt[i].getPrice(), tshirt[i].getStock());
            System.out.println(shirtInfo);
        }


    }

}
