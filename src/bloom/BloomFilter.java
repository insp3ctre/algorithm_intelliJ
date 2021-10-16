package bloom;

public class BloomFilter<S> {

   // private long[] bitTable = new long[1024];
    private static final int MASK = (1<<16)-1;

    private long[] bitTable;
    public BloomFilter() {
        bitTable = new long[1024];
    }

    public long hashCode(S object) {
        int hashCode = object.hashCode();
        return hashCode;
    }

    public void addBit(int key) {
        bitTable[key/64] |= 1L << (key % 64);
    }

    public void add(S object) {
        int hashCode = object.hashCode();
        addBit(hashCode & MASK);
        addBit((hashCode >>> 16) & MASK);
    }

    public boolean containsBit(int key) {
        return ((bitTable[key / 64] & (1L << (key % 64))) != 0);
    }

    public boolean mightContain(S object) {
        int hashCode = object.hashCode();
        return containsBit(hashCode & MASK) && containsBit((hashCode >>> 16) & MASK);
    }

    public long trueBits() {
        int bitCount = 0;
        for (int i = 0; i < 1024; i++) {
            if (bitTable[i] != 0) {
                bitCount++;
            }
        }
        return bitCount;
    }
}