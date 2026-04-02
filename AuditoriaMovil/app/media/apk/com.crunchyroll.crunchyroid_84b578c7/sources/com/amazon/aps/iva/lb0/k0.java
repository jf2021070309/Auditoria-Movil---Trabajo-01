package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ReversedViews.kt */
/* loaded from: classes4.dex */
public final class k0<T> extends c<T> {
    public final List<T> b;

    /* compiled from: ReversedViews.kt */
    /* loaded from: classes4.dex */
    public static final class a implements ListIterator<T>, com.amazon.aps.iva.zb0.a {
        public final ListIterator<T> b;
        public final /* synthetic */ k0<T> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k0<? extends T> k0Var, int i) {
            this.c = k0Var;
            this.b = k0Var.b.listIterator(t.c0(i, k0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(List<? extends T> list) {
        this.b = list;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.b.get(t.b0(i, this));
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
