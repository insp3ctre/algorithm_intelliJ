package inclass;

public class iterate {
    public static int pattern(String small, String big) {
        int j;
        for (int i = 0; i < big.length() - small.length() + 1; i++) {
            for (j = 0; j < small.length(); j++) {
                if (!(small.charAt(j) == big.charAt(i+j))) {
                    break;
                }
            }
            if (j == small.length()) {
                return i;
            }
        }
        return -1;
    }
}
