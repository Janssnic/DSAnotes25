import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] data = {"ZywOo", "NiKo", "device", "coldzera", "shox", "kennyS", "electroNic", "dupreeh", "gla1ve", "XANTARES", "f0rest", "olofmeister", "rain", "Stewie2k", "Magisk", "m0nesy", "B1T", "ropz", "Nivera", "Karrigan", "jks", "huNter-", "BOOMBL4", "ALEX", "frozen", "Krimz", "NBK-", "ApeX", "flameZ", "screaM", "YEKINDAR", "Perfecto", "mantuu", "sunPayus"};


        Stacky stacky = new Stacky(5);
        stacky.push(data[0]);
        stacky.push(data[1]);
        stacky.push(data[2]);
        stacky.push(data[3]);
        stacky.push(data[4]);
        //stacky.push(data[5]);
        System.out.println(stacky.toString());

        Linky linky = new Linky();
        Person p1 = new Person(data[0]);
        Person p2 = new Person(data[1]);
        Person p3 = new Person(data[2]);
        Person p4 = new Person(data[3]);

        linky.add(p1);
        linky.add(p2);
        linky.add(p3);
        linky.add(p4);
        System.out.println(linky.toString());
        System.out.println(linky.size());

        Queey queey = new Queey();
        queey.enQueue(data[0]);
        queey.enQueue(data[1]);
        queey.enQueue(data[2]);
        queey.enQueue(data[3]);
        System.out.println(queey.toString());
        System.out.println("dequeue " + queey.dequeue());
        System.out.println(queey.Peek());

        /*
        String[] weekdays = {"monday","tuesday", "wednesday", "thursday", "friday","saturday","sunday"};
        int today = 3;
        int numberOfdays = 20;
        System.out.printf("today is %s: \n", weekdays[today]);
        System.out.printf("in %s days, its %s ", numberOfdays, weekdays[(today + numberOfdays) % weekdays.length]);
        */

        /*Person p1 = new Person(data[0]);
        Person p2 = new Person(data[1], p1);
        Person p3 = new Person(data[2], p2);
        Person p4 = new Person(data[3], p3);

        System.out.println(p4.getName());
        Person current = p4;
        while(current != null){
            System.out.println(current.getName());
            current = current.next;
        }*/

        /*StringArray names = new StringArray(data);
        System.out.println(names.toString());
        names.add("s1mple");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());

        System.exit(0);
        //time complexity test
        new BigO();
        */
    }
}
