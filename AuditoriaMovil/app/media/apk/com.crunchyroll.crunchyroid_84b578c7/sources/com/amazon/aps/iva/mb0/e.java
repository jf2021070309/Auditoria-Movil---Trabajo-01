package com.amazon.aps.iva.mb0;

import com.amazon.aps.iva.mb0.b;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class e<V> extends com.amazon.aps.iva.lb0.e<V> {
    public final b<?, V> b;

    public e(b<?, V> bVar) {
        j.f(bVar, "backing");
        this.b = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.lb0.e
    public final int b() {
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        b<?, V> bVar = this.b;
        bVar.getClass();
        return new b.f(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        b<?, V> bVar = this.b;
        bVar.c();
        int i2 = bVar.g;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (bVar.d[i2] >= 0) {
                V[] vArr = bVar.c;
                j.c(vArr);
                if (j.a(vArr[i2], obj)) {
                    i = i2;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        bVar.n(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.retainAll(collection);
    }
}
