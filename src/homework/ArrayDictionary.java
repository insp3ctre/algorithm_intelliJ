package homework;

public class ArrayDictionary<K, V> implements Dictionary<K, V>{

    private K[] keys;
    private V[] values;
    private int size;

    /**
     * Creates a new Dictionary using the ArrayList structure
     */
    public ArrayDictionary() {
        keys = (K[]) new Object[1];
        values = (V[]) new Object[1];
    }

    /**
     * Finds the value of the array at a specific spot
     * @param key the location in the array you would like the value of
     * @return the value at location key
     */
    @Override
    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    /**
     * Determines whether or not the array is empty
     * @return True if empty and False if not empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds a new value to a new key into the array and expands the array if it is not big enough.
     * Also calls the remove method if the new value is null
     * @param key the location in the array where the value will be placed
     * @param value the value to be placed into the array at location key
     */
    @Override
    public void put(Object key, Object value) {
        if (value == null) {
            remove(key);
            return;
        }
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = (V) value;
            }
        }
        expandIfNecessary();
        keys[size] = (K) key;
        values[size] = (V) value;
        size++;
    }

    /**
     * Removes a key and value from their respective arrays
     * @param key the location where the array needs have a spot deleted
     */
    public void remove(Object key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                keys[i] = keys[size-1];
                values[i] = values[size-1];
                size--;
                return;
            }
        }
    }

    /**
     * Doubles the size of the arrays to allow for more values to be added
     */
    private void expandIfNecessary() {
        if (size == keys.length) {
            K[] stretchedKeys = (K[])new Object[size*2];
            V[] stretchedValues = (V[])new Object[size*2];
            for (int i = 0; i < size; i++) {
                stretchedKeys[i] = keys[i];
                stretchedValues[i] = values[i];
            }
            keys = stretchedKeys;
            values = stretchedValues;
        }
    }
}