package MyHashMap;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MyHashMap <K,V> {

    public class Node<K,V> {
        private Node<K,V> next;
        private K key;
        private V value;

        public Node(Node<K, V> next, K key, V value) {
            this.next = next;
            this.key = key;
            this.value = value;
        }

        public Node() {
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


    private int size = 8;
    private Node<K,V> table[] = new Node[size];

    public MyHashMap(){

    }

    public MyHashMap(int size){
        this.size = size;
        table = new Node[size];
    }

    public void put(K key,V value){
        int x = getIndex(key);
        Node<K,V> m = table[x];
        for(;m.next!=null;m = m.next){
            if(m.getKey() == key|| m.getKey().equals(key)){
                m.setValue(value);
            }
        }

        table[x] = new Node<K, V>(m,key,value);
    }

    public int getIndex(K key){
        return key.hashCode()&(size-1);
    }


    public static void main(String[] args) {
    }
}
