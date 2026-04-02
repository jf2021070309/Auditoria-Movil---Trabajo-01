package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes4.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> {
    public final /* synthetic */ c1 h;
    public final /* synthetic */ List<j1> i;
    public final /* synthetic */ com.amazon.aps.iva.xd0.i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List list, com.amazon.aps.iva.xd0.i iVar, a1 a1Var, c1 c1Var, boolean z) {
        super(1);
        this.h = c1Var;
        this.i = list;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final m0 invoke(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.fe0.f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "kotlinTypeRefiner");
        int i = f0.a;
        f0.a(this.h, fVar2, this.i);
        return null;
    }
}
