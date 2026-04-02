package com.amazon.aps.iva.nf;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UnrecoverableErrorOverlay.kt */
/* loaded from: classes.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
    public static final h h = new h();

    public h() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        y.e(c0Var2, "unrecoverable_error_overlay_error_code");
        return q.a;
    }
}
