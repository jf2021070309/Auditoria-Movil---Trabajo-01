package androidx.lifecycle;

import c.p.f;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import e.j.d.w;
import i.a.g1;
/* loaded from: classes.dex */
public final class LifecycleController {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final j.b f442b;

    /* renamed from: c  reason: collision with root package name */
    public final f f443c;

    /* renamed from: d  reason: collision with root package name */
    public final n f444d;

    public LifecycleController(j jVar, j.b bVar, f fVar, final g1 g1Var) {
        h.o.c.j.e(jVar, "lifecycle");
        h.o.c.j.e(bVar, "minState");
        h.o.c.j.e(fVar, "dispatchQueue");
        h.o.c.j.e(g1Var, "parentJob");
        this.a = jVar;
        this.f442b = bVar;
        this.f443c = fVar;
        n nVar = new n() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // c.p.n
            public final void c(p pVar, j.a aVar) {
                h.o.c.j.e(pVar, "source");
                h.o.c.j.e(aVar, "$noName_1");
                if (((r) pVar.getLifecycle()).f2467c == j.b.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    w.n(g1Var, null, 1, null);
                    lifecycleController.a();
                } else if (((r) pVar.getLifecycle()).f2467c.compareTo(LifecycleController.this.f442b) < 0) {
                    LifecycleController.this.f443c.a = true;
                } else {
                    f fVar2 = LifecycleController.this.f443c;
                    if (fVar2.a) {
                        if (!(!fVar2.f2453b)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        fVar2.a = false;
                        fVar2.b();
                    }
                }
            }
        };
        this.f444d = nVar;
        if (((r) jVar).f2467c != j.b.DESTROYED) {
            jVar.a(nVar);
            return;
        }
        w.n(g1Var, null, 1, null);
        a();
    }

    public final void a() {
        this.a.b(this.f444d);
        f fVar = this.f443c;
        fVar.f2453b = true;
        fVar.b();
    }
}
