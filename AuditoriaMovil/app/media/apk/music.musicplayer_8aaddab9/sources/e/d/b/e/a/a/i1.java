package e.d.b.e.a.a;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class i1 implements e.d.b.e.a.c.e0<h1> {
    public final e.d.b.e.a.c.e0<z> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<e3> f6818b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<t0> f6819c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<Executor> f6820d;

    public i1(e.d.b.e.a.c.e0<z> e0Var, e.d.b.e.a.c.e0<e3> e0Var2, e.d.b.e.a.c.e0<t0> e0Var3, e.d.b.e.a.c.e0<Executor> e0Var4) {
        this.a = e0Var;
        this.f6818b = e0Var2;
        this.f6819c = e0Var3;
        this.f6820d = e0Var4;
    }

    @Override // e.d.b.e.a.c.e0
    public final /* bridge */ /* synthetic */ h1 a() {
        z a = this.a.a();
        return new h1(a, e.d.b.e.a.c.d0.b(this.f6818b), this.f6819c.a(), e.d.b.e.a.c.d0.b(this.f6820d));
    }
}
