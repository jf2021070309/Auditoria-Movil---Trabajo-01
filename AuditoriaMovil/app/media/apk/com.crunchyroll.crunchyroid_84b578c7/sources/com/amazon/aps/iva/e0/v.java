package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.s1.u0;
/* compiled from: LazyList.kt */
/* loaded from: classes.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.xb0.l<? super u0.a, ? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.s1.e0> {
    public final /* synthetic */ com.amazon.aps.iva.f0.v h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.amazon.aps.iva.f0.v vVar, long j, int i, int i2) {
        super(3);
        this.h = vVar;
        this.i = j;
        this.j = i;
        this.k = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.s1.e0 invoke(Integer num, Integer num2, com.amazon.aps.iva.xb0.l<? super u0.a, ? extends com.amazon.aps.iva.kb0.q> lVar) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        com.amazon.aps.iva.xb0.l<? super u0.a, ? extends com.amazon.aps.iva.kb0.q> lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "placement");
        int i = intValue + this.j;
        long j = this.i;
        return this.h.F0(com.amazon.aps.iva.o2.b.f(i, j), com.amazon.aps.iva.o2.b.e(intValue2 + this.k, j), com.amazon.aps.iva.lb0.a0.b, lVar2);
    }
}
