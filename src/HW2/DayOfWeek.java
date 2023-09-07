package HW2;

import java.util.Scanner;

public class DayOfWeek {
    // return 0 through 6
    public static int dayofweek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month day and year separated by spaces: ");
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        System.out.println(dayofweek(month, day, year));
    }
}
