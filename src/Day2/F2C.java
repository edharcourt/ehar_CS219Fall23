package Day2;

import Util.*;

import java.util.Scanner;

public class F2C {

    public static void main(String[] args) {
        // Create a keyboard object
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a temp in Fahrenheit: ");
        double f = kbd.nextDouble();
        System.out.println(Util.f2c(f));
    }

}
