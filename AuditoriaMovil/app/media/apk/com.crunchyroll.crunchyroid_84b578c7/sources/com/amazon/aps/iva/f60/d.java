package com.amazon.aps.iva.f60;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.watchlist.a;
/* compiled from: CardWatchlistItemToggleModule.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final k b;
    public final com.amazon.aps.iva.g60.b c;
    public final s d;

    public d(com.amazon.aps.iva.ls.a aVar, EtpContentService etpContentService, k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "view");
        this.b = kVar;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.c = new com.amazon.aps.iva.g60.b(aVar);
        com.ellation.crunchyroll.watchlist.a.u0.getClass();
        com.ellation.crunchyroll.watchlist.a aVar2 = a.C0975a.b;
        com.amazon.aps.iva.yb0.j.f(aVar2, "watchlistChangeRegister");
        this.d = new s(etpContentService, aVar2);
    }

    @Override // com.amazon.aps.iva.f60.c
    public final h a(m mVar) {
        com.amazon.aps.iva.g60.b bVar = this.c;
        com.amazon.aps.iva.yb0.j.f(bVar, "watchlistItemToggleAnalytics");
        k kVar = this.b;
        com.amazon.aps.iva.yb0.j.f(kVar, "view");
        return new h(mVar, bVar, kVar);
    }

    @Override // com.amazon.aps.iva.f60.c
    public final m b() {
        return new m(this.d);
    }
}
