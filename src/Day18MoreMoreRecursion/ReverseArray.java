package Day18MoreMoreRecursion;

import java.util.ArrayList;

public class ReverseArray {

    /**
     * Swap that items at aot[i] and aot[j].
     * TODO Write some tests for swap
     * @param aot
     * @param i
     * @param j
     */
    public static <T> void swap(T [] aot, int i, int j) {
        // T in Java is called a "Generic"
        T tmp = aot[i];
        aot[i] = aot[j];
        aot[j] = tmp;
    }

    public static <T> void swap(ArrayList<T> alt, int i , int j) {
        T tmp = alt.get(i);
        alt.set(i, alt.get(j));
        alt.set(j, tmp);
    }

    public static <T> void reverse(ArrayList<T> alt, int i, int j) {
        if (i < j) {
            swap(alt, i, j);
            reverse(alt, i+1, j-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("CS140");
        als.add("CS219");
        als.add("CS220");
        als.add("CS256");
        System.out.println(als);
        reverse(als, 0, als.size() - 1);
        System.out.println(als);
    }



}
