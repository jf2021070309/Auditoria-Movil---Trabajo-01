package com.amazon.aps.iva.s0;

import java.util.Map;
import java.util.Map.Entry;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends com.amazon.aps.iva.lb0.h<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        com.amazon.aps.iva.yb0.j.f(entry, "element");
        Object key = entry.getKey();
        f<K, V> fVar = ((h) this).b;
        Object obj2 = fVar.get(key);
        if (obj2 != null) {
            return com.amazon.aps.iva.yb0.j.a(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !fVar.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        com.amazon.aps.iva.yb0.j.f(entry, "element");
        return ((h) this).b.remove(entry.getKey(), entry.getValue());
    }
}
