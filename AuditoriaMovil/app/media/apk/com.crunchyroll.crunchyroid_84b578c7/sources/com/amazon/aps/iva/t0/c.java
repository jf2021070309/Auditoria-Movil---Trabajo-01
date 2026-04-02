package com.amazon.aps.iva.t0;

import com.amazon.aps.iva.s0.d;
import com.amazon.aps.iva.yb0.j;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: PersistentOrderedSetIterator.kt */
/* loaded from: classes.dex */
public final class c<E> implements Iterator<E>, com.amazon.aps.iva.zb0.a {
    public Object b;
    public final Map<E, a> c;
    public int d;

    public c(Object obj, d dVar) {
        j.f(dVar, "map");
        this.b = obj;
        this.c = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < this.c.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            E e = (E) this.b;
            this.d++;
            a aVar = this.c.get(e);
            if (aVar != null) {
                this.b = aVar.b;
                return e;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
