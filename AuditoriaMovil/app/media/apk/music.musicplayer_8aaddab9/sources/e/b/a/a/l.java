package e.b.a.a;

import android.content.Context;
import e.b.a.a.a0.a;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class l implements Runnable, a.InterfaceC0105a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5365b;

    /* renamed from: c  reason: collision with root package name */
    public final e.b.a.a.z.g f5366c;

    /* renamed from: d  reason: collision with root package name */
    public final m f5367d;

    /* renamed from: e  reason: collision with root package name */
    public final m f5368e;

    /* renamed from: g  reason: collision with root package name */
    public final e.b.a.a.c0.a f5370g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f5371h;

    /* renamed from: j  reason: collision with root package name */
    public final e.b.a.a.z.c f5373j;

    /* renamed from: k  reason: collision with root package name */
    public final e.b.a.a.a0.b f5374k;

    /* renamed from: l  reason: collision with root package name */
    public List<c> f5375l;

    /* renamed from: n  reason: collision with root package name */
    public final long f5377n;

    /* renamed from: f  reason: collision with root package name */
    public final e f5369f = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f5372i = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5376m = true;
    public boolean o = false;

    /* loaded from: classes.dex */
    public class a extends e.b.a.a.z.f {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0324  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02c9  */
        @Override // e.b.a.a.z.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(e.b.a.a.z.b r20) {
            /*
                Method dump skipped, instructions count: 1748
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.a.a.l.a.a(e.b.a.a.z.b):void");
        }

        @Override // e.b.a.a.z.f
        public void b() {
            e.b.a.a.y.c.a.b("joq idle. running:? %s", Boolean.valueOf(l.this.f5376m));
            l lVar = l.this;
            if (lVar.f5376m) {
                if (!lVar.f5372i) {
                    e.b.a.a.y.c.a.b("skipping scheduling a new idle callback because looks like last one did not do anything", new Object[0]);
                    return;
                }
                long j2 = lVar.f5365b.a.a;
                Long valueOf = j2 == Long.MAX_VALUE ? null : Long.valueOf(j2);
                int c2 = lVar.c();
                Collection<String> c3 = lVar.f5365b.a.c();
                lVar.f5369f.a();
                lVar.f5369f.f5299e = lVar.f5370g.a();
                e eVar = lVar.f5369f;
                eVar.f5298d = c2;
                eVar.b(c3);
                e eVar2 = lVar.f5369f;
                eVar2.f5297c = true;
                Long h2 = lVar.f5367d.h(eVar2);
                Long h3 = lVar.f5368e.h(lVar.f5369f);
                Long l2 = valueOf != null ? valueOf : null;
                if (h2 != null) {
                    long longValue = h2.longValue();
                    if (l2 != null) {
                        longValue = Math.min(longValue, l2.longValue());
                    }
                    l2 = Long.valueOf(longValue);
                }
                if (h3 != null) {
                    long longValue2 = h3.longValue();
                    if (l2 != null) {
                        longValue2 = Math.min(longValue2, l2.longValue());
                    }
                    l2 = Long.valueOf(longValue2);
                }
                if (!(lVar.f5374k instanceof e.b.a.a.a0.a)) {
                    long a = lVar.f5370g.a() + k.a;
                    if (l2 != null) {
                        a = Math.min(a, l2.longValue());
                    }
                    l2 = Long.valueOf(a);
                }
                e.b.a.a.y.c.a.a("Job queue idle. next job at: %s", l2);
                if (l2 == null) {
                    Objects.requireNonNull(l.this);
                    return;
                }
                e.b.a.a.z.k.f fVar = (e.b.a.a.z.k.f) l.this.f5373j.a(e.b.a.a.z.k.f.class);
                fVar.f5428d = true;
                e.b.a.a.z.g gVar = l.this.f5366c;
                long longValue3 = l2.longValue();
                synchronized (gVar.a) {
                    gVar.f5405d = true;
                    gVar.f5403b.a(fVar, longValue3);
                    e.b.a.a.c0.a aVar = gVar.f5408g;
                    Object obj = gVar.a;
                    Objects.requireNonNull(aVar);
                    obj.notifyAll();
                }
            }
        }
    }

    public l(e.b.a.a.w.a aVar, e.b.a.a.z.g gVar, e.b.a.a.z.c cVar) {
        this.f5366c = gVar;
        e.b.a.a.y.a aVar2 = aVar.f5388c;
        if (aVar2 != null) {
            e.b.a.a.y.c.a = aVar2;
        }
        this.f5373j = cVar;
        e.b.a.a.c0.a aVar3 = aVar.f5394i;
        this.f5370g = aVar3;
        this.f5371h = aVar.a;
        long a2 = aVar3.a();
        this.f5377n = a2;
        this.f5368e = new e.b.a.a.u.a(new e.b.a.a.b0.a.d(aVar, a2, ((g) aVar.f5393h).a));
        Objects.requireNonNull((g) aVar.f5393h);
        this.f5367d = new e.b.a.a.u.a(new e.b.a.a.x.a(a2));
        e.b.a.a.a0.b bVar = aVar.f5392g;
        this.f5374k = bVar;
        if (bVar instanceof e.b.a.a.a0.a) {
            ((e.b.a.a.a0.a) bVar).a(this);
        }
        this.f5365b = new f(this, aVar3, cVar, aVar);
        this.a = new b(cVar, aVar3);
    }

    public final void a(i iVar, int i2) {
        try {
            iVar.f5336e.f(i2, iVar.r);
        } catch (Throwable th) {
            e.b.a.a.y.c.a.d(th, "job's onCancel did throw an exception, ignoring...", new Object[0]);
        }
        this.a.b(iVar.f5336e, false, iVar.r);
    }

    public final int b(int i2) {
        Collection<String> c2 = this.f5365b.a.c();
        this.f5369f.a();
        this.f5369f.f5299e = this.f5370g.a();
        e eVar = this.f5369f;
        eVar.f5298d = i2;
        eVar.b(c2);
        e eVar2 = this.f5369f;
        eVar2.f5297c = true;
        eVar2.f5302h = Long.valueOf(this.f5370g.a());
        return this.f5368e.b(this.f5369f) + this.f5367d.b(this.f5369f) + 0;
    }

    public final int c() {
        e.b.a.a.a0.b bVar = this.f5374k;
        if (bVar == null) {
            return 2;
        }
        return ((e.b.a.a.a0.c) bVar).c(this.f5371h);
    }

    public final void d(i iVar) {
        if (!iVar.f5340i) {
            if (iVar.f5336e.f5330i) {
                this.f5368e.i(iVar);
                return;
            } else {
                this.f5367d.i(iVar);
                return;
            }
        }
        e.b.a.a.y.c.a.a("not re-adding cancelled job " + iVar, new Object[0]);
    }

    public final void e(i iVar) {
        if (iVar.f5336e.f5330i) {
            this.f5368e.j(iVar);
        } else {
            this.f5367d.j(iVar);
        }
        this.a.c(iVar.f5336e);
    }

    @Override // java.lang.Runnable
    public void run() {
        e.b.a.a.z.b bVar;
        long a2;
        Long b2;
        e.b.a.a.z.g gVar = this.f5366c;
        a aVar = new a();
        if (gVar.f5407f.getAndSet(true)) {
            throw new IllegalStateException("only 1 consumer per MQ");
        }
        while (gVar.f5407f.get()) {
            boolean z = false;
            while (true) {
                if (!gVar.f5407f.get()) {
                    bVar = null;
                    break;
                }
                synchronized (gVar.a) {
                    a2 = gVar.f5408g.a();
                    e.b.a.a.y.c.a.a("[%s] looking for next message at time %s", "priority_mq", Long.valueOf(a2));
                    b2 = gVar.f5403b.b(a2, gVar);
                    e.b.a.a.y.c.a.a("[%s] next delayed job %s", "priority_mq", b2);
                    for (int i2 = e.b.a.a.z.i.MAX_PRIORITY; i2 >= 0; i2--) {
                        e.b.a.a.z.j jVar = gVar.f5406e[i2];
                        if (jVar != null && (bVar = jVar.c()) != null) {
                        }
                    }
                    gVar.f5405d = false;
                }
                if (!z) {
                    aVar.b();
                    z = true;
                }
                synchronized (gVar.a) {
                    e.b.a.a.y.c.a.a("[%s] did on idle post a message? %s", "priority_mq", Boolean.valueOf(gVar.f5405d));
                    if (!gVar.f5405d) {
                        if (b2 == null || b2.longValue() > a2) {
                            if (gVar.f5407f.get()) {
                                if (b2 == null) {
                                    try {
                                        e.b.a.a.c0.a aVar2 = gVar.f5408g;
                                        Object obj = gVar.a;
                                        Objects.requireNonNull(aVar2);
                                        obj.wait();
                                    } catch (InterruptedException unused) {
                                    }
                                } else {
                                    gVar.f5408g.b(gVar.a, b2.longValue());
                                }
                            }
                        }
                    }
                }
            }
            if (bVar != null) {
                e.b.a.a.y.c.a.a("[%s] consuming message of type %s", "priority_mq", bVar.f5400b);
                aVar.a(bVar);
                gVar.f5404c.b(bVar);
            }
        }
    }
}
