package com.amazon.aps.iva.m0;
/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class u2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ com.amazon.aps.iva.a1.f i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(float f, int i, int i2, int i3, long j, long j2, com.amazon.aps.iva.a1.f fVar) {
        super(2);
        this.h = f;
        this.i = fVar;
        this.j = j;
        this.k = j2;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        float f = this.h;
        com.amazon.aps.iva.a1.f fVar = this.i;
        long j = this.j;
        long j2 = this.k;
        v2.c(f, this.l, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n, j, j2, iVar, fVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
