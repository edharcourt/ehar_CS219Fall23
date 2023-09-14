package Day5_conditionals;

import java.util.Random;

public class Dice {

    public static void roll_dice(Random r) {
        int d1 = r.nextInt(1,7);
        int d2 = r.nextInt(1, 7);

        // snake eyes
        if (d1 == 1 && d2 == 1) {
            System.out.println("Snake eyes!");
        }

        // another way to check for snake eyes
        if (d1 == 1) {
            if (d2 == 1) {
                System.out.println("Snake eyes!");
            }
        }

        // one of the dice is not a one
        if (d1 == 1) {
            if (d2 == 1) {
                System.out.println("Snake eyes!");
            }
            else {
                System.out.println("not snake eyes");
            }
        }
        else {
            System.out.println("not snake eyes");
        }

        // one of the dice is not a one
        if (d1 != 1 || d2 != 1) {
            System.out.println("not snake eyes");
        }

        if (!(d1 == 1) || !(d2 == 1)) {
            System.out.println("not snake eyes");
        }

        // at least one 1
        if (d1 == 1 || d2 == 1) {
            System.out.println("at least one one");
        }

        // one and only one one
        if ((d1 == 1 && d2 != 1) || (d1 != 1 && d2 == 1)) {
            System.out.println("only one one");
        }

        // check if d1 is between 2 and 5 including 2 and 5
        // 2 <= d1 <= 5  valid Python but not valid Java
        if (2 <= d1 && d1 <= 5) {
            System.out.println("d1 is between 2 and 5 inclusive");
        }

        // is a < b the same thing as b > a




    } // roll_dice

    public static void main(String[] args) {

        // create a random number generator object
        Random rng = new Random();

        // simulate tossing a single die
        int d1 = rng.nextInt(6) + 1;

        if (d1 == 1) {
            System.out.println("one");
        }
        else {
            System.out.println("not one");
        }

        // toss another die
        d1 = rng.nextInt(1,7);
        if (d1 == 1) {
            System.out.println("one");
        }
        else if (d1 == 2) {
            System.out.println("two");
        }
        else if (d1 == 3) {
            System.out.println("three");
        }
        else if (d1 == 4) {
            System.out.println("four");
        }
        else if (d1 == 5) {
            System.out.println("five");
        }
        else {
            System.out.println("six");
        }

        roll_dice(rng);


    }  // main
}  // class Dice