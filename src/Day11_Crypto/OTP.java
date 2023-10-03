package Day11_Crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class OTP {

    // lowercase English alphabet a - z
    public static String E(String clear, int key, boolean enc) {
        String cipher = "";
        SecureRandom r;

        // Secure Hash Algorithm Pseudo Random Number Generator
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error in random number generator");
            throw new RuntimeException(e);
        }

        r.setSeed(key);

        for (int i = 0; i < clear.length(); i++) {
            char clear_ch = clear.charAt(i);
            int clear_ch_pos = clear_ch - ' ';
            int cipher_char_pos;

            if (enc) {
                cipher_char_pos =
                        Math.floorMod(clear_ch_pos + r.nextInt(), '~' - ' ' + 1);
            }
            else {
                cipher_char_pos =
                        Math.floorMod(clear_ch_pos - r.nextInt(), '~' - ' ' + 1);
            }
            char cipher_ch = (char) (cipher_char_pos + ' ');
            cipher = cipher + cipher_ch;
        }
        return cipher;
    } // E

    public static void main(String[] args) {
        System.out.println(E("Attack! at dawn.", 1, true));
        System.out.println(E("dy3pV^Ub0~SpL\\dA", 1, false));
    }
}
