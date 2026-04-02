package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.js.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: UpsellV2Presenter.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wh.a aVar) {
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, FirebaseAnalytics.Event.PURCHASE);
        o oVar = this.h;
        o.q6(oVar).b();
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = oVar.c.R7().d();
        com.amazon.aps.iva.yb0.j.c(d);
        oVar.f.a(aVar2, d.b.c, l0.SUBSCRIPTION, true);
        oVar.getView().M0();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
