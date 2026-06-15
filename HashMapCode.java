import java.util.*;

public class HashMapCode {

    static class HashMap<K, V> {

        private class Node {
            K key;  // key stored in the node for example "India"
            V value; // value stored in the node for example 30

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes // these are variables 
        private int N; // number of buckets // varieables are used to store the number of nodes and number of buckets in the hash map
        private LinkedList<Node>[] buckets; // array of linked list to store the nodes in the hash map

        @SuppressWarnings("unchecked")
        public HashMap() { // this is an constructor to initialize the hash map
            this.N = 4; // lenth of the buckets array
            this.buckets = new LinkedList[N]; // to initialize the buckets array with linked list

            for (int i = 0; i < N; i++) { // to initialize the linked list in the buckets array     
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) { // hash funcation is used to calculate the bucket index for the given key and values 
            int bi = key.hashCode(); // hash code is a method in java that returns an integer value for the given key and value and this integer value is used to calculate the bucket index for the given key and value
            return Math.abs(bi) % N; // converts the positive value from negative value if any present 
        }

        private int searchInLL(K key, int bi) { // to itterates thorugh one LL 
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;

            N = 2 * N;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { 
            int bi = hashFunction(key); // used to find the bucket index 
            int di = searchInLL(key, bi); //nused to search within the bucket 

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++; // to increase the number of nodes in the hash map
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            return buckets[bi].get(di).value;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].remove(di);
            n--;

            return node.value;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();

        map.remove("India");

        System.out.println(map.get("India")); // null
    }
}