package e.c.a.m.s;

import e.c.a.m.s.i;
import e.c.a.m.s.q;
import e.c.a.s.k.a;
import e.c.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class m<R> implements i.a<R>, a.d {
    public static final c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final e f5720b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.s.k.d f5721c;

    /* renamed from: d  reason: collision with root package name */
    public final q.a f5722d;

    /* renamed from: e  reason: collision with root package name */
    public final c.i.j.c<m<?>> f5723e;

    /* renamed from: f  reason: collision with root package name */
    public final c f5724f;

    /* renamed from: g  reason: collision with root package name */
    public final n f5725g;

    /* renamed from: h  reason: collision with root package name */
    public final e.c.a.m.s.e0.a f5726h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.m.s.e0.a f5727i;

    /* renamed from: j  reason: collision with root package name */
    public final e.c.a.m.s.e0.a f5728j;

    /* renamed from: k  reason: collision with root package name */
    public final e.c.a.m.s.e0.a f5729k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f5730l;

    /* renamed from: m  reason: collision with root package name */
    public e.c.a.m.k f5731m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5732n;
    public boolean o;
    public boolean p;
    public boolean q;
    public w<?> r;
    public e.c.a.m.a s;
    public boolean t;
    public r u;
    public boolean v;
    public q<?> w;
    public i<R> x;
    public volatile boolean y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final e.c.a.q.f a;

        public a(e.c.a.q.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.c.a.q.g gVar = (e.c.a.q.g) this.a;
            gVar.f5996c.a();
            synchronized (gVar.f5997d) {
                synchronized (m.this) {
                    if (m.this.f5720b.a.contains(new d(this.a, e.c.a.s.e.f6025b))) {
                        m mVar = m.this;
                        e.c.a.q.f fVar = this.a;
                        Objects.requireNonNull(mVar);
                        ((e.c.a.q.g) fVar).l(mVar.u, 5);
                    }
                    m.this.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final e.c.a.q.f a;

        public b(e.c.a.q.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.c.a.q.g gVar = (e.c.a.q.g) this.a;
            gVar.f5996c.a();
            synchronized (gVar.f5997d) {
                synchronized (m.this) {
                    if (m.this.f5720b.a.contains(new d(this.a, e.c.a.s.e.f6025b))) {
                        m.this.w.b();
                        m mVar = m.this;
                        e.c.a.q.f fVar = this.a;
                        Objects.requireNonNull(mVar);
                        ((e.c.a.q.g) fVar).m(mVar.w, mVar.s);
                        m.this.h(this.a);
                    }
                    m.this.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final e.c.a.q.f a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f5735b;

        public d(e.c.a.q.f fVar, Executor executor) {
            this.a = fVar;
            this.f5735b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {
        public final List<d> a = new ArrayList(2);

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    public m(e.c.a.m.s.e0.a aVar, e.c.a.m.s.e0.a aVar2, e.c.a.m.s.e0.a aVar3, e.c.a.m.s.e0.a aVar4, n nVar, q.a aVar5, c.i.j.c<m<?>> cVar) {
        c cVar2 = a;
        this.f5720b = new e();
        this.f5721c = new d.b();
        this.f5730l = new AtomicInteger();
        this.f5726h = aVar;
        this.f5727i = aVar2;
        this.f5728j = aVar3;
        this.f5729k = aVar4;
        this.f5725g = nVar;
        this.f5722d = aVar5;
        this.f5723e = cVar;
        this.f5724f = cVar2;
    }

    public synchronized void a(e.c.a.q.f fVar, Executor executor) {
        this.f5721c.a();
        this.f5720b.a.add(new d(fVar, executor));
        boolean z = true;
        if (this.t) {
            e(1);
            executor.execute(new b(fVar));
        } else if (this.v) {
            e(1);
            executor.execute(new a(fVar));
        } else {
            if (this.y) {
                z = false;
            }
            c.t.m.b(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // e.c.a.s.k.a.d
    public e.c.a.s.k.d b() {
        return this.f5721c;
    }

    public void c() {
        if (f()) {
            return;
        }
        this.y = true;
        i<R> iVar = this.x;
        iVar.E = true;
        g gVar = iVar.C;
        if (gVar != null) {
            gVar.cancel();
        }
        n nVar = this.f5725g;
        e.c.a.m.k kVar = this.f5731m;
        l lVar = (l) nVar;
        synchronized (lVar) {
            t tVar = lVar.f5701b;
            Objects.requireNonNull(tVar);
            Map<e.c.a.m.k, m<?>> a2 = tVar.a(this.q);
            if (equals(a2.get(kVar))) {
                a2.remove(kVar);
            }
        }
    }

    public void d() {
        q<?> qVar;
        synchronized (this) {
            this.f5721c.a();
            c.t.m.b(f(), "Not yet complete!");
            int decrementAndGet = this.f5730l.decrementAndGet();
            c.t.m.b(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.w;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.d();
        }
    }

    public synchronized void e(int i2) {
        q<?> qVar;
        c.t.m.b(f(), "Not yet complete!");
        if (this.f5730l.getAndAdd(i2) == 0 && (qVar = this.w) != null) {
            qVar.b();
        }
    }

    public final boolean f() {
        return this.v || this.t || this.y;
    }

    public final synchronized void g() {
        boolean a2;
        if (this.f5731m == null) {
            throw new IllegalArgumentException();
        }
        this.f5720b.a.clear();
        this.f5731m = null;
        this.w = null;
        this.r = null;
        this.v = false;
        this.y = false;
        this.t = false;
        i<R> iVar = this.x;
        i.e eVar = iVar.f5681g;
        synchronized (eVar) {
            eVar.a = true;
            a2 = eVar.a(false);
        }
        if (a2) {
            iVar.l();
        }
        this.x = null;
        this.u = null;
        this.s = null;
        this.f5723e.a(this);
    }

    public synchronized void h(e.c.a.q.f fVar) {
        boolean z;
        this.f5721c.a();
        this.f5720b.a.remove(new d(fVar, e.c.a.s.e.f6025b));
        if (this.f5720b.isEmpty()) {
            c();
            if (!this.t && !this.v) {
                z = false;
                if (z && this.f5730l.get() == 0) {
                    g();
                }
            }
            z = true;
            if (z) {
                g();
            }
        }
    }

    public void i(i<?> iVar) {
        (this.o ? this.f5728j : this.p ? this.f5729k : this.f5727i).f5657c.execute(iVar);
    }
}
