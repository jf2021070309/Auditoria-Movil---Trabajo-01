package com.amazon.aps.iva.hd;
/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends com.amazon.aps.iva.x.a<K, V> {
    public int l;

    @Override // com.amazon.aps.iva.x.h, java.util.Map
    public final void clear() {
        this.l = 0;
        super.clear();
    }

    @Override // com.amazon.aps.iva.x.h, java.util.Map
    public final int hashCode() {
        if (this.l == 0) {
            this.l = super.hashCode();
        }
        return this.l;
    }

    @Override // com.amazon.aps.iva.x.h
    public final void k(com.amazon.aps.iva.x.a aVar) {
        this.l = 0;
        super.k(aVar);
    }

    @Override // com.amazon.aps.iva.x.h
    public final V l(int i) {
        this.l = 0;
        return (V) super.l(i);
    }

    @Override // com.amazon.aps.iva.x.h
    public final V m(int i, V v) {
        this.l = 0;
        return (V) super.m(i, v);
    }

    @Override // com.amazon.aps.iva.x.h, java.util.Map
    public final V put(K k, V v) {
        this.l = 0;
        return (V) super.put(k, v);
    }
}
