package PartsAndSuppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pno = 33;
        String name = "bolt";
        double weight = 1.2; //grams
        String location = "Madstop";
        String color = "red";
        double price = 1.53; // US dollars

        // calling the Part Constructor
        Part p1 = new Part(33, "bolt", 1.2,
                "Madstop", "red", 1.53);

        Part p2 = new Part(22, "gear", .5, "Hamburg",
                "gray", .25);

        System.out.println(p1);
        System.out.println(p2);

        p1.increasePrice(.1);
        p2.increasePrice(.1);

        ArrayList<Part> parts = new ArrayList<>();
        Scanner s;
        try {
            s = new Scanner(new File("parts.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] pieces = line.split(",");
            Part p = new Part(Integer.parseInt(pieces[0]),
                    // name, weight, location, color;
        }



    }
}
