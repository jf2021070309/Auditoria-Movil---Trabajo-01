package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.c1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes4.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, e0> {
    public final /* synthetic */ c1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c1 c1Var) {
        super(1);
        this.h = c1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e0 invoke(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.oc0.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "it");
        e0 type = bVar2.f().get(this.h.getIndex()).getType();
        com.amazon.aps.iva.yb0.j.e(type, "it.valueParameters[p.index].type");
        return type;
    }
}
