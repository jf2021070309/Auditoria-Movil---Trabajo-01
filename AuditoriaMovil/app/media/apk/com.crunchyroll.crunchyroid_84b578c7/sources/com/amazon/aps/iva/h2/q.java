package com.amazon.aps.iva.h2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: FontFamily.kt */
/* loaded from: classes.dex */
public final class q extends i implements List<j>, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ List<j> c;
    public final ArrayList d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(List<? extends j> list) {
        this.c = list;
        List<? extends j> list2 = list;
        if (!list2.isEmpty()) {
            this.d = new ArrayList(list2);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        com.amazon.aps.iva.yb0.j.f(jVar, "element");
        return this.c.contains(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return this.c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && com.amazon.aps.iva.yb0.j.a(this.d, ((q) obj).d)) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final j get(int i) {
        return this.c.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        com.amazon.aps.iva.yb0.j.f(jVar, "element");
        return this.c.indexOf(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<j> iterator() {
        return this.c.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        com.amazon.aps.iva.yb0.j.f(jVar, "element");
        return this.c.lastIndexOf(jVar);
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator() {
        return this.c.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<j> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j set(int i, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super j> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<j> subList(int i, int i2) {
        return this.c.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=" + this.d + ')';
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator(int i) {
        return this.c.listIterator(i);
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
