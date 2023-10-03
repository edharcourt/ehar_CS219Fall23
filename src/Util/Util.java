package Util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Util {
    public static double c2f(double C) {
        return 32 + 9/5.0 * C;
    }

    public static double f2c(double F) {
        return 5/9.0 * (F - 32);
    }

    public static double investment(double c, double r,
                                    double t, double n) {
        return c * Math.pow(1 + r/n, t*n);
    }

    /*
     * Write a function to have the user enter a valid decimal
     * number (double) from the keyboard.  Return the double
     * the user entered.
     */
    public static double getDouble(String prompt) {
        Scanner in = new Scanner(System.in);

        boolean done = false;  // flag
        double c = 0;
        while (!done){
            System.out.print(prompt);

            if (in.hasNextDouble()) {
                c = in.nextDouble();
                done = true;
            } else {
                System.out.printf("Error, enter a number, you entered \"%s\"\n",
                        in.nextLine());
            }
        } // while
        return c;
    }  // getDouble

    /**
     *
     * @param path - Uniform Resource Locator
     * @return
     */
    public static Scanner openSite(String path) {
        try {
            URL url = new URL(path);
            Scanner s = new Scanner(url.openConnection().getInputStream());
            return s;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } // openSite

} // class Util
