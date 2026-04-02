package c.c0;

import c.c0.d0.t.s.a;
import i.a.g1;
import i.a.l1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class o<R> implements e.d.c.a.a.a<R> {
    public final g1 a;

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.t.s.c<R> f1603b;

    public o(g1 g1Var, c.c0.d0.t.s.c cVar, int i2) {
        c.c0.d0.t.s.c<R> cVar2;
        if ((i2 & 2) != 0) {
            cVar2 = new c.c0.d0.t.s.c<>();
            h.o.c.j.d(cVar2, "create()");
        } else {
            cVar2 = null;
        }
        h.o.c.j.e(g1Var, "job");
        h.o.c.j.e(cVar2, "underlying");
        this.a = g1Var;
        this.f1603b = cVar2;
        ((l1) g1Var).u(false, true, new n(this));
    }

    @Override // e.d.c.a.a.a
    public void a(Runnable runnable, Executor executor) {
        this.f1603b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f1603b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f1603b.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) {
        return this.f1603b.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1603b.f1578e instanceof a.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f1603b.isDone();
    }
}
