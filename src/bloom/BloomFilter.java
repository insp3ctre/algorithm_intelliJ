package bloom;

public class BloomFilter<S> {

    private BloomFilter<S> filter;


    public long hashCode(String s) {
        long sum = 0;
        char ch[];
        ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            sum += ch[i];
        }
        return sum % 10;
    }

    public void add(String s) { //marking proper bit as 1, website % = bit to turn on
        long variable = 0;
        variable = hashCode(s);

    }

    public boolean mightContain(String s) { //check if bit is on


        return false;
    }

    public long trueBits() { //just count them

        return -1;
    }
}
