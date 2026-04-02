package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.p;
import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: DeepLinkAnalytics.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final com.amazon.aps.iva.ds.a a;

    public e(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.cg.d
    public final void a(com.amazon.aps.iva.dg.a aVar, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(aVar, "deeplinkUri");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        this.a.e(new com.amazon.aps.iva.es.w("Could not open deeplink " + aVar + ": " + th, com.amazon.aps.iva.ls.a.HOME, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.cg.d
    public final void b(p pVar) {
        com.amazon.aps.iva.ks.e eVar = null;
        if (pVar instanceof p.j) {
            Season season = ((p.j) pVar).c;
            com.amazon.aps.iva.yb0.j.f(season, "season");
            com.amazon.aps.iva.xb0.l lVar = com.amazon.aps.iva.e.w.e;
            if (lVar != null) {
                eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(season.getChannelId(), lVar), com.amazon.aps.iva.js.p.SEASON, season.getId(), "", "", season.getTitle(), null, null, 448);
            } else {
                com.amazon.aps.iva.yb0.j.m("getChannelById");
                throw null;
            }
        } else if (pVar instanceof p.f) {
            eVar = com.amazon.aps.iva.e.w.w(((p.f) pVar).b());
        }
        com.amazon.aps.iva.dg.a a = pVar.a();
        this.a.e(new com.amazon.aps.iva.es.r(new com.amazon.aps.iva.ks.h(a.e, a.f, a.g, a.a, 2), eVar));
    }
}
