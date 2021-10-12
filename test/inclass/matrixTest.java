package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class matrixTest {

    @Test
    void matrixProductWorksForRectangularMatrices() {
        double[][] m = {{1, 2, 3},
                {4, 5, 6}};
        double[][] n = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        double[][] expected = {{38, 44, 50, 56},
                {83, 98, 113, 128}};
        double[][] result = matrix.product(m, n);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }

    @Test
    void twoByTwoMatrixWorks() {
        double[][] m = {{1, 2}, {3, 4}};
        double[][] n = {{5, 6}, {7, 8}};
        double[][] expected = {{19, 22}, {43, 50}};
        double[][] result = matrix.product(m, n);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }

}
