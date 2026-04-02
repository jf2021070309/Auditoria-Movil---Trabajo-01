package com.amazon.aps.iva.j2;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/* compiled from: LocaleList.kt */
/* loaded from: classes.dex */
public final class d implements Collection<c>, com.amazon.aps.iva.zb0.a {
    public final List<c> b;
    public final int c;

    public d(List<c> list) {
        this.b = list;
        this.c = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        j.f(cVar, "element");
        return this.b.contains(cVar);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (j.a(this.b, ((d) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<c> iterator() {
        return this.b.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super c> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return z.Q(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.b + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return (T[]) z.R(this, tArr);
    }
}
