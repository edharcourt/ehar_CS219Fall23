package PartsAndSuppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Shipments implements ShipmentsInterface {

    private ArrayList<Shipment> shipments;
    private Parts parts;
    private Suppliers suppliers;

    public Shipments(Parts parts, Suppliers suppliers) {
        this.parts = parts;
        this.suppliers = suppliers;

        this.shipments = new ArrayList<>();
        Scanner s = null;

        try {
            s = new Scanner(
                  new File(
                  "src/PartsAndSuppliers/shipments.csv"));       }
        catch (FileNotFoundException e) {
            throw new RuntimeException();
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] pieces = line.split(",");
            int pno = Integer.parseInt(pieces[0].trim());
            int sno = Integer.parseInt(pieces[1].trim());
            int qty = Integer.parseInt(pieces[2].trim());

            Shipment ship = new Shipment(
                                  qty,
                                  parts.findByPno(pno),
                                  suppliers.findBySno(sno));
            shipments.add(ship);
        }
    }

    @Override
    public String toString() {
        // create string with one shipment per line

        String r = "";

        for (Shipment s: shipments) {
            r = r + s + "\n";
        }
        return r;

        //return "Shipments{" +
        //        "shipments=" + shipments +
        //        '}';
    }

    @Override
    public void printReport() {
        for (Shipment s: this.shipments) {
            String sname = s.getSupplier().getName();
            int sno = s.getSupplier().getSno();
            String pname = s.getPart().getName();
            int pno = s.getPart().getPno();
            int qty = s.getQty();
            System.out.printf("%10s | %4d | %10s | %4d | %4d\n",
                              sname, sno, pname, pno, qty);
        }
    }
}  // Shipments class
