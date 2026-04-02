package com.amazon.aps.iva.pd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class h extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
        super(2);
        this.h = fVar;
        this.i = i;
        this.j = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
        int i = this.j;
        g.d(this.h, iVar, I, i);
        return q.a;
    }
}
