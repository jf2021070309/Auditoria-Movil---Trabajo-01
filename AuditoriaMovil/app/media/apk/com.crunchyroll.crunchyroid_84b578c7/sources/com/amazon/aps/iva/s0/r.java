package com.amazon.aps.iva.s0;

import java.util.Iterator;
/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class r<K, V> extends com.amazon.aps.iva.lb0.a<V> {
    public final d<K, V> b;

    public r(d<K, V> dVar) {
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
        return this.b.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new s(this.b.b);
    }
}
