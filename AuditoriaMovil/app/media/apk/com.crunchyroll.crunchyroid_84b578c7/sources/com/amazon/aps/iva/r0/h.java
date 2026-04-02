package com.amazon.aps.iva.r0;

import java.util.NoSuchElementException;
/* compiled from: AbstractListIterator.kt */
/* loaded from: classes.dex */
public final class h<E> extends a {
    public final E e;

    public h(E e, int i) {
        super(i, 1, 0);
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
