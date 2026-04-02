package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class l1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f2 h;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(f2 f2Var, com.amazon.aps.iva.se0.g0 g0Var) {
        super(0);
        this.h = f2Var;
        this.i = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        f2 f2Var = this.h;
        if (f2Var.c.d.invoke(g2.Hidden).booleanValue()) {
            com.amazon.aps.iva.se0.i.d(this.i, null, null, new k1(f2Var, null), 3);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
