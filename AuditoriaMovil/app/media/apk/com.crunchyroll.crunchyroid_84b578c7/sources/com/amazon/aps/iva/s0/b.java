package com.amazon.aps.iva.s0;

import java.util.Map;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, com.amazon.aps.iva.zb0.a {
    public final K b;
    public final V c;

    public b(K k, V v) {
        this.b = k;
        this.c = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !com.amazon.aps.iva.yb0.j.a(entry.getKey(), this.b) || !com.amazon.aps.iva.yb0.j.a(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        int i2 = 0;
        K k = this.b;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        V value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i2 ^ i;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
