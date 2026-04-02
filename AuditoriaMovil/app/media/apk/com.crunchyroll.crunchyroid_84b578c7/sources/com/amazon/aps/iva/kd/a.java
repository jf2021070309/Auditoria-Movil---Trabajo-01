package com.amazon.aps.iva.kd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
/* compiled from: ChangeEmailFragment.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = c.c;
            c cVar = this.h;
            cVar.getClass();
            f.a((p) cVar.b.getValue(cVar, c.c[0]), null, iVar2, 8, 2);
        }
        return q.a;
    }
}
