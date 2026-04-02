package e.j.d;

import e.j.d.c0.a0;
/* loaded from: classes2.dex */
public final class g implements e.a.a.a.h {
    public final /* synthetic */ i.a.j<a0<Integer>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(i.a.j<? super a0<Integer>> jVar) {
        this.a = jVar;
    }

    @Override // e.a.a.a.h
    public void a(e.a.a.a.j jVar) {
        h.o.c.j.e(jVar, "result");
        if (this.a.a()) {
            if (w.U(jVar)) {
                this.a.resumeWith(new a0.c(Integer.valueOf(jVar.a)));
            } else {
                this.a.resumeWith(new a0.b(new IllegalStateException(String.valueOf(jVar.a))));
            }
        }
    }

    @Override // e.a.a.a.h
    public void b() {
        try {
            if (this.a.a()) {
                this.a.resumeWith(new a0.b(new IllegalStateException("-1")));
            }
        } catch (IllegalStateException e2) {
            n.a.a.b("BillingConnection").c(e2);
        }
    }
}
