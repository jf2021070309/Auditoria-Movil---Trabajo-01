package com.amazon.aps.iva.x;

import java.util.Iterator;
/* compiled from: SparseArray.kt */
/* loaded from: classes.dex */
public final class j implements Iterator<Object>, com.amazon.aps.iva.zb0.a {
    public int b;
    public final /* synthetic */ i c;

    public j(i<Object> iVar) {
        this.c = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c.g()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.c.h(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
