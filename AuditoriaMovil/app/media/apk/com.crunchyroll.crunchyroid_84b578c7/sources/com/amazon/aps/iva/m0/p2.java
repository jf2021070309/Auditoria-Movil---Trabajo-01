package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.z.h0;
/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class p2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ com.amazon.aps.iva.h1.i i;
    public final /* synthetic */ float j;
    public final /* synthetic */ long k;
    public final /* synthetic */ com.amazon.aps.iva.o0.p3<Integer> l;
    public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> m;
    public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> n;
    public final /* synthetic */ com.amazon.aps.iva.o0.p3<Float> o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(long j, com.amazon.aps.iva.h1.i iVar, float f, long j2, h0.a aVar, h0.a aVar2, h0.a aVar3, h0.a aVar4) {
        super(1);
        this.h = j;
        this.i = iVar;
        this.j = f;
        this.k = j2;
        this.l = aVar;
        this.m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.e eVar) {
        boolean z;
        float f;
        com.amazon.aps.iva.h1.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$this$Canvas");
        v2.d(eVar2, 0.0f, 360.0f, this.h, this.i);
        float floatValue = this.m.getValue().floatValue();
        com.amazon.aps.iva.o0.p3<Float> p3Var = this.n;
        float abs = Math.abs(floatValue - p3Var.getValue().floatValue());
        float floatValue2 = p3Var.getValue().floatValue() + this.o.getValue().floatValue() + (((this.l.getValue().intValue() * 216.0f) % 360.0f) - 90.0f);
        long j = this.k;
        com.amazon.aps.iva.h1.i iVar = this.i;
        if (iVar.c == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = ((this.j / (v2.c / 2)) * 57.29578f) / 2.0f;
        }
        v2.d(eVar2, f + floatValue2, Math.max(abs, 0.1f), j, iVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
