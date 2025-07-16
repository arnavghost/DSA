package Hashs;
import java.util.*;

public class Hashmapcode1 {
    static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    static class HashMap<K, V> {
        private int n; // n-total no of nodes
        private int N; // N-buckets 
        private LinkedList<Node<K, V>>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key) {// value should lie between 0 to N-1 only
            int bi = key.hashCode();
            return Math.abs(bi) % N; // need a positive value always
        }

        private int searchinLL(K key, int bi) {
            LinkedList<Node<K, V>> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node<K, V>>[] oldbucket = buckets;
            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node<K, V>> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node<K, V> node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi); // data index in linked list 

            if (di == -1) { // when di=-1 key dosent exist 
                buckets[bi].add(new Node<>(key, value));
                n++;
            } else { // exist
                Node<K, V> node = buckets[bi].get(di);
                node.value = value;
            }

            double lamda = (double) n / N;
            if (lamda > 2.0) { // rehashing if lamda value exceed 
                rehash();
            }
        }

        public boolean conatinsKey(K key) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi); // data index in linked list 

            if (di == -1) { // when di=-1 key dosent exist 
                return false;
            } else { // exist
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi); // data index in linked list 

            if (di == -1) { // when di=-1 key dosent exist 
                return null;
            } else { // key exist
                Node<K, V> node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi); // data index in linked list 

            if (di == -1) { // when di=-1 key dosent exist 
                return null;
            } else { // exist
                Node<K, V> node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node<K, V>> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node<K, V> node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isempty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 120);
        map.put("US", 30);
        map.put("china", 150);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        System.out.println("\n--- Additional Tests ---");

// Check containsKey
System.out.println("Contains key 'india': " + map.conatinsKey("india"));
System.out.println("Contains key 'japan': " + map.conatinsKey("japan"));

// Get values
System.out.println("Value of 'china': " + map.get("china"));
System.out.println("Value of 'japan': " + map.get("japan")); // should return null

// Update a value
map.put("india", 130);
System.out.println("Updated value of 'india': " + map.get("india"));

// Remove a key
System.out.println("Removing key 'US': " + map.remove("US"));
System.out.println("After removal, contains key 'US': " + map.conatinsKey("US"));

// Check if empty
System.out.println("Is map empty: " + map.isempty());

// Add more values to test rehash
map.put("UK", 80);
map.put("Germany", 60);
map.put("France", 50);
map.put("Brazil", 70);
map.put("Australia", 40); // Should trigger rehash

// Print all keys after rehash
System.out.println("\nKeys after adding more countries (rehash test):");
ArrayList<String> updatedKeys = map.keySet();
for (String key : updatedKeys) {
    System.out.println(key + " -> " + map.get(key));
}

    }
}
