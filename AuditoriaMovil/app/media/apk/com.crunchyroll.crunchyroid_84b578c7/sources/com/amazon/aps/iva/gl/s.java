package com.amazon.aps.iva.gl;
/* compiled from: PlayerTapToSeekOverlay.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.g, com.amazon.aps.iva.e1.a> lVar4, int i, int i2) {
        super(2);
        this.h = lVar;
        this.i = lVar2;
        this.j = lVar3;
        this.k = lVar4;
        this.l = i;
        this.m = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        j.b(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
