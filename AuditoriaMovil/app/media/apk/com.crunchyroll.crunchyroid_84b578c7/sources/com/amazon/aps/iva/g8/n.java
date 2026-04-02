package com.amazon.aps.iva.g8;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, g0> {
    public static final n h = new n();

    public n() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final g0 invoke(g0 g0Var) {
        boolean z;
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, FirebaseAnalytics.Param.DESTINATION);
        j0 j0Var = g0Var2.c;
        if (j0Var != null && j0Var.l == g0Var2.h) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return j0Var;
    }
}
