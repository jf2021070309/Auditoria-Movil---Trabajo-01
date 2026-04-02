package com.amazon.aps.iva.s0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {
    public final f<K, V> b;

    public h(f<K, V> fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "builder");
        this.b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        com.amazon.aps.iva.yb0.j.f((Map.Entry) obj, "element");
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.b);
    }
}
