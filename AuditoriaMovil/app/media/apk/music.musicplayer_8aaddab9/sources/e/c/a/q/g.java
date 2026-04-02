package e.c.a.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import e.c.a.m.s.l;
import e.c.a.m.s.r;
import e.c.a.m.s.w;
import e.c.a.q.h.h;
import e.c.a.s.j;
import e.c.a.s.k.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g<R> implements b, e.c.a.q.h.g, f {
    public static final boolean a = Log.isLoggable("Request", 2);
    public int A;
    public int B;
    public boolean C;
    public RuntimeException D;

    /* renamed from: b  reason: collision with root package name */
    public final String f5995b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.s.k.d f5996c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5997d;

    /* renamed from: e  reason: collision with root package name */
    public final d<R> f5998e;

    /* renamed from: f  reason: collision with root package name */
    public final c f5999f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f6000g;

    /* renamed from: h  reason: collision with root package name */
    public final e.c.a.d f6001h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f6002i;

    /* renamed from: j  reason: collision with root package name */
    public final Class<R> f6003j;

    /* renamed from: k  reason: collision with root package name */
    public final e.c.a.q.a<?> f6004k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6005l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6006m;

    /* renamed from: n  reason: collision with root package name */
    public final e.c.a.f f6007n;
    public final h<R> o;
    public final List<d<R>> p;
    public final e.c.a.q.i.c<? super R> q;
    public final Executor r;
    public w<R> s;
    public l.d t;
    public long u;
    public volatile l v;
    public a w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public g(Context context, e.c.a.d dVar, Object obj, Object obj2, Class<R> cls, e.c.a.q.a<?> aVar, int i2, int i3, e.c.a.f fVar, h<R> hVar, d<R> dVar2, List<d<R>> list, c cVar, l lVar, e.c.a.q.i.c<? super R> cVar2, Executor executor) {
        this.f5995b = a ? String.valueOf(hashCode()) : null;
        this.f5996c = new d.b();
        this.f5997d = obj;
        this.f6000g = context;
        this.f6001h = dVar;
        this.f6002i = obj2;
        this.f6003j = cls;
        this.f6004k = aVar;
        this.f6005l = i2;
        this.f6006m = i3;
        this.f6007n = fVar;
        this.o = hVar;
        this.f5998e = dVar2;
        this.p = list;
        this.f5999f = cVar;
        this.v = lVar;
        this.q = cVar2;
        this.r = executor;
        this.w = a.PENDING;
        if (this.D == null && dVar.f5465i) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // e.c.a.q.h.g
    public void a(int i2, int i3) {
        Object obj;
        int i4 = i2;
        this.f5996c.a();
        Object obj2 = this.f5997d;
        synchronized (obj2) {
            try {
                boolean z = a;
                if (z) {
                    e.c.a.s.f.a(this.u);
                }
                if (this.w == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.w = aVar;
                    float f2 = this.f6004k.f5982b;
                    if (i4 != Integer.MIN_VALUE) {
                        i4 = Math.round(i4 * f2);
                    }
                    this.A = i4;
                    this.B = i3 == Integer.MIN_VALUE ? i3 : Math.round(f2 * i3);
                    if (z) {
                        e.c.a.s.f.a(this.u);
                    }
                    l lVar = this.v;
                    e.c.a.d dVar = this.f6001h;
                    Object obj3 = this.f6002i;
                    e.c.a.q.a<?> aVar2 = this.f6004k;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.t = lVar.b(dVar, obj3, aVar2.f5992l, this.A, this.B, aVar2.s, this.f6003j, this.f6007n, aVar2.f5983c, aVar2.r, aVar2.f5993m, aVar2.y, aVar2.q, aVar2.f5989i, aVar2.w, aVar2.z, aVar2.x, this, this.r);
                                if (this.w != aVar) {
                                    this.t = null;
                                }
                                if (z) {
                                    e.c.a.s.f.a(this.u);
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

    @Override // e.c.a.q.b
    public boolean b() {
        boolean z;
        synchronized (this.f5997d) {
            z = this.w == a.CLEARED;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[Catch: all -> 0x009e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0021, B:9:0x0029, B:13:0x0032, B:14:0x003c, B:16:0x003e, B:18:0x0044, B:20:0x0048, B:21:0x004f, B:23:0x0051, B:25:0x005f, B:27:0x006c, B:39:0x008b, B:41:0x008f, B:42:0x0094, B:30:0x0072, B:32:0x0076, B:38:0x0082, B:26:0x0067, B:44:0x0096, B:45:0x009d), top: B:49:0x0003 }] */
    @Override // e.c.a.q.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5997d
            monitor-enter(r0)
            r5.e()     // Catch: java.lang.Throwable -> L9e
            e.c.a.s.k.d r1 = r5.f5996c     // Catch: java.lang.Throwable -> L9e
            r1.a()     // Catch: java.lang.Throwable -> L9e
            int r1 = e.c.a.s.f.f6026b     // Catch: java.lang.Throwable -> L9e
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L9e
            r5.u = r1     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r5.f6002i     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L3e
            int r1 = r5.f6005l     // Catch: java.lang.Throwable -> L9e
            int r2 = r5.f6006m     // Catch: java.lang.Throwable -> L9e
            boolean r1 = e.c.a.s.j.i(r1, r2)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L29
            int r1 = r5.f6005l     // Catch: java.lang.Throwable -> L9e
            r5.A = r1     // Catch: java.lang.Throwable -> L9e
            int r1 = r5.f6006m     // Catch: java.lang.Throwable -> L9e
            r5.B = r1     // Catch: java.lang.Throwable -> L9e
        L29:
            android.graphics.drawable.Drawable r1 = r5.g()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L31
            r1 = 5
            goto L32
        L31:
            r1 = 3
        L32:
            e.c.a.m.s.r r2 = new e.c.a.m.s.r     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            r5.l(r2, r1)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return
        L3e:
            e.c.a.q.g$a r1 = r5.w     // Catch: java.lang.Throwable -> L9e
            e.c.a.q.g$a r2 = e.c.a.q.g.a.RUNNING     // Catch: java.lang.Throwable -> L9e
            if (r1 == r2) goto L96
            e.c.a.q.g$a r3 = e.c.a.q.g.a.COMPLETE     // Catch: java.lang.Throwable -> L9e
            if (r1 != r3) goto L51
            e.c.a.m.s.w<R> r1 = r5.s     // Catch: java.lang.Throwable -> L9e
            e.c.a.m.a r2 = e.c.a.m.a.MEMORY_CACHE     // Catch: java.lang.Throwable -> L9e
            r5.m(r1, r2)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return
        L51:
            e.c.a.q.g$a r1 = e.c.a.q.g.a.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L9e
            r5.w = r1     // Catch: java.lang.Throwable -> L9e
            int r3 = r5.f6005l     // Catch: java.lang.Throwable -> L9e
            int r4 = r5.f6006m     // Catch: java.lang.Throwable -> L9e
            boolean r3 = e.c.a.s.j.i(r3, r4)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L67
            int r3 = r5.f6005l     // Catch: java.lang.Throwable -> L9e
            int r4 = r5.f6006m     // Catch: java.lang.Throwable -> L9e
            r5.a(r3, r4)     // Catch: java.lang.Throwable -> L9e
            goto L6c
        L67:
            e.c.a.q.h.h<R> r3 = r5.o     // Catch: java.lang.Throwable -> L9e
            r3.h(r5)     // Catch: java.lang.Throwable -> L9e
        L6c:
            e.c.a.q.g$a r3 = r5.w     // Catch: java.lang.Throwable -> L9e
            if (r3 == r2) goto L72
            if (r3 != r1) goto L8b
        L72:
            e.c.a.q.c r1 = r5.f5999f     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L7f
            boolean r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L7d
            goto L7f
        L7d:
            r1 = 0
            goto L80
        L7f:
            r1 = 1
        L80:
            if (r1 == 0) goto L8b
            e.c.a.q.h.h<R> r1 = r5.o     // Catch: java.lang.Throwable -> L9e
            android.graphics.drawable.Drawable r2 = r5.h()     // Catch: java.lang.Throwable -> L9e
            r1.e(r2)     // Catch: java.lang.Throwable -> L9e
        L8b:
            boolean r1 = e.c.a.q.g.a     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L94
            long r1 = r5.u     // Catch: java.lang.Throwable -> L9e
            e.c.a.s.f.a(r1)     // Catch: java.lang.Throwable -> L9e
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return
        L96:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9e
            throw r1     // Catch: java.lang.Throwable -> L9e
        L9e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.q.g.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0013, B:10:0x001b, B:12:0x001f, B:14:0x0023, B:20:0x002f, B:21:0x0038, B:22:0x003a), top: B:29:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // e.c.a.q.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5997d
            monitor-enter(r0)
            r5.e()     // Catch: java.lang.Throwable -> L43
            e.c.a.s.k.d r1 = r5.f5996c     // Catch: java.lang.Throwable -> L43
            r1.a()     // Catch: java.lang.Throwable -> L43
            e.c.a.q.g$a r1 = r5.w     // Catch: java.lang.Throwable -> L43
            e.c.a.q.g$a r2 = e.c.a.q.g.a.CLEARED     // Catch: java.lang.Throwable -> L43
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L13:
            r5.f()     // Catch: java.lang.Throwable -> L43
            e.c.a.m.s.w<R> r1 = r5.s     // Catch: java.lang.Throwable -> L43
            r3 = 0
            if (r1 == 0) goto L1e
            r5.s = r3     // Catch: java.lang.Throwable -> L43
            goto L1f
        L1e:
            r1 = r3
        L1f:
            e.c.a.q.c r3 = r5.f5999f     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2c
            boolean r3 = r3.g(r5)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            e.c.a.q.h.h<R> r3 = r5.o     // Catch: java.lang.Throwable -> L43
            android.graphics.drawable.Drawable r4 = r5.h()     // Catch: java.lang.Throwable -> L43
            r3.g(r4)     // Catch: java.lang.Throwable -> L43
        L38:
            r5.w = r2     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L42
            e.c.a.m.s.l r0 = r5.v
            r0.f(r1)
        L42:
            return
        L43:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.q.g.clear():void");
    }

    @Override // e.c.a.q.b
    public boolean d() {
        boolean z;
        synchronized (this.f5997d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    public final void e() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void f() {
        e();
        this.f5996c.a();
        this.o.a(this);
        l.d dVar = this.t;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.a.h(dVar.f5718b);
            }
            this.t = null;
        }
    }

    public final Drawable g() {
        int i2;
        if (this.z == null) {
            e.c.a.q.a<?> aVar = this.f6004k;
            Drawable drawable = aVar.o;
            this.z = drawable;
            if (drawable == null && (i2 = aVar.p) > 0) {
                this.z = k(i2);
            }
        }
        return this.z;
    }

    public final Drawable h() {
        int i2;
        if (this.y == null) {
            e.c.a.q.a<?> aVar = this.f6004k;
            Drawable drawable = aVar.f5987g;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.f5988h) > 0) {
                this.y = k(i2);
            }
        }
        return this.y;
    }

    public boolean i(b bVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        e.c.a.q.a<?> aVar;
        e.c.a.f fVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        e.c.a.q.a<?> aVar2;
        e.c.a.f fVar2;
        int size2;
        if (bVar instanceof g) {
            synchronized (this.f5997d) {
                i2 = this.f6005l;
                i3 = this.f6006m;
                obj = this.f6002i;
                cls = this.f6003j;
                aVar = this.f6004k;
                fVar = this.f6007n;
                List<d<R>> list = this.p;
                size = list != null ? list.size() : 0;
            }
            g gVar = (g) bVar;
            synchronized (gVar.f5997d) {
                i4 = gVar.f6005l;
                i5 = gVar.f6006m;
                obj2 = gVar.f6002i;
                cls2 = gVar.f6003j;
                aVar2 = gVar.f6004k;
                fVar2 = gVar.f6007n;
                List<d<R>> list2 = gVar.p;
                size2 = list2 != null ? list2.size() : 0;
            }
            if (i2 == i4 && i3 == i5) {
                char[] cArr = j.a;
                if ((obj == null ? obj2 == null : obj instanceof e.c.a.m.t.l ? ((e.c.a.m.t.l) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.c.a.q.b
    public boolean isRunning() {
        boolean z;
        synchronized (this.f5997d) {
            a aVar = this.w;
            z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z;
    }

    public final boolean j() {
        c cVar = this.f5999f;
        return cVar == null || !cVar.c().b();
    }

    public final Drawable k(int i2) {
        Resources.Theme theme = this.f6004k.u;
        if (theme == null) {
            theme = this.f6000g.getTheme();
        }
        e.c.a.d dVar = this.f6001h;
        return e.c.a.m.u.e.a.a(dVar, dVar, i2, theme);
    }

    public final void l(r rVar, int i2) {
        boolean z;
        this.f5996c.a();
        synchronized (this.f5997d) {
            Objects.requireNonNull(rVar);
            int i3 = this.f6001h.f5466j;
            if (i3 <= i2) {
                Log.w("Glide", "Load failed for " + this.f6002i + " with size [" + this.A + "x" + this.B + "]", rVar);
                if (i3 <= 4) {
                    ArrayList arrayList = new ArrayList();
                    rVar.a(rVar, arrayList);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        int i5 = i4 + 1;
                        Throwable th = (Throwable) arrayList.get(i4);
                        i4 = i5;
                    }
                }
            }
            this.t = null;
            this.w = a.FAILED;
            boolean z2 = true;
            this.C = true;
            List<d<R>> list = this.p;
            if (list != null) {
                z = false;
                for (d<R> dVar : list) {
                    z |= dVar.a(rVar, this.f6002i, this.o, j());
                }
            } else {
                z = false;
            }
            d<R> dVar2 = this.f5998e;
            if (dVar2 == null || !dVar2.a(rVar, this.f6002i, this.o, j())) {
                z2 = false;
            }
            if (!(z | z2)) {
                o();
            }
            this.C = false;
            c cVar = this.f5999f;
            if (cVar != null) {
                cVar.a(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(w<?> wVar, e.c.a.m.a aVar) {
        this.f5996c.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.f5997d) {
                try {
                    this.t = null;
                    if (wVar == null) {
                        l(new r("Expected to receive a Resource<R> with an object of " + this.f6003j + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    try {
                        if (obj != null && this.f6003j.isAssignableFrom(obj.getClass())) {
                            c cVar = this.f5999f;
                            if (cVar == null || cVar.e(this)) {
                                n(wVar, obj, aVar);
                                return;
                            }
                            this.s = null;
                            this.w = a.COMPLETE;
                            this.v.f(wVar);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f6003j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(wVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        l(new r(sb.toString()), 5);
                        this.v.f(wVar);
                    } catch (Throwable th) {
                        wVar2 = wVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (wVar2 != null) {
                this.v.f(wVar2);
            }
            throw th3;
        }
    }

    public final void n(w<R> wVar, R r, e.c.a.m.a aVar) {
        boolean z;
        boolean j2 = j();
        this.w = a.COMPLETE;
        this.s = wVar;
        if (this.f6001h.f5466j <= 3) {
            StringBuilder y = e.a.d.a.a.y("Finished loading ");
            y.append(r.getClass().getSimpleName());
            y.append(" from ");
            y.append(aVar);
            y.append(" for ");
            y.append(this.f6002i);
            y.append(" with size [");
            y.append(this.A);
            y.append("x");
            y.append(this.B);
            y.append("] in ");
            y.append(e.c.a.s.f.a(this.u));
            y.append(" ms");
            y.toString();
        }
        boolean z2 = true;
        this.C = true;
        try {
            List<d<R>> list = this.p;
            if (list != null) {
                z = false;
                for (d<R> dVar : list) {
                    z |= dVar.b(r, this.f6002i, this.o, aVar, j2);
                }
            } else {
                z = false;
            }
            d<R> dVar2 = this.f5998e;
            if (dVar2 == null || !dVar2.b(r, this.f6002i, this.o, aVar, j2)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                Objects.requireNonNull(this.q);
                this.o.b(r, e.c.a.q.i.a.a);
            }
            this.C = false;
            c cVar = this.f5999f;
            if (cVar != null) {
                cVar.f(this);
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    public final void o() {
        int i2;
        c cVar = this.f5999f;
        if (cVar == null || cVar.d(this)) {
            Drawable g2 = this.f6002i == null ? g() : null;
            if (g2 == null) {
                if (this.x == null) {
                    e.c.a.q.a<?> aVar = this.f6004k;
                    Drawable drawable = aVar.f5985e;
                    this.x = drawable;
                    if (drawable == null && (i2 = aVar.f5986f) > 0) {
                        this.x = k(i2);
                    }
                }
                g2 = this.x;
            }
            if (g2 == null) {
                g2 = h();
            }
            this.o.d(g2);
        }
    }

    @Override // e.c.a.q.b
    public void pause() {
        synchronized (this.f5997d) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
