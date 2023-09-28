package Day9;

import java.util.Scanner;

public class MoreLoopExercises {

    public static int getTemp() {
        Scanner s = new Scanner(System.in);
        for (;;) {  // don't do this
            if (s.hasNextInt()) {
                return s.nextInt();
            }
            else {
                // error message
            }
        }
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i > -1; i--) {
            // + is string concatenation
            // reversed = s.charAt(i) + reversed;
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome2(String s) {
        return reverse(s).equalsIgnoreCase(s);
    }

    public static boolean isPalindromNumber(int n) {
        int reversed = 0;
        int tmp = n;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            reversed = reversed * 10 + digit;
        }
        return reversed == tmp;
    }

    public static void main(String[] args) {
        System.out.println("Test isPalindrome");
        System.out.println(isPalindrome("kayaK"));
        System.out.println(isPalindrome("RacEcar"));
        System.out.println(isPalindrome("ablewasiereisawelba"));
        System.out.println(isPalindrome("gohangasalamiimalasagnahog"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("Abba"));
        // Think about negative tests

        System.out.println("Test reverse");
        System.out.println(reverse("kayaK").equals("Kayak"));
        System.out.println(reverse("").equals(""));
        System.out.println(reverse("a").equals("a"));
        System.out.println(!reverse("kayaK").equals("kayak"));
    }

}
