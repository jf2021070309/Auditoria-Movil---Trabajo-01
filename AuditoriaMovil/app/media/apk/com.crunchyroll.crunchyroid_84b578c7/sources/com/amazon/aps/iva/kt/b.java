package com.amazon.aps.iva.kt;

import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.nt.o;
import com.amazon.aps.iva.vx.s;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
import com.ellation.crunchyroll.model.UpNext;
/* compiled from: BigFeedCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ws.d a;
    public final h b;
    public final n c;
    public final q<Panel, o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> d;

    public b(com.amazon.aps.iva.ws.d dVar, h hVar, n nVar, s sVar) {
        this.a = dVar;
        this.b = hVar;
        this.c = nVar;
        this.d = sVar;
    }

    @Override // com.amazon.aps.iva.kt.a
    public final void a(Panel panel, com.amazon.aps.iva.jt.a aVar) {
        j.f(panel, "panel");
        j.f(aVar, "feedAnalyticsData");
        this.b.t(panel);
        d.b.a(this.a, panel, aVar, null, null, null, 28);
    }

    @Override // com.amazon.aps.iva.kt.a
    public final void b(Panel panel, com.amazon.aps.iva.fs.b bVar) {
        o oVar;
        j.f(panel, "panel");
        j.f(bVar, "analyticsClickedView");
        if (panel.getWatchlistStatus() == WatchlistStatus.IN_WATCHLIST) {
            oVar = o.b.e;
        } else {
            oVar = o.a.e;
        }
        this.d.invoke(panel, oVar, bVar);
    }

    @Override // com.amazon.aps.iva.kt.a
    public final void c(Panel panel, UpNext upNext, com.amazon.aps.iva.jt.a aVar) {
        j.f(panel, "panel");
        j.f(aVar, "feedAnalyticsData");
        n nVar = this.c;
        if (upNext == null) {
            nVar.d(panel);
        } else {
            nVar.c(PlayheadTimeProviderKt.getPlayheadMs(upNext), upNext.getPanel(), upNext.getFullyWatched());
        }
        d.b.a(this.a, panel, aVar, null, null, null, 28);
    }
}
