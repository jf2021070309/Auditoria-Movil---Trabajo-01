package h.o.c;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class a<T> implements Iterator<T> {
    public final T[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f8935b;

    public a(T[] tArr) {
        j.e(tArr, "array");
        this.a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8935b < this.a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.a;
            int i2 = this.f8935b;
            this.f8935b = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f8935b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
