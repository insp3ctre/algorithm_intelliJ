package homework;

public class Bubble {
    /**
     * Sorts an array of doubles using the bubble sort method
     * @param b the array you wish to bubble sort
     */
    public static void sort(Double[] b) {
        double temp;
        for (int c = 0; c < b.length; c++) {
            for (int n = 0; n < b.length-1; n++) {
                if (b[n] > b[n+1]) {
                    temp = b[n];
                    b[n] = b[n+1];
                    b[n+1] = temp;
                }
            }
        }
    }
}
