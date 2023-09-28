package HW5;

public class HW5 {

    /**
     * Remove punctuation from a string. Punctuation is defined as any character
     * that is not a letter or a number or a space. The function should return a new string.
     * For example, if the input string is "Hello, World!!!" the function should
     * return "Hello World".
     * @param s
     * @return
     */
    public static String removePunctuation(String s) {
        return "";
    }

    /**
     * Convert a string to lower case. Without using the built-in function
     * toLowerCase. The function should return a new string.
     * For example, if the input string is "Hello, World!!!" the function should
     * return "hello, world!!!".
     *
     * @param s - the string being converted to lower case
     * @return the string s converted to lower case
     */
    public static String toLowerCase(String s) {
        return "";
    }

    public static void main(String[] args) {

        System.out.println(removePunctuation("Hello, World!!!").equals("Hello World"));
        System.out.println(removePunctuation("Hello World").equals("Hello World"));
        System.out.println(removePunctuation("!@#$%^&*()-_+=").equals(""));

        System.out.println(toLowerCase("Hello, World!!!").equals("hello, world!!!"));
        System.out.println(toLowerCase("Hello World").equals("hello world"));
        System.out.println(toLowerCase("!@#$%^&*()-_+=").equals("!@#$%^&*()-_+="));


    }
}
