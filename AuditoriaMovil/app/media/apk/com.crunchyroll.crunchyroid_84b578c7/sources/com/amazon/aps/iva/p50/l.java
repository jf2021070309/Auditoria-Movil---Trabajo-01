package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.n50.e;
/* compiled from: ShowRatingDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n50.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.n50.e eVar) {
        o view;
        com.amazon.aps.iva.u70.i iVar;
        g.c cVar;
        com.amazon.aps.iva.n50.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "it");
        k kVar = this.h;
        view = kVar.getView();
        if (com.amazon.aps.iva.yb0.j.a(eVar2, e.a.a)) {
            iVar = a.b;
        } else if (com.amazon.aps.iva.yb0.j.a(eVar2, e.b.a)) {
            iVar = b.b;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        view.showSnackbar(iVar);
        o view2 = kVar.getView();
        p pVar = kVar.b;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) pVar.e().d();
        if (gVar != null) {
            cVar = gVar.a();
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar);
        view2.ug(((n) cVar.a).d);
        pVar.a();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
