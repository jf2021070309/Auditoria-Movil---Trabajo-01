package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.u;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class j0<T> implements List<T>, com.amazon.aps.iva.zb0.c {
    public final u<T> b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, com.amazon.aps.iva.zb0.a {
        public final /* synthetic */ com.amazon.aps.iva.yb0.b0 b;
        public final /* synthetic */ j0<T> c;

        public a(com.amazon.aps.iva.yb0.b0 b0Var, j0<T> j0Var) {
            this.b = b0Var;
            this.c = j0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            Object obj2 = v.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.b.b < this.c.e - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.b.b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            com.amazon.aps.iva.yb0.b0 b0Var = this.b;
            int i = b0Var.b + 1;
            j0<T> j0Var = this.c;
            v.a(i, j0Var.e);
            b0Var.b = i;
            return j0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b.b + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            com.amazon.aps.iva.yb0.b0 b0Var = this.b;
            int i = b0Var.b;
            j0<T> j0Var = this.c;
            v.a(i, j0Var.e);
            b0Var.b = i - 1;
            return j0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b.b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            Object obj = v.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Object obj2 = v.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public j0(u<T> uVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(uVar, "parentList");
        this.b = uVar;
        this.c = i;
        this.d = uVar.b();
        this.e = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.c + this.e;
        u<T> uVar = this.b;
        uVar.add(i, t);
        this.e++;
        this.d = uVar.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return addAll(this.e, collection);
    }

    public final void b() {
        if (this.b.b() == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        h k;
        boolean z;
        if (this.e > 0) {
            b();
            u<T> uVar = this.b;
            int i2 = this.c;
            int i3 = this.e + i2;
            uVar.getClass();
            do {
                Object obj = v.a;
                synchronized (obj) {
                    u.a aVar = uVar.b;
                    com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    u.a aVar2 = (u.a) m.i(aVar);
                    i = aVar2.d;
                    cVar = aVar2.c;
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
                com.amazon.aps.iva.yb0.j.c(cVar);
                com.amazon.aps.iva.r0.e a2 = cVar.a();
                a2.subList(i2, i3).clear();
                com.amazon.aps.iva.q0.c<? extends T> e = a2.e();
                if (com.amazon.aps.iva.yb0.j.a(e, cVar)) {
                    break;
                }
                u.a aVar3 = uVar.b;
                com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (m.c) {
                    k = m.k();
                    u.a aVar4 = (u.a) m.x(aVar3, uVar, k);
                    synchronized (obj) {
                        if (aVar4.d == i) {
                            aVar4.c(e);
                            z = true;
                            aVar4.d++;
                        } else {
                            z = false;
                        }
                    }
                }
                m.o(k, uVar);
            } while (!z);
            this.e = 0;
            this.d = this.b.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        b();
        v.a(i, this.e);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.e;
        int i2 = this.c;
        Iterator<Integer> it = com.amazon.aps.iva.aq.j.T(i2, i + i2).iterator();
        while (it.hasNext()) {
            int b = ((com.amazon.aps.iva.lb0.f0) it).b();
            if (com.amazon.aps.iva.yb0.j.a(obj, this.b.get(b))) {
                return b - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.e;
        int i2 = this.c;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (com.amazon.aps.iva.yb0.j.a(obj, this.b.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        h k;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        b();
        u<T> uVar = this.b;
        int i2 = this.c;
        int i3 = this.e + i2;
        uVar.getClass();
        int size = uVar.size();
        do {
            Object obj = v.a;
            synchronized (obj) {
                u.a aVar = uVar.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                u.a aVar2 = (u.a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.r0.e a2 = cVar.a();
            a2.subList(i2, i3).retainAll(collection);
            com.amazon.aps.iva.q0.c<? extends T> e = a2.e();
            if (com.amazon.aps.iva.yb0.j.a(e, cVar)) {
                break;
            }
            u.a aVar3 = uVar.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                u.a aVar4 = (u.a) m.x(aVar3, uVar, k);
                synchronized (obj) {
                    if (aVar4.d == i) {
                        aVar4.c(e);
                        aVar4.d++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, uVar);
        } while (!z);
        int size2 = size - uVar.size();
        if (size2 > 0) {
            this.d = this.b.b();
            this.e -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        v.a(i, this.e);
        b();
        int i2 = i + this.c;
        u<T> uVar = this.b;
        T t2 = uVar.set(i2, t);
        this.d = uVar.b();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 > this.e) {
            z2 = false;
        }
        if (z2) {
            b();
            int i3 = this.c;
            return new j0(this.b, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        b();
        com.amazon.aps.iva.yb0.b0 b0Var = new com.amazon.aps.iva.yb0.b0();
        b0Var.b = i - 1;
        return new a(b0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        b();
        int i2 = i + this.c;
        u<T> uVar = this.b;
        boolean addAll = uVar.addAll(i2, collection);
        if (addAll) {
            this.e = collection.size() + this.e;
            this.d = uVar.b();
        }
        return addAll;
    }

    @Override // java.util.List
    public final T remove(int i) {
        b();
        int i2 = this.c + i;
        u<T> uVar = this.b;
        T remove = uVar.remove(i2);
        this.e--;
        this.d = uVar.b();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        int i2 = this.c + i;
        u<T> uVar = this.b;
        uVar.add(i2, t);
        this.e++;
        this.d = uVar.b();
    }
}
