package com.amazon.aps.iva.y0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public abstract class e0<K, V> {
    public final w<K, V> b;
    public final Iterator<Map.Entry<K, V>> c;
    public int d;
    public Map.Entry<? extends K, ? extends V> e;
    public Map.Entry<? extends K, ? extends V> f;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(w<K, V> wVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        com.amazon.aps.iva.yb0.j.f(wVar, "map");
        com.amazon.aps.iva.yb0.j.f(it, "iterator");
        this.b = wVar;
        this.c = it;
        this.d = wVar.b().d;
        b();
    }

    public final void b() {
        Object obj;
        this.e = this.f;
        Iterator<Map.Entry<K, V>> it = this.c;
        if (it.hasNext()) {
            obj = (Map.Entry<K, V>) ((Map.Entry) it.next());
        } else {
            obj = (Map.Entry<? extends K, ? extends V>) null;
        }
        this.f = (Map.Entry<? extends K, ? extends V>) obj;
    }

    public final boolean hasNext() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        w<K, V> wVar = this.b;
        if (wVar.b().d == this.d) {
            Map.Entry<? extends K, ? extends V> entry = this.e;
            if (entry != null) {
                wVar.remove(entry.getKey());
                this.e = null;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                this.d = wVar.b().d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
