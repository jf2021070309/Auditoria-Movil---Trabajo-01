package rx.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes4.dex */
public class SynchronizedQueue<T> implements Cloneable, Queue<T> {
    private final Queue<T> a;
    private final int b;

    public SynchronizedQueue() {
        this.a = new LinkedList();
        this.b = -1;
    }

    public SynchronizedQueue(int i) {
        this.a = new LinkedList();
        this.b = i;
    }

    @Override // java.util.Collection
    public synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Collection
    public synchronized int size() {
        return this.a.size();
    }

    @Override // java.util.Queue, java.util.Collection
    public synchronized boolean add(T t) {
        return this.a.add(t);
    }

    @Override // java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.Collection
    public synchronized void clear() {
        this.a.clear();
    }

    public synchronized String toString() {
        return this.a.toString();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((SynchronizedQueue) obj).a);
    }

    @Override // java.util.Queue
    public synchronized T peek() {
        return this.a.peek();
    }

    @Override // java.util.Queue
    public synchronized T element() {
        return this.a.element();
    }

    @Override // java.util.Queue
    public synchronized T poll() {
        return this.a.poll();
    }

    @Override // java.util.Queue
    public synchronized T remove() {
        return this.a.remove();
    }

    @Override // java.util.Queue
    public synchronized boolean offer(T t) {
        boolean z;
        if (this.b <= -1 || this.a.size() + 1 <= this.b) {
            z = this.a.offer(t) ? true : true;
        }
        z = false;
        return z;
    }

    public synchronized Object clone() {
        SynchronizedQueue synchronizedQueue;
        synchronizedQueue = new SynchronizedQueue(this.b);
        synchronizedQueue.addAll(this.a);
        return synchronizedQueue;
    }

    @Override // java.util.Collection
    public synchronized Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Collection
    public synchronized <R> R[] toArray(R[] rArr) {
        return (R[]) this.a.toArray(rArr);
    }
}
