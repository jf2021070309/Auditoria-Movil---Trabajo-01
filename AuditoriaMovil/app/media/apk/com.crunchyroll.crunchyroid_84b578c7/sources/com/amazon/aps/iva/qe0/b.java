package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.yb0.j;
import java.util.NoSuchElementException;
/* compiled from: BufferIterator.kt */
/* loaded from: classes4.dex */
public final class b<T> extends com.amazon.aps.iva.r0.a {
    public final T[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(T[] tArr, int i, int i2) {
        super(i, i2, 1);
        j.f(tArr, "buffer");
        this.e = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            int b = b();
            d(b + 1);
            return this.e[b];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            d(b() - 1);
            return this.e[b()];
        }
        throw new NoSuchElementException();
    }
}
