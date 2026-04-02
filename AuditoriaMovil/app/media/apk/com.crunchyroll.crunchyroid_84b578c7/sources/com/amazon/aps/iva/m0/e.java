package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: AlertDialog.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, com.amazon.aps.iva.xb0.p pVar) {
        super(2);
        this.h = pVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.o0.l0.a(new com.amazon.aps.iva.o0.h2[]{e0.a.b(Float.valueOf(com.amazon.aps.iva.hc.m.o(iVar2)))}, com.amazon.aps.iva.v0.b.b(iVar2, 2115920639, new d(this.i, this.h)), iVar2, 56);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
