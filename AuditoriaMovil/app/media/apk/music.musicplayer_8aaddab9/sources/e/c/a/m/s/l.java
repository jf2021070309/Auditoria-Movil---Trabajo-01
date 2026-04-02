package e.c.a.m.s;

import android.os.SystemClock;
import android.util.Log;
import e.c.a.m.s.a;
import e.c.a.m.s.d0.a;
import e.c.a.m.s.d0.i;
import e.c.a.m.s.i;
import e.c.a.m.s.q;
import e.c.a.s.k.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l implements n, i.a, q.a {
    public static final boolean a = Log.isLoggable("Engine", 2);

    /* renamed from: b  reason: collision with root package name */
    public final t f5701b;

    /* renamed from: c  reason: collision with root package name */
    public final p f5702c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.m.s.d0.i f5703d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5704e;

    /* renamed from: f  reason: collision with root package name */
    public final z f5705f;

    /* renamed from: g  reason: collision with root package name */
    public final c f5706g;

    /* renamed from: h  reason: collision with root package name */
    public final a f5707h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.m.s.a f5708i;

    /* loaded from: classes.dex */
    public static class a {
        public final i.d a;

        /* renamed from: b  reason: collision with root package name */
        public final c.i.j.c<i<?>> f5709b = e.c.a.s.k.a.a(150, new C0119a());

        /* renamed from: c  reason: collision with root package name */
        public int f5710c;

        /* renamed from: e.c.a.m.s.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0119a implements a.b<i<?>> {
            public C0119a() {
            }

            @Override // e.c.a.s.k.a.b
            public i<?> a() {
                a aVar = a.this;
                return new i<>(aVar.a, aVar.f5709b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final e.c.a.m.s.e0.a a;

        /* renamed from: b  reason: collision with root package name */
        public final e.c.a.m.s.e0.a f5711b;

        /* renamed from: c  reason: collision with root package name */
        public final e.c.a.m.s.e0.a f5712c;

        /* renamed from: d  reason: collision with root package name */
        public final e.c.a.m.s.e0.a f5713d;

        /* renamed from: e  reason: collision with root package name */
        public final n f5714e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f5715f;

        /* renamed from: g  reason: collision with root package name */
        public final c.i.j.c<m<?>> f5716g = e.c.a.s.k.a.a(150, new a());

        /* loaded from: classes.dex */
        public class a implements a.b<m<?>> {
            public a() {
            }

            @Override // e.c.a.s.k.a.b
            public m<?> a() {
                b bVar = b.this;
                return new m<>(bVar.a, bVar.f5711b, bVar.f5712c, bVar.f5713d, bVar.f5714e, bVar.f5715f, bVar.f5716g);
            }
        }

        public b(e.c.a.m.s.e0.a aVar, e.c.a.m.s.e0.a aVar2, e.c.a.m.s.e0.a aVar3, e.c.a.m.s.e0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.f5711b = aVar2;
            this.f5712c = aVar3;
            this.f5713d = aVar4;
            this.f5714e = nVar;
            this.f5715f = aVar5;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements i.d {
        public final a.InterfaceC0115a a;

        /* renamed from: b  reason: collision with root package name */
        public volatile e.c.a.m.s.d0.a f5717b;

        public c(a.InterfaceC0115a interfaceC0115a) {
            this.a = interfaceC0115a;
        }

        public e.c.a.m.s.d0.a a() {
            if (this.f5717b == null) {
                synchronized (this) {
                    if (this.f5717b == null) {
                        e.c.a.m.s.d0.d dVar = (e.c.a.m.s.d0.d) this.a;
                        e.c.a.m.s.d0.f fVar = (e.c.a.m.s.d0.f) dVar.f5638b;
                        File cacheDir = fVar.a.getCacheDir();
                        e.c.a.m.s.d0.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f5643b != null) {
                            cacheDir = new File(cacheDir, fVar.f5643b);
                        }
                        if (cacheDir != null && (cacheDir.mkdirs() || (cacheDir.exists() && cacheDir.isDirectory()))) {
                            eVar = new e.c.a.m.s.d0.e(cacheDir, dVar.a);
                        }
                        this.f5717b = eVar;
                    }
                    if (this.f5717b == null) {
                        this.f5717b = new e.c.a.m.s.d0.b();
                    }
                }
            }
            return this.f5717b;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public final m<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final e.c.a.q.f f5718b;

        public d(e.c.a.q.f fVar, m<?> mVar) {
            this.f5718b = fVar;
            this.a = mVar;
        }
    }

    public l(e.c.a.m.s.d0.i iVar, a.InterfaceC0115a interfaceC0115a, e.c.a.m.s.e0.a aVar, e.c.a.m.s.e0.a aVar2, e.c.a.m.s.e0.a aVar3, e.c.a.m.s.e0.a aVar4, boolean z) {
        this.f5703d = iVar;
        c cVar = new c(interfaceC0115a);
        this.f5706g = cVar;
        e.c.a.m.s.a aVar5 = new e.c.a.m.s.a(z);
        this.f5708i = aVar5;
        synchronized (this) {
            synchronized (aVar5) {
                aVar5.f5589e = this;
            }
        }
        this.f5702c = new p();
        this.f5701b = new t();
        this.f5704e = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f5707h = new a(cVar);
        this.f5705f = new z();
        ((e.c.a.m.s.d0.h) iVar).f5644d = this;
    }

    public static void d(String str, long j2, e.c.a.m.k kVar) {
        StringBuilder A = e.a.d.a.a.A(str, " in ");
        A.append(e.c.a.s.f.a(j2));
        A.append("ms, key: ");
        A.append(kVar);
        A.toString();
    }

    @Override // e.c.a.m.s.q.a
    public void a(e.c.a.m.k kVar, q<?> qVar) {
        e.c.a.m.s.a aVar = this.f5708i;
        synchronized (aVar) {
            a.b remove = aVar.f5587c.remove(kVar);
            if (remove != null) {
                remove.f5591c = null;
                remove.clear();
            }
        }
        if (qVar.a) {
            ((e.c.a.m.s.d0.h) this.f5703d).d(kVar, qVar);
        } else {
            this.f5705f.a(qVar, false);
        }
    }

    public <R> d b(e.c.a.d dVar, Object obj, e.c.a.m.k kVar, int i2, int i3, Class<?> cls, Class<R> cls2, e.c.a.f fVar, k kVar2, Map<Class<?>, e.c.a.m.q<?>> map, boolean z, boolean z2, e.c.a.m.m mVar, boolean z3, boolean z4, boolean z5, boolean z6, e.c.a.q.f fVar2, Executor executor) {
        long j2;
        if (a) {
            int i4 = e.c.a.s.f.f6026b;
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        long j3 = j2;
        Objects.requireNonNull(this.f5702c);
        o oVar = new o(obj, kVar, i2, i3, map, cls, cls2, mVar);
        synchronized (this) {
            q<?> c2 = c(oVar, z3, j3);
            if (c2 == null) {
                return g(dVar, obj, kVar, i2, i3, cls, cls2, fVar, kVar2, map, z, z2, mVar, z3, z4, z5, z6, fVar2, executor, oVar, j3);
            }
            ((e.c.a.q.g) fVar2).m(c2, e.c.a.m.a.MEMORY_CACHE);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<?> c(o oVar, boolean z, long j2) {
        q<?> qVar;
        Object remove;
        if (z) {
            e.c.a.m.s.a aVar = this.f5708i;
            synchronized (aVar) {
                a.b bVar = aVar.f5587c.get(oVar);
                if (bVar == null) {
                    qVar = null;
                } else {
                    qVar = bVar.get();
                    if (qVar == null) {
                        aVar.b(bVar);
                    }
                }
            }
            if (qVar != null) {
                qVar.b();
            }
            if (qVar != null) {
                if (a) {
                    d("Loaded resource from active resources", j2, oVar);
                }
                return qVar;
            }
            e.c.a.m.s.d0.h hVar = (e.c.a.m.s.d0.h) this.f5703d;
            synchronized (hVar) {
                remove = hVar.a.remove(oVar);
                if (remove != null) {
                    hVar.f6028c -= hVar.b(remove);
                }
            }
            w wVar = (w) remove;
            q<?> qVar2 = wVar == null ? null : wVar instanceof q ? (q) wVar : new q<>(wVar, true, true, oVar, this);
            if (qVar2 != null) {
                qVar2.b();
                this.f5708i.a(oVar, qVar2);
            }
            if (qVar2 != null) {
                if (a) {
                    d("Loaded resource from cache", j2, oVar);
                }
                return qVar2;
            }
            return null;
        }
        return null;
    }

    public synchronized void e(m<?> mVar, e.c.a.m.k kVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.a) {
                this.f5708i.a(kVar, qVar);
            }
        }
        t tVar = this.f5701b;
        Objects.requireNonNull(tVar);
        Map<e.c.a.m.k, m<?>> a2 = tVar.a(mVar.q);
        if (mVar.equals(a2.get(kVar))) {
            a2.remove(kVar);
        }
    }

    public void f(w<?> wVar) {
        if (!(wVar instanceof q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((q) wVar).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[Catch: all -> 0x0113, TryCatch #0 {, blocks: (B:19:0x00d3, B:21:0x00df, B:27:0x00e9, B:35:0x00fc, B:28:0x00ec, B:30:0x00f0, B:31:0x00f3, B:33:0x00f7, B:34:0x00fa), top: B:48:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[Catch: all -> 0x0113, TryCatch #0 {, blocks: (B:19:0x00d3, B:21:0x00df, B:27:0x00e9, B:35:0x00fc, B:28:0x00ec, B:30:0x00f0, B:31:0x00f3, B:33:0x00f7, B:34:0x00fa), top: B:48:0x00d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> e.c.a.m.s.l.d g(e.c.a.d r17, java.lang.Object r18, e.c.a.m.k r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, e.c.a.f r24, e.c.a.m.s.k r25, java.util.Map<java.lang.Class<?>, e.c.a.m.q<?>> r26, boolean r27, boolean r28, e.c.a.m.m r29, boolean r30, boolean r31, boolean r32, boolean r33, e.c.a.q.f r34, java.util.concurrent.Executor r35, e.c.a.m.s.o r36, long r37) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.s.l.g(e.c.a.d, java.lang.Object, e.c.a.m.k, int, int, java.lang.Class, java.lang.Class, e.c.a.f, e.c.a.m.s.k, java.util.Map, boolean, boolean, e.c.a.m.m, boolean, boolean, boolean, boolean, e.c.a.q.f, java.util.concurrent.Executor, e.c.a.m.s.o, long):e.c.a.m.s.l$d");
    }
}
