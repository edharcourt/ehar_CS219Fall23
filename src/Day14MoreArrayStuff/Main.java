package Day14MoreArrayStuff;

import Util.Util;

import java.util.Arrays;

public class Main {

    public static boolean double_trouble(String s) {
        int[] f = new int[26];
        s = s.toLowerCase();

        // counts the number of times each character
        // occurs in s
        for (char ch : s.toCharArray())
            f[ch - 'a']++;

        for (int x : f) {
            if (x != 2 && x != 0) {
                return false;
            }
        }

        return true;
    }

    // return true if there is no repeated digit in x
    // no_repeated_digit(12345) == true
    // no_repreated_digit(123454) == false
    public static boolean no_repeated_digit(int x) {
        return false; // shut up error message
    }

    public static void main(String[] args) {
        double [] a = {1,2,3,4,5};
        double avg = Util.average(Util.scale(a, 1.05));
        System.out.println(Arrays.toString(a));

        System.out.println(double_trouble("esophagographers"));
        System.out.println(double_trouble("esophagographer"));
    }
}
