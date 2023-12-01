package PartsAndSuppliers;

import java.util.ArrayList;

public interface ShipmentsInterface {

    void printReport();

    // Return the Suppliers who are currently
    // shipping pname (part name)
    ArrayList<Supplier> findSuppliers(String pname);

    // sort the shipments by shipment weight
    void sortByWeight();
}
