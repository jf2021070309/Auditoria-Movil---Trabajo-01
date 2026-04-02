package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: AndroidAlertDialog.android.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2) {
        super(2);
        this.h = pVar;
        this.i = i;
        this.j = pVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            iVar2.s(-1046483318);
            int i = this.i;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.h;
            if (pVar != null) {
                pVar.invoke(iVar2, Integer.valueOf((i >> 9) & 14));
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            iVar2.G();
            this.j.invoke(iVar2, Integer.valueOf((i >> 3) & 14));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
