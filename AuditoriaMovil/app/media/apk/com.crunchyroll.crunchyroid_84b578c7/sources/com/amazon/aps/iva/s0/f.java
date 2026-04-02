package com.amazon.aps.iva.s0;

import com.amazon.aps.iva.q0.d;
import java.util.Map;
/* compiled from: PersistentHashMapBuilder.kt */
/* loaded from: classes.dex */
public class f<K, V> extends com.amazon.aps.iva.lb0.g<K, V> implements d.a<K, V> {
    public d<K, V> b;
    public com.amazon.aps.iva.u0.b c;
    public t<K, V> d;
    public V e;
    public int f;
    public int g;

    public f(d<K, V> dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "map");
        this.b = dVar;
        this.c = new com.amazon.aps.iva.u0.b(0);
        this.d = dVar.b;
        this.g = dVar.c;
    }

    @Override // com.amazon.aps.iva.q0.d.a
    /* renamed from: b */
    public d<K, V> build() {
        t<K, V> tVar = this.d;
        d<K, V> dVar = this.b;
        if (tVar != dVar.b) {
            this.c = new com.amazon.aps.iva.u0.b(0);
            dVar = new d<>(this.d, this.g);
        }
        this.b = dVar;
        return dVar;
    }

    public final void c(int i) {
        this.g = i;
        this.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t tVar = t.e;
        t<K, V> tVar2 = t.e;
        com.amazon.aps.iva.yb0.j.d(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.d = tVar2;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        int i;
        t<K, V> tVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return tVar.d(i, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k) {
        int i;
        t<K, V> tVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (V) tVar.g(i, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i;
        this.e = null;
        t<K, V> tVar = this.d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.d = tVar.l(i, k, v, 0, this);
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        d<K, V> dVar;
        f fVar;
        com.amazon.aps.iva.yb0.j.f(map, "from");
        d<K, V> dVar2 = null;
        if (map instanceof d) {
            dVar = (d) map;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (map instanceof f) {
                fVar = (f) map;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                dVar2 = fVar.build();
            }
        } else {
            dVar2 = dVar;
        }
        if (dVar2 != null) {
            com.amazon.aps.iva.u0.a aVar = new com.amazon.aps.iva.u0.a(0);
            int i = this.g;
            t<K, V> tVar = this.d;
            t<K, V> tVar2 = dVar2.b;
            com.amazon.aps.iva.yb0.j.d(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.d = tVar.m(tVar2, 0, aVar, this);
            int i2 = (dVar2.c + i) - aVar.a;
            if (i != i2) {
                c(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.g;
        t<K, V> o = this.d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            t tVar = t.e;
            o = t.e;
            com.amazon.aps.iva.yb0.j.d(o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.d = o;
        return i != this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k) {
        this.e = null;
        t<K, V> n = this.d.n(k != null ? k.hashCode() : 0, k, 0, this);
        if (n == null) {
            t tVar = t.e;
            n = t.e;
            com.amazon.aps.iva.yb0.j.d(n, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.d = n;
        return this.e;
    }
}
