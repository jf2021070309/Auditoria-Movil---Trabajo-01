package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.gm.z;
/* compiled from: AssetSelectionScreenContent.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<z, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ com.amazon.aps.iva.hm.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.amazon.aps.iva.xb0.l<? super z, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.hm.d dVar) {
        super(0);
        this.h = lVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.invoke(new z.a(this.i));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
