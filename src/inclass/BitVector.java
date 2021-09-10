package inclass;

public class BitVector {

    private int data;

    boolean get(int i) {
        return ((data >>> i) & 1) == 1;
    }

    public void set(int i) {
        data = data | (1 << i);
    }

    public void unset(int i) {
        data = data & ~(1 << i);
    }
}
