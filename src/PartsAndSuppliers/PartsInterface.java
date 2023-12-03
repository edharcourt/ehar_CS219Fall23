package PartsAndSuppliers;

import java.util.ArrayList;

public interface PartsInterface {
   Part findByPno(int pno);
   ArrayList<Part> findByName(String name);

   boolean insert(int pno, String name, double weight,
               String location, String color, double price);

   // Delete by the part number, and return the Part deleted.
   Part delete(int pno);

   /**
    * Return an array list of parts ordered by the part weight. Don't
    * modify the this.parts, create a new array list, sort it by
    * weight, and then return a reference to it.
    *
    * @return
    */
   ArrayList<Part> orderByWeight();
}
