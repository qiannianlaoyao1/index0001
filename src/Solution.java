import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LRUCache {

    private Map<Integer,Integer> m ;
    private int len ;
    private int len1 ;

    public LRUCache(int capacity) {
        new LinkedHashMap<>(capacity);
        len = capacity;
        len1 = 0;
    }

    public int get(int key) {
        return m.get(key);
    }

    public void put(int key, int value) {
        if(len == len1){
            
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */