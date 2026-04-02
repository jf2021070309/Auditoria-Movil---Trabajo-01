package com.amazon.aps.iva.cv;

import java.util.List;
/* compiled from: CrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<w, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(w wVar) {
        w wVar2 = wVar;
        com.amazon.aps.iva.yb0.j.f(wVar2, "model");
        List<com.amazon.aps.iva.dv.a> list = wVar2.a;
        boolean z = !list.isEmpty();
        p pVar = this.h;
        if (z) {
            pVar.getView().i();
            pVar.getView().P4();
            pVar.getView().qg(wVar2.b, wVar2.c);
        } else {
            pVar.getView().p3();
            pVar.getView().h();
            pVar.getView().Z5();
        }
        p.q6(pVar).C7(list);
        if (wVar2.d) {
            pVar.getView().Ng();
        } else {
            pVar.getView().x4();
        }
        pVar.h.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
