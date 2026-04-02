package com.amazon.aps.iva.p0;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: MutableVector.kt */
/* loaded from: classes.dex */
public final class f<T> implements RandomAccess {
    public T[] b;
    public a c;
    public int d = 0;

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements List<T>, com.amazon.aps.iva.zb0.c {
        public final f<T> b;

        public a(f<T> fVar) {
            j.f(fVar, "vector");
            this.b = fVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.b.b(t);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            j.f(collection, "elements");
            return this.b.d(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.b.f();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.g(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            f<T> fVar = this.b;
            fVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!fVar.g(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            return this.b.b[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            f<T> fVar = this.b;
            int i = fVar.d;
            if (i > 0) {
                T[] tArr = fVar.b;
                int i2 = 0;
                while (!j.a(obj, tArr[i2])) {
                    i2++;
                    if (i2 >= i) {
                        return -1;
                    }
                }
                return i2;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.b.i();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            f<T> fVar = this.b;
            int i = fVar.d;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = fVar.b;
            while (!j.a(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.b.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            f<T> fVar = this.b;
            fVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = fVar.d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                fVar.k(it.next());
            }
            if (i == fVar.d) {
                return false;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            f<T> fVar = this.b;
            fVar.getClass();
            int i = fVar.d;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(fVar.b[i2])) {
                    fVar.l(i2);
                }
            }
            if (i != fVar.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            T[] tArr = this.b.b;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b.d;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            com.amazon.aps.iva.ff0.b.j(i, i2, this);
            return new b(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z.Q(this);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.b.a(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            j.f(collection, "elements");
            f<T> fVar = this.b;
            fVar.getClass();
            return fVar.d(fVar.d, collection);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            return this.b.l(i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            j.f(tArr, "array");
            return (T[]) z.R(this, tArr);
        }
    }

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    public static final class b<T> implements List<T>, com.amazon.aps.iva.zb0.c {
        public final List<T> b;
        public final int c;
        public int d;

        public b(int i, int i2, List list) {
            j.f(list, "list");
            this.b = list;
            this.c = i;
            this.d = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.d;
            this.d = i + 1;
            this.b.add(i, t);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            j.f(collection, "elements");
            this.b.addAll(i + this.c, collection);
            this.d = collection.size() + this.d;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.d - 1;
            int i2 = this.c;
            if (i2 <= i) {
                while (true) {
                    this.b.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.d = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.d;
            for (int i2 = this.c; i2 < i; i2++) {
                if (j.a(this.b.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            return this.b.get(i + this.c);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.d;
            int i2 = this.c;
            for (int i3 = i2; i3 < i; i3++) {
                if (j.a(this.b.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            if (this.d == this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.d - 1;
            int i2 = this.c;
            if (i2 <= i) {
                while (!j.a(this.b.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - i2;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.d;
            for (int i2 = this.c; i2 < i; i2++) {
                List<T> list = this.b;
                if (j.a(list.get(i2), obj)) {
                    list.remove(i2);
                    this.d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            int i = this.d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            int i = this.d;
            int i2 = i - 1;
            int i3 = this.c;
            if (i3 <= i2) {
                while (true) {
                    List<T> list = this.b;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.d--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            return this.b.set(i + this.c, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.d - this.c;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            com.amazon.aps.iva.ff0.b.j(i, i2, this);
            return new b(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z.Q(this);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.b.add(i + this.c, t);
            this.d++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            j.f(tArr, "array");
            return (T[]) z.R(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            j.f(collection, "elements");
            this.b.addAll(this.d, collection);
            this.d = collection.size() + this.d;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            com.amazon.aps.iva.ff0.b.i(i, this);
            this.d--;
            return this.b.remove(i + this.c);
        }
    }

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    public static final class c<T> implements ListIterator<T>, com.amazon.aps.iva.zb0.a {
        public final List<T> b;
        public int c;

        public c(List<T> list, int i) {
            j.f(list, "list");
            this.b = list;
            this.c = i;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            this.b.add(this.c, t);
            this.c++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.c < this.b.size()) {
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
        public final T next() {
            int i = this.c;
            this.c = i + 1;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.c;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.c - 1;
            this.c = i;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.c - 1;
            this.c = i;
            this.b.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.b.set(this.c, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Object[] objArr) {
        this.b = objArr;
    }

    public final void a(int i, T t) {
        h(this.d + 1);
        T[] tArr = this.b;
        int i2 = this.d;
        if (i != i2) {
            m.F(tArr, i + 1, tArr, i, i2);
        }
        tArr[i] = t;
        this.d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        h(this.d + 1);
        int i = this.d;
        this.b[i] = obj;
        this.d = i + 1;
    }

    public final void c(int i, f fVar) {
        j.f(fVar, "elements");
        if (fVar.i()) {
            return;
        }
        h(this.d + fVar.d);
        T[] tArr = this.b;
        int i2 = this.d;
        if (i != i2) {
            m.F(tArr, fVar.d + i, tArr, i, i2);
        }
        m.F(fVar.b, i, tArr, 0, fVar.d);
        this.d += fVar.d;
    }

    public final boolean d(int i, Collection<? extends T> collection) {
        j.f(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        h(collection.size() + this.d);
        T[] tArr = this.b;
        if (i != this.d) {
            m.F(tArr, collection.size() + i, tArr, i, this.d);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                tArr[i2 + i] = t;
                i2 = i3;
            } else {
                f1.S();
                throw null;
            }
        }
        this.d = collection.size() + this.d;
        return true;
    }

    public final List<T> e() {
        a aVar = this.c;
        if (aVar == null) {
            a aVar2 = new a(this);
            this.c = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final void f() {
        T[] tArr = this.b;
        int i = this.d;
        while (true) {
            i--;
            if (-1 < i) {
                tArr[i] = null;
            } else {
                this.d = 0;
                return;
            }
        }
    }

    public final boolean g(T t) {
        int i = this.d - 1;
        if (i >= 0) {
            for (int i2 = 0; !j.a(this.b[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void h(int i) {
        T[] tArr = this.b;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            j.e(tArr2, "copyOf(this, newSize)");
            this.b = tArr2;
        }
    }

    public final boolean i() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(T t) {
        int i;
        int i2 = this.d;
        if (i2 > 0) {
            T[] tArr = this.b;
            i = 0;
            while (!j.a(t, tArr[i])) {
                i++;
                if (i >= i2) {
                    i = -1;
                    break;
                }
            }
        } else {
            i = -1;
            break;
        }
        if (i < 0) {
            return false;
        }
        l(i);
        return true;
    }

    public final T l(int i) {
        T[] tArr = this.b;
        T t = tArr[i];
        int i2 = this.d;
        if (i != i2 - 1) {
            m.F(tArr, i, tArr, i + 1, i2);
        }
        int i3 = this.d - 1;
        this.d = i3;
        tArr[i3] = null;
        return t;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.d;
            if (i2 < i3) {
                T[] tArr = this.b;
                m.F(tArr, i, tArr, i2, i3);
            }
            int i4 = this.d;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.b[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.d = i5;
        }
    }
}
