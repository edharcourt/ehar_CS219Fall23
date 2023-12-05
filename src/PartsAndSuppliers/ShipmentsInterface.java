package PartsAndSuppliers;

import java.util.ArrayList;

public interface ShipmentsInterface {

    void printReport();

    // Return the Suppliers who are currently
    // shipping pname (part name)
    ArrayList<Supplier> findSuppliers(String pname);

    // sort the shipments by shipment weight
    void sortByWeight();

    /**
     * Find the shipments coming from a supplier who's status is
     * greater than or equal to status.
     *
     * @param status
     * @return An array list of shipment
     */
    ArrayList<Shipment> findShipmentsByStatus(int status);
}
