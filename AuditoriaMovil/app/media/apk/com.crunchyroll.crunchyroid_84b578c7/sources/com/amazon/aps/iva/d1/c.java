package com.amazon.aps.iva.d1;

import com.amazon.aps.iva.a1.f;
/* compiled from: FocusChangedModifier.kt */
/* loaded from: classes.dex */
public final class c extends f.c implements f {
    public com.amazon.aps.iva.xb0.l<? super w, com.amazon.aps.iva.kb0.q> o;
    public w p;

    public c(com.amazon.aps.iva.xb0.l<? super w, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "onFocusChanged");
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.d1.f
    public final void p0(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "focusState");
        if (!com.amazon.aps.iva.yb0.j.a(this.p, xVar)) {
            this.p = xVar;
            this.o.invoke(xVar);
        }
    }
}
