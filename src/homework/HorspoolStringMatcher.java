package homework;

public class HorspoolStringMatcher {

    private String pattern;
    private int length;
    private int[] t;

    /**
     * Constructor for the algorithm with the pattern, the length of the pattern,
     * and the table of values of each letter
     * @param s the pattern we are searching for
     */
    public HorspoolStringMatcher(String s) {
        this.pattern = s;
        this.length = s.length();
        this.t = preprocess();
    }

    /**
     * Setup the values for each letter
     * @return table of correct values
     */
    public int[] preprocess() {
        int table[] = new int[256];
        for (int i = 0; i < 256; i++) {
            table[i] = length;
        }
        for (int i = 0; i < length - 1; i++) {
            table[pattern.charAt(i)] = length - 1 - i;
        }
        return table;
    }

    /**
     * Get the amount that the search needs to shift
     * @param c character in the alphabet
     * @return value associated with the letter
     */
    public int getShift(char c) {
        int shift = t[c];
        return shift;
    }

    /**
     * Computes whether the pattern matches the string
     * @param s string we are searching in
     * @return where the match occurs or -1 if no match
     */
    public int match(String s) {
        for (int i = s.length() - length; i >= 0; i--) {
            if (s.startsWith(pattern, i)) {
                return i;
            }
            i -= getShift(s.charAt(i)) - 1;
        }
        return -1;
    }
}
