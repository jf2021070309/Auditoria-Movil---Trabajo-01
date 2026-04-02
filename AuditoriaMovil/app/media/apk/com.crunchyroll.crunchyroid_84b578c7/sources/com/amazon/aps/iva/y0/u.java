package com.amazon.aps.iva.y0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class u<T> implements List<T>, h0, com.amazon.aps.iva.zb0.c {
    public a b = new a(com.amazon.aps.iva.r0.i.c);

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends i0 {
        public com.amazon.aps.iva.q0.c<? extends T> c;
        public int d;

        public a(com.amazon.aps.iva.q0.c<? extends T> cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "list");
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final void a(i0 i0Var) {
            com.amazon.aps.iva.yb0.j.f(i0Var, "value");
            synchronized (v.a) {
                this.c = ((a) i0Var).c;
                this.d = ((a) i0Var).d;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final i0 b() {
            return new a(this.c);
        }

        public final void c(com.amazon.aps.iva.q0.c<? extends T> cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<set-?>");
            this.c = cVar;
        }
    }

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<T>, Boolean> {
        public final /* synthetic */ int h;
        public final /* synthetic */ Collection<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, Collection<? extends T> collection) {
            super(1);
            this.h = i;
            this.i = collection;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Object obj) {
            List list = (List) obj;
            com.amazon.aps.iva.yb0.j.f(list, "it");
            return Boolean.valueOf(list.addAll(this.h, this.i));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<T>, Boolean> {
        public final /* synthetic */ Collection<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Collection<? extends T> collection) {
            super(1);
            this.h = collection;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Object obj) {
            List list = (List) obj;
            com.amazon.aps.iva.yb0.j.f(list, "it");
            return Boolean.valueOf(list.retainAll(this.h));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        boolean z;
        h k;
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> add = cVar.add((com.amazon.aps.iva.q0.c<? extends T>) t);
            z = false;
            if (com.amazon.aps.iva.yb0.j.a(add, cVar)) {
                return false;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i) {
                        aVar4.c(add);
                        aVar4.d++;
                        z = true;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return e(new b(i, collection));
    }

    public final int b() {
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) m.i(aVar)).d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        h k;
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (m.c) {
            k = m.k();
            a aVar2 = (a) m.x(aVar, this, k);
            synchronized (v.a) {
                aVar2.c(com.amazon.aps.iva.r0.i.c);
                aVar2.d++;
            }
        }
        m.o(k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return d().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return d().c.containsAll(collection);
    }

    public final a<T> d() {
        a aVar = this.b;
        com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) m.u(aVar, this);
    }

    public final boolean e(com.amazon.aps.iva.xb0.l<? super List<T>, Boolean> lVar) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        Boolean invoke;
        h k;
        boolean z;
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.r0.e a2 = cVar.a();
            invoke = lVar.invoke(a2);
            com.amazon.aps.iva.q0.c<? extends T> e = a2.e();
            if (com.amazon.aps.iva.yb0.j.a(e, cVar)) {
                break;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
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
            m.o(k, this);
        } while (!z);
        return invoke.booleanValue();
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(i0 i0Var) {
        i0Var.b = this.b;
        this.b = (a) i0Var;
    }

    @Override // java.util.List
    public final T get(int i) {
        return d().c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return d().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return d().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return d().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new b0(this, 0);
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final i0 n() {
        return this.b;
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        h k;
        boolean z;
        T t = get(i);
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i2 = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> m = cVar.m(i);
            if (com.amazon.aps.iva.yb0.j.a(m, cVar)) {
                break;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i2) {
                        aVar4.c(m);
                        z = true;
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        boolean z;
        h k;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> removeAll = cVar.removeAll((Collection<? extends Object>) collection);
            z = false;
            if (com.amazon.aps.iva.yb0.j.a(removeAll, cVar)) {
                return false;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i) {
                        aVar4.c(removeAll);
                        aVar4.d++;
                        z = true;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return e(new c(collection));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        h k;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i2 = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> cVar2 = cVar.set(i, (int) t);
            if (com.amazon.aps.iva.yb0.j.a(cVar2, cVar)) {
                break;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i2) {
                        aVar4.c(cVar2);
                        z = true;
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return d().c.size();
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
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            return new j0(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        boolean z;
        h k;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> addAll = cVar.addAll((Collection<? extends Object>) collection);
            z = false;
            if (com.amazon.aps.iva.yb0.j.a(addAll, cVar)) {
                return false;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i) {
                        aVar4.c(addAll);
                        aVar4.d++;
                        z = true;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new b0(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        h k;
        boolean z;
        do {
            Object obj = v.a;
            synchronized (obj) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i2 = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> add = cVar.add(i, (int) t);
            if (com.amazon.aps.iva.yb0.j.a(add, cVar)) {
                return;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj) {
                    if (aVar4.d == i2) {
                        aVar4.c(add);
                        z = true;
                        aVar4.d++;
                    } else {
                        z = false;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        com.amazon.aps.iva.q0.c<? extends T> cVar;
        boolean z;
        h k;
        do {
            Object obj2 = v.a;
            synchronized (obj2) {
                a aVar = this.b;
                com.amazon.aps.iva.yb0.j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m.i(aVar);
                i = aVar2.d;
                cVar = aVar2.c;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            com.amazon.aps.iva.q0.c<? extends T> remove = cVar.remove((com.amazon.aps.iva.q0.c<? extends T>) obj);
            z = false;
            if (com.amazon.aps.iva.yb0.j.a(remove, cVar)) {
                return false;
            }
            a aVar3 = this.b;
            com.amazon.aps.iva.yb0.j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.c) {
                k = m.k();
                a aVar4 = (a) m.x(aVar3, this, k);
                synchronized (obj2) {
                    if (aVar4.d == i) {
                        aVar4.c(remove);
                        aVar4.d++;
                        z = true;
                    }
                }
            }
            m.o(k, this);
        } while (!z);
        return true;
    }
}
