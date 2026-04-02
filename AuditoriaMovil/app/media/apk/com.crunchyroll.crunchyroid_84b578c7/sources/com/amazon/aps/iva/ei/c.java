package com.amazon.aps.iva.ei;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: FeaturedMusicListAdapter.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i) {
        super(2);
        this.h = dVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -633023378, new b(this.h, this.i)), iVar2, 6);
        }
        return q.a;
    }
}
