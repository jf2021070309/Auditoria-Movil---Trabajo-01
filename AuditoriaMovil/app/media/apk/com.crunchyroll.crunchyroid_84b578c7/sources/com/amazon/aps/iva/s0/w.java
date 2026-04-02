package com.amazon.aps.iva.s0;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.d + 2;
        this.d = i;
        return (K) this.b[i - 2];
    }
}
