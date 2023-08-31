package Day3;

import java.util.Scanner;

import Util.*;

public class C2F {

    public static void main(String[] args) {

        // create a Scanner object that is tied
        // the keyboard. System.in is call "standard input"
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a value in degrees Celsius: ");
        double C = kbd.nextDouble();
        double F = Util.c2f(C);
        System.out.printf("Degrees Fahrenheit: %.2f\n", F);
    }
}
