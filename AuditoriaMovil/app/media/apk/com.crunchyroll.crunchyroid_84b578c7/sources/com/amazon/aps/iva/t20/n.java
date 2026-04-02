package com.amazon.aps.iva.t20;

import com.amazon.aps.iva.js.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ManageMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wh.a aVar) {
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, FirebaseAnalytics.Event.PURCHASE);
        e eVar = this.h;
        com.amazon.aps.iva.g30.g gVar = eVar.g;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = eVar.c.R7().d();
        com.amazon.aps.iva.yb0.j.c(d);
        gVar.a(aVar2, d.b.c, l0.UPGRADE, true);
        eVar.getView().closeScreen();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
