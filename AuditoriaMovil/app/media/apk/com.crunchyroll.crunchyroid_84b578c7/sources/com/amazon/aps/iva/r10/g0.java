package com.amazon.aps.iva.r10;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: HistoryPresenter.kt */
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.j8.h<a0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var) {
        super(1);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j8.h<a0> hVar) {
        com.amazon.aps.iva.j8.h<a0> hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, FirebaseAnalytics.Param.ITEMS);
        e0 e0Var = this.h;
        e0.q6(e0Var).H();
        e0Var.getView().sb(hVar2);
        if (hVar2.isEmpty()) {
            e0Var.getView().h();
            com.amazon.aps.iva.uw.a aVar = e0Var.c;
            T d = aVar.a1().d();
            com.amazon.aps.iva.yb0.j.c(d);
            if (((Boolean) d).booleanValue()) {
                aVar.u();
            }
        } else {
            e0Var.getView().i();
        }
        e0Var.d.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
