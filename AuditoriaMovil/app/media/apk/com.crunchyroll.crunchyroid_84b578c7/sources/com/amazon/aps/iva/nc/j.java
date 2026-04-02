package com.amazon.aps.iva.nc;

import android.os.SystemClock;
import android.util.Log;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.id.d;
import com.amazon.aps.iva.nc.h;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.nc.n;
import com.amazon.aps.iva.nc.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public com.amazon.aps.iva.kc.a A;
    public com.amazon.aps.iva.lc.d<?> B;
    public volatile com.amazon.aps.iva.nc.h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public final e e;
    public final com.amazon.aps.iva.o3.d<j<?>> f;
    public com.bumptech.glide.c i;
    public com.amazon.aps.iva.kc.f j;
    public com.amazon.aps.iva.ec.c k;
    public p l;
    public int m;
    public int n;
    public l o;
    public com.amazon.aps.iva.kc.h p;
    public b<R> q;
    public int r;
    public h s;
    public g t;
    public boolean u;
    public Object v;
    public Thread w;
    public com.amazon.aps.iva.kc.f x;
    public com.amazon.aps.iva.kc.f y;
    public Object z;
    public final i<R> b = new i<>();
    public final ArrayList c = new ArrayList();
    public final d.a d = new d.a();
    public final d<?> g = new d<>();
    public final f h = new f();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.amazon.aps.iva.kc.c.values().length];
            c = iArr;
            try {
                iArr[com.amazon.aps.iva.kc.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[com.amazon.aps.iva.kc.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface b<R> {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class c<Z> {
        public final com.amazon.aps.iva.kc.a a;

        public c(com.amazon.aps.iva.kc.a aVar) {
            this.a = aVar;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class d<Z> {
        public com.amazon.aps.iva.kc.f a;
        public com.amazon.aps.iva.kc.k<Z> b;
        public v<Z> c;
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class f {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            if ((this.c || this.b) && this.a) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public j(e eVar, a.c cVar) {
        this.e = eVar;
        this.f = cVar;
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void a(com.amazon.aps.iva.kc.f fVar, Object obj, com.amazon.aps.iva.lc.d<?> dVar, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.f fVar2) {
        this.x = fVar;
        this.z = obj;
        this.B = dVar;
        this.A = aVar;
        this.y = fVar2;
        boolean z = false;
        if (fVar != this.b.a().get(0)) {
            z = true;
        }
        this.F = z;
        if (Thread.currentThread() != this.w) {
            p(g.DECODE_DATA);
        } else {
            j();
        }
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void b(com.amazon.aps.iva.kc.f fVar, Exception exc, com.amazon.aps.iva.lc.d<?> dVar, com.amazon.aps.iva.kc.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a2 = dVar.a();
        rVar.c = fVar;
        rVar.d = aVar;
        rVar.e = a2;
        this.c.add(rVar);
        if (Thread.currentThread() != this.w) {
            p(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            q();
        }
    }

    @Override // com.amazon.aps.iva.id.a.d
    public final d.a c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.k.ordinal() - jVar2.k.ordinal();
        if (ordinal == 0) {
            return this.r - jVar2.r;
        }
        return ordinal;
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void f() {
        p(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public final <Data> w<R> h(com.amazon.aps.iva.lc.d<?> dVar, Data data, com.amazon.aps.iva.kc.a aVar) throws r {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i = com.amazon.aps.iva.hd.h.a;
            SystemClock.elapsedRealtimeNanos();
            w<R> i2 = i(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                i2.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.l);
                Thread.currentThread().getName();
            }
            return i2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> i(Data data, com.amazon.aps.iva.kc.a aVar) throws r {
        boolean z;
        Class<?> cls = data.getClass();
        i<R> iVar = this.b;
        u<Data, ?, R> c2 = iVar.c(cls);
        com.amazon.aps.iva.kc.h hVar = this.p;
        if (aVar != com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE && !iVar.r) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.kc.g<Boolean> gVar = com.amazon.aps.iva.uc.n.i;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            hVar = new com.amazon.aps.iva.kc.h();
            com.amazon.aps.iva.hd.b bVar = this.p.b;
            com.amazon.aps.iva.hd.b bVar2 = hVar.b;
            bVar2.k(bVar);
            bVar2.put(gVar, Boolean.valueOf(z));
        }
        com.amazon.aps.iva.kc.h hVar2 = hVar;
        com.bumptech.glide.load.data.a f2 = this.i.a().f(data);
        try {
            return c2.a(this.m, this.n, hVar2, f2, new c(aVar));
        } finally {
            f2.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.amazon.aps.iva.nc.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.amazon.aps.iva.nc.j, com.amazon.aps.iva.nc.j<R>] */
    public final void j() {
        v vVar;
        boolean z;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B;
            int i = com.amazon.aps.iva.hd.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.l);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        v vVar2 = null;
        try {
            vVar = h(this.B, this.z, this.A);
        } catch (r e2) {
            com.amazon.aps.iva.kc.f fVar = this.y;
            com.amazon.aps.iva.kc.a aVar = this.A;
            e2.c = fVar;
            e2.d = aVar;
            e2.e = null;
            this.c.add(e2);
            vVar = null;
        }
        if (vVar != null) {
            com.amazon.aps.iva.kc.a aVar2 = this.A;
            boolean z2 = this.F;
            if (vVar instanceof s) {
                ((s) vVar).initialize();
            }
            boolean z3 = false;
            if (this.g.c != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vVar2 = (v) v.f.b();
                defpackage.i.l(vVar2);
                vVar2.e = false;
                vVar2.d = true;
                vVar2.c = vVar;
                vVar = vVar2;
            }
            m(vVar, aVar2, z2);
            this.s = h.ENCODE;
            try {
                d<?> dVar = this.g;
                if (dVar.c != null) {
                    z3 = true;
                }
                if (z3) {
                    e eVar = this.e;
                    com.amazon.aps.iva.kc.h hVar = this.p;
                    dVar.getClass();
                    ((m.c) eVar).a().c(dVar.a, new com.amazon.aps.iva.nc.g(dVar.b, dVar.c, hVar));
                    dVar.c.e();
                }
                f fVar2 = this.h;
                synchronized (fVar2) {
                    fVar2.b = true;
                    a2 = fVar2.a();
                }
                if (a2) {
                    o();
                    return;
                }
                return;
            } finally {
                if (vVar2 != null) {
                    vVar2.e();
                }
            }
        }
        q();
    }

    public final com.amazon.aps.iva.nc.h k() {
        int i = a.b[this.s.ordinal()];
        i<R> iVar = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.s);
                }
                return new b0(iVar, this);
            }
            return new com.amazon.aps.iva.nc.e(iVar.a(), iVar, this);
        }
        return new x(iVar, this);
    }

    public final h l(h hVar) {
        int i = a.b[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.o.b()) {
                            return h.RESOURCE_CACHE;
                        }
                        return l(h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                }
                return h.FINISHED;
            } else if (this.u) {
                return h.FINISHED;
            } else {
                return h.SOURCE;
            }
        } else if (this.o.a()) {
            return h.DATA_CACHE;
        } else {
            return l(h.DATA_CACHE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(w<R> wVar, com.amazon.aps.iva.kc.a aVar, boolean z) {
        Object obj;
        s();
        n nVar = (n) this.q;
        synchronized (nVar) {
            nVar.r = wVar;
            nVar.s = aVar;
            nVar.z = z;
        }
        synchronized (nVar) {
            nVar.c.a();
            if (nVar.y) {
                nVar.r.b();
                nVar.g();
            } else if (!nVar.b.b.isEmpty()) {
                if (!nVar.t) {
                    n.c cVar = nVar.f;
                    w<?> wVar2 = nVar.r;
                    boolean z2 = nVar.n;
                    com.amazon.aps.iva.kc.f fVar = nVar.m;
                    q.a aVar2 = nVar.d;
                    cVar.getClass();
                    nVar.w = new q<>(wVar2, z2, true, fVar, aVar2);
                    nVar.t = true;
                    n.e eVar = nVar.b;
                    eVar.getClass();
                    ArrayList<n.d> arrayList = new ArrayList(eVar.b);
                    nVar.e(arrayList.size() + 1);
                    com.amazon.aps.iva.kc.f fVar2 = nVar.m;
                    q<?> qVar = nVar.w;
                    m mVar = (m) nVar.g;
                    synchronized (mVar) {
                        if (qVar != null) {
                            if (qVar.b) {
                                mVar.g.a(fVar2, qVar);
                            }
                        }
                        t tVar = mVar.a;
                        tVar.getClass();
                        if (nVar.q) {
                            obj = tVar.c;
                        } else {
                            obj = tVar.b;
                        }
                        Map map = (Map) obj;
                        if (nVar.equals(map.get(fVar2))) {
                            map.remove(fVar2);
                        }
                    }
                    for (n.d dVar : arrayList) {
                        dVar.b.execute(new n.b(dVar.a));
                    }
                    nVar.d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public final void n() {
        Object obj;
        boolean a2;
        s();
        r rVar = new r("Failed to load resource", new ArrayList(this.c));
        n nVar = (n) this.q;
        synchronized (nVar) {
            nVar.u = rVar;
        }
        synchronized (nVar) {
            nVar.c.a();
            if (nVar.y) {
                nVar.g();
            } else if (!nVar.b.b.isEmpty()) {
                if (!nVar.v) {
                    nVar.v = true;
                    com.amazon.aps.iva.kc.f fVar = nVar.m;
                    n.e eVar = nVar.b;
                    eVar.getClass();
                    ArrayList<n.d> arrayList = new ArrayList(eVar.b);
                    nVar.e(arrayList.size() + 1);
                    m mVar = (m) nVar.g;
                    synchronized (mVar) {
                        t tVar = mVar.a;
                        tVar.getClass();
                        if (nVar.q) {
                            obj = tVar.c;
                        } else {
                            obj = tVar.b;
                        }
                        Map map = (Map) obj;
                        if (nVar.equals(map.get(fVar))) {
                            map.remove(fVar);
                        }
                    }
                    for (n.d dVar : arrayList) {
                        dVar.b.execute(new n.a(dVar.a));
                    }
                    nVar.d();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        f fVar2 = this.h;
        synchronized (fVar2) {
            fVar2.c = true;
            a2 = fVar2.a();
        }
        if (a2) {
            o();
        }
    }

    public final void o() {
        f fVar = this.h;
        synchronized (fVar) {
            fVar.b = false;
            fVar.a = false;
            fVar.c = false;
        }
        d<?> dVar = this.g;
        dVar.a = null;
        dVar.b = null;
        dVar.c = null;
        i<R> iVar = this.b;
        iVar.c = null;
        iVar.d = null;
        iVar.n = null;
        iVar.g = null;
        iVar.k = null;
        iVar.i = null;
        iVar.o = null;
        iVar.j = null;
        iVar.p = null;
        iVar.a.clear();
        iVar.l = false;
        iVar.b.clear();
        iVar.m = false;
        this.D = false;
        this.i = null;
        this.j = null;
        this.p = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.s = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.E = false;
        this.v = null;
        this.c.clear();
        this.f.a(this);
    }

    public final void p(g gVar) {
        com.amazon.aps.iva.qc.a aVar;
        this.t = gVar;
        n nVar = (n) this.q;
        if (nVar.o) {
            aVar = nVar.j;
        } else if (nVar.p) {
            aVar = nVar.k;
        } else {
            aVar = nVar.i;
        }
        aVar.execute(this);
    }

    public final void q() {
        this.w = Thread.currentThread();
        int i = com.amazon.aps.iva.hd.h.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.E && this.C != null && !(z = this.C.d())) {
            this.s = l(this.s);
            this.C = k();
            if (this.s == h.SOURCE) {
                p(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.s == h.FINISHED || this.E) && !z) {
            n();
        }
    }

    public final void r() {
        int i = a.a[this.t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.t);
            }
            q();
            return;
        }
        this.s = l(h.INITIALIZE);
        this.C = k();
        q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.lc.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    n();
                    if (dVar != null) {
                        return;
                    }
                    return;
                }
                r();
                if (dVar != null) {
                    dVar.b();
                }
            } finally {
                if (dVar != null) {
                    dVar.b();
                }
            }
        } catch (com.amazon.aps.iva.nc.d e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.s);
            }
            if (this.s != h.ENCODE) {
                this.c.add(th);
                n();
            }
            if (!this.E) {
                throw th;
            }
            throw th;
        }
    }

    public final void s() {
        Throwable th;
        this.d.a();
        if (this.D) {
            if (this.c.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.c;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.D = true;
    }
}
