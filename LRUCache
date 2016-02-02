import java.util.LinkedHashMap;

public class LRUCache {
    
    private LinkedHashMap<Integer, Integer> cache = null;
    private int capacity = 0;
    private float loadFactor = 0.75f;
    private boolean accessOrder = true;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity, loadFactor, accessOrder);
    }
    
    public int get(int key) {
        if (cache.get(key) != null) return cache.get(key);
        return -1;
    }
    
    public void set(int key, int value) {
        if (cache.size() == capacity && cache.get(key) == null){
            Set<Integer> keys = cache.keySet();
            Iterator<Integer> itr = keys.iterator();
            cache.remove(itr.next());
        }
        cache.put(key, value);
        
    }
}
