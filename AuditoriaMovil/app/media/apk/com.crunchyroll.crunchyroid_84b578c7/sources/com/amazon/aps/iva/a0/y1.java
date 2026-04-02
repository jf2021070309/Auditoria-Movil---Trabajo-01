package com.amazon.aps.iva.a0;
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class y1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Float, Float, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ c2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.amazon.aps.iva.se0.g0 g0Var, boolean z, c2 c2Var) {
        super(2);
        this.h = g0Var;
        this.i = z;
        this.j = c2Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(Float f, Float f2) {
        float floatValue = f.floatValue();
        com.amazon.aps.iva.se0.i.d(this.h, null, null, new x1(this.i, this.j, f2.floatValue(), floatValue, null), 3);
        return Boolean.TRUE;
    }
}
