package com.amazon.aps.iva.tm;

import com.amazon.aps.iva.d0.o;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.q;
/* compiled from: SwitchProfileDialog.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements q<o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ m0 h;
    public final /* synthetic */ c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m0 m0Var, c cVar) {
        super(3);
        this.h = m0Var;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(o oVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(oVar, "$this$ModalBottomSheetLayout");
        if ((intValue & 81) == 16 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -1513896827, new h(this.h, this.i)), iVar2, 6);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
