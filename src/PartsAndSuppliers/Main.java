package PartsAndSuppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Parts parts = new Parts();
        System.out.println(parts);  // DEBUG

        // Test find part 3
        System.out.println(parts.findByPno(3));
        System.out.println(parts.findByPno(99));
        System.out.println(parts.findByName("screw"));

        // insert a part at the beginning
        // TODO insert now returns a boolean and we should check it.
        parts.insert(0, "chair",
                20, "B109", "gray", 75);
        System.out.println(parts);

        // insert at the end
        parts.insert(50, "wheel", 10, "J Lot",
                "black", 50);
        System.out.println(parts);

        // insert in the middle
        parts.insert(40, "desk", 500, "Sykes 2621",
                "pink", 1000);
        System.out.println(parts);

        // make sure we can not insert a duplicate pno
        boolean code = parts.insert(1, "hammer", 2,
                "B105-1", "red", 10);
        if (!code)
            System.out.printf("Part number %d already exists\n", 1);

        // delete part at beginning
        Part x = parts.delete(0);
        System.out.println(parts);
        System.out.println(x);

        // delete part in middle
        x = parts.delete(5);
        System.out.println(parts);
        System.out.println(x);

        // delete part at end
        x = parts.delete(50);
        System.out.println(parts);
        System.out.println(x);

        // delet non-existant part
        x = parts.delete(99);
        System.out.println(x);

        // The Object class with a capital "O"
        Integer z = 5;  // Integer z = new Integer(5);
        Object o = new String("Hello");

    } // main
}  // Main
