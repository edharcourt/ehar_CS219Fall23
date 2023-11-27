package PartsAndSuppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Suppliers implements SuppliersInterface {

    private ArrayList<Supplier> suppliers;

    public Suppliers() {
        // array of objects
        this.suppliers = new ArrayList<>();

        Scanner s;
        try {
            s = new Scanner(new File("src/PartsAndSuppliers/suppliers.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] pieces = line.split(",");
            Supplier p = new Supplier(
                    Integer.parseInt(pieces[0].trim()),   // sno
                    pieces[1].trim(),              // name
                    Integer.parseInt(pieces[2].trim()),   // status
                    pieces[3].trim());             // price
            suppliers.add(p);
        }  // while
    }  // constructor

    @Override
    public Supplier findBySno(int sno) {
        for (Supplier p : this.suppliers)
            if (p.getSno() == sno)
                return p;

        return null;
    }

    @Override
    public ArrayList<Supplier> findByName(String name) {
        ArrayList<Supplier> suppliers = new ArrayList<>();

        for (Supplier s : this.suppliers)

            if (s.getName().toLowerCase().contains(name.toLowerCase()))
                suppliers.add(s);

        return suppliers;
    }

    public boolean insert(int sno, String name, int status, String city) {
        // make sure pno does not already exist
        if (findBySno(sno) != null)
            return false;

        Supplier p = new Supplier(sno, name, status, city);

        int i = 0;

        // increment i until it is at the correct location
        while (i < suppliers.size() && suppliers.get(i).getSno() < sno)
            i++;

        suppliers.add(i, p);
        return true;

    }

    public Supplier delete(int sno) {
        Supplier p = findBySno(sno);
        if (p == null)
            return null;

        suppliers.remove(p);
        return p;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "suppliers=" + suppliers +
                '}';
    }
} // Suppliers