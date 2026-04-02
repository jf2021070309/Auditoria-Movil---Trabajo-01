package com.amazon.aps.iva.y0;

import java.util.Set;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public abstract class r<K, V, E> implements Set<E>, com.amazon.aps.iva.zb0.e {
    public final w<K, V> b;

    public r(w<K, V> wVar) {
        com.amazon.aps.iva.yb0.j.f(wVar, "map");
        this.b = wVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
    }
}
