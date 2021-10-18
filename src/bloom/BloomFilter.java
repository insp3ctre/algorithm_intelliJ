/** Charlie Compton, Berto Gonzalez, Ross Miyabuchi, and Adam Schwarz **/

package bloom;

public class BloomFilter<S> {

    private long[] bitTable;
    public BloomFilter() {
        bitTable = new long[1024];
    }
    private static final int MASK = (1<<16)-1;

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
        for (long counter : bitTable) {
            long counter2 = counter;
            while (counter2 != 0) {
                bitCount++;
                counter2 = (counter2 - 1) & counter2;
            }
        }
        return bitCount;
    }
}