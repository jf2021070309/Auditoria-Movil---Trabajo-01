package com.amazon.aps.iva.dv;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.a<q>, com.amazon.aps.iva.o0.i, Integer, q> h;
    public final /* synthetic */ j i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.v0.a aVar, j jVar) {
        super(2);
        this.h = aVar;
        this.i = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            this.h.invoke(new h(this.i), iVar2, 0);
        }
        return q.a;
    }
}
