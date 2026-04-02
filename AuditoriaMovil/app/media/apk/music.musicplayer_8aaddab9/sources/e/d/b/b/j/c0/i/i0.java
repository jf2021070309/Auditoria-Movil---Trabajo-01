package e.d.b.b.j.c0.i;

import java.util.Objects;
/* loaded from: classes.dex */
public final class i0 implements g.a.a {
    public final g.a.a<e.d.b.b.j.e0.a> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a.a<e.d.b.b.j.e0.a> f6216b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a.a<b0> f6217c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a.a<j0> f6218d;

    /* renamed from: e  reason: collision with root package name */
    public final g.a.a<String> f6219e;

    public i0(g.a.a<e.d.b.b.j.e0.a> aVar, g.a.a<e.d.b.b.j.e0.a> aVar2, g.a.a<b0> aVar3, g.a.a<j0> aVar4, g.a.a<String> aVar5) {
        this.a = aVar;
        this.f6216b = aVar2;
        this.f6217c = aVar3;
        this.f6218d = aVar4;
        this.f6219e = aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [e.d.b.b.j.z.a] */
    @Override // g.a.a
    public Object get() {
        e.d.b.b.j.z.b.a aVar;
        e.d.b.b.j.e0.a aVar2 = this.a.get();
        e.d.b.b.j.e0.a aVar3 = this.f6216b.get();
        b0 b0Var = this.f6217c.get();
        j0 j0Var = this.f6218d.get();
        g.a.a<String> aVar4 = this.f6219e;
        Object obj = e.d.b.b.j.z.b.a.a;
        if (aVar4 instanceof e.d.b.b.j.z.a) {
            aVar = (e.d.b.b.j.z.a) aVar4;
        } else {
            Objects.requireNonNull(aVar4);
            aVar = new e.d.b.b.j.z.b.a(aVar4);
        }
        return new h0(aVar2, aVar3, b0Var, j0Var, aVar);
    }
}
