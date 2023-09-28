package Day11_Crypto;

public class Caesar {

    // lowercase English alphabet a - z
    public static String E(String clear, int shift) {
        String cipher = "";

        for (int i = 0; i < clear.length(); i++) {
            char clear_ch = clear.charAt(i);
            int clear_ch_pos = clear_ch - ' ';
            int cipher_char_pos =
                    Math.floorMod(clear_ch_pos + shift, '~' - ' ' + 1);
            char cipher_ch = (char) (cipher_char_pos + ' ');
            cipher = cipher + cipher_ch;
        }
        return cipher;
    } // E

    public static void main(String[] args) {
        System.out.println(E("Attack! at dawn.", 1));
        System.out.println(E("Buubdl\"!bu!ebxo/", -1));
    }
}
