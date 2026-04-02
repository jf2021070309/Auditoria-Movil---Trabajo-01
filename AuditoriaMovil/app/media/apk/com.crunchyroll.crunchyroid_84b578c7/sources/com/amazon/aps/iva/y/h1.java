package com.amazon.aps.iva.y;

import com.amazon.aps.iva.y.g1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class h1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f0, com.amazon.aps.iva.o2.h> {
    public final /* synthetic */ g1 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g1 g1Var, long j) {
        super(1);
        this.h = g1Var;
        this.i = j;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o2.h invoke(f0 f0Var) {
        long j;
        long j2;
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.h> lVar;
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.h> lVar2;
        f0 f0Var2 = f0Var;
        com.amazon.aps.iva.yb0.j.f(f0Var2, "it");
        g1 g1Var = this.h;
        g1Var.getClass();
        f1 value = g1Var.d.getValue();
        long j3 = this.i;
        if (value != null && (lVar2 = value.a) != null) {
            j = lVar2.invoke(new com.amazon.aps.iva.o2.j(j3)).a;
        } else {
            j = com.amazon.aps.iva.o2.h.b;
        }
        f1 value2 = g1Var.e.getValue();
        if (value2 != null && (lVar = value2.a) != null) {
            j2 = lVar.invoke(new com.amazon.aps.iva.o2.j(j3)).a;
        } else {
            j2 = com.amazon.aps.iva.o2.h.b;
        }
        int i = g1.a.a[f0Var2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j = j2;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            }
        } else {
            j = com.amazon.aps.iva.o2.h.b;
        }
        return new com.amazon.aps.iva.o2.h(j);
    }
}
