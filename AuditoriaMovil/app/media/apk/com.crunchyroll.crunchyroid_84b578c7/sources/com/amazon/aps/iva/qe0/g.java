package com.amazon.aps.iva.qe0;

import java.util.NoSuchElementException;
/* compiled from: AbstractListIterator.kt */
/* loaded from: classes4.dex */
public final class g<E> extends com.amazon.aps.iva.r0.a {
    public final E e;

    public g(E e, int i) {
        super(i, 1, 1);
        this.e = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            d(b() + 1);
            return this.e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            d(b() - 1);
            return this.e;
        }
        throw new NoSuchElementException();
    }
}
