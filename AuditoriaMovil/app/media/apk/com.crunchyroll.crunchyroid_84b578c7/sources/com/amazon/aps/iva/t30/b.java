package com.amazon.aps.iva.t30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.e0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: ContainerSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.s30.h h;
    public final /* synthetic */ d i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.s30.h hVar, d dVar, boolean z) {
        super(2);
        this.h = hVar;
        this.i = dVar;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.s30.h hVar = this.h;
            com.amazon.aps.iva.s30.k kVar = (com.amazon.aps.iva.s30.k) hVar;
            Panel a = kVar.a();
            WatchlistStatus watchlistStatus = kVar.a().getWatchlistStatus();
            d dVar = this.i;
            com.amazon.aps.iva.u30.a.a(a, dVar.d, dVar.c.a(kVar.a()), this.j, new a(hVar, dVar), x.m0(dVar.b.a(kVar.a())), watchlistStatus, null, null, false, iVar2, Panel.$stable | 0, 896);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
