package com.amazon.aps.iva.s0;

import com.amazon.aps.iva.s0.t;
/* compiled from: PersistentHashMap.kt */
/* loaded from: classes.dex */
public class d<K, V> extends com.amazon.aps.iva.lb0.d<K, V> implements com.amazon.aps.iva.q0.d<K, V> {
    public static final d d = new d(t.e, 0);
    public final t<K, V> b;
    public final int c;

    public d(t<K, V> tVar, int i) {
        com.amazon.aps.iva.yb0.j.f(tVar, "node");
        this.b = tVar;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.q0.d
    /* renamed from: c */
    public f<K, V> a() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public boolean containsKey(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return this.b.d(i, 0, k);
    }

    public final d d(Object obj, com.amazon.aps.iva.t0.a aVar) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        t.a u = this.b.u(obj, i, 0, aVar);
        if (u == null) {
            return this;
        }
        return new d(u.a, this.c + u.b);
    }

    @Override // java.util.Map
    public V get(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (V) this.b.g(i, 0, k);
    }
}
