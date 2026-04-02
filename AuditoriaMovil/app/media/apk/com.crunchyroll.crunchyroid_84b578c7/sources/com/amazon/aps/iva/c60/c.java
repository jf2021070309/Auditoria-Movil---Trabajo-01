package com.amazon.aps.iva.c60;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchlistCarouselViewAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.z70.a h;
    public final /* synthetic */ d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.z70.a aVar) {
        super(2);
        this.h = aVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 536225606, new b(this.i, this.h)), iVar2, 6);
        }
        return q.a;
    }
}
