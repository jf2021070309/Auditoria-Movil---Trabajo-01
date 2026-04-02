package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.js.k0;
import com.amazon.aps.iva.js.m0;
import com.amazon.aps.iva.ks.a;
import com.ellation.crunchyroll.presentation.watchlist.filtering.FavoritesFilter;
import com.ellation.crunchyroll.presentation.watchlist.filtering.SubDubFilter;
import com.ellation.crunchyroll.presentation.watchlist.filtering.VideoTypeFilter;
import com.ellation.crunchyroll.presentation.watchlist.sorting.WatchlistSortOrder;
import com.ellation.crunchyroll.presentation.watchlist.sorting.a;
import java.util.List;
/* compiled from: WatchlistSortAndFiltersAnalytics.kt */
/* loaded from: classes2.dex */
public final class c0 implements com.amazon.aps.iva.mn.h {
    public final com.amazon.aps.iva.ds.a b = com.amazon.aps.iva.ds.c.b;

    @Override // com.amazon.aps.iva.mn.h
    public final void a(com.amazon.aps.iva.mn.o oVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.js.i0 i0Var;
        com.amazon.aps.iva.yb0.j.f(oVar, "sorting");
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.js.h0 h0Var = null;
        com.amazon.aps.iva.ks.i iVar = new com.amazon.aps.iva.ks.i(com.amazon.aps.iva.js.k.COLLECTION, null, aVar.toString());
        a.c cVar = a.c.f;
        com.amazon.aps.iva.mn.m mVar = oVar.a;
        if (com.amazon.aps.iva.yb0.j.a(mVar, cVar)) {
            i0Var = com.amazon.aps.iva.js.i0.DATE_CONTENT_UPDATED;
        } else if (com.amazon.aps.iva.yb0.j.a(mVar, a.d.f)) {
            i0Var = com.amazon.aps.iva.js.i0.DATE_WATCHED;
        } else if (com.amazon.aps.iva.yb0.j.a(mVar, a.b.f)) {
            i0Var = com.amazon.aps.iva.js.i0.DATE_ADDED_TO_FEED;
        } else if (com.amazon.aps.iva.yb0.j.a(mVar, a.C0974a.f)) {
            i0Var = com.amazon.aps.iva.js.i0.ALPHABETICAL;
        } else {
            i0Var = null;
        }
        com.amazon.aps.iva.mn.n nVar = oVar.b;
        if (nVar instanceof WatchlistSortOrder.Ascending) {
            h0Var = com.amazon.aps.iva.js.h0.ASCENDING;
        } else if (nVar instanceof WatchlistSortOrder.Descending) {
            h0Var = com.amazon.aps.iva.js.h0.DESCENDING;
        }
        this.b.e(new com.amazon.aps.iva.es.z(c, iVar, i0Var, h0Var));
    }

    @Override // com.amazon.aps.iva.mn.h
    public final void e(com.amazon.aps.iva.mn.e eVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.js.d dVar;
        k0 k0Var;
        List list;
        com.amazon.aps.iva.yb0.j.f(eVar, "filters");
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        i iVar = (i) eVar;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.ks.i iVar2 = new com.amazon.aps.iva.ks.i(com.amazon.aps.iva.js.k.COLLECTION, null, aVar.toString());
        VideoTypeFilter.SeriesOnly seriesOnly = VideoTypeFilter.SeriesOnly.d;
        VideoTypeFilter videoTypeFilter = iVar.b;
        if (com.amazon.aps.iva.yb0.j.a(videoTypeFilter, seriesOnly)) {
            dVar = com.amazon.aps.iva.js.d.SERIES_ONLY;
        } else if (com.amazon.aps.iva.yb0.j.a(videoTypeFilter, VideoTypeFilter.MoviesOnly.d)) {
            dVar = com.amazon.aps.iva.js.d.MOVIES_ONLY;
        } else if (com.amazon.aps.iva.yb0.j.a(videoTypeFilter, VideoTypeFilter.Default.d)) {
            dVar = com.amazon.aps.iva.js.d.ALL;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        SubDubFilter.SubtitledOnly subtitledOnly = SubDubFilter.SubtitledOnly.d;
        SubDubFilter subDubFilter = iVar.c;
        if (com.amazon.aps.iva.yb0.j.a(subDubFilter, subtitledOnly)) {
            k0Var = k0.SUBTITLED_ONLY;
        } else if (com.amazon.aps.iva.yb0.j.a(subDubFilter, SubDubFilter.DubbedOnly.d)) {
            k0Var = k0.DUBBED_ONLY;
        } else if (com.amazon.aps.iva.yb0.j.a(subDubFilter, SubDubFilter.Default.d)) {
            k0Var = k0.ALL;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        if (com.amazon.aps.iva.yb0.j.a(iVar.a, FavoritesFilter.FavoritesOnly.d)) {
            list = f1.J(m0.FAVORITES_ONLY);
        } else {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        this.b.e(new com.amazon.aps.iva.es.y(c, iVar2, new com.amazon.aps.iva.ks.d(dVar, k0Var, list)));
    }
}
