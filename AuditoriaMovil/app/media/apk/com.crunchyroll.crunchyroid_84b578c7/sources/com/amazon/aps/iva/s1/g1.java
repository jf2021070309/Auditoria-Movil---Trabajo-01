package com.amazon.aps.iva.s1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public interface g1 {

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class a implements Collection<Object>, com.amazon.aps.iva.zb0.a {
        public final Set<Object> b = new LinkedHashSet();

        public a(int i) {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.b.add(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.b.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            com.amazon.aps.iva.yb0.j.f(collection, "elements");
            return this.b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return this.b.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.b.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            com.amazon.aps.iva.yb0.j.f(collection, "slotIds");
            return this.b.remove(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            com.amazon.aps.iva.yb0.j.f(collection, "slotIds");
            return this.b.retainAll(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.b.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return com.amazon.aps.iva.e.z.Q(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            com.amazon.aps.iva.yb0.j.f(tArr, "array");
            return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
