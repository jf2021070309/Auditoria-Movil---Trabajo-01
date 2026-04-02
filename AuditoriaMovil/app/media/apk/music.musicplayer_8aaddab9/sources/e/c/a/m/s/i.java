package e.c.a.m.s;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import e.c.a.m.r.e;
import e.c.a.m.s.g;
import e.c.a.m.s.j;
import e.c.a.m.s.l;
import e.c.a.m.s.m;
import e.c.a.m.s.q;
import e.c.a.s.k.a;
import e.c.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public e.c.a.m.a A;
    public e.c.a.m.r.d<?> B;
    public volatile e.c.a.m.s.g C;
    public volatile boolean D;
    public volatile boolean E;

    /* renamed from: d  reason: collision with root package name */
    public final d f5678d;

    /* renamed from: e  reason: collision with root package name */
    public final c.i.j.c<i<?>> f5679e;

    /* renamed from: h  reason: collision with root package name */
    public e.c.a.d f5682h;

    /* renamed from: i  reason: collision with root package name */
    public e.c.a.m.k f5683i;

    /* renamed from: j  reason: collision with root package name */
    public e.c.a.f f5684j;

    /* renamed from: k  reason: collision with root package name */
    public o f5685k;

    /* renamed from: l  reason: collision with root package name */
    public int f5686l;

    /* renamed from: m  reason: collision with root package name */
    public int f5687m;

    /* renamed from: n  reason: collision with root package name */
    public k f5688n;
    public e.c.a.m.m o;
    public a<R> p;
    public int q;
    public g r;
    public f s;
    public long t;
    public boolean u;
    public Object v;
    public Thread w;
    public e.c.a.m.k x;
    public e.c.a.m.k y;
    public Object z;
    public final h<R> a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<Throwable> f5676b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.s.k.d f5677c = new d.b();

    /* renamed from: f  reason: collision with root package name */
    public final c<?> f5680f = new c<>();

    /* renamed from: g  reason: collision with root package name */
    public final e f5681g = new e();

    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* loaded from: classes.dex */
    public final class b<Z> implements j.a<Z> {
        public final e.c.a.m.a a;

        public b(e.c.a.m.a aVar) {
            this.a = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c<Z> {
        public e.c.a.m.k a;

        /* renamed from: b  reason: collision with root package name */
        public e.c.a.m.p<Z> f5690b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f5691c;
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5692b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5693c;

        public final boolean a(boolean z) {
            return (this.f5693c || z || this.f5692b) && this.a;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, c.i.j.c<i<?>> cVar) {
        this.f5678d = dVar;
        this.f5679e = cVar;
    }

    @Override // e.c.a.m.s.g.a
    public void a(e.c.a.m.k kVar, Exception exc, e.c.a.m.r.d<?> dVar, e.c.a.m.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", exc);
        Class<?> a2 = dVar.a();
        rVar.f5752c = kVar;
        rVar.f5753d = aVar;
        rVar.f5754e = a2;
        this.f5676b.add(rVar);
        if (Thread.currentThread() == this.w) {
            m();
            return;
        }
        this.s = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.p).i(this);
    }

    @Override // e.c.a.s.k.a.d
    public e.c.a.s.k.d b() {
        return this.f5677c;
    }

    @Override // e.c.a.m.s.g.a
    public void c() {
        this.s = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.p).i(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(i<?> iVar) {
        i<?> iVar2 = iVar;
        int ordinal = this.f5684j.ordinal() - iVar2.f5684j.ordinal();
        return ordinal == 0 ? this.q - iVar2.q : ordinal;
    }

    @Override // e.c.a.m.s.g.a
    public void d(e.c.a.m.k kVar, Object obj, e.c.a.m.r.d<?> dVar, e.c.a.m.a aVar, e.c.a.m.k kVar2) {
        this.x = kVar;
        this.z = obj;
        this.B = dVar;
        this.A = aVar;
        this.y = kVar2;
        if (Thread.currentThread() == this.w) {
            g();
            return;
        }
        this.s = f.DECODE_DATA;
        ((m) this.p).i(this);
    }

    public final <Data> w<R> e(e.c.a.m.r.d<?> dVar, Data data, e.c.a.m.a aVar) throws r {
        if (data == null) {
            return null;
        }
        try {
            int i2 = e.c.a.s.f.f6026b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f2 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f2, elapsedRealtimeNanos, null);
            }
            return f2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> f(Data data, e.c.a.m.a aVar) throws r {
        e.c.a.m.r.e<Data> b2;
        u<Data, ?, R> d2 = this.a.d(data.getClass());
        e.c.a.m.m mVar = this.o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = aVar == e.c.a.m.a.RESOURCE_DISK_CACHE || this.a.r;
            e.c.a.m.l<Boolean> lVar = e.c.a.m.u.c.m.f5871d;
            Boolean bool = (Boolean) mVar.c(lVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                mVar = new e.c.a.m.m();
                mVar.d(this.o);
                mVar.f5559b.put(lVar, Boolean.valueOf(z));
            }
        }
        e.c.a.m.m mVar2 = mVar;
        e.c.a.m.r.f fVar = this.f5682h.f5459c.f5471e;
        synchronized (fVar) {
            e.a<?> aVar2 = fVar.f5565b.get(data.getClass());
            if (aVar2 == null) {
                Iterator<e.a<?>> it = fVar.f5565b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = e.c.a.m.r.f.a;
            }
            b2 = aVar2.b(data);
        }
        try {
            return d2.a(b2, mVar2, this.f5686l, this.f5687m, new b(aVar));
        } finally {
            b2.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        w wVar;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.t;
            StringBuilder y = e.a.d.a.a.y("data: ");
            y.append(this.z);
            y.append(", cache key: ");
            y.append(this.x);
            y.append(", fetcher: ");
            y.append(this.B);
            j("Retrieved data", j2, y.toString());
        }
        v vVar = null;
        try {
            wVar = (w<R>) e(this.B, this.z, this.A);
        } catch (r e2) {
            e.c.a.m.k kVar = this.y;
            e.c.a.m.a aVar = this.A;
            e2.f5752c = kVar;
            e2.f5753d = aVar;
            e2.f5754e = null;
            this.f5676b.add(e2);
            wVar = (w<R>) null;
        }
        if (wVar == null) {
            m();
            return;
        }
        e.c.a.m.a aVar2 = this.A;
        if (wVar instanceof s) {
            ((s) wVar).initialize();
        }
        if (this.f5680f.f5691c != null) {
            vVar = v.d(wVar);
            wVar = vVar;
        }
        o();
        m<?> mVar = (m) this.p;
        synchronized (mVar) {
            mVar.r = wVar;
            mVar.s = aVar2;
        }
        synchronized (mVar) {
            mVar.f5721c.a();
            if (mVar.y) {
                mVar.r.a();
                mVar.g();
            } else if (mVar.f5720b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } else {
                if (mVar.t) {
                    throw new IllegalStateException("Already have resource");
                }
                m.c cVar = mVar.f5724f;
                w<?> wVar2 = mVar.r;
                boolean z = mVar.f5732n;
                e.c.a.m.k kVar2 = mVar.f5731m;
                q.a aVar3 = mVar.f5722d;
                Objects.requireNonNull(cVar);
                mVar.w = new q<>(wVar2, z, true, kVar2, aVar3);
                mVar.t = true;
                m.e eVar = mVar.f5720b;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.a);
                mVar.e(arrayList.size() + 1);
                ((l) mVar.f5725g).e(mVar, mVar.f5731m, mVar.w);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.f5735b.execute(new m.b(dVar.a));
                }
                mVar.d();
            }
        }
        this.r = g.ENCODE;
        try {
            c<?> cVar2 = this.f5680f;
            if (cVar2.f5691c != null) {
                ((l.c) this.f5678d).a().a(cVar2.a, new e.c.a.m.s.f(cVar2.f5690b, cVar2.f5691c, this.o));
                cVar2.f5691c.e();
            }
            e eVar2 = this.f5681g;
            synchronized (eVar2) {
                eVar2.f5692b = true;
                a2 = eVar2.a(false);
            }
            if (a2) {
                l();
            }
        } finally {
            if (vVar != null) {
                vVar.e();
            }
        }
    }

    public final e.c.a.m.s.g h() {
        int ordinal = this.r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        return null;
                    }
                    StringBuilder y = e.a.d.a.a.y("Unrecognized stage: ");
                    y.append(this.r);
                    throw new IllegalStateException(y.toString());
                }
                return new b0(this.a, this);
            }
            return new e.c.a.m.s.d(this.a, this);
        }
        return new x(this.a, this);
    }

    public final g i(g gVar) {
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.f5688n.b() ? g.RESOURCE_CACHE : i(g.RESOURCE_CACHE);
        } else if (ordinal == 1) {
            return this.f5688n.a() ? g.DATA_CACHE : i(g.DATA_CACHE);
        } else if (ordinal == 2) {
            return this.u ? g.FINISHED : g.SOURCE;
        } else if (ordinal == 3 || ordinal == 5) {
            return g.FINISHED;
        } else {
            throw new IllegalArgumentException("Unrecognized stage: " + gVar);
        }
    }

    public final void j(String str, long j2, String str2) {
        StringBuilder A = e.a.d.a.a.A(str, " in ");
        A.append(e.c.a.s.f.a(j2));
        A.append(", load key: ");
        A.append(this.f5685k);
        A.append(str2 != null ? e.a.d.a.a.k(", ", str2) : "");
        A.append(", thread: ");
        A.append(Thread.currentThread().getName());
        A.toString();
    }

    public final void k() {
        boolean a2;
        o();
        r rVar = new r("Failed to load resource", new ArrayList(this.f5676b));
        m<?> mVar = (m) this.p;
        synchronized (mVar) {
            mVar.u = rVar;
        }
        synchronized (mVar) {
            mVar.f5721c.a();
            if (mVar.y) {
                mVar.g();
            } else if (mVar.f5720b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else {
                if (mVar.v) {
                    throw new IllegalStateException("Already failed once");
                }
                mVar.v = true;
                e.c.a.m.k kVar = mVar.f5731m;
                m.e eVar = mVar.f5720b;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.a);
                mVar.e(arrayList.size() + 1);
                ((l) mVar.f5725g).e(mVar, kVar, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.f5735b.execute(new m.a(dVar.a));
                }
                mVar.d();
            }
        }
        e eVar2 = this.f5681g;
        synchronized (eVar2) {
            eVar2.f5693c = true;
            a2 = eVar2.a(false);
        }
        if (a2) {
            l();
        }
    }

    public final void l() {
        e eVar = this.f5681g;
        synchronized (eVar) {
            eVar.f5692b = false;
            eVar.a = false;
            eVar.f5693c = false;
        }
        c<?> cVar = this.f5680f;
        cVar.a = null;
        cVar.f5690b = null;
        cVar.f5691c = null;
        h<R> hVar = this.a;
        hVar.f5664c = null;
        hVar.f5665d = null;
        hVar.f5675n = null;
        hVar.f5668g = null;
        hVar.f5672k = null;
        hVar.f5670i = null;
        hVar.o = null;
        hVar.f5671j = null;
        hVar.p = null;
        hVar.a.clear();
        hVar.f5673l = false;
        hVar.f5663b.clear();
        hVar.f5674m = false;
        this.D = false;
        this.f5682h = null;
        this.f5683i = null;
        this.o = null;
        this.f5684j = null;
        this.f5685k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.E = false;
        this.v = null;
        this.f5676b.clear();
        this.f5679e.a(this);
    }

    public final void m() {
        this.w = Thread.currentThread();
        int i2 = e.c.a.s.f.f6026b;
        this.t = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.E && this.C != null && !(z = this.C.b())) {
            this.r = i(this.r);
            this.C = h();
            if (this.r == g.SOURCE) {
                this.s = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.p).i(this);
                return;
            }
        }
        if ((this.r == g.FINISHED || this.E) && !z) {
            k();
        }
    }

    public final void n() {
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            this.r = i(g.INITIALIZE);
            this.C = h();
            m();
        } else if (ordinal == 1) {
            m();
        } else if (ordinal == 2) {
            g();
        } else {
            StringBuilder y = e.a.d.a.a.y("Unrecognized run reason: ");
            y.append(this.s);
            throw new IllegalStateException(y.toString());
        }
    }

    public final void o() {
        Throwable th;
        this.f5677c.a();
        if (!this.D) {
            this.D = true;
            return;
        }
        if (this.f5676b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f5676b;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public void run() {
        e.c.a.m.r.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    k();
                    if (dVar != null) {
                        return;
                    }
                    return;
                }
                n();
                if (dVar != null) {
                    dVar.b();
                }
            } finally {
                if (dVar != null) {
                    dVar.b();
                }
            }
        } catch (e.c.a.m.s.c e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                String str = "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.r;
            }
            if (this.r != g.ENCODE) {
                this.f5676b.add(th);
                k();
            }
            if (!this.E) {
                throw th;
            }
            throw th;
        }
    }
}
