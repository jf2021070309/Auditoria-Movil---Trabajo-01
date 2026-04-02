package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.id.d;
import com.amazon.aps.iva.nc.j;
import com.amazon.aps.iva.nc.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public final class n<R> implements j.b<R>, a.d {
    public static final c A = new c();
    public final e b;
    public final d.a c;
    public final q.a d;
    public final com.amazon.aps.iva.o3.d<n<?>> e;
    public final c f;
    public final o g;
    public final com.amazon.aps.iva.qc.a h;
    public final com.amazon.aps.iva.qc.a i;
    public final com.amazon.aps.iva.qc.a j;
    public final com.amazon.aps.iva.qc.a k;
    public final AtomicInteger l;
    public com.amazon.aps.iva.kc.f m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public w<?> r;
    public com.amazon.aps.iva.kc.a s;
    public boolean t;
    public r u;
    public boolean v;
    public q<?> w;
    public j<R> x;
    public volatile boolean y;
    public boolean z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final com.amazon.aps.iva.dd.i b;

        public a(com.amazon.aps.iva.dd.i iVar) {
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.amazon.aps.iva.dd.j jVar = (com.amazon.aps.iva.dd.j) this.b;
            jVar.a.a();
            synchronized (jVar.b) {
                synchronized (n.this) {
                    e eVar = n.this.b;
                    com.amazon.aps.iva.dd.i iVar = this.b;
                    eVar.getClass();
                    if (eVar.b.contains(new d(iVar, com.amazon.aps.iva.hd.e.b))) {
                        n nVar = n.this;
                        com.amazon.aps.iva.dd.i iVar2 = this.b;
                        nVar.getClass();
                        ((com.amazon.aps.iva.dd.j) iVar2).k(nVar.u, 5);
                    }
                    n.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final com.amazon.aps.iva.dd.i b;

        public b(com.amazon.aps.iva.dd.i iVar) {
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.amazon.aps.iva.dd.j jVar = (com.amazon.aps.iva.dd.j) this.b;
            jVar.a.a();
            synchronized (jVar.b) {
                synchronized (n.this) {
                    e eVar = n.this.b;
                    com.amazon.aps.iva.dd.i iVar = this.b;
                    eVar.getClass();
                    if (eVar.b.contains(new d(iVar, com.amazon.aps.iva.hd.e.b))) {
                        n.this.w.c();
                        n nVar = n.this;
                        com.amazon.aps.iva.dd.i iVar2 = this.b;
                        nVar.getClass();
                        ((com.amazon.aps.iva.dd.j) iVar2).l(nVar.w, nVar.s, nVar.z);
                        n.this.h(this.b);
                    }
                    n.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final com.amazon.aps.iva.dd.i a;
        public final Executor b;

        public d(com.amazon.aps.iva.dd.i iVar, Executor executor) {
            this.a = iVar;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {
        public final List<d> b;

        public e(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.b.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(com.amazon.aps.iva.qc.a aVar, com.amazon.aps.iva.qc.a aVar2, com.amazon.aps.iva.qc.a aVar3, com.amazon.aps.iva.qc.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = A;
        this.b = new e(new ArrayList(2));
        this.c = new d.a();
        this.l = new AtomicInteger();
        this.h = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = aVar4;
        this.g = oVar;
        this.d = aVar5;
        this.e = cVar;
        this.f = cVar2;
    }

    public final synchronized void a(com.amazon.aps.iva.dd.i iVar, Executor executor) {
        this.c.a();
        e eVar = this.b;
        eVar.getClass();
        eVar.b.add(new d(iVar, executor));
        boolean z = true;
        if (this.t) {
            e(1);
            executor.execute(new b(iVar));
        } else if (this.v) {
            e(1);
            executor.execute(new a(iVar));
        } else {
            if (this.y) {
                z = false;
            }
            defpackage.i.k(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final void b() {
        Object obj;
        if (f()) {
            return;
        }
        this.y = true;
        j<R> jVar = this.x;
        jVar.E = true;
        h hVar = jVar.C;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.g;
        com.amazon.aps.iva.kc.f fVar = this.m;
        m mVar = (m) oVar;
        synchronized (mVar) {
            t tVar = mVar.a;
            tVar.getClass();
            if (this.q) {
                obj = tVar.c;
            } else {
                obj = tVar.b;
            }
            Map map = (Map) obj;
            if (equals(map.get(fVar))) {
                map.remove(fVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.id.a.d
    public final d.a c() {
        return this.c;
    }

    public final void d() {
        boolean z;
        q<?> qVar;
        synchronized (this) {
            this.c.a();
            defpackage.i.k(f(), "Not yet complete!");
            int decrementAndGet = this.l.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            defpackage.i.k(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.w;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public final synchronized void e(int i) {
        q<?> qVar;
        defpackage.i.k(f(), "Not yet complete!");
        if (this.l.getAndAdd(i) == 0 && (qVar = this.w) != null) {
            qVar.c();
        }
    }

    public final boolean f() {
        if (!this.v && !this.t && !this.y) {
            return false;
        }
        return true;
    }

    public final synchronized void g() {
        boolean a2;
        if (this.m != null) {
            this.b.b.clear();
            this.m = null;
            this.w = null;
            this.r = null;
            this.v = false;
            this.y = false;
            this.t = false;
            this.z = false;
            j<R> jVar = this.x;
            j.f fVar = jVar.h;
            synchronized (fVar) {
                fVar.a = true;
                a2 = fVar.a();
            }
            if (a2) {
                jVar.o();
            }
            this.x = null;
            this.u = null;
            this.s = null;
            this.e.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(com.amazon.aps.iva.dd.i iVar) {
        boolean z;
        this.c.a();
        e eVar = this.b;
        eVar.b.remove(new d(iVar, com.amazon.aps.iva.hd.e.b));
        if (this.b.b.isEmpty()) {
            b();
            if (!this.t && !this.v) {
                z = false;
                if (z && this.l.get() == 0) {
                    g();
                }
            }
            z = true;
            if (z) {
                g();
            }
        }
    }
}
