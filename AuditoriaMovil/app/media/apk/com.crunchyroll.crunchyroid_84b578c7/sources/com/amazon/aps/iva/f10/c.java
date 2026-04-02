package com.amazon.aps.iva.f10;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: DownloadsAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.d10.i i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, com.amazon.aps.iva.d10.i iVar, int i) {
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
            e eVar = this.h;
            com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> dVar = eVar.b;
            com.amazon.aps.iva.d10.g gVar = eVar.c;
            boolean z = eVar.e;
            com.amazon.aps.iva.d10.i iVar3 = this.i;
            com.amazon.aps.iva.yb0.j.e(iVar3, "downloadPanel");
            h.a(iVar3, gVar, new b(eVar, iVar3, this.j), dVar, null, z, iVar2, 4104, 16);
        }
        return q.a;
    }
}
