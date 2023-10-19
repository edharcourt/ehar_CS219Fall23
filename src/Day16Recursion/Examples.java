package Day16Recursion;

public class Examples {
    /**
     *
     * @param x - any integer
     * @param y - must be non-negative
     * @return x raised to the y power
     */
    public static int pow(int x, int y) {
        // base case
        if (y == 0)
            return 1;

        return x * pow(x, y - 1);
    }

    public static int powiter(int x, int y) {
        int result = 1;

        for(int i = 0; i < y; i++)
            result *= x;  // result = result * x

        return result;
    }

    /**
     * Compute the sum of the digits in n
     * @param n - n is non-negative
     * @return
     */
    public static int sod(int n) {
        if (n == 0)
            return 0;

        return sod(n/10) + (n % 10);
    }

    public static int count7s(int n) {
        if (n == 0)
            return 0;
        else if (n % 10 == 7)
            return 1 + count7s(n/10);
        else
            return count7s(n/10);
    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3) == 8);
        System.out.println(pow(10,0) == 1);
        System.out.println(pow(2, 10) == 1024); // 1K

        System.out.println(sod(1234) == 10);
        System.out.println(count7s(7077567) == 4);
        System.out.println(reverse("hogwarts").equals("strawgoh"));
    }
}
