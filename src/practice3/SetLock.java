package practice3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SetLock<T> implements Set<T> {
    private final Set<T> set = new HashSet<>();
    private final Lock lock = new ReentrantLock();


    @Override
    public int size() {
        lock.lock();
        try {
            return set.size();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return set.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        try {
            return set.contains(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Iterator<T> iterator() {
        lock.lock();
        try {
            return set.iterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        try {
            return set.toArray();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        lock.lock();
        try {
            return set.toArray(a);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean add(T t) {
        lock.lock();
        try {
            return set.add(t);
        } finally {
            lock.unlock();
        }

    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        try {
            return set.remove(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        try {
            return set.containsAll(c);
        } finally {
            lock.unlock();
        }    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        lock.lock();
        try {
            return set.addAll(c);
        } finally {
            lock.unlock();
        }    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lock.lock();
        try {
            return set.retainAll(c);
        } finally {
            lock.unlock();
        }    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lock.lock();
        try {
            return set.removeAll(c);
        } finally {
            lock.unlock();
        }    }

    @Override
    public void clear() {
        lock.lock();
        try {
            set.clear();
        } finally {
            lock.unlock();
        }
    }
}
