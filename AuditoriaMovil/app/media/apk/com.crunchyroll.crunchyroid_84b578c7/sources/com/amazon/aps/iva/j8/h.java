package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.a;
import com.amazon.aps.iva.j8.m;
import com.amazon.aps.iva.tz.i1;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PagedList.java */
/* loaded from: classes.dex */
public abstract class h<T> extends AbstractList<T> {
    public static final /* synthetic */ int o = 0;
    public final Executor b;
    public final Executor c;
    public final c<T> d;
    public final f e;
    public final j<T> f;
    public int g = 0;
    public T h = null;
    public boolean i = false;
    public boolean j = false;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MIN_VALUE;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final ArrayList<WeakReference<e>> n = new ArrayList<>();

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public a(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.b;
            h hVar = h.this;
            if (z) {
                hVar.d.c();
            }
            if (this.c) {
                hVar.i = true;
            }
            if (this.d) {
                hVar.j = true;
            }
            hVar.u(false);
        }
    }

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public b(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            j<T> jVar = hVar.f;
            boolean z = this.b;
            c<T> cVar = hVar.d;
            if (z) {
                cVar.b(jVar.c.get(0).get(0));
            }
            if (this.c) {
                ArrayList<List<T>> arrayList = jVar.c;
                List<T> list = arrayList.get(arrayList.size() - 1);
                cVar.a(list.get(list.size() - 1));
            }
        }
    }

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a(int i, int i2);

        public abstract void b(int i, int i2);
    }

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public static class f {
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;

        public f(int i, int i2, boolean z, int i3) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
        }
    }

    public h(j<T> jVar, Executor executor, Executor executor2, c<T> cVar, f fVar) {
        this.f = jVar;
        this.b = executor;
        this.c = executor2;
        this.d = cVar;
        this.e = fVar;
    }

    public final void b(h hVar, a.C0405a c0405a) {
        if (hVar != null && hVar != this) {
            if (hVar.isEmpty()) {
                j<T> jVar = this.f;
                if (!jVar.isEmpty()) {
                    c0405a.b(0, jVar.size());
                }
            } else {
                f(hVar, c0405a);
            }
        }
        ArrayList<WeakReference<e>> arrayList = this.n;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size).get() == null) {
                    arrayList.remove(size);
                }
            } else {
                arrayList.add(new WeakReference<>(c0405a));
                return;
            }
        }
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        if (this.d != null) {
            if (this.k == Integer.MAX_VALUE) {
                this.k = this.f.size();
            }
            if (this.l == Integer.MIN_VALUE) {
                this.l = 0;
            }
            if (z || z2 || z3) {
                this.b.execute(new a(z, z2, z3));
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    public final void e() {
        this.m.set(true);
    }

    public abstract void f(h hVar, a.C0405a c0405a);

    public abstract com.amazon.aps.iva.j8.e<?, T> g();

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        T t = this.f.get(i);
        if (t != null) {
            this.h = t;
        }
        return t;
    }

    public abstract Object j();

    public abstract boolean k();

    public boolean l() {
        return this.m.get();
    }

    public boolean n() {
        return l();
    }

    public abstract void o(int i);

    public final void p(int i, int i2) {
        if (i2 != 0) {
            ArrayList<WeakReference<e>> arrayList = this.n;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e eVar = arrayList.get(size).get();
                if (eVar != null) {
                    eVar.a(i, i2);
                }
            }
        }
    }

    public final void q(int i, int i2) {
        if (i2 != 0) {
            ArrayList<WeakReference<e>> arrayList = this.n;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e eVar = arrayList.get(size).get();
                if (eVar != null) {
                    eVar.b(i, i2);
                }
            }
        }
    }

    public final void r(a.C0405a c0405a) {
        ArrayList<WeakReference<e>> arrayList = this.n;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                e eVar = arrayList.get(size).get();
                if (eVar == null || eVar == c0405a) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }

    public final void u(boolean z) {
        boolean z2;
        ArrayList<List<T>> arrayList;
        List<T> list;
        boolean z3 = this.i;
        f fVar = this.e;
        boolean z4 = true;
        if (z3 && this.k <= fVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.j || this.l < (size() - 1) - fVar.b) {
            z4 = false;
        }
        if (!z2 && !z4) {
            return;
        }
        if (z2) {
            this.i = false;
        }
        if (z4) {
            this.j = false;
        }
        if (z) {
            this.b.execute(new b(z2, z4));
            return;
        }
        j<T> jVar = this.f;
        c<T> cVar = this.d;
        if (z2) {
            cVar.b(jVar.c.get(0).get(0));
        }
        if (z4) {
            cVar.a(jVar.c.get(arrayList.size() - 1).get(list.size() - 1));
        }
    }

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public static final class d<Key, Value> {
        public final com.amazon.aps.iva.j8.e<Key, Value> a;
        public final f b;
        public Executor c;
        public Executor d;
        public c e;
        public Key f;

        public d(com.amazon.aps.iva.j8.e<Key, Value> eVar, f fVar) {
            if (fVar != null) {
                this.a = eVar;
                this.b = fVar;
                return;
            }
            throw new IllegalArgumentException("Config may not be null");
        }

        public final h<Value> a() {
            int i;
            Executor executor = this.c;
            if (executor != null) {
                Executor executor2 = this.d;
                if (executor2 != null) {
                    c cVar = this.e;
                    f fVar = this.b;
                    Key key = this.f;
                    int i2 = h.o;
                    com.amazon.aps.iva.j8.e<Key, Value> eVar = this.a;
                    if (!eVar.d() && fVar.c) {
                        m mVar = (m) eVar;
                        if (key != null) {
                            i = ((Integer) key).intValue();
                        } else {
                            i = 0;
                        }
                        return new o(mVar, executor, executor2, cVar, fVar, i);
                    }
                    int i3 = -1;
                    if (!eVar.d()) {
                        m.a aVar = new m.a((m) eVar);
                        if (key != null) {
                            i3 = ((Integer) key).intValue();
                        }
                        eVar = aVar;
                    }
                    return new com.amazon.aps.iva.j8.d((com.amazon.aps.iva.j8.c) eVar, executor, executor2, cVar, fVar, key, i3);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(i1 i1Var, int i) {
            this(i1Var, new f(i, i, true, i * 3));
            if (i >= 1) {
                return;
            }
            throw new IllegalArgumentException("Page size must be a positive number");
        }
    }

    /* compiled from: PagedList.java */
    /* loaded from: classes.dex */
    public static abstract class c<T> {
        public abstract void a(T t);

        public void c() {
        }

        public void b(T t) {
        }
    }
}
