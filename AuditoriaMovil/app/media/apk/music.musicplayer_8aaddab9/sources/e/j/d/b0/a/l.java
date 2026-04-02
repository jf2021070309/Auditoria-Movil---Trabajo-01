package e.j.d.b0.a;

import e.j.d.b0.c.g;
/* loaded from: classes2.dex */
public final class l implements g.a {
    public final /* synthetic */ c.b.c.l a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.o.b.a<h.k> f8562b;

    public l(c.b.c.l lVar, h.o.b.a<h.k> aVar) {
        this.a = lVar;
        this.f8562b = aVar;
    }

    @Override // e.j.d.b0.c.g.a
    public void a(g.c cVar, boolean z) {
        h.o.c.j.e(cVar, "reviewUiShown");
        if (cVar == g.c.NONE) {
            e.j.d.k.a.a().k(this.a, this.f8562b);
            return;
        }
        h.o.b.a<h.k> aVar = this.f8562b;
        if (aVar == null) {
            return;
        }
        aVar.invoke();
    }
}
