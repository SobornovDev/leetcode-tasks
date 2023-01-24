package solutions.my_own_implementation.hash_map;

/**
 * @author : Sobornov Vladimir
 * @since : 18.01.2023
 **/
public class MyOwnHashMap <K, V> {
    static class Node <K, V> {
        private final K key;
        private V value;
        private Node<K, V> next;

        private Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        private K getKey() {
            return this.key;
        }

        private V getValue() {
            return this.value;
        }
        private void setValue(V value) {
            this.value = value;
        }

        private Node<K, V> getNext() {
            return this.next;
        }

        private void setNext(Node<K, V> node) {
            this.next = node;
        }
    }

    static class Segment {
        private static int count;
    }

    private final Node[] buckets;

    private Segment[] segments = new Segment[32];

    public MyOwnHashMap() {

        int INIT_CAPACITY = 3;
        buckets = new Node[INIT_CAPACITY];
    }
    public MyOwnHashMap(int capacity) {
        buckets = new Node[capacity];
    }

    public void put (K key, V value) {
        Node<K, V> node = new Node<>(key, value, null);

        int index =  (buckets.length - 1) & key.hashCode();

        Node<K, V> current = buckets[index];

        if (current == null) {
            buckets[index] = node;
        } else {
            while (current.getNext() != null) {
                if (current.getKey().equals(key)) {
                    current.setValue(value);
                    return;
                }
                current = current.getNext();
            }
            if (current.getKey().equals(key)) {
                current.setValue(value);
            } else {
                current.setNext(node);
            }
        }
    }

    public V get(K key) {
        int index = (buckets.length - 1) & key.hashCode();
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void delete(K key) {
        int index = (buckets.length - 1) & key.hashCode();

        Node<K, V> node = buckets[index];
        if (node.getKey().equals(key)) {
            buckets[index] = node.getNext();
            return;
        }
        while (node.getNext() != null) {
            if (node.getNext().getKey().equals(key)) {
                node.setNext(node.getNext().getNext());
                return;
            }
            node = node.getNext();
        }
    }



}
