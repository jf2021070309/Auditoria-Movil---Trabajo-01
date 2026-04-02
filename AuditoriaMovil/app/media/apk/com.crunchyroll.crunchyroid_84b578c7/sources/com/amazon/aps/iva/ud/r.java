package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ContinueWatchingCard.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.d, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.sd.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z, com.amazon.aps.iva.sd.a aVar) {
        super(3);
        this.h = z;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.d dVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(dVar, "$this$Column");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(792903046);
        n.a aVar = n.a.b;
        if (this.h) {
            float f = 24;
            com.amazon.aps.iva.p4.q.a(new com.amazon.aps.iva.p4.a(R.drawable.cr_logo_white), "", com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar, f), f), 0, iVar2, 56, 8);
        }
        iVar2.G();
        com.amazon.aps.iva.y4.c.a(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.o(com.amazon.aps.iva.e.w.M(8))), 2, 1, com.amazon.aps.iva.v0.b.b(iVar2, -1072859280, new q(this.i)), iVar2, 3072, 0);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
