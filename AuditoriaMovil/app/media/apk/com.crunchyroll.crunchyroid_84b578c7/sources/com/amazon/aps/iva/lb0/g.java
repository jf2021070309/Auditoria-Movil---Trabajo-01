package com.amazon.aps.iva.lb0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: AbstractMutableMap.kt */
/* loaded from: classes4.dex */
public abstract class g<K, V> extends AbstractMap<K, V> implements Map<K, V>, com.amazon.aps.iva.zb0.d {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new com.amazon.aps.iva.s0.h((com.amazon.aps.iva.s0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new com.amazon.aps.iva.s0.j((com.amazon.aps.iva.s0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((com.amazon.aps.iva.s0.f) this).g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new com.amazon.aps.iva.s0.l((com.amazon.aps.iva.s0.f) this);
    }
}
