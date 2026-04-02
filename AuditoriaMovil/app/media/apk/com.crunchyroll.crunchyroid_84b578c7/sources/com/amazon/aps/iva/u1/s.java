package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: HitTestResult.kt */
/* loaded from: classes.dex */
public final class s implements List<f.c>, com.amazon.aps.iva.zb0.a {
    public Object[] b = new Object[16];
    public long[] c = new long[16];
    public int d = -1;
    public int e;

    /* compiled from: HitTestResult.kt */
    /* loaded from: classes.dex */
    public final class b implements List<f.c>, com.amazon.aps.iva.zb0.a {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, f.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends f.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof f.c)) {
                return false;
            }
            f.c cVar = (f.c) obj;
            com.amazon.aps.iva.yb0.j.f(cVar, "element");
            if (indexOf(cVar) == -1) {
                return false;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            com.amazon.aps.iva.yb0.j.f(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((f.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final f.c get(int i) {
            Object obj = s.this.b[i + this.b];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (f.c) obj;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof f.c)) {
                return -1;
            }
            f.c cVar = (f.c) obj;
            com.amazon.aps.iva.yb0.j.f(cVar, "element");
            int i = this.b;
            int i2 = this.c;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!com.amazon.aps.iva.yb0.j.a(s.this.b[i3], cVar)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            if (this.c - this.b == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<f.c> iterator() {
            int i = this.b;
            return new a(i, i, this.c);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof f.c)) {
                return -1;
            }
            f.c cVar = (f.c) obj;
            com.amazon.aps.iva.yb0.j.f(cVar, "element");
            int i = this.c;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!com.amazon.aps.iva.yb0.j.a(s.this.b[i], cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<f.c> listIterator() {
            int i = this.b;
            return new a(i, i, this.c);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ f.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<f.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ f.c set(int i, f.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super f.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<f.c> subList(int i, int i2) {
            int i3 = this.b;
            return new b(i + i3, i3 + i2);
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
        public final boolean addAll(Collection<? extends f.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<f.c> listIterator(int i) {
            int i2 = this.b;
            int i3 = this.c;
            return new a(i + i2, i2, i3);
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

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, f.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends f.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long k = com.amazon.aps.iva.e.z.k(Float.POSITIVE_INFINITY, false);
        int i = this.d + 1;
        int B = com.amazon.aps.iva.ee0.f1.B(this);
        if (i <= B) {
            while (true) {
                long j = this.c[i];
                if (com.amazon.aps.iva.e.w.s(j, k) < 0) {
                    k = j;
                }
                if (Float.intBitsToFloat((int) (k >> 32)) < 0.0f && com.amazon.aps.iva.e.w.H(k)) {
                    return k;
                }
                if (i == B) {
                    break;
                }
                i++;
            }
        }
        return k;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d = -1;
        e();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof f.c)) {
            return false;
        }
        f.c cVar = (f.c) obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "element");
        if (indexOf(cVar) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((f.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(f.c cVar, float f, boolean z, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        Object[] objArr = this.b;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.c, length);
            com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
            this.c = copyOf2;
        }
        Object[] objArr2 = this.b;
        int i3 = this.d;
        objArr2[i3] = cVar;
        this.c[i3] = com.amazon.aps.iva.e.z.k(f, z);
        e();
        aVar.invoke();
        this.d = i;
    }

    public final void e() {
        int i = this.d + 1;
        int B = com.amazon.aps.iva.ee0.f1.B(this);
        if (i <= B) {
            while (true) {
                this.b[i] = null;
                if (i == B) {
                    break;
                }
                i++;
            }
        }
        this.e = this.d + 1;
    }

    @Override // java.util.List
    public final f.c get(int i) {
        Object obj = this.b[i];
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (f.c) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof f.c)) {
            return -1;
        }
        f.c cVar = (f.c) obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "element");
        int B = com.amazon.aps.iva.ee0.f1.B(this);
        if (B < 0) {
            return -1;
        }
        int i = 0;
        while (!com.amazon.aps.iva.yb0.j.a(this.b[i], cVar)) {
            if (i == B) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<f.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof f.c)) {
            return -1;
        }
        f.c cVar = (f.c) obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "element");
        for (int B = com.amazon.aps.iva.ee0.f1.B(this); -1 < B; B--) {
            if (com.amazon.aps.iva.yb0.j.a(this.b[B], cVar)) {
                return B;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<f.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ f.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<f.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ f.c set(int i, f.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super f.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<f.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    /* compiled from: HitTestResult.kt */
    /* loaded from: classes.dex */
    public final class a implements ListIterator<f.c>, com.amazon.aps.iva.zb0.a {
        public int b;
        public final int c;
        public final int d;

        public a(s sVar, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? sVar.e : 0);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(f.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.b < this.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.b > this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Object[] objArr = s.this.b;
            int i = this.b;
            this.b = i + 1;
            Object obj = objArr[i];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (f.c) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b - this.c;
        }

        @Override // java.util.ListIterator
        public final f.c previous() {
            Object[] objArr = s.this.b;
            int i = this.b - 1;
            this.b = i;
            Object obj = objArr[i];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (f.c) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.b - this.c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(f.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends f.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<f.c> listIterator(int i) {
        return new a(this, i, 6);
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
