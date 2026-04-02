package e.d.b.b.j.y;

import android.content.Context;
/* loaded from: classes.dex */
public final class j implements g.a.a {
    public final g.a.a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.e0.a> f6302b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.e0.a> f6303c;

    public j(g.a.a<Context> aVar, g.a.a<e.d.b.b.j.e0.a> aVar2, g.a.a<e.d.b.b.j.e0.a> aVar3) {
        this.a = aVar;
        this.f6302b = aVar2;
        this.f6303c = aVar3;
    }

    @Override // g.a.a
    public Object get() {
        return new i(this.a.get(), this.f6302b.get(), this.f6303c.get());
    }
}
