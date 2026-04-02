package com.amazon.aps.iva.t5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: CopyOnWriteMultiset.java */
/* loaded from: classes.dex */
public final class h<E> implements Iterable<E> {
    public final Object b = new Object();
    public final HashMap c = new HashMap();
    public Set<E> d = Collections.emptySet();
    public List<E> e = Collections.emptyList();

    public final int count(E e) {
        int i;
        synchronized (this.b) {
            if (this.c.containsKey(e)) {
                i = ((Integer) this.c.get(e)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.b) {
            it = this.e.iterator();
        }
        return it;
    }
}
