package PartsAndSuppliers;

public class Shipment {

    private int qty;    // quantity should be >= 0
    private Part p;     // a reference to a part
    private Supplier s; // a reference to a supplier

    public Shipment(int qty, Part p, Supplier s) {
        this.qty = qty;
        this.p = p;
        this.s = s;
    }

    public int getQty() {
        return qty;
    }

    public Part getPart() {
        return p;
    }

    public Supplier getSupplier() {
        return s;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "qty=" + qty +
                ", p=" + p +
                ", s=" + s +
                '}';
    }
}  // Shipment class