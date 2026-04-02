package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.q0.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class w<K, V> implements Map<K, V>, h0, com.amazon.aps.iva.zb0.d {
    public a b;
    public final p c;
    public final q d;
    public final s e;

    /* compiled from: SnapshotStateMap.kt */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends i0 {
        public com.amazon.aps.iva.q0.d<K, ? extends V> c;
        public int d;

        public a(com.amazon.aps.iva.q0.d<K, ? extends V> dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "map");
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final void a(i0 i0Var) {
            com.amazon.aps.iva.yb0.j.f(i0Var, "value");
            a aVar = (a) i0Var;
            synchronized (x.a) {
                this.c = aVar.c;
                this.d = aVar.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final i0 b() {
            return new a(this.c);
        }

        public final void c(com.amazon.aps.iva.q0.d<K, ? extends V> dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "<set-?>");
            this.c = dVar;
        }
    }

    public w() {
        com.amazon.aps.iva.s0.d dVar = com.amazon.aps.iva.s0.d.d;
        com.amazon.aps.iva.yb0.j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.b = new a(dVar);
        this.c = new p(this);
        this.d = new q(this);
        this.e = new s(this);
    }

    public final a<K, V> b() {
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) m.u(aVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        h k;
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        com.amazon.aps.iva.s0.d dVar = com.amazon.aps.iva.s0.d.d;
        com.amazon.aps.iva.yb0.j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (dVar != ((a) m.i(aVar)).c) {
            a aVar2 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.c) {
                k = m.k();
                a aVar3 = (a) m.x(aVar2, this, k);
                synchronized (x.a) {
                    aVar3.c = dVar;
                    aVar3.d++;
                }
            }
            m.o(k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(i0 i0Var) {
        this.b = (a) i0Var;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return b().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final i0 n() {
        return this.b;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        V put;
        h k2;
        boolean z;
        do {
            Object obj = x.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.i(aVar);
                dVar = aVar2.c;
                i = aVar2.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            d.a<K, ? extends V> a2 = dVar.a();
            put = a2.put(k, v);
            com.amazon.aps.iva.q0.d<K, ? extends V> build = a2.build();
            if (com.amazon.aps.iva.yb0.j.a(build, dVar)) {
                break;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.c) {
                k2 = m.k();
                a aVar4 = (a) m.x(aVar3, this, k2);
                synchronized (obj) {
                    if (aVar4.d == i) {
                        aVar4.c(build);
                        z = true;
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k2, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        h k;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(map, "from");
        do {
            Object obj = x.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.i(aVar);
                dVar = aVar2.c;
                i = aVar2.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            d.a<K, ? extends V> a2 = dVar.a();
            a2.putAll(map);
            com.amazon.aps.iva.q0.d<K, ? extends V> build = a2.build();
            if (!com.amazon.aps.iva.yb0.j.a(build, dVar)) {
                a aVar3 = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (m.c) {
                    k = m.k();
                    a aVar4 = (a) m.x(aVar3, this, k);
                    synchronized (obj) {
                        if (aVar4.d == i) {
                            aVar4.c(build);
                            z = true;
                            aVar4.d++;
                        } else {
                            z = false;
                        }
                    }
                }
                m.o(k, this);
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        V remove;
        h k;
        boolean z;
        do {
            Object obj2 = x.a;
            synchronized (obj2) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.i(aVar);
                dVar = aVar2.c;
                i = aVar2.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            d.a<K, ? extends V> a2 = dVar.a();
            remove = a2.remove(obj);
            com.amazon.aps.iva.q0.d<K, ? extends V> build = a2.build();
            if (com.amazon.aps.iva.yb0.j.a(build, dVar)) {
                break;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj2) {
                    if (aVar4.d == i) {
                        aVar4.c(build);
                        z = true;
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().c.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.e;
    }
}
