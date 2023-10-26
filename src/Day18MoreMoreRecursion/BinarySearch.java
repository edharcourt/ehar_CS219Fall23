package Day18MoreMoreRecursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import Util.*;

public class BinarySearch {

    // In sample exam i and j wewre called left and right
    public static <T extends Comparable<T>> int bsearch(ArrayList<T> als,
                                                     T target,
                                                     int i, int j) {
        // base case
        if (i > j)
            return -1;

        // Check to see if the midpoint is the target
        int mid = (i + j) / 2;
        if (als.get(mid).equals(target))
            return mid;
        else if (als.get(mid).compareTo(target) < 0)
            return bsearch(als, target, mid + 1, j);
        else
            return bsearch(als, target, i, mid - 1);
    }

    public static void main(String[] args) {
        Scanner s = Util.openSite(
        "http://10.32.10.70:8000/wordle-nyt-allowed-guesses.txt");

        ArrayList<String> words = new ArrayList<>();

        while (s.hasNextLine()) {
            words.add(s.nextLine().strip());
        }

        System.out.println(bsearch(words, "zorro", 0, words.size() - 1));
    }

}
