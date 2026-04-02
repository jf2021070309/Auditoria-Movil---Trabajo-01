package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ReversedViews.kt */
/* loaded from: classes4.dex */
public final class j0<T> extends f<T> {
    public final List<T> b;

    /* compiled from: ReversedViews.kt */
    /* loaded from: classes4.dex */
    public static final class a implements ListIterator<T>, com.amazon.aps.iva.zb0.a {
        public final ListIterator<T> b;
        public final /* synthetic */ j0<T> c;

        public a(j0<T> j0Var, int i) {
            this.c = j0Var;
            this.b = j0Var.b.listIterator(t.c0(i, j0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            ListIterator<T> listIterator = this.b;
            listIterator.add(t);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.b.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return f1.B(this.c) - this.b.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.b.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return f1.B(this.c) - this.b.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.b.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.b.set(t);
        }
    }

    public j0(ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(arrayList, "delegate");
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.b.add(t.c0(i, this), t);
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final int b() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final T d(int i) {
        return this.b.remove(t.b0(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.get(t.b0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.b.set(t.b0(i, this), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
