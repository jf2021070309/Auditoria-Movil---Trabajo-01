package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.e;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.w1;
import com.amazon.aps.iva.q5.l0;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ConnectedControllersManager.java */
/* loaded from: classes.dex */
public final class e<T> {
    public final WeakReference<t> d;
    public final com.amazon.aps.iva.x.a<T, q.d> b = new com.amazon.aps.iva.x.a<>();
    public final com.amazon.aps.iva.x.a<q.d, b<T>> c = new com.amazon.aps.iva.x.a<>();
    public final Object a = new Object();

    /* compiled from: ConnectedControllersManager.java */
    /* loaded from: classes.dex */
    public interface a {
        ListenableFuture<Void> run();
    }

    /* compiled from: ConnectedControllersManager.java */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public final T a;
        public final w1 b;
        public final ArrayDeque c = new ArrayDeque();
        public y1 d;
        public l0.a e;
        public boolean f;

        public b(T t, w1 w1Var, y1 y1Var, l0.a aVar) {
            this.a = t;
            this.b = w1Var;
            this.d = y1Var;
            this.e = aVar;
        }
    }

    public e(t tVar) {
        this.d = new WeakReference<>(tVar);
    }

    public final void a(T t, q.d dVar, y1 y1Var, l0.a aVar) {
        synchronized (this.a) {
            q.d e = e(t);
            if (e == null) {
                this.b.put(t, dVar);
                this.c.put(dVar, new b<>(t, new w1(), y1Var, aVar));
            } else {
                b<T> orDefault = this.c.getOrDefault(e, null);
                com.amazon.aps.iva.cq.b.D(orDefault);
                orDefault.d = y1Var;
                orDefault.e = aVar;
            }
        }
    }

    public final void b(final b<T> bVar) {
        t tVar = this.d.get();
        if (tVar == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final a aVar = (a) bVar.c.poll();
            if (aVar == null) {
                bVar.f = false;
                return;
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            com.amazon.aps.iva.t5.g0.U(tVar.j, tVar.a(e(bVar.a), new Runnable() { // from class: com.amazon.aps.iva.b8.c
                @Override // java.lang.Runnable
                public final void run() {
                    final e eVar = e.this;
                    eVar.getClass();
                    ListenableFuture<Void> run = aVar.run();
                    final AtomicBoolean atomicBoolean3 = atomicBoolean2;
                    final e.b bVar2 = bVar;
                    final AtomicBoolean atomicBoolean4 = atomicBoolean;
                    run.addListener(new Runnable() { // from class: com.amazon.aps.iva.b8.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar2 = (e) eVar;
                            AtomicBoolean atomicBoolean5 = (AtomicBoolean) atomicBoolean3;
                            e.b bVar3 = (e.b) bVar2;
                            AtomicBoolean atomicBoolean6 = (AtomicBoolean) atomicBoolean4;
                            synchronized (eVar2.a) {
                                if (!atomicBoolean5.get()) {
                                    eVar2.b(bVar3);
                                } else {
                                    atomicBoolean6.set(true);
                                }
                            }
                        }
                    }, MoreExecutors.directExecutor());
                }
            }));
            atomicBoolean2.set(false);
        }
    }

    public final l0.a c(q.d dVar) {
        synchronized (this.a) {
            b<T> orDefault = this.c.getOrDefault(dVar, null);
            if (orDefault == null) {
                return null;
            }
            return orDefault.e;
        }
    }

    public final ImmutableList<q.d> d() {
        ImmutableList<q.d> copyOf;
        synchronized (this.a) {
            copyOf = ImmutableList.copyOf((Collection) this.b.values());
        }
        return copyOf;
    }

    public final q.d e(T t) {
        q.d orDefault;
        synchronized (this.a) {
            orDefault = this.b.getOrDefault(t, null);
        }
        return orDefault;
    }

    public final w1 f(q.d dVar) {
        b<T> orDefault;
        synchronized (this.a) {
            orDefault = this.c.getOrDefault(dVar, null);
        }
        if (orDefault == null) {
            return null;
        }
        return orDefault.b;
    }

    public final boolean g(q.d dVar) {
        boolean z;
        synchronized (this.a) {
            if (this.c.getOrDefault(dVar, null) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean h(int i, q.d dVar) {
        b<T> orDefault;
        synchronized (this.a) {
            orDefault = this.c.getOrDefault(dVar, null);
        }
        t tVar = this.d.get();
        if (orDefault != null && orDefault.e.a(i) && tVar != null && tVar.o.j0().a(i)) {
            return true;
        }
        return false;
    }

    public final boolean i(int i, q.d dVar) {
        b<T> orDefault;
        boolean z;
        boolean z2;
        synchronized (this.a) {
            orDefault = this.c.getOrDefault(dVar, null);
        }
        if (orDefault == null) {
            return false;
        }
        y1 y1Var = orDefault.d;
        y1Var.getClass();
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.v(z, "Use contains(Command) for custom command");
        Iterator<x1> it = y1Var.b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().b == i) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final boolean j(q.d dVar, x1 x1Var) {
        b<T> orDefault;
        synchronized (this.a) {
            orDefault = this.c.getOrDefault(dVar, null);
        }
        if (orDefault != null) {
            y1 y1Var = orDefault.d;
            y1Var.getClass();
            if (y1Var.b.contains(x1Var)) {
                return true;
            }
        }
        return false;
    }

    public final void k(q.d dVar) {
        ArrayList arrayList;
        synchronized (this.a) {
            b<T> remove = this.c.remove(dVar);
            if (remove == null) {
                return;
            }
            this.b.remove(remove.a);
            w1 w1Var = remove.b;
            synchronized (w1Var.a) {
                arrayList = new ArrayList(w1Var.c.values());
                w1Var.c.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((w1.a) it.next()).a();
            }
            t tVar = this.d.get();
            if (tVar != null && !tVar.g()) {
                com.amazon.aps.iva.t5.g0.U(tVar.j, new com.amazon.aps.iva.a6.g1(4, tVar, dVar));
            }
        }
    }
}
