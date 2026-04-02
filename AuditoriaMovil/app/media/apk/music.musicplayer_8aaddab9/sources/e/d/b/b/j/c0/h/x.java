package e.d.b.b.j.c0.h;

import e.d.b.b.j.c0.i.a0;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class x implements g.a.a {
    public final g.a.a<Executor> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<a0> f6203b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<y> f6204c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.d0.b> f6205d;

    public x(g.a.a<Executor> aVar, g.a.a<a0> aVar2, g.a.a<y> aVar3, g.a.a<e.d.b.b.j.d0.b> aVar4) {
        this.a = aVar;
        this.f6203b = aVar2;
        this.f6204c = aVar3;
        this.f6205d = aVar4;
    }

    @Override // g.a.a
    public Object get() {
        return new w(this.a.get(), this.f6203b.get(), this.f6204c.get(), this.f6205d.get());
    }
}
