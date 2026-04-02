package com.amazon.aps.iva.s0;

import java.util.Iterator;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, com.amazon.aps.iva.zb0.a {
    public Object[] b;
    public int c;
    public int d;

    public u() {
        t tVar = t.e;
        this.b = t.e.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
