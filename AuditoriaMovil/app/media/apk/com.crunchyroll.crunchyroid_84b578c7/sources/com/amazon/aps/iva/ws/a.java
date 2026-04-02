package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.js.t;
import com.amazon.aps.iva.js.v;
import com.amazon.aps.iva.ks.n;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.tz.q0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: BrowseAllPanelAnalyticsDataFactory.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    @Override // com.amazon.aps.iva.ws.b
    public final e a(int i, Panel panel, com.amazon.aps.iva.mn.g gVar) {
        j.f(panel, "panel");
        j.f(gVar, "sortAndFilters");
        com.amazon.aps.iva.mn.e eVar = gVar.b;
        j.d(eVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.BrowseFilters");
        q0 q0Var = (q0) eVar;
        m mVar = gVar.a.a;
        j.d(mVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.sorting.BrowseSortOption");
        return new e(0, i, v.BROWSE, t.GRID, new n.a(w.w(panel), c.a(q0Var.a), c.c(q0Var.b), c.b((com.amazon.aps.iva.a00.b) mVar)));
    }
}
