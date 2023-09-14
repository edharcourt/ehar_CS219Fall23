package Day7;

public class LoopExercises {


    /*
     *  count the number of times the digit d appears
     *  in n.
     *  precondition: n >= 0 && 0 <= d <= 9
     */
    public static int countd(int n, int d) {
        int count = 0;

        while (n > 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }  // countd

    // compute the checksum of a non-negative number n
    public static int checksum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum % 10;
    }

    public static int sum3or5(int n) {
        int sum = 0;
        int i = 0;

        // change this while loop to a for loop
        while (i < n) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
            i++;
        } // while
        return sum;
    } // sum3or5

    public static void main(String[] args) {
        System.out.println(checksum(4973) == 3);
        System.out.println(countd(1727337, 7) == 3);
        System.out.println(countd(1234, 7) == 0);
        System.out.println(countd(777777, 7) == 6);
        System.out.println(countd(123445, 4) == 2);
        System.out.println(sum3or5(10) == 23);
        System.out.println(sum3or5(1000) == 233168);
    } // main
}
