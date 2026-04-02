package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.oc0.c1;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes4.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.k0> {
    public final /* synthetic */ com.amazon.aps.iva.oc0.b h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.oc0.b bVar, int i) {
        super(0);
        this.h = bVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.oc0.k0 invoke() {
        c1 c1Var = this.h.f().get(this.i);
        com.amazon.aps.iva.yb0.j.e(c1Var, "descriptor.valueParameters[i]");
        return c1Var;
    }
}
