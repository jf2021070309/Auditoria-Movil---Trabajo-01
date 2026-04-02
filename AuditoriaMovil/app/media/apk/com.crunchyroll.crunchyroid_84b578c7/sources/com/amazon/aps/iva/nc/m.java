package com.amazon.aps.iva.nc;

import android.os.SystemClock;
import android.util.Log;
import com.amazon.aps.iva.hd.i;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.nc.c;
import com.amazon.aps.iva.nc.j;
import com.amazon.aps.iva.nc.q;
import com.amazon.aps.iva.pc.a;
import com.amazon.aps.iva.pc.h;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: Engine.java */
/* loaded from: classes.dex */
public final class m implements o, h.a, q.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final t a;
    public final com.amazon.aps.iva.ab.t b;
    public final com.amazon.aps.iva.pc.h c;
    public final b d;
    public final z e;
    public final a f;
    public final com.amazon.aps.iva.nc.c g;

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {
        public final j.e a;
        public final a.c b = com.amazon.aps.iva.id.a.a(150, new C0534a());
        public int c;

        /* compiled from: Engine.java */
        /* renamed from: com.amazon.aps.iva.nc.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0534a implements a.b<j<?>> {
            public C0534a() {
            }

            @Override // com.amazon.aps.iva.id.a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {
        public final com.amazon.aps.iva.qc.a a;
        public final com.amazon.aps.iva.qc.a b;
        public final com.amazon.aps.iva.qc.a c;
        public final com.amazon.aps.iva.qc.a d;
        public final o e;
        public final q.a f;
        public final a.c g = com.amazon.aps.iva.id.a.a(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // com.amazon.aps.iva.id.a.b
            public final n<?> a() {
                b bVar = b.this;
                return new n<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(com.amazon.aps.iva.qc.a aVar, com.amazon.aps.iva.qc.a aVar2, com.amazon.aps.iva.qc.a aVar3, com.amazon.aps.iva.qc.a aVar4, o oVar, q.a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = oVar;
            this.f = aVar5;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class c implements j.e {
        public final a.InterfaceC0607a a;
        public volatile com.amazon.aps.iva.pc.a b;

        public c(a.InterfaceC0607a interfaceC0607a) {
            this.a = interfaceC0607a;
        }

        public final com.amazon.aps.iva.pc.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        com.amazon.aps.iva.pc.c cVar = (com.amazon.aps.iva.pc.c) this.a;
                        com.amazon.aps.iva.pc.e eVar = (com.amazon.aps.iva.pc.e) cVar.b;
                        File cacheDir = eVar.a.getCacheDir();
                        com.amazon.aps.iva.pc.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            dVar = new com.amazon.aps.iva.pc.d(cacheDir, cVar.a);
                        }
                        this.b = dVar;
                    }
                    if (this.b == null) {
                        this.b = new com.amazon.aps.iva.gy.t();
                    }
                }
            }
            return this.b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {
        public final n<?> a;
        public final com.amazon.aps.iva.dd.i b;

        public d(com.amazon.aps.iva.dd.i iVar, n<?> nVar) {
            this.b = iVar;
            this.a = nVar;
        }
    }

    public m(com.amazon.aps.iva.pc.h hVar, a.InterfaceC0607a interfaceC0607a, com.amazon.aps.iva.qc.a aVar, com.amazon.aps.iva.qc.a aVar2, com.amazon.aps.iva.qc.a aVar3, com.amazon.aps.iva.qc.a aVar4) {
        this.c = hVar;
        c cVar = new c(interfaceC0607a);
        com.amazon.aps.iva.nc.c cVar2 = new com.amazon.aps.iva.nc.c();
        this.g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.e = this;
            }
        }
        this.b = new com.amazon.aps.iva.ab.t();
        this.a = new t();
        this.d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f = new a(cVar);
        this.e = new z();
        ((com.amazon.aps.iva.pc.g) hVar).d = this;
    }

    public static void d(w wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // com.amazon.aps.iva.nc.q.a
    public final void a(com.amazon.aps.iva.kc.f fVar, q<?> qVar) {
        com.amazon.aps.iva.nc.c cVar = this.g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.c.remove(fVar);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (qVar.b) {
            ((com.amazon.aps.iva.pc.g) this.c).d(fVar, qVar);
        } else {
            this.e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.c cVar, Object obj, com.amazon.aps.iva.kc.f fVar, int i, int i2, Class cls, Class cls2, com.amazon.aps.iva.ec.c cVar2, l lVar, com.amazon.aps.iva.hd.b bVar, boolean z, boolean z2, com.amazon.aps.iva.kc.h hVar, boolean z3, boolean z4, boolean z5, boolean z6, com.amazon.aps.iva.dd.i iVar, Executor executor) {
        long j;
        if (h) {
            int i3 = com.amazon.aps.iva.hd.h.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.b.getClass();
        p pVar = new p(obj, fVar, i, i2, bVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                q<?> c2 = c(pVar, z3, j2);
                if (c2 == null) {
                    return e(cVar, obj, fVar, i, i2, cls, cls2, cVar2, lVar, bVar, z, z2, hVar, z3, z4, z5, z6, iVar, executor, pVar, j2);
                }
                ((com.amazon.aps.iva.dd.j) iVar).l(c2, com.amazon.aps.iva.kc.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<?> c(p pVar, boolean z, long j) {
        q<?> qVar;
        w wVar;
        q<?> qVar2;
        if (!z) {
            return null;
        }
        com.amazon.aps.iva.nc.c cVar = this.g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.c.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.c();
        }
        if (qVar != null) {
            if (h) {
                int i = com.amazon.aps.iva.hd.h.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return qVar;
        }
        com.amazon.aps.iva.pc.g gVar = (com.amazon.aps.iva.pc.g) this.c;
        synchronized (gVar) {
            i.a aVar2 = (i.a) gVar.a.remove(pVar);
            if (aVar2 == null) {
                wVar = null;
            } else {
                gVar.c -= aVar2.b;
                wVar = aVar2.a;
            }
        }
        w wVar2 = wVar;
        if (wVar2 == null) {
            qVar2 = null;
        } else if (wVar2 instanceof q) {
            qVar2 = (q) wVar2;
        } else {
            qVar2 = new q<>(wVar2, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.c();
            this.g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (h) {
            int i2 = com.amazon.aps.iva.hd.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return qVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:23:0x00d5, B:25:0x00e1, B:31:0x00eb, B:39:0x00fe, B:32:0x00ee, B:34:0x00f2, B:35:0x00f5, B:37:0x00f9, B:38:0x00fc), top: B:52:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:23:0x00d5, B:25:0x00e1, B:31:0x00eb, B:39:0x00fe, B:32:0x00ee, B:34:0x00f2, B:35:0x00f5, B:37:0x00f9, B:38:0x00fc), top: B:52:0x00d5 }] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.amazon.aps.iva.qc.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.nc.m.d e(com.bumptech.glide.c r17, java.lang.Object r18, com.amazon.aps.iva.kc.f r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.amazon.aps.iva.ec.c r24, com.amazon.aps.iva.nc.l r25, com.amazon.aps.iva.hd.b r26, boolean r27, boolean r28, com.amazon.aps.iva.kc.h r29, boolean r30, boolean r31, boolean r32, boolean r33, com.amazon.aps.iva.dd.i r34, java.util.concurrent.Executor r35, com.amazon.aps.iva.nc.p r36, long r37) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nc.m.e(com.bumptech.glide.c, java.lang.Object, com.amazon.aps.iva.kc.f, int, int, java.lang.Class, java.lang.Class, com.amazon.aps.iva.ec.c, com.amazon.aps.iva.nc.l, com.amazon.aps.iva.hd.b, boolean, boolean, com.amazon.aps.iva.kc.h, boolean, boolean, boolean, boolean, com.amazon.aps.iva.dd.i, java.util.concurrent.Executor, com.amazon.aps.iva.nc.p, long):com.amazon.aps.iva.nc.m$d");
    }
}
