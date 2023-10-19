package HW7;

public class HW7 {

    /**
     * Pretend the multiplication key on your keyboard is broke
     * (the * key).  Write a recursive function mult(x,y) that returns
     * the value of x multiplied by y. For example,
     *
     * mult(5, 4) is 20.
     *
     * You can assume x and y are non-negative.
     *
     * Hint: 5*4 is  5 + 5 + 5 + 5.
     *
     * Remember, only use Java constructs we have used in class.
     * If your code is getting a little too whacky, then you are
     * probably on the wrong path.
     *
     * @param x - multiplicand
     * @param y - multiplier
     * @return the value of x multiplied by y
     */
    public static int mult(int x, int y) {
        return 0; // shut up error message
    }

    /**
     * Write a recursive function isPalindrome that returns
     * true if s is a palindrome. For example,
     *
     *  isPalindrome("kayak") == true
     *  isPalindrome("apple") == false
     *
     *  Do not call the string function reverse.
     *
     *  Hint: Think recursively. If a string is a palindrome
     *  what should be true about the first and last characters in
     *  the string? What should be true about the middle of the string
     *  between the first and last characters?
     *
     * @param s
     * @return true if s is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        return false;  // shut up error message
    }

    /**
     * Write a function removeSpaces that returns the string s
     * with the spaces removed. For example,
     *
     * removeSpaces("Attack At       Dawn!") should return "AttackAtDawn"
     *
     * removeSpaces("Hello") should return "Hello".
     *
     * @param s - the string we are removing the spaces from
     * @return - s with the spaces removed
     */
    public static String removeSpaces(String s) {
        return "";  // shut up error message
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("kayak"));
        System.out.println(!isPalindrome("apple"));
        System.out.println(removeSpaces("Attack At    Dawn!").equals("AttackAtDawn!"));
        System.out.println(removeSpaces("Apple").equals("Apple"));
        System.out.println(removeSpaces("").isEmpty());
        System.out.println(mult(5,4) == 20);
        System.out.println(mult(0,4) == 0);
        System.out.println(mult(5,0) == 0);
        System.out.println(mult(5,1) == 5);
    }

}  // HW7
