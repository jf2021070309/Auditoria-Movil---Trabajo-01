package com.amazon.aps.iva.jy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.ads.AdRequest;
/* compiled from: SeriesCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class d extends l implements p<i, Integer, q> {
    public final /* synthetic */ Panel h;
    public final /* synthetic */ e i;
    public final /* synthetic */ com.amazon.aps.iva.jt.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.jt.a aVar, e eVar, Panel panel) {
        super(2);
        this.h = panel;
        this.i = eVar;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            Panel panel = this.h;
            com.amazon.aps.iva.jt.a aVar = this.j;
            e eVar = this.i;
            com.amazon.aps.iva.qt.c.a(panel, new c(aVar, eVar, panel), eVar.a, null, iVar2, Panel.$stable | AdRequest.MAX_CONTENT_URL_LENGTH, 8);
        }
        return q.a;
    }
}
