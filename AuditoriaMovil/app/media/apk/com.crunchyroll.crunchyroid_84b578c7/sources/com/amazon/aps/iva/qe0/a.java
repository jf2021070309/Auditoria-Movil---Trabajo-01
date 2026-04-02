package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.pe0.a;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: AbstractPersistentList.kt */
/* loaded from: classes4.dex */
public abstract class a<E> extends com.amazon.aps.iva.lb0.c<E> implements com.amazon.aps.iva.pe0.b<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final List subList(int i, int i2) {
        return new a.C0614a(this, i, i2);
    }
}
