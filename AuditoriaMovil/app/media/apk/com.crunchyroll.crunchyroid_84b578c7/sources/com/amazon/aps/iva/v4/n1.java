package com.amazon.aps.iva.v4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public final class n1 extends AbstractList<String> implements e0, RandomAccess {
    public final e0 b;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes.dex */
    public class a implements ListIterator<String> {
        public final ListIterator<String> b;

        public a(n1 n1Var, int i) {
            this.b = n1Var.b.listIterator(i);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes.dex */
    public class b implements Iterator<String> {
        public final Iterator<String> b;

        public b(n1 n1Var) {
            this.b = n1Var.b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n1(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final void c(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.b.get(i);
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final Object getRaw(int i) {
        return this.b.getRaw(i);
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final List<?> getUnderlyingElements() {
        return this.b.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new a(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.amazon.aps.iva.v4.e0
    public final e0 getUnmodifiableView() {
        return this;
    }
}
