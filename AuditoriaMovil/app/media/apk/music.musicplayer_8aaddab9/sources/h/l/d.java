package h.l;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class d implements ListIterator {
    public static final d a = new d();

    @Override // java.util.ListIterator
    public void add(Object obj) {
        Void r2 = (Void) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        Void r2 = (Void) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
