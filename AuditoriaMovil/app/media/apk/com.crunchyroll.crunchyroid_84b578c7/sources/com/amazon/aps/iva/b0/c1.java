package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.z.y1;
/* compiled from: UpdatableAnimationState.kt */
/* loaded from: classes.dex */
public final class c1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e1 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Float, com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(e1 e1Var, float f, com.amazon.aps.iva.xb0.l<? super Float, com.amazon.aps.iva.kb0.q> lVar) {
        super(1);
        this.h = e1Var;
        this.i = f;
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Long l) {
        boolean z;
        long d;
        long longValue = l.longValue();
        e1 e1Var = this.h;
        if (e1Var.a == Long.MIN_VALUE) {
            e1Var.a = longValue;
        }
        com.amazon.aps.iva.z.m mVar = new com.amazon.aps.iva.z.m(e1Var.d);
        float f = this.i;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = e1.f.b(new com.amazon.aps.iva.z.m(e1Var.d), e1.e, e1Var.b);
        } else {
            d = com.amazon.aps.iva.ob0.f.d(((float) (longValue - e1Var.a)) / f);
        }
        long j = d;
        y1<com.amazon.aps.iva.z.m> y1Var = e1.f;
        com.amazon.aps.iva.z.m mVar2 = e1.e;
        float f2 = y1Var.e(j, mVar, mVar2, e1Var.b).a;
        e1Var.b = y1Var.f(j, mVar, mVar2, e1Var.b);
        e1Var.a = longValue;
        e1Var.d = f2;
        this.j.invoke(Float.valueOf(e1Var.d - f2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
