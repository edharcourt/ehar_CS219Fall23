package Day6;

import java.util.Scanner;
import Util.Util;

public class Main {



    public static void main(String[] args) {

        double c = Util.getDouble("Enter a temperature in celsius: ");
        System.out.printf("%.1f in Celsius is %.1f Fahrenheit", c, Util.c2f(c));

    } // main
}  // class Main
