package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.a1.f;
/* compiled from: OnGloballyPositionedModifier.kt */
/* loaded from: classes.dex */
public final class n0 extends f.c implements com.amazon.aps.iva.u1.r {
    public com.amazon.aps.iva.xb0.l<? super q, com.amazon.aps.iva.kb0.q> o;

    public n0(com.amazon.aps.iva.xb0.l<? super q, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "callback");
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.u1.r
    public final void z(androidx.compose.ui.node.o oVar) {
        this.o.invoke(oVar);
    }
}
