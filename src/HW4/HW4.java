package HW4;

public class HW4 {

    /*
     * Return the first factor of n greater than 1
     * and less than n. If no factors are found return -1.
     * Notice that this function uses longs and not ints.
     * We will talk about this in class.
     *
     *  factor(25) = 5
     *  factor(59953793) == 7727
     *  factor(1531482031) == -1
     *  factor(7304692485435694493L) == -1;
     *
     * Question: Notice the letter L on the end of the largest integer above?
     *           Any guess of what it means or why it is there?  What happens if you
     *           remove it?
     */
    public static long factor(long n) {
        return -1;
    }

    /*
     *   perfect number
     *
     *   A perfect number is a number that is equal to the sum of its divisors that
     *   are less than the number. For example, 6 is a perfect number
     *   because 6 = 1 + 2 + 3 and 1,2,3 are the divisors.
     *
     *   28 is also a perfect number because 28 = 1 + 2 + 4 + 7 + 14 and 1,2,4,7,14 are the only
     *   divisors of 28.
     *
     *   Write a function named perfect that takes an integer n and returns true if n
     *   is a perfect number, and false if it is not.
     *
     *   perfect(28) == true
     *   perfect(496) == true
     *   perfect(99) == false
     */
    public static boolean perfect(int n) {
        return false;
    }

    /*
     * The function double_trouble returns true if each character
     * in the string s appears exactly twice. For example, "Abba"
     * has two a's and two b's, so it returns true. "appeases" has
     * two a's, two p's, two e's, and two s's, so it returns true.
     *
     * The word kayak is not double_trouble because it has only one 'y'.
     */
    public static boolean double_trouble(String word) {
        return false;
    }

    /*
     * Thoroughly test all of your functions above.
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.printf("%d: %b\n", i++, factor(25) == 5);
        System.out.printf("%d: %b\n", i++, factor(59953793) == 7727);
        System.out.printf("%d: %b\n", i++, factor(1531482031) == -1);

        System.out.printf("%d: %b\n", i++, perfect(28));
        System.out.printf("%d: %b\n", i++, perfect(496));
        System.out.printf("%d: %b\n", i++, !perfect(99));

        System.out.printf("%d: %b\n", i++, double_trouble("Abba"));
        System.out.printf("%d: %b\n", i++, double_trouble("appeases"));
        System.out.printf("%d: %b\n", i++, double_trouble("esophagographers"));
        System.out.printf("%d: %b\n", i++, !double_trouble("kayak"));
    } // main
} // class HW4