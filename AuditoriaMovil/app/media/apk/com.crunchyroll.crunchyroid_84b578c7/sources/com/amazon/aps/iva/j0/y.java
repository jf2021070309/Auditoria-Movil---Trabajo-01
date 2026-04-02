package com.amazon.aps.iva.j0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ p2 h;
    public final /* synthetic */ com.amazon.aps.iva.d1.r i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p2 p2Var, com.amazon.aps.iva.d1.r rVar, boolean z) {
        super(0);
        this.h = p2Var;
        this.i = rVar;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        com.amazon.aps.iva.i2.n0 n0Var;
        boolean z = !this.j;
        p2 p2Var = this.h;
        if (!p2Var.b()) {
            this.i.a();
        } else if (z && (n0Var = p2Var.d) != null && n0Var.a()) {
            n0Var.b.e();
        }
        return Boolean.TRUE;
    }
}
