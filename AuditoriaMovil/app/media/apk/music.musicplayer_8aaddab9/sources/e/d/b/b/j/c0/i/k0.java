package e.d.b.b.j.c0.i;

import android.content.Context;
/* loaded from: classes.dex */
public final class k0 implements g.a.a {
    public final g.a.a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<String> f6229b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<Integer> f6230c;

    public k0(g.a.a<Context> aVar, g.a.a<String> aVar2, g.a.a<Integer> aVar3) {
        this.a = aVar;
        this.f6229b = aVar2;
        this.f6230c = aVar3;
    }

    @Override // g.a.a
    public Object get() {
        return new j0(this.a.get(), this.f6229b.get(), this.f6230c.get().intValue());
    }
}
