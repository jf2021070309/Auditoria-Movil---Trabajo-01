package com.amazon.aps.iva.ee0;

import java.util.Collection;
/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c1, Iterable<? extends e0>> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Iterable<? extends e0> invoke(c1 c1Var) {
        h hVar;
        Collection<e0> g;
        c1 c1Var2 = c1Var;
        com.amazon.aps.iva.yb0.j.f(c1Var2, "it");
        this.h.getClass();
        if (c1Var2 instanceof h) {
            hVar = (h) c1Var2;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            g = com.amazon.aps.iva.lb0.x.L0(hVar.f(), hVar.b.invoke().a);
        } else {
            g = c1Var2.g();
            com.amazon.aps.iva.yb0.j.e(g, "supertypes");
        }
        return g;
    }
}
