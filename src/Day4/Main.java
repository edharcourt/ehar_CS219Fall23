package Day4;

import Util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.investment(1,1,1,1));
        System.out.println(Util.investment(1,1,1,12));
        System.out.println(Util.investment(1,1,1,1e9));
        System.out.println(Util.investment(1,1,1,1e12));
        System.out.printf("%.2f\n",
                          Util.investment(1000,.05,1,12));

    }

}
