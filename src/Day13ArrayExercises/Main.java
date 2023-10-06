package Day13ArrayExercises;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    // Write a function that takes a string of words separated by
    // a space and reverses the words in the string.
    // Return an array of the words reversed.
    public static String [] reverse_words(String s) {
        String [] words = s.split(" ");

        // Allocate a new empty array of strings
        // of the same length as words
        //String [] rv = new String[words.length];
        //for (int i = words.length - 1; i >= 0; i--) {
        //    rv[words.length - i - 1] = words[i];
        //}

        for (int i = 0; i < words.length/2; i++) {
            // swap words[i] with words[words.length - i - 1]
            String tmp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = tmp;
        }

        return words;
    }

    /**
     * Prints aod to the console formatted [2, 2.1, 4.0, -6.23]
     * Without calling Arrays.toString
     * @param aod
     */
    public static void printDoubles(double [] aod) {
        System.out.print('[');
        for (int i = 0; i < aod.length - 1; i++) {
            System.out.printf("%.2f, ", aod[i]);
        }
        System.out.printf("%.2f", aod[aod.length - 1]);
        System.out.println(']');
    }

    // A generic function to reverse an array of strings
    public static String [] reverse(String [] aos) {
        return null; // null is the empty object TODO
    }

    public static void main(String[] args) {
        String s = "A problem by Tim";
        System.out.println(Arrays.toString(reverse_words(s)));

        double [] aod = {3.14, 2.1, 5.6, 7.0};
        printDoubles(aod);
    }
}
