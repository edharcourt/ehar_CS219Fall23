package Util;

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
}
