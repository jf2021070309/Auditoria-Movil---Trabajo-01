package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class n0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<p> h;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 i;
    public final /* synthetic */ f0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.amazon.aps.iva.fc0.m mVar, com.amazon.aps.iva.se0.g0 g0Var, f0 f0Var) {
        super(1);
        this.h = mVar;
        this.i = g0Var;
        this.j = f0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Integer num) {
        boolean z;
        int intValue = num.intValue();
        p invoke = this.h.invoke();
        if (intValue >= 0 && intValue < invoke.b()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.se0.i.d(this.i, null, null, new m0(this.j, intValue, null), 3);
            return Boolean.TRUE;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
        d.append(invoke.b());
        d.append(')');
        throw new IllegalArgumentException(d.toString().toString());
    }
}
