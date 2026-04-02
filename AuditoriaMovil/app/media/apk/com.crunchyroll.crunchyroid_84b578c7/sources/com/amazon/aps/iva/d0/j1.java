package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.v1.p2;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class j1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.v1.v1, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(float f, float f2) {
        super(1);
        this.h = f;
        this.i = f2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.v1.v1 v1Var) {
        com.amazon.aps.iva.v1.v1 v1Var2 = v1Var;
        com.amazon.aps.iva.yb0.j.f(v1Var2, "$this$$receiver");
        com.amazon.aps.iva.o2.e eVar = new com.amazon.aps.iva.o2.e(this.h);
        p2 p2Var = v1Var2.a;
        p2Var.b(eVar, "x");
        p2Var.b(new com.amazon.aps.iva.o2.e(this.i), "y");
        return com.amazon.aps.iva.kb0.q.a;
    }
}
