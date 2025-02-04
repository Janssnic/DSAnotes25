import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] data = {"ZywOo", "NiKo", "device", "coldzera", "shox", "kennyS", "electroNic", "dupreeh", "gla1ve", "XANTARES", "f0rest", "olofmeister", "rain", "Stewie2k", "Magisk", "m0nesy", "B1T", "ropz", "Nivera", "Karrigan", "jks", "huNter-", "BOOMBL4", "ALEX", "frozen", "Krimz", "NBK-", "ApeX", "flameZ", "screaM", "YEKINDAR", "Perfecto", "mantuu", "sunPayus"};

        Person p1 = new Person(data[0]);
        Person p2 = new Person(data[1], p1);
        Person p3 = new Person(data[2], p2);
        Person p4 = new Person(data[3], p3);

        System.out.println(p4.getName());
        Person current = p4;
        while(current != null){
            System.out.println(current.getName());
            current = current.next;
        }

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
