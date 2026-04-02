package com.amazon.aps.iva.g8;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, Boolean> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, FirebaseAnalytics.Param.DESTINATION);
        return Boolean.valueOf(!this.h.n.containsKey(Integer.valueOf(g0Var2.h)));
    }
}
