package PartsAndSuppliers;

import java.util.ArrayList;

public interface PartsInterface {
   Part findByPno(int pno);
   ArrayList<Part> findByName(String name);

   boolean insert(int pno, String name, double weight,
               String location, String color, double price);

   // Delete by the part number, and return the Part deleted.
   Part delete(int pno);
}
