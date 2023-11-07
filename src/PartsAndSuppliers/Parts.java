package PartsAndSuppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parts {

    private ArrayList<Part> parts;

    public Parts() {
        // array of objects
        this.parts = new ArrayList<>();
        Scanner s;
        try {
            s = new Scanner(new File("src/PartsAndSuppliers/parts.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] pieces = line.split(",");
            Part p = new Part(
                    Integer.parseInt(pieces[0]),   // pno
                    pieces[1].trim(),                     // name
                    Double.parseDouble(pieces[3]), // weight
                    pieces[4].trim(),              // location
                    pieces[2].trim(),              // color
                    0);                            // price
            parts.add(p);
        }  // while
    }  // constructor

    @Override
    public String toString() {
        return "Parts{" +
                "parts=" + parts +
                '}';
    }

    // search for a part by the part number
    // Return null if the part is not found
    public Part findByPno(int pno) {
        for (Part p : this.parts)
            if (p.getPno() == pno)
                return p;

        return null;
    }

    // search for a part by the part name
    // return ????? is no parts for with that name
    public ArrayList<Part> findByName(String name) {
        ArrayList<Part> parts = new ArrayList<>();

        for (Part p : this.parts)

            // TODO Make this a little more general
            // where what we're looking for is a
            // substring of the actual part name
            if (p.getName().equalsIgnoreCase(name))
                parts.add(p);
        return parts;
    }

} // class Parts
