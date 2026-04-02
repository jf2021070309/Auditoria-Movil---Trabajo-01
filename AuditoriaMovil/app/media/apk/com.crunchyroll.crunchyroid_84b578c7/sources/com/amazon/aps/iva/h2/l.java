package com.amazon.aps.iva.h2;
/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<n0, Object> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar) {
        super(1);
        this.h = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(n0 n0Var) {
        n0 n0Var2 = n0Var;
        com.amazon.aps.iva.yb0.j.f(n0Var2, "it");
        int i = n0Var2.c;
        int i2 = n0Var2.d;
        Object obj = n0Var2.e;
        y yVar = n0Var2.b;
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        return this.h.b(new n0(null, yVar, i, i2, obj)).getValue();
    }
}
