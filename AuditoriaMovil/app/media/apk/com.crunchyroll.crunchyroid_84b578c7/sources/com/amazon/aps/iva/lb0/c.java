package com.amazon.aps.iva.lb0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: AbstractList.kt */
/* loaded from: classes4.dex */
public abstract class c<E> extends com.amazon.aps.iva.lb0.a<E> implements List<E> {

    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void a(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i <= i2) {
                    return;
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("fromIndex: ", i, " > toIndex: ", i2));
            }
            StringBuilder a = com.amazon.aps.iva.b6.x.a("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            a.append(i3);
            throw new IndexOutOfBoundsException(a.toString());
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    public class b implements Iterator<E>, com.amazon.aps.iva.zb0.a {
        public int b;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < c.this.b()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                int i = this.b;
                this.b = i + 1;
                return c.this.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: com.amazon.aps.iva.lb0.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0474c extends c<E>.b implements ListIterator<E> {
        public C0474c(int i) {
            super();
            int b = c.this.b();
            if (i >= 0 && i <= b) {
                this.b = i;
                return;
            }
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", b));
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                int i = this.b - 1;
                this.b = i;
                return c.this.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    public static final class d<E> extends c<E> implements RandomAccess {
        public final c<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "list");
            this.b = cVar;
            this.c = i;
            a.a(i, i2, cVar.b());
            this.d = i2 - i;
        }

        @Override // com.amazon.aps.iva.lb0.a
        public final int b() {
            return this.d;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i2 = this.d;
            if (i >= 0 && i < i2) {
                return this.b.get(this.c + i);
            }
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", i2));
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        com.amazon.aps.iva.yb0.j.f(collection, "other");
        if (size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        for (E e : this) {
            if (!com.amazon.aps.iva.yb0.j.a(e, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (E e : this) {
            int i3 = i2 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (!com.amazon.aps.iva.yb0.j.a(e2, e)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (com.amazon.aps.iva.yb0.j.a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0474c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C0474c(i);
    }
}
