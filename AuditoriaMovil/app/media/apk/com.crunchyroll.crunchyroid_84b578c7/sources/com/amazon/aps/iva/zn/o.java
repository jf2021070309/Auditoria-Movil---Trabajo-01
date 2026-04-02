package com.amazon.aps.iva.zn;
/* compiled from: Shimmer.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i, int i2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p pVar) {
        super(2);
        this.h = fVar;
        this.i = pVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        com.amazon.aps.iva.a1.f fVar = this.h;
        com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.i;
        p.a(I, this.k, iVar, fVar, pVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
