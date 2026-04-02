package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.e0.e0;
/* compiled from: AssetSelectionScreenContent.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.hm.e h;
    public final /* synthetic */ a i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.hm.e eVar, a aVar, com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar, int i) {
        super(1);
        this.h = eVar;
        this.i = aVar;
        this.j = lVar;
        this.k = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "$this$LazyRow");
        com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.d> aVar = this.h.b;
        e0Var2.a(aVar.size(), new q(aVar, p.h), com.amazon.aps.iva.v0.b.c(-632812321, new r(aVar, this.i, this.j, this.k), true));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
