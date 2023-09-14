package Day6;

import java.util.Scanner;
import Util.Util;

public class Main {

    /*
        Write a function to have the user enter a valid decimal
        number (double) from the keyboard.  Return the double
        the user entered.
     */
    public static double getTemperature() {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        double c = 0;
        while (!done){
            System.out.print("Please enter a temp in celsius: ");

            if (in.hasNextDouble()) {
                c = in.nextDouble();
                done = true;
            } else {
                System.out.printf("Error, enter a number, you entered \"%s\"\n",
                        in.nextLine());
            }
        } // while
        return c;
    }


    public static void main(String[] args) {

        double c = getTemperature();
        System.out.printf("%.1f in Celsius is %.1f Fahrenheit", c, Util.c2f(c));

    } // main
}  // class Main
