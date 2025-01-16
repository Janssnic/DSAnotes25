import java.util.Random;
import java.util.Scanner;

public class Dice {

    public void rollDice(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("(enter för ett nytt tal, q för att avsluta.)");
            String userInput = scanner.nextLine();
                System.out.printf("slumptal: %s\n", random.nextInt(1,100));
                if (userInput.equalsIgnoreCase("q")) {
                System.out.println("tack o hej!");
                System.exit(0);
            }

        }
    }
}
