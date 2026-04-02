package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class q3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Float h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(int i, long j, Float f, com.amazon.aps.iva.xb0.p pVar) {
        super(2);
        this.h = f;
        this.i = pVar;
        this.j = i;
        this.k = j;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            int i = this.j;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.i;
            Float f = this.h;
            if (f != null) {
                iVar2.s(-452621938);
                com.amazon.aps.iva.o0.l0.a(new com.amazon.aps.iva.o0.h2[]{e0.a.b(f)}, pVar, iVar2, ((i >> 6) & 112) | 8);
                iVar2.G();
            } else {
                iVar2.s(-452621758);
                com.amazon.aps.iva.o0.l0.a(new com.amazon.aps.iva.o0.h2[]{e0.a.b(Float.valueOf(com.amazon.aps.iva.f1.x.d(this.k)))}, pVar, iVar2, ((i >> 6) & 112) | 8);
                iVar2.G();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
