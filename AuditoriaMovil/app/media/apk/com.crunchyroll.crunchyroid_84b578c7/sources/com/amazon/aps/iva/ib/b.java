package com.amazon.aps.iva.ib;

import java.util.Iterator;
/* compiled from: AbstractPositionIterator.java */
/* loaded from: classes.dex */
public abstract class b implements Iterator<Integer> {
    public int b;
    public final int c;

    public b(int i) {
        if (i >= 0) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("item count couldn't be negative");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("removing not supported in position iterator");
    }
}
