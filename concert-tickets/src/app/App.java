package app;

import java.util.Scanner;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Thank you, " + name);

        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Big Theif", 5);
        m.put("Post Malone", 20);
        m.put("Band", 15);
        m.put("MeM", 25);
        System.out.println("What band? Would you like to see?");

        for (Map.Entry<String, Integer> entry : m.entrySet()) {

            System.out.println("Artist: " + entry.getKey() + " | Price: " + entry.getValue());
        }

        String chosenBand = input.next();
        input.close();

        if (chosenBand == "Post Malone") {
            System.out.println("Thanks");
        } else {
            System.out.println("Ok");
        }

    }
}