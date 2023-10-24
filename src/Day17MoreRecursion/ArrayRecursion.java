package Day17MoreRecursion;

public class ArrayRecursion {

    /**
     * Sum up the items in the array a starting from
     * index i.
     *
     * @param a - the array being summed
     * @param i - current location in the array a
     * @return the sum of the ints in the array a.
     */
    public static int sum(int [] a, int i) {

        // the array has no more items to sum.
        // i is past the end of the arry
        if (i == a.length)
            return 0;
        else
            return a[i] + sum(a, i+1);
    }

    public static void main(String[] args) {
        int [] arr = {4, 1, 9, 7, 3, 6};
        System.out.println(sum(arr, 0) == 30);
        System.out.println(sum(arr, 2) == 25);

    }


}
