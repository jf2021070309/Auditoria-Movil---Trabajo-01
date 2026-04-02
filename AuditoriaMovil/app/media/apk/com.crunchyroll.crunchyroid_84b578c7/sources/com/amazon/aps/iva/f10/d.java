package com.amazon.aps.iva.f10;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: DownloadsAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.d10.i i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.amazon.aps.iva.d10.i iVar, int i) {
        super(2);
        this.h = eVar;
        this.i = iVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -2123287722, new c(this.h, this.i, this.j)), iVar2, 6);
        }
        return q.a;
    }
}
