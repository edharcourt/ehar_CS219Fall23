package Day15Banish;
import Util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Banish {

    public static void remove(ArrayList<Integer> l, int target) {
        int i = l.indexOf(target);
        if (i == -1) return;
        l.remove(i);  // automatically shifts items to the left
    }

    public static void remove(int [] a, int target) {

        int i = Util.indexOf(a, target);
        if (i == -1) return;

        // shift all of the values starting at a[i] left
        for (int j = i; j < a.length - 1; j++) {
            a[j] = a[j+1];
        }

        // put a zero in the last item in the array
        a[a.length - 1] = 0;
    }  // remove

    public static void banish(int [] a1, int [] a2) {
        for (int v : a2)
            while (Util.indexOf(a1, v) >= 0)
                remove(a1, v);
    }

    public static void banish(ArrayList<Integer> a1,
                              ArrayList<Integer> a2) {
        for (int v : a2)
            while (a1.contains(v))
                remove(a1, v);
    }

    public static void main(String[] args) {
        int [] a1 = {4, 3, 9, 2};
        remove(a1, 9);
        System.out.println(Arrays.equals(a1, new int [] {4, 3, 2, 0}));
        remove(a1, 99);
        System.out.println(Arrays.equals(a1, new int []{4, 3, 2, 0}));
        remove(a1, 4);
        System.out.println(Arrays.equals(a1, new int[]{3, 2, 0, 0}));

        // test removing the last item in the array
        a1[a1.length - 1] = 99;
        remove(a1, 99);
        System.out.println(Arrays.equals(a1, new int[]{3, 2, 0, 0}));

        // Tests for banish
        int [] a1a = {42, 3, 9, 42, 42, 1, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 7, 1};
        int [] a2 = {42, 9, 2222};
        banish(a1a, a2);
        System.out.println(Arrays.toString(a1a));

        // Test removing from an ArrayList
        ArrayList<Integer> al1 = new ArrayList<>();
        int [] a1b = {42, 3, 9, 42, 42, 1, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 7, 1};
        for(int v : a1b)
            al1.add(v);
        remove(al1, 42);
        System.out.println(al1.toString());
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int v : a2)
            al2.add(v);
        banish(al1, al2);
        System.out.println(al1);

    } // main

}
