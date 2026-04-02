package com.amazon.aps.iva.mb0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.c;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: ListBuilder.kt */
/* loaded from: classes4.dex */
public final class a<E> extends com.amazon.aps.iva.lb0.f<E> implements RandomAccess, Serializable {
    public static final a h;
    public E[] b;
    public final int c;
    public int d;
    public boolean e;
    public final a<E> f;
    public final a<E> g;

    /* compiled from: ListBuilder.kt */
    /* renamed from: com.amazon.aps.iva.mb0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0507a<E> implements ListIterator<E>, com.amazon.aps.iva.zb0.a {
        public final a<E> b;
        public int c;
        public int d;

        public C0507a(a<E> aVar, int i) {
            j.f(aVar, "list");
            this.b = aVar;
            this.c = i;
            this.d = -1;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            int i = this.c;
            this.c = i + 1;
            this.b.add(i, e);
            this.d = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.c < this.b.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.c > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            int i = this.c;
            a<E> aVar = this.b;
            if (i < aVar.d) {
                this.c = i + 1;
                this.d = i;
                return aVar.b[aVar.c + i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.c;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            int i = this.c;
            if (i > 0) {
                int i2 = i - 1;
                this.c = i2;
                this.d = i2;
                a<E> aVar = this.b;
                return aVar.b[aVar.c + i2];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            boolean z;
            int i = this.d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.b.d(i);
                this.c = this.d;
                this.d = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            boolean z;
            int i = this.d;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.b.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        a aVar = new a(0);
        aVar.e = true;
        h = aVar;
    }

    public a(E[] eArr, int i, int i2, boolean z, a<E> aVar, a<E> aVar2) {
        this.b = eArr;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = aVar;
        this.g = aVar2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        j();
        g(this.c + this.d, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        j();
        int size = collection.size();
        e(this.c + this.d, collection, size);
        return size > 0;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final int b() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        n(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final E d(int i) {
        j();
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return l(this.c + i);
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    public final void e(int i, Collection<? extends E> collection, int i2) {
        a<E> aVar = this.f;
        if (aVar != null) {
            aVar.e(i, collection, i2);
            this.b = aVar.b;
            this.d += i2;
            return;
        }
        k(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L31
            boolean r1 = r8 instanceof java.util.List
            r2 = 0
            if (r1 == 0) goto L30
            java.util.List r8 = (java.util.List) r8
            E[] r1 = r7.b
            int r3 = r7.d
            int r4 = r8.size()
            if (r3 == r4) goto L15
            goto L27
        L15:
            r4 = r2
        L16:
            if (r4 >= r3) goto L2c
            int r5 = r7.c
            int r5 = r5 + r4
            r5 = r1[r5]
            java.lang.Object r6 = r8.get(r4)
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r6)
            if (r5 != 0) goto L29
        L27:
            r8 = r2
            goto L2d
        L29:
            int r4 = r4 + 1
            goto L16
        L2c:
            r8 = r0
        L2d:
            if (r8 == 0) goto L30
            goto L31
        L30:
            r0 = r2
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mb0.a.equals(java.lang.Object):boolean");
    }

    public final void g(int i, E e) {
        a<E> aVar = this.f;
        if (aVar != null) {
            aVar.g(i, e);
            this.b = aVar.b;
            this.d++;
            return;
        }
        k(i, 1);
        this.b[i] = e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return this.b[this.c + i];
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        E[] eArr = this.b;
        int i2 = this.d;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            E e = eArr[this.c + i4];
            int i5 = i3 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.d; i++) {
            if (j.a(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new C0507a(this, 0);
    }

    public final void j() {
        boolean z;
        a<E> aVar;
        if (!this.e && ((aVar = this.g) == null || !aVar.e)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void k(int i, int i2) {
        int i3 = this.d + i2;
        if (this.f == null) {
            if (i3 >= 0) {
                E[] eArr = this.b;
                if (i3 > eArr.length) {
                    int length = eArr.length;
                    int i4 = length + (length >> 1);
                    if (i4 - i3 < 0) {
                        i4 = i3;
                    }
                    if (i4 - 2147483639 > 0) {
                        if (i3 > 2147483639) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = 2147483639;
                        }
                    }
                    E[] eArr2 = (E[]) Arrays.copyOf(eArr, i4);
                    j.e(eArr2, "copyOf(this, newSize)");
                    this.b = eArr2;
                }
                E[] eArr3 = this.b;
                m.F(eArr3, i + i2, eArr3, i, this.c + this.d);
                this.d += i2;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    public final E l(int i) {
        int i2;
        a<E> aVar = this.f;
        if (aVar != null) {
            this.d--;
            return aVar.l(i);
        }
        E[] eArr = this.b;
        E e = eArr[i];
        m.F(eArr, i, eArr, i + 1, this.d + this.c);
        E[] eArr2 = this.b;
        j.f(eArr2, "<this>");
        eArr2[(i2 + this.d) - 1] = null;
        this.d--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.d - 1; i >= 0; i--) {
            if (j.a(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new C0507a(this, 0);
    }

    public final void n(int i, int i2) {
        a<E> aVar = this.f;
        if (aVar != null) {
            aVar.n(i, i2);
        } else {
            E[] eArr = this.b;
            m.F(eArr, i, eArr, i + i2, this.d);
            E[] eArr2 = this.b;
            int i3 = this.d;
            k.B(i3 - i2, i3, eArr2);
        }
        this.d -= i2;
    }

    public final int o(int i, int i2, Collection<? extends E> collection, boolean z) {
        a<E> aVar = this.f;
        if (aVar != null) {
            int o = aVar.o(i, i2, collection, z);
            this.d -= o;
            return o;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.b[i5]) == z) {
                E[] eArr = this.b;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.b;
        m.F(eArr2, i + i4, eArr2, i2 + i, this.d);
        E[] eArr3 = this.b;
        int i7 = this.d;
        k.B(i7 - i6, i7, eArr3);
        this.d -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        j();
        if (o(this.c, this.d, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        j();
        if (o(this.c, this.d, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        j();
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            E[] eArr = this.b;
            int i3 = this.c;
            E e2 = eArr[i3 + i];
            eArr[i3 + i] = e;
            return e2;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        a<E> aVar;
        c.a.a(i, i2, this.d);
        E[] eArr = this.b;
        int i3 = this.c + i;
        int i4 = i2 - i;
        boolean z = this.e;
        a<E> aVar2 = this.g;
        if (aVar2 == null) {
            aVar = this;
        } else {
            aVar = aVar2;
        }
        return new a(eArr, i3, i4, z, this, aVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, FirebaseAnalytics.Param.DESTINATION);
        int length = tArr.length;
        int i = this.d;
        int i2 = this.c;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.b, i2, i + i2, tArr.getClass());
            j.e(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        m.F(this.b, 0, tArr, i2, i + i2);
        int length2 = tArr.length;
        int i3 = this.d;
        if (length2 > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.b;
        int i = this.d;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[this.c + i2]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        j.e(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.d;
        if (i >= 0 && i <= i2) {
            return new C0507a(this, i);
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        j();
        int i2 = this.d;
        if (i >= 0 && i <= i2) {
            g(this.c + i, e);
            return;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        j.f(collection, "elements");
        j();
        int i2 = this.d;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            e(this.c + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.b;
        int i = this.d;
        int i2 = this.c;
        return m.I(i2, i + i2, eArr);
    }

    public a() {
        this(10);
    }

    public a(int i) {
        this(k.h(i), 0, 0, false, null, null);
    }
}
