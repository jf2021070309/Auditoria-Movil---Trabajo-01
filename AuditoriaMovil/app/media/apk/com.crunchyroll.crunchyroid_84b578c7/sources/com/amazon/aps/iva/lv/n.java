package com.amazon.aps.iva.lv;
/* compiled from: CrunchylistsPresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        v view;
        v view2;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        o oVar = this.h;
        view = oVar.getView();
        view.k0(new m(oVar));
        view2 = oVar.getView();
        view2.i();
        oVar.f.a(th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
