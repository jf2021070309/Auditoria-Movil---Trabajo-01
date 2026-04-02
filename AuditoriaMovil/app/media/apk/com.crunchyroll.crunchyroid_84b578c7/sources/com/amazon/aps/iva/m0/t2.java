package com.amazon.aps.iva.m0;
/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class t2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(float f, int i, long j, long j2) {
        super(1);
        this.h = j;
        this.i = i;
        this.j = f;
        this.k = j2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
        com.amazon.aps.iva.h1.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$this$Canvas");
        float b = com.amazon.aps.iva.e1.g.b(eVar2.h());
        v2.e(eVar2, 0.0f, 1.0f, this.h, b, this.i);
        v2.e(eVar2, 0.0f, this.j, this.k, b, this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
