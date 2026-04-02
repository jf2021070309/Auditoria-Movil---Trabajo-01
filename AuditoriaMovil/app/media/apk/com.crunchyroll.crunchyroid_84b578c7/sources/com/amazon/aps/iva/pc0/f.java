package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.c0;
/* compiled from: annotationUtil.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, e0> {
    public final /* synthetic */ com.amazon.aps.iva.lc0.k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.lc0.k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e0 invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "module");
        return c0Var2.j().h(this.h.v(), v1.INVARIANT);
    }
}
