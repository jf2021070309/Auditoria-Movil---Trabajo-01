package e.d.b.b.j.c0;

import e.d.b.b.j.c0.h.y;
import e.d.b.b.j.c0.i.a0;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d implements g.a.a {
    public final g.a.a<Executor> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.y.e> f6151b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<y> f6152c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.a<a0> f6153d;

    /* renamed from: e  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.d0.b> f6154e;

    public d(g.a.a<Executor> aVar, g.a.a<e.d.b.b.j.y.e> aVar2, g.a.a<y> aVar3, g.a.a<a0> aVar4, g.a.a<e.d.b.b.j.d0.b> aVar5) {
        this.a = aVar;
        this.f6151b = aVar2;
        this.f6152c = aVar3;
        this.f6153d = aVar4;
        this.f6154e = aVar5;
    }

    @Override // g.a.a
    public Object get() {
        return new c(this.a.get(), this.f6151b.get(), this.f6152c.get(), this.f6153d.get(), this.f6154e.get());
    }
}
