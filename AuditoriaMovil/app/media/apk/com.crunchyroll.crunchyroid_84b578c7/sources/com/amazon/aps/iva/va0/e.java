package com.amazon.aps.iva.va0;

import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: UnmodifiableEmptyCollections.kt */
/* loaded from: classes4.dex */
public final class e<K, V> implements Map<K, V>, com.amazon.aps.iva.zb0.d {
    public static final e c = new e();
    public final /* synthetic */ Map b;

    public e() {
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.emptyMap());
        j.b(unmodifiableMap, "Collections.unmodifiable…p(Collections.emptyMap())");
        this.b = unmodifiableMap;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.b.entrySet();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.b.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.b.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) this.b.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        j.g(map, "from");
        this.b.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return false;
    }

    @Override // java.util.Map
    public final void clear() {
    }
}
