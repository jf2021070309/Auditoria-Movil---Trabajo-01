package com.amazon.aps.iva.s0;

import java.util.Iterator;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class j<K, V> extends com.amazon.aps.iva.lb0.h<K> {
    public final f<K, V> b;

    public j(f<K, V> fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "builder");
        this.b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.lb0.h
    public final int b() {
        f<K, V> fVar = this.b;
        fVar.getClass();
        return fVar.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new k(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<K, V> fVar = this.b;
        if (fVar.containsKey(obj)) {
            fVar.remove(obj);
            return true;
        }
        return false;
    }
}
