package e.d.b.b.j.c0;

import android.content.Context;
import android.os.Build;
import e.d.b.b.j.c0.h.p;
import e.d.b.b.j.c0.h.s;
import e.d.b.b.j.c0.h.t;
import e.d.b.b.j.c0.i.a0;
/* loaded from: classes.dex */
public final class g implements g.a.a {
    public final g.a.a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<a0> f6155b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<t> f6156c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.e0.a> f6157d;

    public g(g.a.a<Context> aVar, g.a.a<a0> aVar2, g.a.a<t> aVar3, g.a.a<e.d.b.b.j.e0.a> aVar4) {
        this.a = aVar;
        this.f6155b = aVar2;
        this.f6156c = aVar3;
        this.f6157d = aVar4;
    }

    @Override // g.a.a
    public Object get() {
        Context context = this.a.get();
        a0 a0Var = this.f6155b.get();
        t tVar = this.f6156c.get();
        return Build.VERSION.SDK_INT >= 21 ? new s(context, a0Var, tVar) : new p(context, a0Var, this.f6157d.get(), tVar);
    }
}
