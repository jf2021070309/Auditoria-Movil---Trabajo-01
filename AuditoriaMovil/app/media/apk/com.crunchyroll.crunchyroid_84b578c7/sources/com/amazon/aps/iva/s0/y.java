package com.amazon.aps.iva.s0;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.d + 2;
        this.d = i;
        return (V) this.b[i - 1];
    }
}
