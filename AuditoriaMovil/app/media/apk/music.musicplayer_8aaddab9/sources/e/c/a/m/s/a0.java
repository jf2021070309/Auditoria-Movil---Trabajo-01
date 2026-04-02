package e.c.a.m.s;

import e.c.a.m.r.d;
import e.c.a.m.s.g;
import e.c.a.m.t.n;
/* loaded from: classes.dex */
public class a0 implements d.a<Object> {
    public final /* synthetic */ n.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f5592b;

    public a0(b0 b0Var, n.a aVar) {
        this.f5592b = b0Var;
        this.a = aVar;
    }

    @Override // e.c.a.m.r.d.a
    public void c(Exception exc) {
        b0 b0Var = this.f5592b;
        n.a<?> aVar = this.a;
        n.a<?> aVar2 = b0Var.f5597f;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f5592b;
            n.a aVar3 = this.a;
            g.a aVar4 = b0Var2.f5593b;
            e.c.a.m.k kVar = b0Var2.f5598g;
            e.c.a.m.r.d<Data> dVar = aVar3.f5806c;
            aVar4.a(kVar, exc, dVar, dVar.d());
        }
    }

    @Override // e.c.a.m.r.d.a
    public void f(Object obj) {
        b0 b0Var = this.f5592b;
        n.a<?> aVar = this.a;
        n.a<?> aVar2 = b0Var.f5597f;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f5592b;
            n.a aVar3 = this.a;
            k kVar = b0Var2.a.p;
            if (obj != null && kVar.c(aVar3.f5806c.d())) {
                b0Var2.f5596e = obj;
                b0Var2.f5593b.c();
                return;
            }
            g.a aVar4 = b0Var2.f5593b;
            e.c.a.m.k kVar2 = aVar3.a;
            e.c.a.m.r.d<Data> dVar = aVar3.f5806c;
            aVar4.d(kVar2, obj, dVar, dVar.d(), b0Var2.f5598g);
        }
    }
}
