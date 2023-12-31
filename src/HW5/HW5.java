package HW5;

public class HW5 {

    /**
     * Remove punctuation from a string. Punctuation is defined as any character
     * that is not a letter or a number or a space. The function should return a new string.
     * For example, if the input string is "Hello, World!!!" the function should
     * return "Hello World".
     *
     * Don't use the built-in functions that start with "is", such as
     * isLetterOrDigit, or isAlphabetic. Code these yourself. For example,
     * you can check if a character is a letter by making sure it is
     * between 'a' and 'z' or 'A' and 'Z'.
     *
     * @param s - the string we are removing the punctuation from.
     * @return - a new string with punctuation removed.
     */
    public static String removePunctuation(String s) {
        return "";
    }

    /**
     * Convert a string to lower case. Without using the built-in function
     * toLowerCase. The function should return a new string.  For example,
     * if the input string is "Hello, World!!!" the function should
     * return "hello, world!!!".
     *
     * @param s - the string being converted to lower case
     * @return the string s converted to lower case
     */
    public static String toLowerCase(String s) {
        return "";
    }

    public static void main(String[] args) {

        // Test removePunctuation
        System.out.println(removePunctuation("Hello, World!!!").equals("Hello World"));
        System.out.println(removePunctuation("Hello World").equals("Hello World"));
        System.out.println(removePunctuation("!@#$%^&*()-_+=").equals(""));

        // Test toLowerCase
        System.out.println(toLowerCase("Hello, World!!!").equals("hello, world!!!"));
        System.out.println(toLowerCase("Hello World").equals("hello world"));
        System.out.println(toLowerCase("!@#$%^&*()-_+=").equals("!@#$%^&*()-_+="));
    }
}
