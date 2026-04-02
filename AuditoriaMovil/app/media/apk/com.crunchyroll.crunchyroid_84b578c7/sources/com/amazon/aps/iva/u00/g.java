package com.amazon.aps.iva.u00;

import com.amazon.aps.iva.sv.g2;
/* compiled from: BulkDownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.hg.g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, com.amazon.aps.iva.hg.g gVar) {
        super(0);
        this.h = iVar;
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        i iVar = this.h;
        g2 g2Var = iVar.b;
        com.amazon.aps.iva.hg.g gVar = this.i;
        g2Var.V0(gVar, new f(iVar, gVar));
        iVar.e.d(gVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
