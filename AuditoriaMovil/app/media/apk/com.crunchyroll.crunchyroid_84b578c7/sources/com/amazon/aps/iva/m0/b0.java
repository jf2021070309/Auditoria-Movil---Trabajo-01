package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.d0.o1 h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.x1, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(com.amazon.aps.iva.d0.o1 o1Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.x1, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
        super(2);
        this.h = o1Var;
        this.i = qVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            a4.a(((b4) iVar2.i(c4.b)).k, com.amazon.aps.iva.v0.b.b(iVar2, -630330208, new a0(this.h, this.i, this.j)), iVar2, 48);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
