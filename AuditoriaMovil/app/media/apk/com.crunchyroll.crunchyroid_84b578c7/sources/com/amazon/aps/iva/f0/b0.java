package com.amazon.aps.iva.f0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes.dex */
public final class b0 implements List<a>, com.amazon.aps.iva.zb0.a {
    public final List<a> b = new com.amazon.aps.iva.y0.u();

    /* compiled from: LazyLayoutPinnableItem.kt */
    /* loaded from: classes.dex */
    public interface a {
        int getIndex();

        Object getKey();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        com.amazon.aps.iva.yb0.j.f(aVar, "element");
        return this.b.contains(aVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return this.b.containsAll(collection);
    }

    @Override // java.util.List
    public final a get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        a aVar = (a) obj;
        com.amazon.aps.iva.yb0.j.f(aVar, "element");
        return this.b.indexOf(aVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<a> iterator() {
        return this.b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        a aVar = (a) obj;
        com.amazon.aps.iva.yb0.j.f(aVar, "element");
        return this.b.lastIndexOf(aVar);
    }

    @Override // java.util.List
    public final ListIterator<a> listIterator() {
        return this.b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ a remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ a set(int i, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<a> subList(int i, int i2) {
        return this.b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<a> listIterator(int i) {
        return this.b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
    }
}
