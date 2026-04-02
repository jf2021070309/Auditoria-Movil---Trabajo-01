package com.amazon.aps.iva.cj;

import com.amazon.aps.iva.ve0.v0;
/* compiled from: FullyWatchedMonitor.kt */
/* loaded from: classes.dex */
public final class g {
    public final com.amazon.aps.iva.dh.c a;

    public g(v0 v0Var, com.amazon.aps.iva.se0.g0 g0Var) {
        k kVar = n.d;
        if (kVar != null) {
            com.amazon.aps.iva.dh.c d = kVar.d();
            com.amazon.aps.iva.yb0.j.f(v0Var, "playerState");
            com.amazon.aps.iva.yb0.j.f(d, "inAppReviewHandler");
            this.a = d;
            com.amazon.aps.iva.dg.b.A(g0Var, new com.amazon.aps.iva.ve0.a0(com.amazon.aps.iva.dg.b.m(new f(new e(v0Var))), new d(this, null)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
