package h.l;

import h.o.c.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class a<T> implements Collection<T> {
    public final T[] a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8928b;

    public a(T[] tArr, boolean z) {
        j.e(tArr, "values");
        this.a = tArr;
        this.f8928b = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        int i2;
        T[] tArr = this.a;
        j.e(tArr, "<this>");
        j.e(tArr, "<this>");
        if (obj == null) {
            int length = tArr.length;
            i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (tArr[i2] == null) {
                    break;
                }
                i2 = i3;
            }
            i2 = -1;
        } else {
            int length2 = tArr.length;
            int i4 = 0;
            while (i4 < length2) {
                int i5 = i4 + 1;
                if (j.a(obj, tArr[i4])) {
                    i2 = i4;
                    break;
                }
                i4 = i5;
            }
            i2 = -1;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        j.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        T[] tArr = this.a;
        j.e(tArr, "array");
        return new h.o.c.a(tArr);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.a;
        boolean z = this.f8928b;
        j.e(tArr, "<this>");
        if (z && j.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        j.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        j.e(tArr, "array");
        return (T[]) h.o.c.e.b(this, tArr);
    }
}
