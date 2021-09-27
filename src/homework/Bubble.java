package homework;

public class Bubble {
    /**
     * Sorts an array of comparables using the bubble sort method
     * @param b the array you wish to bubble sort
     */
    public static void sort(Comparable[] b) {
        Comparable temp;
        for (int c = 0; c < b.length; c++) {
            for (int n = 0; n < b.length-1; n++) {
                if (less(b[n+1], b[n])) {
                    exch(b, n, n+1);
                }
            }
        }
    }

    /**
     * Compare two comparables to see which is smaller
     * @param v a comparable
     * @param w a comparable
     * @return True if the comparable is smaller and False if it is not
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Swap the comparables
     * @param a a temporary object
     * @param i a comparable
     * @param j a comparable
     */
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
