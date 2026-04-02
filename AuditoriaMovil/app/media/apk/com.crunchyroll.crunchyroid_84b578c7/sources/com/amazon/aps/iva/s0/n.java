package com.amazon.aps.iva.s0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class n<K, V> extends com.amazon.aps.iva.lb0.i<Map.Entry<? extends K, ? extends V>> implements com.amazon.aps.iva.q0.b<Map.Entry<? extends K, ? extends V>> {
    public final d<K, V> b;

    public n(d<K, V> dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "map");
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        d<K, V> dVar = this.b;
        dVar.getClass();
        return dVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        com.amazon.aps.iva.yb0.j.f(entry, "element");
        Object key = entry.getKey();
        d<K, V> dVar = this.b;
        Object obj2 = dVar.get(key);
        if (obj2 != null) {
            return com.amazon.aps.iva.yb0.j.a(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !dVar.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.b.b);
    }
}
