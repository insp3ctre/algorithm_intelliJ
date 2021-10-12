package inclass;

public class matrix {

    static double[][] product(double[][] m, double[][] n) {
        double[][] o = new double[m.length][n[0].length];
        for (int counter = 0; counter < m.length; counter++) {
            for (int counter2 = 0; counter2 < n[0].length; counter2++) {
                for (int counter3 = 0; counter3 < m[0].length; counter3++) {
                    o[counter][counter2] += m[counter][counter3] * n[counter3][counter2];    
                }
            }
        }
        return o;
    }
}
