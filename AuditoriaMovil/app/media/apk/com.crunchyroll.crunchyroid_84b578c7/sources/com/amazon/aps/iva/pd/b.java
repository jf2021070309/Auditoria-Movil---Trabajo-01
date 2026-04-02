package com.amazon.aps.iva.pd;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class b extends l implements q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.a1.f fVar, int i) {
        super(3);
        this.h = fVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue = num.intValue();
        j.f(fVar, "it");
        if ((intValue & 81) == 16 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            g.d(this.h, iVar2, (this.i >> 9) & 14, 0);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
