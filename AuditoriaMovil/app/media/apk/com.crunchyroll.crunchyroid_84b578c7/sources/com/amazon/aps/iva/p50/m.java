package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.ez.g;
/* compiled from: ShowRatingDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        o view;
        g.c a;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        k kVar = this.h;
        view = kVar.getView();
        view.showSnackbar(com.amazon.aps.iva.bt.c.b);
        p pVar = kVar.b;
        pVar.a();
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) pVar.e().d();
        if (gVar != null && (a = gVar.a()) != null) {
            kVar.getView().C5(((n) a.a).d);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
