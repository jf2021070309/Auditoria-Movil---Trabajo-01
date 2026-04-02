package com.amazon.aps.iva.dd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.id.d;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.nc.r;
import com.amazon.aps.iva.nc.w;
import com.bumptech.glide.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class j<R> implements d, com.amazon.aps.iva.ed.g, i {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public final d.a a;
    public final Object b;
    public final g<R> c;
    public final e d;
    public final Context e;
    public final com.bumptech.glide.c f;
    public final Object g;
    public final Class<R> h;
    public final com.amazon.aps.iva.dd.a<?> i;
    public final int j;
    public final int k;
    public final com.amazon.aps.iva.ec.c l;
    public final com.amazon.aps.iva.ed.h<R> m;
    public final List<g<R>> n;
    public final com.amazon.aps.iva.fd.e<? super R> o;
    public final Executor p;
    public w<R> q;
    public m.d r;
    public volatile m s;
    public a t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    /* compiled from: SingleRequest.java */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public j(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class cls, com.amazon.aps.iva.dd.a aVar, int i, int i2, com.amazon.aps.iva.ec.c cVar2, com.amazon.aps.iva.ed.h hVar, g gVar, ArrayList arrayList, e eVar, m mVar, com.amazon.aps.iva.fd.e eVar2, Executor executor) {
        if (B) {
            String.valueOf(hashCode());
        }
        this.a = new d.a();
        this.b = obj;
        this.e = context;
        this.f = cVar;
        this.g = obj2;
        this.h = cls;
        this.i = aVar;
        this.j = i;
        this.k = i2;
        this.l = cVar2;
        this.m = hVar;
        this.c = gVar;
        this.n = arrayList;
        this.d = eVar;
        this.s = mVar;
        this.o = eVar2;
        this.p = executor;
        this.t = a.PENDING;
        if (this.A == null && cVar.h.a.containsKey(b.c.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            if (this.t == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.ed.g
    public final void b(int i, int i2) {
        Object obj;
        int round;
        int i3 = i;
        this.a.a();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                boolean z = B;
                if (z) {
                    int i4 = com.amazon.aps.iva.hd.h.a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.t == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.t = aVar;
                    float f = this.i.c;
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(i3 * f);
                    }
                    this.x = i3;
                    if (i2 == Integer.MIN_VALUE) {
                        round = i2;
                    } else {
                        round = Math.round(f * i2);
                    }
                    this.y = round;
                    if (z) {
                        int i5 = com.amazon.aps.iva.hd.h.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    m mVar = this.s;
                    com.bumptech.glide.c cVar = this.f;
                    Object obj3 = this.g;
                    com.amazon.aps.iva.dd.a<?> aVar2 = this.i;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.r = mVar.b(cVar, obj3, aVar2.m, this.x, this.y, aVar2.t, this.h, this.l, aVar2.d, aVar2.s, aVar2.n, aVar2.z, aVar2.r, aVar2.j, aVar2.x, aVar2.A, aVar2.y, this, this.p);
                                if (this.t != aVar) {
                                    this.r = null;
                                }
                                if (z) {
                                    int i6 = com.amazon.aps.iva.hd.h.a;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean c(d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        com.amazon.aps.iva.dd.a<?> aVar;
        com.amazon.aps.iva.ec.c cVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        com.amazon.aps.iva.dd.a<?> aVar2;
        com.amazon.aps.iva.ec.c cVar2;
        int i6;
        boolean equals;
        boolean g;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.b) {
            i = this.j;
            i2 = this.k;
            obj = this.g;
            cls = this.h;
            aVar = this.i;
            cVar = this.l;
            List<g<R>> list = this.n;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.b) {
            i4 = jVar.j;
            i5 = jVar.k;
            obj2 = jVar.g;
            cls2 = jVar.h;
            aVar2 = jVar.i;
            cVar2 = jVar.l;
            List<g<R>> list2 = jVar.n;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = l.a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof com.amazon.aps.iva.rc.l) {
                equals = ((com.amazon.aps.iva.rc.l) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (aVar == null) {
                    if (aVar2 == null) {
                        g = true;
                    } else {
                        g = false;
                    }
                } else {
                    g = aVar.g(aVar2);
                }
                if (g && cVar == cVar2 && i3 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[Catch: all -> 0x004f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:10:0x0014, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:22:0x0030, B:23:0x0039, B:24:0x003b, B:28:0x0047, B:29:0x004e), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.dd.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            boolean r1 = r5.z     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L47
            com.amazon.aps.iva.id.d$a r1 = r5.a     // Catch: java.lang.Throwable -> L4f
            r1.a()     // Catch: java.lang.Throwable -> L4f
            com.amazon.aps.iva.dd.j$a r1 = r5.t     // Catch: java.lang.Throwable -> L4f
            com.amazon.aps.iva.dd.j$a r2 = com.amazon.aps.iva.dd.j.a.CLEARED     // Catch: java.lang.Throwable -> L4f
            if (r1 != r2) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L14:
            r5.e()     // Catch: java.lang.Throwable -> L4f
            com.amazon.aps.iva.nc.w<R> r1 = r5.q     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            if (r1 == 0) goto L1f
            r5.q = r3     // Catch: java.lang.Throwable -> L4f
            goto L20
        L1f:
            r1 = r3
        L20:
            com.amazon.aps.iva.dd.e r3 = r5.d     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2d
            boolean r3 = r3.i(r5)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2b
            goto L2d
        L2b:
            r3 = 0
            goto L2e
        L2d:
            r3 = 1
        L2e:
            if (r3 == 0) goto L39
            com.amazon.aps.iva.ed.h<R> r3 = r5.m     // Catch: java.lang.Throwable -> L4f
            android.graphics.drawable.Drawable r4 = r5.g()     // Catch: java.lang.Throwable -> L4f
            r3.onLoadCleared(r4)     // Catch: java.lang.Throwable -> L4f
        L39:
            r5.t = r2     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L46
            com.amazon.aps.iva.nc.m r0 = r5.s
            r0.getClass()
            com.amazon.aps.iva.nc.m.d(r1)
        L46:
            return
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dd.j.clear():void");
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            if (this.t == a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void e() {
        if (!this.z) {
            this.a.a();
            this.m.removeCallback(this);
            m.d dVar = this.r;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.a.h(dVar.b);
                }
                this.r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            if (this.t == a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final Drawable g() {
        int i;
        if (this.v == null) {
            com.amazon.aps.iva.dd.a<?> aVar = this.i;
            Drawable drawable = aVar.h;
            this.v = drawable;
            if (drawable == null && (i = aVar.i) > 0) {
                this.v = i(i);
            }
        }
        return this.v;
    }

    public final boolean h() {
        e eVar = this.d;
        if (eVar != null && eVar.getRoot().a()) {
            return false;
        }
        return true;
    }

    public final Drawable i(int i) {
        Resources.Theme theme = this.i.v;
        Context context = this.e;
        if (theme == null) {
            theme = context.getTheme();
        }
        return com.amazon.aps.iva.wc.e.a(context, context, i, theme);
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            a aVar = this.t;
            if (aVar != a.RUNNING && aVar != a.WAITING_FOR_SIZE) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void j() {
        int i;
        int i2;
        synchronized (this.b) {
            if (!this.z) {
                this.a.a();
                int i3 = com.amazon.aps.iva.hd.h.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (l.i(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        com.amazon.aps.iva.dd.a<?> aVar = this.i;
                        Drawable drawable = aVar.p;
                        this.w = drawable;
                        if (drawable == null && (i2 = aVar.q) > 0) {
                            this.w = i(i2);
                        }
                    }
                    if (this.w == null) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    k(new r("Received null model"), i);
                    return;
                }
                a aVar2 = this.t;
                if (aVar2 != a.RUNNING) {
                    boolean z = false;
                    if (aVar2 == a.COMPLETE) {
                        l(this.q, com.amazon.aps.iva.kc.a.MEMORY_CACHE, false);
                        return;
                    }
                    List<g<R>> list = this.n;
                    if (list != null) {
                        for (g<R> gVar : list) {
                            if (gVar instanceof c) {
                                ((c) gVar).getClass();
                            }
                        }
                    }
                    a aVar3 = a.WAITING_FOR_SIZE;
                    this.t = aVar3;
                    if (l.i(this.j, this.k)) {
                        b(this.j, this.k);
                    } else {
                        this.m.getSize(this);
                    }
                    a aVar4 = this.t;
                    if (aVar4 == a.RUNNING || aVar4 == aVar3) {
                        e eVar = this.d;
                        if ((eVar == null || eVar.g(this)) ? true : true) {
                            this.m.onLoadStarted(g());
                        }
                    }
                    if (B) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void k(r rVar, int i) {
        int i2;
        int i3;
        this.a.a();
        synchronized (this.b) {
            rVar.getClass();
            int i4 = this.f.i;
            if (i4 <= i) {
                Objects.toString(this.g);
                if (i4 <= 4) {
                    ArrayList arrayList = new ArrayList();
                    r.a(rVar, arrayList);
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        int i6 = i5 + 1;
                        Throwable th = (Throwable) arrayList.get(i5);
                        i5 = i6;
                    }
                }
            }
            Drawable drawable = null;
            this.r = null;
            this.t = a.FAILED;
            e eVar = this.d;
            if (eVar != null) {
                eVar.e(this);
            }
            boolean z = true;
            this.z = true;
            List<g<R>> list = this.n;
            if (list != null) {
                for (g<R> gVar : list) {
                    com.amazon.aps.iva.ed.h<R> hVar = this.m;
                    h();
                    gVar.a(rVar, hVar);
                }
            }
            g<R> gVar2 = this.c;
            if (gVar2 != null) {
                com.amazon.aps.iva.ed.h<R> hVar2 = this.m;
                h();
                gVar2.a(rVar, hVar2);
            }
            e eVar2 = this.d;
            if (eVar2 != null && !eVar2.g(this)) {
                z = false;
            }
            if (this.g == null) {
                if (this.w == null) {
                    com.amazon.aps.iva.dd.a<?> aVar = this.i;
                    Drawable drawable2 = aVar.p;
                    this.w = drawable2;
                    if (drawable2 == null && (i3 = aVar.q) > 0) {
                        this.w = i(i3);
                    }
                }
                drawable = this.w;
            }
            if (drawable == null) {
                if (this.u == null) {
                    com.amazon.aps.iva.dd.a<?> aVar2 = this.i;
                    Drawable drawable3 = aVar2.f;
                    this.u = drawable3;
                    if (drawable3 == null && (i2 = aVar2.g) > 0) {
                        this.u = i(i2);
                    }
                }
                drawable = this.u;
            }
            if (drawable == null) {
                drawable = g();
            }
            this.m.onLoadFailed(drawable);
            this.z = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b7 -> B:63:0x00ba). Please submit an issue!!! */
    public final void l(w<?> wVar, com.amazon.aps.iva.kc.a aVar, boolean z) {
        j jVar;
        j jVar2;
        Throwable th;
        Object obj;
        String str;
        boolean z2;
        this.a.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.r = null;
                    if (wVar == null) {
                        k(new r("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = wVar.get();
                    try {
                        if (obj2 != null && this.h.isAssignableFrom(obj2.getClass())) {
                            e eVar = this.d;
                            if (eVar != null && !eVar.h(this)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                this.q = null;
                                this.t = a.COMPLETE;
                                this.s.getClass();
                                m.d(wVar);
                            }
                            m(wVar, obj2, aVar, z);
                            return;
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(wVar);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        k(new r(sb.toString()), 5);
                        this.s.getClass();
                        m.d(wVar);
                    } catch (Throwable th2) {
                        th = th2;
                        wVar2 = wVar;
                        jVar = this;
                        try {
                            try {
                            } catch (Throwable th3) {
                                jVar2 = jVar;
                                th = th3;
                                j jVar3 = jVar2;
                                th = th;
                                jVar = jVar3;
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                            if (wVar2 != null) {
                                jVar.s.getClass();
                                m.d(wVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    jVar2 = this;
                    j jVar32 = jVar2;
                    th = th;
                    jVar = jVar32;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            jVar = this;
        }
    }

    public final void m(w<R> wVar, R r, com.amazon.aps.iva.kc.a aVar, boolean z) {
        boolean z2;
        boolean h = h();
        this.t = a.COMPLETE;
        this.q = wVar;
        if (this.f.i <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.g);
            int i = com.amazon.aps.iva.hd.h.a;
            SystemClock.elapsedRealtimeNanos();
        }
        e eVar = this.d;
        if (eVar != null) {
            eVar.b(this);
        }
        boolean z3 = true;
        this.z = true;
        try {
            List<g<R>> list = this.n;
            if (list != null) {
                z2 = false;
                for (g<R> gVar : list) {
                    z2 |= gVar.b(r, this.g, this.m, aVar, h);
                    if (gVar instanceof c) {
                        z2 |= ((c) gVar).c();
                    }
                }
            } else {
                z2 = false;
            }
            g<R> gVar2 = this.c;
            if (gVar2 == null || !gVar2.b(r, this.g, this.m, aVar, h)) {
                z3 = false;
            }
            if (!(z3 | z2)) {
                this.m.onResourceReady(r, this.o.a(aVar));
            }
        } finally {
            this.z = false;
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void pause() {
        synchronized (this.b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
