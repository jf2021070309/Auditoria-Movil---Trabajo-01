package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.q0.d;
import com.amazon.aps.iva.y0.w;
import com.amazon.aps.iva.zb0.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class p<K, V> extends r<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w<K, V> wVar) {
        super(wVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        com.amazon.aps.iva.yb0.j.f((Map.Entry) obj, "element");
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
        boolean z;
        if ((obj instanceof Map.Entry) && (!(obj instanceof com.amazon.aps.iva.zb0.a) || (obj instanceof d.a))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        com.amazon.aps.iva.yb0.j.f(entry, "element");
        return com.amazon.aps.iva.yb0.j.a(this.b.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        w<K, V> wVar = this.b;
        return new d0(wVar, ((com.amazon.aps.iva.q0.b) wVar.b().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        boolean z;
        if ((obj instanceof Map.Entry) && (!(obj instanceof com.amazon.aps.iva.zb0.a) || (obj instanceof d.a))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        com.amazon.aps.iva.yb0.j.f(entry, "element");
        if (this.b.remove(entry.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.b.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.q0.d<K, ? extends V> dVar;
        int i;
        boolean z;
        h k;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(collection2));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        w<K, V> wVar = this.b;
        boolean z3 = false;
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
            Iterator<Map.Entry<K, V>> it2 = wVar.c.iterator();
            while (true) {
                z = true;
                if (!((e0) it2).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((d0) it2).next();
                if (linkedHashMap.containsKey(entry2.getKey()) && com.amazon.aps.iva.yb0.j.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    a.remove(entry2.getKey());
                    z3 = true;
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
        return z3;
    }
}
