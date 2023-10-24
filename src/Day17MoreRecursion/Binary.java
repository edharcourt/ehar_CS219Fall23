package Day17MoreRecursion;

public class Binary {

    public static String toBinary(int n) {
        if (n == 0)
            return "0";
        else
            return toBinary(n/2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(7));
        System.out.println(toBinary(1023));

        int n = 19;  // decimal notation is the default
        int m = 0b111; // 7
        System.out.println(n + m);
        int p = 0xFF17; // base 16 hexadecimal

        String s = Integer.toBinaryString(7);
        int z = Integer.parseInt("45");
        int w = Integer.parseInt("45", 2);

    }

}
