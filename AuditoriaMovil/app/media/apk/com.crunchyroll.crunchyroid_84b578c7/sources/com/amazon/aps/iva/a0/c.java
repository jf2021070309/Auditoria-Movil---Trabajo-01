package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.s1.u0;
/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.s1.u0 u0Var, int i) {
        super(1);
        this.h = u0Var;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
        u0.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
        int i = (-this.i) / 2;
        com.amazon.aps.iva.s1.u0 u0Var = this.h;
        u0.a.i(aVar2, u0Var, i - ((u0Var.b - u0Var.o0()) / 2), i - ((u0Var.c - u0Var.k0()) / 2), null, 12);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
