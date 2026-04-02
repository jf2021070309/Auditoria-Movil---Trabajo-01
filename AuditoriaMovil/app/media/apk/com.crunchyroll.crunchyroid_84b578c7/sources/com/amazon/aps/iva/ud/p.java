package com.amazon.aps.iva.ud;

import android.content.Context;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ContinueWatchingCard.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.sd.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.sd.a aVar) {
        super(3);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.o oVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        boolean z;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(oVar, "$this$Row");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        Context context = (Context) iVar2.i(com.amazon.aps.iva.p4.h.b);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.mt.m mVar = new com.amazon.aps.iva.mt.m(context);
        com.amazon.aps.iva.sd.a aVar = this.h;
        String a = mVar.a(aVar.i, aVar.g);
        iVar2.s(149483731);
        if (aVar.f == com.amazon.aps.iva.x50.t.EPISODE) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                n.a aVar2 = n.a.b;
                com.amazon.aps.iva.a5.d.a(a, com.amazon.aps.iva.ff0.b.L(aVar2), new com.amazon.aps.iva.a5.e(new com.amazon.aps.iva.b5.e(R.color.cr_white_opacity_70), new com.amazon.aps.iva.o2.m(com.amazon.aps.iva.e.z.z(14)), null, new com.amazon.aps.iva.a5.c(4), 44), 1, iVar2, 3072, 0);
                com.amazon.aps.iva.p4.q.a(new com.amazon.aps.iva.p4.a(R.drawable.ic_divider_dot), "", com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.e.w.K(aVar2, 4)), 0, iVar2, 56, 8);
            }
        }
        iVar2.G();
        s.b(aVar.e, iVar2, 0);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
