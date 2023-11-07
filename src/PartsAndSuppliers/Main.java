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
    } // main
}  // Main
