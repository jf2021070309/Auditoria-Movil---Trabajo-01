package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.o0.y1;
/* compiled from: IntrinsicsPolicy.kt */
/* loaded from: classes.dex */
public final class u {
    public final androidx.compose.ui.node.e a;
    public final y1 b;

    public u(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.a = eVar;
        this.b = com.amazon.aps.iva.cq.b.c0(null);
    }

    public final com.amazon.aps.iva.s1.d0 a() {
        com.amazon.aps.iva.s1.d0 d0Var = (com.amazon.aps.iva.s1.d0) this.b.getValue();
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
