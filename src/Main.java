public class Main {

    public static void main(String[] args) {
        Car[] car = {
                new Car("Polo", "VW", 2016),
                new Car("535xd", "BMW", 2011),
                new Car("Corola", "Toyota", 2009)

        };
        car[0].carInfo();
        car[1].carInfo();
        car[2].carInfo();
        car[0].setMake("Volkswagen");
        car[0].carInfo();
    }

}
