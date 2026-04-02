package c.c0.d0.t;

import c.c0.y;
import java.util.UUID;
/* loaded from: classes.dex */
public class p implements Runnable {
    public final /* synthetic */ UUID a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.c0.f f1564b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.c0.d0.t.s.c f1565c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f1566d;

    public p(q qVar, UUID uuid, c.c0.f fVar, c.c0.d0.t.s.c cVar) {
        this.f1566d = qVar;
        this.a = uuid;
        this.f1564b = fVar;
        this.f1565c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c.c0.d0.s.p i2;
        String uuid = this.a.toString();
        c.c0.r c2 = c.c0.r.c();
        String str = q.a;
        c2.a(str, String.format("Updating progress for %s (%s)", this.a, this.f1564b), new Throwable[0]);
        this.f1566d.f1567b.c();
        try {
            i2 = ((c.c0.d0.s.r) this.f1566d.f1567b.q()).i(uuid);
        } finally {
            try {
            } finally {
            }
        }
        if (i2 == null) {
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        if (i2.f1507b == y.RUNNING) {
            c.c0.d0.s.m mVar = new c.c0.d0.s.m(uuid, this.f1564b);
            c.c0.d0.s.o oVar = (c.c0.d0.s.o) this.f1566d.f1567b.p();
            oVar.a.b();
            oVar.a.c();
            oVar.f1504b.e(mVar);
            oVar.a.k();
            oVar.a.g();
        } else {
            c.c0.r.c().f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
        }
        this.f1565c.j(null);
        this.f1566d.f1567b.k();
    }
}
