package PartsAndSuppliers;

import java.util.Comparator;

public class ShipmentWeightComparator
        implements Comparator<Shipment> {

    @Override
    public int compare(Shipment s1, Shipment s2) {

        // Compute the weights of shoipments 1 and 2
        double ws1 = s1.getQty() * s1.getPart().getWeight();
        double ws2 = s2.getQty() * s2.getPart().getWeight();

        if (ws1 < ws2)
            return -1;
        else if (ws1 > ws2)
            return 1;
        else
            return 0;

    }
}
