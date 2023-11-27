package PartsAndSuppliers;

import java.util.ArrayList;

public interface SuppliersInterface {

    /**
     * Supplier numbers are unique. There should only be one supplier
     * with a given supplier number.
     *
     * @param sno - supplier number
     * @return the Supplier object for the sno, null if not found.
     */
    Supplier findBySno(int sno);

    /**
     * Supplier names are not unique.
     * @param name
     * @return An array list of supplier objects that match the name.
     * Case insensitive.
     */
    ArrayList<Supplier> findByName(String name);

    /**
     * Insert a new supplier into the database.
     * @param sno
     * @param name
     * @param status
     * @param city
     * @return true if insert successful false if sno already exists.
     */
    boolean insert(int sno, String name, int status, String city);

    Supplier delete(int sno);

}
