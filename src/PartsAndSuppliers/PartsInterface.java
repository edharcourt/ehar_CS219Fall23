package PartsAndSuppliers;

import java.util.ArrayList;

public interface PartsInterface {

    /**
     * Insert a new part into the database and pno must not already exist
     * @param pno - the part number
     * @param name - the part name
     * @param weight - the part weight
     * @param location - the part location
     * @param color - the part color
     * @param price - the part price
     *
     * @return the part object that was inserted, null if there was an error
     */
    Part insertPart(int pno, String name, double weight, String location, String color, double price);

    /**
     * Delete a part from the database
     * @param pno
     * @return the part object that was deleted, null if there was an error
     */
    Part deletePart(int pno);

    /**
     * Update a part in the database
     * @param pno - the part number
     * @param name - the part name
     * @param weight - the part weight
     * @param location - the part location
     * @param color - the part color
     * @param price - the part price
     *
     * @return the part object that was updated, null if there was an error
     */
    Part updatePart(int pno, String name, double weight, String location, String color, double price);

    /**
     * Find a part by the part number
     * @param pno - the part number
     * @return the part object, null if not found
     */
    Part findByPno(int pno);

    /**
     * Find a part by the part name
     * @param name
     * @return an ArrayList of the parts that match the name. The ArrayList
     *        will be empty if no parts match the name.
     */
    ArrayList<Part> findByName(String name);
}
