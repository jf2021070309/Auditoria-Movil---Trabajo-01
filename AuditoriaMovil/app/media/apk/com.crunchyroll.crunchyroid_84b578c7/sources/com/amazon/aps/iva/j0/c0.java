package com.amazon.aps.iva.j0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.l0.c0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.amazon.aps.iva.l0.c0 c0Var, boolean z, int i) {
        super(2);
        this.h = c0Var;
        this.i = z;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
        k.d(this.h, this.i, iVar, I);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
