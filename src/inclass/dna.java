package inclass;

public class dna {
    public static String count(String dna) {
        int a = 0, c = 0, g = 0, t = 0;

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                a++;
            } else if (dna.charAt(i) == 'C') {
                c++;
            } else if (dna.charAt(i) == 'G') {
                g++;
            } else if (dna.charAt(i) == 'T') {
                t++;
            }
        }
        return a + " " + c + " " + g + " " + t;
    }
}
