package com.amazon.aps.iva.ud;

import android.content.Context;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
/* compiled from: ContinueWatchingCard.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.sd.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.amazon.aps.iva.sd.a aVar) {
        super(2);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        String string;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.sd.a aVar = this.h;
            com.amazon.aps.iva.p4.a aVar2 = new com.amazon.aps.iva.p4.a(aVar.j.getRatingIcon());
            Integer contentDescriptionTextRes = aVar.j.getContentDescriptionTextRes();
            iVar2.s(792902553);
            if (contentDescriptionTextRes == null) {
                string = null;
            } else {
                string = ((Context) iVar2.i(com.amazon.aps.iva.p4.h.b)).getString(contentDescriptionTextRes.intValue());
            }
            iVar2.G();
            float f = 18;
            com.amazon.aps.iva.p4.q.a(aVar2, string, com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(n.a.b, f), f), 0, iVar2, 8, 8);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
