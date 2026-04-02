package com.amazon.aps.iva.s0;

import java.util.Map;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class x<K, V> extends u<K, V, Map.Entry<K, V>> {
    public final i<K, V> e;

    public x(i<K, V> iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "parentIterator");
        this.e = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d + 2;
        this.d = i;
        Object[] objArr = this.b;
        return new c(this.e, objArr[i - 2], objArr[i - 1]);
    }
}
