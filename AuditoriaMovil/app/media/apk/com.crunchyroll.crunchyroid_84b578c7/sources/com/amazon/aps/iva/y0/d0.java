package com.amazon.aps.iva.y0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class d0<K, V> extends e0<K, V> implements Iterator<Map.Entry<K, V>>, com.amazon.aps.iva.zb0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(w<K, V> wVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(wVar, it);
        com.amazon.aps.iva.yb0.j.f(wVar, "map");
        com.amazon.aps.iva.yb0.j.f(it, "iterator");
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (this.e != null) {
            return new c0(this);
        }
        throw new IllegalStateException();
    }
}
