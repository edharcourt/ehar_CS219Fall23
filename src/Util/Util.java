package Util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
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

    /**
     * Compute the mean of the array of doubles vec
     * @param vec - the array of doubles
     * @return the mean
     */
    public static double average(double [] vec) {
        double sum = 0;

        // for i in range(len(vec)):
        // for each double v in the array vec
        // for v in vec:
        for (double v : vec) {
            sum = sum + v;
        }

        return sum/vec.length;
    }

    public static double median(double [] vec) {
        Arrays.sort(vec);

        // odd length vector
        if (vec.length % 2 == 1) {
            return vec[vec.length/2];
        }

        // the array has even length
        return (vec[vec.length/2] + vec[vec.length/2 + 1]) / 2;
    }

    // exercise 7.1

    /**
     * Return the index of target in the array a.
     * @param a - the array
     * @param target - the integer being searched for
     * @return -1 if target is not found
     */
    public static int indexOf(int[] a, int target) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String [] a, String target) {

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Write a function scale that scales each double
    // in an array of doubles by some factor f
    // without modifying the array aod.
    public static double [] scale(double [] aod, double f) {
        double [] ra = new double[aod.length];

        // allocate a new array or modify aod directly?
        for (int i = 0; i < aod.length; i++) {
            ra[i] = aod[i] * f;
        }
        return ra;
    }

} // class Util
