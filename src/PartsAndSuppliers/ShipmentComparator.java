package PartsAndSuppliers;

import java.util.Comparator;

public class ShipmentComparator implements Comparator<Shipment> {
    @Override
    public int compare(Shipment t1, Shipment t2) {
        if (t1.getQty()*t1.getPart().getWeight() <
                t2.getQty()*t2.getPart().getWeight())
            return -1;
        else if (t1.getQty()*t1.getPart().getWeight() >
                t2.getQty()*t2.getPart().getWeight())
            return 1;
        else
            return 0;

    }
}
