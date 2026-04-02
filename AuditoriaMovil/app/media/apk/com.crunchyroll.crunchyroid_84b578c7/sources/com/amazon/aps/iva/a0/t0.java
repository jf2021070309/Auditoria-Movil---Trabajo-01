package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: Indication.kt */
/* loaded from: classes.dex */
public final class t0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ q0 h;
    public final /* synthetic */ com.amazon.aps.iva.c0.k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(q0 q0Var, com.amazon.aps.iva.c0.k kVar) {
        super(3);
        this.h = q0Var;
        this.i = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, -353972293);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        q0 q0Var = this.h;
        if (q0Var == null) {
            q0Var = l1.a;
        }
        r0 a = q0Var.a(this.i, iVar2);
        iVar2.s(1157296644);
        boolean H = iVar2.H(a);
        Object t = iVar2.t();
        if (H || t == i.a.a) {
            t = new u0(a);
            iVar2.n(t);
        }
        iVar2.G();
        u0 u0Var = (u0) t;
        iVar2.G();
        return u0Var;
    }
}
