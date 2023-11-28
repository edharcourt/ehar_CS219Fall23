package PartsAndSuppliers;

public class ShipmentsMain {

    public static void main(String[] args) {
        Parts parts = new Parts();
        Suppliers suppliers = new Suppliers();
        Shipments shipments = new Shipments(parts, suppliers);
        //System.out.println(shipments);
        shipments.printReport();
    }
}
