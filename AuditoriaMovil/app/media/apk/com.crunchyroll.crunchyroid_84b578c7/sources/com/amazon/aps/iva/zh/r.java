package com.amazon.aps.iva.zh;

import java.util.List;
/* compiled from: ArtistPresenter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class r extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public r(m mVar) {
        super(0, mVar, m.class, "onCtaButtonClick", "onCtaButtonClick()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        com.amazon.aps.iva.ci.h hVar;
        m mVar = (m) this.receiver;
        List list = (List) mVar.b.E1().d();
        if (list != null && (hVar = (com.amazon.aps.iva.ci.h) com.amazon.aps.iva.lb0.x.t0(list)) != null) {
            mVar.getView().C1(new com.amazon.aps.iva.l50.c(hVar.a, hVar.i));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
