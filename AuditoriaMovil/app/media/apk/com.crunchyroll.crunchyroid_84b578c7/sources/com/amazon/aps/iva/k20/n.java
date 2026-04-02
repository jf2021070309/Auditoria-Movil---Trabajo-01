package com.amazon.aps.iva.k20;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: CancellationRescuePresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wh.a aVar) {
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, FirebaseAnalytics.Event.PURCHASE);
        p pVar = this.h;
        pVar.getView().hg(pVar.b.d);
        pVar.d.c(aVar2.b);
        pVar.getView().setResult(30);
        pVar.getView().close();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
