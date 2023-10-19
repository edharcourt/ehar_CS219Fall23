package Day12;

import java.util.Arrays;
import java.util.Scanner;
import Util.Util;
public class SwallowSpeed {

    public static double [] loadSpeeds(Scanner s) {
        double [] speeds = new double[18];
        int i = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();

            if (!line.isBlank()) {
                if (line.indexOf('#') == -1) {
                    speeds[i] = Double.parseDouble(line);
                    i = i + 1;
                }
            }
        } // while
        return speeds;
    }

    public static double average(Scanner s) {
        double sum = 0;
        int i = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();

            if (!line.isBlank()) {
                if (line.indexOf('#') == -1) {
                    sum = sum + Double.parseDouble(line);
                    i = i + 1;
                }
            }
        } // while
        return sum / i;
    } // average

    // The function average(double [] vec) is overloaded
    // with the function average(Scanner s)

    public static void main(String[] args) {
        Scanner site = Util.openSite(
         "https://scipython.com/static/media/problems/P4.1/swallow-speeds.txt");

        double [] vec = loadSpeeds(site);
        System.out.println(Arrays.toString(vec));
        //System.out.printf("%.1f\n", average(site));
        System.out.printf("Mean: %.2f\n", Util.average(vec));
        System.out.printf("Median: %.2f\n", Util.median(vec));

        // DEBUG median issues with Gunnar and Foster
        System.out.println(Arrays.toString(vec));
        System.out.println(vec.length);
        System.out.println(vec[vec.length / 2]);
        System.out.println(vec[vec.length / 2 + 1]);

    }

}
