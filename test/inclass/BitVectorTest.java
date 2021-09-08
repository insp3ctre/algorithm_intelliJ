package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitVectorTest {

    @Test
    void initialBitIsOff() {
        BitVector v = new BitVector();
        assertFalse(v.get(7));
    }

}