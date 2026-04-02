package com.amazon.aps.iva.h30;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: BentoCheckoutSuccessScreen.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xh.a h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> i;
    public final /* synthetic */ com.amazon.aps.iva.a1.f j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.xh.a aVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, q> lVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
        super(2);
        this.h = aVar;
        this.i = lVar;
        this.j = fVar;
        this.k = i;
        this.l = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        a.c(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
        return q.a;
    }
}
