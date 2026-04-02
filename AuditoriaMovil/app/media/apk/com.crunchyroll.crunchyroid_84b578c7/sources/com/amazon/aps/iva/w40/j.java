package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.ads.AdRequest;
/* compiled from: SimulcastAdapter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, int i) {
        super(2);
        this.h = lVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            l lVar = this.h;
            int i = this.i;
            com.amazon.aps.iva.uz.h d = lVar.d(i);
            if (d instanceof h.c.C0774c) {
                iVar2.s(-1812770548);
                com.amazon.aps.iva.wz.a.a(((h.c.C0774c) d).c, new i(lVar, d, i), lVar.b, null, null, iVar2, Panel.$stable | AdRequest.MAX_CONTENT_URL_LENGTH, 24);
                iVar2.G();
            } else {
                iVar2.s(-1812770245);
                com.amazon.aps.iva.wz.b.a(null, iVar2, 0, 1);
                iVar2.G();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
