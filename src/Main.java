import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Hopper,Grace";
        System.out.println(Math.floorMod(-25,15));
        System.out.println(-25 % 15);
        //Scanner s = new Scanner(System.in);
        //int x = s.nextInt();
        //String c_or_f = s.nextLine();
        //System.out.println(x + "----" + c_or_f.strip());
        System.out.println(Math.floorMod(-76,11));
        System.out.println("banana".compareTo("apple") > 0);
        System.out.println("Hermione said, \"Don't \\forget\\ to say \"expelliarmus\"");
        ArrayList<Integer> aloi = new ArrayList<>();
        aloi.add(6);
        System.out.println(aloi);
        aloi.remove(aloi.size() - 1);
        aloi.set(aloi.size() - 1, aloi.get(aloi.size() - 1) + 2);
        System.out.println(aloi);
        System.out.println("Hermione said, \"Don't \\forget\\ to say \"expelliarmus\".");
    }
}