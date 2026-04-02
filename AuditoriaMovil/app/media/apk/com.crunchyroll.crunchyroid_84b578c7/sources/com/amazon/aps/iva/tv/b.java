package com.amazon.aps.iva.tv;

import com.amazon.aps.iva.d10.i;
import com.amazon.aps.iva.es.l;
import com.amazon.aps.iva.es.n;
import com.amazon.aps.iva.es.o;
import com.amazon.aps.iva.hg.g;
import com.amazon.aps.iva.ks.m;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: BulkDownloadsAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final q b;

    public b(r rVar) {
        this.b = rVar;
    }

    @Override // com.amazon.aps.iva.tv.a
    public final void a(g gVar) {
        m mVar;
        j.f(gVar, "toDownload");
        com.amazon.aps.iva.ks.e c = com.amazon.aps.iva.p4.f.c(gVar);
        if (this.b.b()) {
            mVar = m.a.a;
        } else {
            mVar = m.b.a;
        }
        this.a.e(new o(c, mVar));
    }

    @Override // com.amazon.aps.iva.tv.a
    public final void b(g gVar) {
        com.amazon.aps.iva.ls.a aVar;
        j.f(gVar, "toDownload");
        if (((PlayableAsset) x.t0(gVar.d)) instanceof Episode) {
            aVar = com.amazon.aps.iva.ls.a.SERIES;
        } else {
            aVar = com.amazon.aps.iva.ls.a.MOVIE;
        }
        this.a.e(new l(com.amazon.aps.iva.p4.f.c(gVar), aVar));
    }

    @Override // com.amazon.aps.iva.tv.a
    public final void c(i iVar, com.amazon.aps.iva.ls.a aVar) {
        j.f(iVar, "panel");
        j.f(aVar, "screen");
        com.amazon.aps.iva.xb0.l lVar = com.amazon.aps.iva.p4.f.b;
        if (lVar != null) {
            Panel panel = iVar.a;
            j.f(panel, "<this>");
            this.a.e(new l(new com.amazon.aps.iva.ks.e(s.a(panel.getChannelId(), lVar), s.e(iVar.b(), panel.getResourceType()), iVar.b(), "", s.c(panel), "", "", "", 256), aVar));
            return;
        }
        j.m("getChannelById");
        throw null;
    }

    @Override // com.amazon.aps.iva.tv.a
    public final void d(g gVar) {
        m mVar;
        j.f(gVar, "toDownload");
        com.amazon.aps.iva.ks.e c = com.amazon.aps.iva.p4.f.c(gVar);
        if (this.b.b()) {
            mVar = m.a.a;
        } else {
            mVar = m.b.a;
        }
        this.a.e(new n(c, mVar));
    }
}
