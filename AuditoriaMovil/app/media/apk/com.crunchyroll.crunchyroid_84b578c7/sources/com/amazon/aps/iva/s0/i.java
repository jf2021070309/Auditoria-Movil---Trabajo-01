package com.amazon.aps.iva.s0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, com.amazon.aps.iva.zb0.a {
    public final g<K, V, Map.Entry<K, V>> b;

    public i(f<K, V> fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "builder");
        u[] uVarArr = new u[8];
        for (int i = 0; i < 8; i++) {
            uVarArr[i] = new x(this);
        }
        this.b = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
