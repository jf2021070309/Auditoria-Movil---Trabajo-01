package com.amazon.aps.iva.t20;
/* compiled from: ManageMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        e eVar = this.h;
        e.q6(eVar).b();
        if (th2 instanceof com.amazon.aps.iva.d30.k) {
            eVar.getView().I(new k(eVar.c));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
