package com.amazon.aps.iva.s0;

import java.util.Iterator;
/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class p<K, V> extends com.amazon.aps.iva.lb0.i<K> implements com.amazon.aps.iva.q0.b<K> {
    public final d<K, V> b;

    public p(d<K, V> dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "map");
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        d<K, V> dVar = this.b;
        dVar.getClass();
        return dVar.c;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new q(this.b.b);
    }
}
