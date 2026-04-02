package ch.qos.logback.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class COWArrayList<E> implements List<E> {
    public final E[] modelArray;
    public E[] ourCopy;
    public AtomicBoolean fresh = new AtomicBoolean(false);
    public CopyOnWriteArrayList<E> underlyingList = new CopyOnWriteArrayList<>();

    public COWArrayList(E[] eArr) {
        this.modelArray = eArr;
    }

    private boolean isFresh() {
        return this.fresh.get();
    }

    private void markAsStale() {
        this.fresh.set(false);
    }

    private void refreshCopy() {
        this.ourCopy = (E[]) this.underlyingList.toArray(this.modelArray);
        this.fresh.set(true);
    }

    private void refreshCopyIfNecessary() {
        if (isFresh()) {
            return;
        }
        refreshCopy();
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        this.underlyingList.add(i2, e2);
        markAsStale();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e2) {
        boolean add = this.underlyingList.add(e2);
        markAsStale();
        return add;
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        boolean addAll = this.underlyingList.addAll(i2, collection);
        markAsStale();
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll = this.underlyingList.addAll(collection);
        markAsStale();
        return addAll;
    }

    public void addIfAbsent(E e2) {
        this.underlyingList.addIfAbsent(e2);
        markAsStale();
    }

    public E[] asTypedArray() {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.underlyingList.clear();
        markAsStale();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.underlyingList.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.underlyingList.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i2) {
        refreshCopyIfNecessary();
        return this.ourCopy[i2];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.underlyingList.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.underlyingList.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.underlyingList.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.underlyingList.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.underlyingList.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return this.underlyingList.listIterator(i2);
    }

    @Override // java.util.List
    public E remove(int i2) {
        E remove = this.underlyingList.remove(i2);
        markAsStale();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.underlyingList.remove(obj);
        markAsStale();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.underlyingList.removeAll(collection);
        markAsStale();
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.underlyingList.retainAll(collection);
        markAsStale();
        return retainAll;
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        E e3 = this.underlyingList.set(i2, e2);
        markAsStale();
        return e3;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.underlyingList.size();
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return this.underlyingList.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T[], E[]] */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        refreshCopyIfNecessary();
        return this.ourCopy;
    }
}
