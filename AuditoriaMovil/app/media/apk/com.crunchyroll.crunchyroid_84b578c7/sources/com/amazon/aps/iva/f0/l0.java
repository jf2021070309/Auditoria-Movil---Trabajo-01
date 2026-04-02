package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class l0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Float, Float, Boolean> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 i;
    public final /* synthetic */ f0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z, com.amazon.aps.iva.se0.g0 g0Var, f0 f0Var) {
        super(2);
        this.h = z;
        this.i = g0Var;
        this.j = f0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(Float f, Float f2) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        if (this.h) {
            floatValue = floatValue2;
        }
        com.amazon.aps.iva.se0.i.d(this.i, null, null, new k0(this.j, floatValue, null), 3);
        return Boolean.TRUE;
    }
}
