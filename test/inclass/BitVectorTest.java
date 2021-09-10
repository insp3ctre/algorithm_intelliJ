package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitVectorTest {

    @Test
    void initialBitIsOff() {
        BitVector v = new BitVector();
        assertFalse(v.get(7));
    }

    @Test
    void setsBit() {
        BitVector v = new BitVector();
        v.set(4);
        assertTrue(v.get(4));
    }

    @Test
    void unsetBit() {
        
    }

}