package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.q0.d;
import com.amazon.aps.iva.y0.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class s<K, V> extends r<K, V, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w<K, V> wVar) {
        super(wVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        x.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        x.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!this.b.containsValue(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        w<K, V> wVar = this.b;
        return new g0(wVar, ((com.amazon.aps.iva.q0.b) wVar.b().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        w<K, V> wVar = this.b;
        Iterator<Map.Entry<K, V>> it = wVar.c.iterator();
        while (true) {
            if (((e0) it).hasNext()) {
                obj2 = ((d0) it).next();
                if (com.amazon.aps.iva.yb0.j.a(((Map.Entry) obj2).getValue(), obj)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            wVar.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        boolean z;
        h k;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Set c1 = com.amazon.aps.iva.lb0.x.c1(collection);
        w<K, V> wVar = this.b;
        boolean z2 = false;
        do {
            synchronized (x.a) {
                w.a aVar = wVar.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w.a aVar2 = (w.a) m.i(aVar);
                dVar = aVar2.c;
                i = aVar2.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            d.a<K, ? extends V> a = dVar.a();
            Iterator<Map.Entry<K, V>> it = wVar.c.iterator();
            while (true) {
                z = true;
                if (!((e0) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((d0) it).next();
                if (c1.contains(entry.getValue())) {
                    a.remove(entry.getKey());
                    z2 = true;
                }
            }
            com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.q0.d<K, ? extends V> build = a.build();
            if (com.amazon.aps.iva.yb0.j.a(build, dVar)) {
                break;
            }
            w.a aVar3 = wVar.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.c) {
                k = m.k();
                w.a aVar4 = (w.a) m.x(aVar3, wVar, k);
                synchronized (x.a) {
                    if (aVar4.d == i) {
                        aVar4.c(build);
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, wVar);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        boolean z;
        h k;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Set c1 = com.amazon.aps.iva.lb0.x.c1(collection);
        w<K, V> wVar = this.b;
        boolean z2 = false;
        do {
            synchronized (x.a) {
                w.a aVar = wVar.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w.a aVar2 = (w.a) m.i(aVar);
                dVar = aVar2.c;
                i = aVar2.d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            d.a<K, ? extends V> a = dVar.a();
            Iterator<Map.Entry<K, V>> it = wVar.c.iterator();
            while (true) {
                z = true;
                if (!((e0) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((d0) it).next();
                if (!c1.contains(entry.getValue())) {
                    a.remove(entry.getKey());
                    z2 = true;
                }
            }
            com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.q0.d<K, ? extends V> build = a.build();
            if (com.amazon.aps.iva.yb0.j.a(build, dVar)) {
                break;
            }
            w.a aVar3 = wVar.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.c) {
                k = m.k();
                w.a aVar4 = (w.a) m.x(aVar3, wVar, k);
                synchronized (x.a) {
                    if (aVar4.d == i) {
                        aVar4.c(build);
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, wVar);
        } while (!z);
        return z2;
    }
}
