package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.js.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: UpgradePresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar) {
        super(1);
        this.h = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wh.a aVar) {
        l0 l0Var;
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, FirebaseAnalytics.Event.PURCHASE);
        n nVar = this.h;
        n.q6(nVar).b();
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = nVar.b.R7().d();
        com.amazon.aps.iva.yb0.j.c(d);
        String str = d.b.c;
        if (nVar.g) {
            l0Var = l0.UPGRADE;
        } else {
            l0Var = l0.SUBSCRIPTION;
        }
        nVar.c.a(aVar2, str, l0Var, true);
        nVar.getView().M0();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
