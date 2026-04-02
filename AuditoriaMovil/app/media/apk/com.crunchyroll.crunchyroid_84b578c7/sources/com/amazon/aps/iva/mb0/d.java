package com.amazon.aps.iva.mb0;

import com.amazon.aps.iva.lb0.h;
import com.amazon.aps.iva.mb0.b;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class d<E> extends h<E> {
    public final b<E, ?> b;

    public d(b<E, ?> bVar) {
        j.f(bVar, "backing");
        this.b = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.lb0.h
    public final int b() {
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.b;
        bVar.getClass();
        return new b.e(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.b;
        bVar.c();
        int j = bVar.j(obj);
        if (j < 0) {
            j = -1;
        } else {
            bVar.n(j);
        }
        if (j >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.retainAll(collection);
    }
}
