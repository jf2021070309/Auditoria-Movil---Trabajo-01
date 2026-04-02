package com.amazon.aps.iva.j30;
/* compiled from: UpsellV2Presenter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        o oVar = this.h;
        o.q6(oVar).b();
        if (th2 instanceof com.amazon.aps.iva.d30.k) {
            oVar.getView().I(new r(oVar.c));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
