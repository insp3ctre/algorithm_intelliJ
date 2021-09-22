package homework;

public class LinkedDictionary<K, V> implements Dictionary<K, V> {

    /**
     * Creates a new Dictionary using the LinkedList structure
     */
    private class Node {
        K key;
        V value;
        Node next;

        Node(Object key, Object value, Node next) {
            this.key = (K) key;
            this.value = (V) value;
            this.next = next;
        }
    }

    /**
     * Initializes the front node
     */
    private Node front;

    /**
     * Gets the value at a specific location key
     * @param key the location you wish to find the value of
     * @return the value at the inputted location
     */
    @Override
    public Object get(Object key) {
        for (Node n = front; n != null; n = n.next) {
            if (n.key.equals(key)) {
                return n.value;
            }
        }
        return null;
    }

    /**
     * Check if the Dictionary is empty
     * @return True if empty and False if not empty
     */
    @Override
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Add a new value into the list at location key.
     * Also calls the remove method if the value is null
     * @param key the specific location to place the value into
     * @param value the value to be placed into location key
     */
    @Override
    public void put(Object key, Object value) {
        for (Node n = front; n != null; n = n.next) {
            if (n.key.equals(key)) {
                if (value != null) {
                    n.value = (V) value;
                    return;
                } else {
                    remove(key);
                }
            }

        }
        if (value != null) {
            front = new Node(key, value, front);
        }
    }

    /**
     * Removes the key from the list
     * @param key the location to be removed
     */
    public void remove(Object key) {
        if (front == null) {
            return;
        } else if (front.key.equals(key)) {
            front = front.next;
        } else {
            for (Node p = front; p.next != null; p = p.next) {
                Node n = p.next;
                if (n.key.equals(key)) {
                    p.next = n.next;
                    return;
                }
            }
        }
    }
}