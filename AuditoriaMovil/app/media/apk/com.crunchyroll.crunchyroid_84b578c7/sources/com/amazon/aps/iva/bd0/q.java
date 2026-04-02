package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.rc0.l0;
/* compiled from: LazyJavaScope.kt */
/* loaded from: classes4.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<? extends com.amazon.aps.iva.sd0.g<?>>> {
    public final /* synthetic */ o h;
    public final /* synthetic */ com.amazon.aps.iva.ed0.n i;
    public final /* synthetic */ l0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, com.amazon.aps.iva.ed0.n nVar, com.amazon.aps.iva.zc0.f fVar) {
        super(0);
        this.h = oVar;
        this.i = nVar;
        this.j = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.de0.j<? extends com.amazon.aps.iva.sd0.g<?>> invoke() {
        o oVar = this.h;
        return oVar.b.b().b(new p(oVar, this.i, this.j));
    }
}
