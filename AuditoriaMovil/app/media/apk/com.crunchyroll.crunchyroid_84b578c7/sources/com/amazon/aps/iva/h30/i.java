package com.amazon.aps.iva.h30;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: BentoCheckoutSuccessScreen.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> h;
    public final /* synthetic */ com.amazon.aps.iva.a1.f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, q> lVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
        super(2);
        this.h = lVar;
        this.i = fVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        a.d(this.h, this.i, iVar, I, this.k);
        return q.a;
    }
}
