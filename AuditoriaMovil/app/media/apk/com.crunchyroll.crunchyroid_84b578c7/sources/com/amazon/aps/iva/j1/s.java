package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.o0.e0;
/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.r<Float, Float, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.xb0.r<? super Float, ? super Float, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar, r rVar2) {
        super(2);
        this.h = rVar;
        this.i = rVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            r rVar = this.i;
            this.h.K(Float.valueOf(rVar.d.g), Float.valueOf(rVar.d.h), iVar2, 0);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
