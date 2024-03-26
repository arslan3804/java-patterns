package practice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;


public class MapSemaphore<K, V> implements Map<K, V> {
    private final Map<K, V> map = new HashMap<>();

    private final Semaphore semaphore;

    public MapSemaphore(int n){
        this.semaphore = new Semaphore(n);
    }

    @Override
    public int size() {
        try {
            semaphore.acquire();
            return map.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return map.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return true;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            return map.containsKey(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }    }

    @Override
    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            return map.containsValue(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }    }

    @Override
    public V get(Object key) {
        try {
            semaphore.acquire();
            return map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            semaphore.acquire();
            return map.put(key, value);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public V remove(Object key) {
        try {
            semaphore.acquire();
            return map.remove(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }    }

    @Override
    public void putAll(Map m) {
        try {
            semaphore.acquire();
            map.putAll(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<K> keySet() {
        try {
            semaphore.acquire();
            return map.keySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Collection<V> values() {
        try {
            semaphore.acquire();
            return map.values();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        try {
            semaphore.acquire();
            return map.entrySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }
}
