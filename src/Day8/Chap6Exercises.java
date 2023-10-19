package Day8;

public class Chap6Exercises {

    public static boolean isAbcedarian(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++)
            if (word.charAt(i) > word.charAt(i+1))
                return false;
        return true;
    }  // isAbcedarian

    public static boolean canSpell(String word, String tiles) {

        for (int i = 0; i < word.length(); i++) {
            int j = tiles.indexOf(word.charAt(i));

            if (j == -1)
                return false;

            // delete the character at position j in tiles
            tiles = tiles.substring(0, j) +
                    tiles.substring(j+1);
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(canSpell("boot", "zqioxbto"));
        System.out.println(canSpell("box", "zqioxbto"));
        System.out.println(canSpell("to", "zqioxbto"));
        System.out.println(canSpell("too", "zqioxbto"));
        System.out.println(!canSpell("toot", "zqioxbto"));

        System.out.println(isAbcedarian("biopsy"));
        System.out.println(isAbcedarian("aegilops"));
        System.out.println(!isAbcedarian("apple"));
        System.out.println(isAbcedarian("aqqxyz"));
        System.out.println(isAbcedarian(""));
        System.out.println(isAbcedarian("z"));
        System.out.println(isAbcedarian("ap"));
    }
}
