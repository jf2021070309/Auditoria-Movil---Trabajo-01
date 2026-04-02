package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.e0;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<m0> {
    public final /* synthetic */ k h;
    public final /* synthetic */ com.amazon.aps.iva.de0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, com.amazon.aps.iva.de0.l lVar) {
        super(0);
        this.h = kVar;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final m0 invoke() {
        k kVar = this.h;
        c0 c0Var = kVar.g().a;
        e.d.getClass();
        return com.amazon.aps.iva.oc0.u.c(c0Var, e.h, new e0(this.i, kVar.g().a)).m();
    }
}
