package inclass;

public class BitVector {

    private int data;

    boolean get(int i) {
        return ((data >>> i) & 1) == 1;
    }
}
