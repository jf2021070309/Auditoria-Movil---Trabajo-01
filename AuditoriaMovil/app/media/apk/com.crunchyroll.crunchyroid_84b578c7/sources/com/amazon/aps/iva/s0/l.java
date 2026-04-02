package com.amazon.aps.iva.s0;

import java.util.Iterator;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class l<K, V> extends com.amazon.aps.iva.lb0.e<V> {
    public final f<K, V> b;

    public l(f<K, V> fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "builder");
        this.b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.lb0.e
    public final int b() {
        f<K, V> fVar = this.b;
        fVar.getClass();
        return fVar.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new m(this.b);
    }
}
