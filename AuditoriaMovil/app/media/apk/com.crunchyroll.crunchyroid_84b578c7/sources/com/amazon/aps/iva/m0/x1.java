package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class x1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(long j, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, boolean z, int i) {
        super(2);
        this.h = j;
        this.i = aVar;
        this.j = z;
        this.k = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        j1.b(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
