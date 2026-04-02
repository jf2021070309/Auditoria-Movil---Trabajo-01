package com.amazon.aps.iva.ci;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MusicAssetsAdapter.kt */
/* loaded from: classes.dex */
public final class d extends l implements p<i, Integer, q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h hVar) {
        super(2);
        this.h = hVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 404790998, new c(this.i, this.h)), iVar2, 6);
        }
        return q.a;
    }
}
