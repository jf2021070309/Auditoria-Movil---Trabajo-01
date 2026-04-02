package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c0;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.rc0.n> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.de0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, com.amazon.aps.iva.de0.l lVar) {
        super(0);
        this.h = eVar;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.rc0.n invoke() {
        e eVar = this.h;
        com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.oc0.k> lVar = eVar.b;
        c0 c0Var = eVar.a;
        com.amazon.aps.iva.rc0.n nVar = new com.amazon.aps.iva.rc0.n(lVar.invoke(c0Var), e.g, b0.ABSTRACT, com.amazon.aps.iva.oc0.f.INTERFACE, f1.J(c0Var.j().f()), this.i);
        nVar.G0(new a(this.i, nVar), com.amazon.aps.iva.lb0.b0.b, null);
        return nVar;
    }
}
