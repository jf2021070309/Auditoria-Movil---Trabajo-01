package e.b.a.a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b {
    public final e.b.a.a.z.h a;

    /* renamed from: d  reason: collision with root package name */
    public final e.b.a.a.z.c f5240d;

    /* renamed from: f  reason: collision with root package name */
    public final e.b.a.a.c0.a f5242f;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f5239c = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f5241e = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<e.b.a.a.v.a> f5238b = new CopyOnWriteArrayList<>();

    public b(e.b.a.a.z.c cVar, e.b.a.a.c0.a aVar) {
        this.f5242f = aVar;
        this.a = new e.b.a.a.z.h(aVar, cVar, "jq_callback");
        this.f5240d = cVar;
    }

    public final boolean a() {
        return this.f5239c.get() > 0;
    }

    public void b(h hVar, boolean z, Throwable th) {
        if (a()) {
            e.b.a.a.z.k.b bVar = (e.b.a.a.z.k.b) this.f5240d.a(e.b.a.a.z.k.b.class);
            bVar.f5424h = 3;
            bVar.f5420d = z;
            bVar.f5421e = hVar;
            bVar.f5423g = th;
            this.a.a(bVar);
        }
    }

    public void c(h hVar) {
        if (a()) {
            e.b.a.a.z.k.b bVar = (e.b.a.a.z.k.b) this.f5240d.a(e.b.a.a.z.k.b.class);
            bVar.f5424h = 4;
            bVar.f5421e = hVar;
            this.a.a(bVar);
        }
    }

    public final void d() {
        if (this.f5241e.getAndSet(true)) {
            return;
        }
        try {
            new Thread(new a(this), "job-manager-callbacks").start();
        } catch (InternalError e2) {
            e.b.a.a.y.c.a.d(e2, "Cannot start a thread. Looks like app is shutting down.See issue #294 for details.", new Object[0]);
        }
    }
}
