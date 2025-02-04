import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] data = {"ZywOo", "NiKo", "device", "coldzera", "shox", "kennyS", "electroNic", "dupreeh", "gla1ve", "XANTARES", "f0rest", "olofmeister", "rain", "Stewie2k", "Magisk", "m0nesy", "B1T", "ropz", "Nivera", "Karrigan", "jks", "huNter-", "BOOMBL4", "ALEX", "frozen", "Krimz", "NBK-", "ApeX", "flameZ", "screaM", "YEKINDAR", "Perfecto", "mantuu", "sunPayus"};

        StringArray names = new StringArray(data);
        System.out.println(names.toString());
        names.add("s1mple");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());

        System.exit(0);
        //time complexity test
        new BigO();

    }
}
