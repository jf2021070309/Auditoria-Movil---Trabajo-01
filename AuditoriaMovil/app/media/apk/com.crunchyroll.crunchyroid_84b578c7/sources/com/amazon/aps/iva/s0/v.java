package com.amazon.aps.iva.s0;

import java.util.Map;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d + 2;
        this.d = i;
        Object[] objArr = this.b;
        return new b(objArr[i - 2], objArr[i - 1]);
    }
}
